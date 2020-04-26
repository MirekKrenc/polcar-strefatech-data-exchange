package streafa.tech.polcar.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.rmi.RemoteException;

import org.apache.axis.message.MessageElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoapProxy;
import pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult;
import pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult;
import pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult;
import pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoapProxy;

@Service
public class PolcarDataService {

	private FileWriter stockLevelsWriter;
	private PolcarProperties polcarProperties;

	@Autowired
	public PolcarDataService(PolcarProperties polcarProperties) {
		this.polcarProperties = polcarProperties;
	}

	public FileWriter getStockLevelsWriter() {
		return stockLevelsWriter;
	}

	public boolean getStockList() throws IOException
	{
		boolean result = false;
		ProductsSoapProxy productsSoapProxy = new ProductsSoapProxy();
		//PrintWriter stockLevelsWriter = new PrintWriter(new File("stockLevels.xml"));
		
		
		GetStockLevelsResponseGetStockLevelsResult stockLevels ;
		StringBuilder stringBuilder = new StringBuilder();
		try 
		{
			File xmlFile = new File("stockLevels.xml");
			boolean deleteFile = Files.deleteIfExists(xmlFile.toPath());
			stockLevelsWriter = new FileWriter(xmlFile);

			//stockLevels = productsSoapProxy.getStockLevels("strefatech", "XhFch3Ewq3X5SUN", 1);
			stockLevels = productsSoapProxy.getStockLevels(polcarProperties.getLogin(), polcarProperties.getPassword(), polcarProperties.getBranch());
			MessageElement[] get_any = stockLevels.get_any();
			for (MessageElement me: get_any)
			{
				stringBuilder.append(me.getAsString());
			}
			stockLevelsWriter.write(stringBuilder.toString());
			stockLevelsWriter.flush();
			stockLevelsWriter.close();
			result = true;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally
		{
			stockLevelsWriter.close();
		}
		
		return result;
	}
	
	public String getStockListAsXMLString() throws IOException
	{
		ProductsSoapProxy productsSoapProxy = new ProductsSoapProxy();
		GetStockLevelsResponseGetStockLevelsResult stockLevels ;
		StringBuilder stringBuilder = new StringBuilder();
		try 
		{
			stockLevels = productsSoapProxy.getStockLevels("strefatech", "XhFch3Ewq3X5SUN", 1);
			MessageElement[] get_any = stockLevels.get_any();
			for (MessageElement me: get_any)
			{
				stringBuilder.append(me.getAsString());
			}
			return stringBuilder.toString();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getClientPricesListAsXMLString() throws IOException
	{
		
		CustomersSoapProxy customersSoapProxy = new CustomersSoapProxy();
		
		GetCustomerPricesResponseGetCustomerPricesResult customerPricesList ;
		StringBuilder stringBuilder = new StringBuilder();
		try 
		{
			customerPricesList = customersSoapProxy.getCustomerPrices("PCA", "9380", "strefatech", "XhFch3Ewq3X5SUN");
			MessageElement[] get_any = customerPricesList.get_any();
			for (MessageElement me: get_any)
			{
				stringBuilder.append(me.getAsString());
			}
			return stringBuilder.toString();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean getProductList() throws IOException
	{
		boolean result = false;
		ProductsSoapProxy productsSoapProxy = new ProductsSoapProxy();
		//PrintWriter stockLevelsWriter = new PrintWriter(new File("stockLevels.xml"));
		
		
		GetProductsListResponseGetProductsListResult productList ;
		StringBuilder stringBuilder = new StringBuilder();
		try 
		{
			File xmlFile = new File("ProductList.xml");
			boolean deleteFile = Files.deleteIfExists(xmlFile.toPath());
			stockLevelsWriter = new FileWriter(xmlFile);
			
			productList = productsSoapProxy.getProductsList("strefatech", "XhFch3Ewq3X5SUN", 1, 5);
			MessageElement[] get_any = productList.get_any();
			for (MessageElement me: get_any)
			{
				stringBuilder.append(me.getAsString());
			}
			stockLevelsWriter.write(stringBuilder.toString());
			stockLevelsWriter.flush();
			stockLevelsWriter.close();
			result = true;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally
		{
			stockLevelsWriter.close();
		}
		
		return result;
	}
		
	public boolean getClientPricesList() throws IOException
	{
		boolean result = false;
		CustomersSoapProxy customersSoapProxy = new CustomersSoapProxy();
		
		GetCustomerPricesResponseGetCustomerPricesResult customerPricesList ;
		StringBuilder stringBuilder = new StringBuilder();
		try 
		{
			File xmlFile = new File("PricesList.xml");
			boolean deleteFile = Files.deleteIfExists(xmlFile.toPath());
			stockLevelsWriter = new FileWriter(xmlFile);
			
			customerPricesList = customersSoapProxy.getCustomerPrices("PCA", "9380", "strefatech", "XhFch3Ewq3X5SUN");
			MessageElement[] get_any = customerPricesList.get_any();
			for (MessageElement me: get_any)
			{
				stringBuilder.append(me.getAsString());
			}
			stockLevelsWriter.write(stringBuilder.toString());
			stockLevelsWriter.flush();
			stockLevelsWriter.close();
			result = true;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally
		{
			stockLevelsWriter.close();
		}
		
		return result;
	}
	
}
