package streafa.tech.polcar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import streafa.tech.DBConfiguration;
import streafa.tech.polcar.service.xmlobject.XMLPricesList;
import streafa.tech.polcar.service.xmlobject.XMLStockLevels;

@Service
public class PolcarDBService {

    private XMLStockLevels xmlStockLevels;
    private XMLPricesList xmlPricesList;

    @Autowired
    //public PolcarDBService(XMLStockLevels xmlStockLevels, XMLPricesList xmlPricesList, DBConfiguration dbConfiguration) {
    public PolcarDBService(XMLStockLevels xmlStockLevels, XMLPricesList xmlPricesList) {
        this.xmlStockLevels = xmlStockLevels;
        this.xmlPricesList = xmlPricesList;

        //dbConfiguration.createSchema();
        //get stock levels
        xmlStockLevels.saveStockLevelsData();

        //get prices
        xmlPricesList.savePricesData();
    }

}
