package streafa.tech.polcar.service.xmlobject;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import streafa.tech.polcar.model.StockProductData;
import streafa.tech.polcar.model.repo.StockListRepo;
import streafa.tech.polcar.service.PolcarDataService;
import streafa.tech.polcar.xmlclasses.xmlclasses.stocklevels.StockLevel;
import streafa.tech.polcar.xmlclasses.xmlclasses.stocklevels.StockLevelRoot;

@Component
public class XMLStockLevels {
	
	@Autowired
	private PolcarDataService polcarDataService;
	private StockListRepo stockListRepo;

	public XMLStockLevels(StockListRepo stockListRepo) {
		this.stockListRepo = stockListRepo;
	}

	public void getXMLdata() {
		try {
			JAXBContext context = JAXBContext.newInstance(StockLevelRoot.class);
			String XMLData = polcarDataService.getStockListAsXMLString();
			Unmarshaller unmarshaller = context.createUnmarshaller();
			StringReader reader = new StringReader(XMLData);
			StockLevelRoot stockLevel = (StockLevelRoot) unmarshaller.unmarshal(reader);
			List<StockLevel> stocklist = stockLevel.getITEM();
			for (StockLevel sl: stocklist)
			{
				System.out.println(sl.getNumber() + "|" + sl.getQuantity());
			}
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void saveStockLevelsData() {
		try {
			JAXBContext context = JAXBContext.newInstance(StockLevelRoot.class);
			String XMLData = polcarDataService.getStockListAsXMLString();
			Unmarshaller unmarshaller = context.createUnmarshaller();
			StringReader reader = new StringReader(XMLData);
			StockLevelRoot stockLevel = (StockLevelRoot) unmarshaller.unmarshal(reader);
			List<StockLevel> stocklist = stockLevel.getITEM();
			System.out.println("Liczba rekordow w stock list = " + stocklist.size());

			//remove all data from table
			stockListRepo.deleteAll();

			for (StockLevel sl: stocklist)
			{
				stockListRepo.save(new StockProductData(sl.getNumber(), sl.getQuantity()));
//				jdbcTemplate.update(
//						"INSERT INTO  polcar_stock_list (product_id, stock) VALUES (?, ?)",
//						sl.getNumber(), sl.getQuantity()
//				);
				//System.out.println(sl.getNumber() + "|" + sl.getQuantity());
			}

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
