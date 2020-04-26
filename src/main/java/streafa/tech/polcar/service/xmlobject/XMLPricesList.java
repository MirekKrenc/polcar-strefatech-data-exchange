package streafa.tech.polcar.service.xmlobject;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import streafa.tech.polcar.model.PriceProductData;
import streafa.tech.polcar.model.repo.PriceListRepo;
import streafa.tech.polcar.service.PolcarDataService;
import streafa.tech.polcar.xmlclasses.xmlclasses.priceslist.CENA;
import streafa.tech.polcar.xmlclasses.xmlclasses.priceslist.PricesRoot;

@Component
public class XMLPricesList {
	
	@Autowired
	private PolcarDataService polcarDataService;

	private PriceListRepo priceListRepo;

	public XMLPricesList(PriceListRepo priceListRepo) {
		this.priceListRepo = priceListRepo;
	}

	public void getXMLdata() {

		try {
			JAXBContext context = JAXBContext.newInstance(PricesRoot.class);
			String XMLData = polcarDataService.getClientPricesListAsXMLString();
			Unmarshaller unmarshaller = context.createUnmarshaller();
			StringReader reader = new StringReader(XMLData);
			PricesRoot prices = (PricesRoot) unmarshaller.unmarshal(reader);
			List<CENA> pricesList = prices.getCENA();
			for (CENA cena : pricesList)
			{
				System.out.println(cena.getNumber() + "|" + cena.getPrice());
			}

		}
		catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void savePricesData() {

		try {
			JAXBContext context = JAXBContext.newInstance(PricesRoot.class);
			String XMLData = polcarDataService.getClientPricesListAsXMLString();
			Unmarshaller unmarshaller = context.createUnmarshaller();
			StringReader reader = new StringReader(XMLData);
			PricesRoot prices = (PricesRoot) unmarshaller.unmarshal(reader);
			List<CENA> pricesList = prices.getCENA();
			System.out.println("Liczba rekordow w price list = " + pricesList.size());
			for (CENA cena : pricesList)
			{
				priceListRepo.save(new PriceProductData(cena.getNumber(), cena.getPrice()));
//				jdbcTemplate.update(
//						"INSERT INTO  polcar_price_list (product_id, price) VALUES (?, ?)",
//						cena.getNumber(), cena.getPrice()
//				);
				//System.out.println(cena.getNumber() + "|" + cena.getPrice());
			}

		}
		catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
