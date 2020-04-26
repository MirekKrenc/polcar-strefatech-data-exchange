package pl.com.polcar.dedal.Nemesis.WebServices;

public class ProductsSoapProxy implements ProductsSoap {
  private String _endpoint = null;
  private ProductsSoap productsSoap = null;
  
  public ProductsSoapProxy() {
    _initProductsSoapProxy();
  }
  
  public ProductsSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductsSoapProxy();
  }
  
  private void _initProductsSoapProxy() {
    try {
      productsSoap = (new ProductsLocator()).getProductsSoap();
      if (productsSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productsSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productsSoap != null)
      ((javax.xml.rpc.Stub)productsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ProductsSoap getProductsSoap() {
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap;
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult getStockLevels(String login, String password, int branchID) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getStockLevels(login, password, branchID);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getStockLevelsForList(String login, String password, int branchID, pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList partsList) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getStockLevelsForList(login, password, branchID, partsList);
  }
  
  public ProductResponse getStockLevelsForListOfProducts(ProductRequest productRequest, String login, String password, int languageID) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getStockLevelsForListOfProducts(productRequest, login, password, languageID);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getStockLevels_eTN(String storeID, String credentialsGuid) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getStockLevels_eTN(storeID, credentialsGuid);
  }
  
  public String uploadStockLevels(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsStockLevels stockLevels, int branchID, String login, String password) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.uploadStockLevels(stockLevels, branchID, login, password);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult uploadStockLevelsWithReport(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels stockLevels, int branchID, String login, String password) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.uploadStockLevelsWithReport(stockLevels, branchID, login, password);
  }
  
  public String uploadStockLevels_eTN(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels stockLevels, String storeID, String credentialsGuid) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.uploadStockLevels_eTN(stockLevels, storeID, credentialsGuid);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getProductsList(String login, String password, int languageID, int formatID) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getProductsList(login, password, languageID, formatID);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getProductsList_eTN(int languageID, int formatID, String credentialsGuid) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getProductsList_eTN(languageID, formatID, credentialsGuid);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getEAN13List(String login, String password, int languageID, int formatID) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getEAN13List(login, password, languageID, formatID);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getEAN13List_eTN(int languageID, int formatID, String credentialsGuid) throws java.rmi.RemoteException{
    if (productsSoap == null)
      _initProductsSoapProxy();
    return productsSoap.getEAN13List_eTN(languageID, formatID, credentialsGuid);
  }
  
  
}
