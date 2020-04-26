package pl.com.polcar.dedal.Nemesis.WebServices;

public class CustomersSoapProxy implements CustomersSoap {
  private String _endpoint = null;
  private CustomersSoap customersSoap = null;
  
  public CustomersSoapProxy() {
    _initCustomersSoapProxy();
  }
  
  public CustomersSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomersSoapProxy();
  }
  
  private void _initCustomersSoapProxy() {
    try {
      customersSoap = (new CustomersLocator()).getCustomersSoap();
      if (customersSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customersSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customersSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customersSoap != null)
      ((javax.xml.rpc.Stub)customersSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public CustomersSoap getCustomersSoap() {
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap;
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getCustomerPricesForList(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListPartList partList, String distributorCode, String customerNumber, String login, String password) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.getCustomerPricesForList(partList, distributorCode, customerNumber, login, password);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getCustomerPricesForList_eTN(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList partList, String distributorCode, String customerNumber, String login, String password, String credentialsGuid) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.getCustomerPricesForList_eTN(partList, distributorCode, customerNumber, login, password, credentialsGuid);
  }
  
  public String setCustomerPrices(String distributorCode, String customerNumber, pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices prices, int howToDealWithPreviousPrices, String login, String password) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.setCustomerPrices(distributorCode, customerNumber, prices, howToDealWithPreviousPrices, login, password);
  }
  
  public String setCustomerPrices_eTN(String distributorCode, String customerNumber, pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices prices, int howToDealWithPreviousPrices, String credentialsGuid) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.setCustomerPrices_eTN(distributorCode, customerNumber, prices, howToDealWithPreviousPrices, credentialsGuid);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult getCustomerPrices(String distributorCode, String customerNumber, String login, String password) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.getCustomerPrices(distributorCode, customerNumber, login, password);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getCustomerPrices_eTN(String distributorCode, String customerNumber, String credentialsGuid) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.getCustomerPrices_eTN(distributorCode, customerNumber, credentialsGuid);
  }
  
  public String setDistributorPriceList(String distributorCode, String priceListName, pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList priceList, String login, String password) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.setDistributorPriceList(distributorCode, priceListName, priceList, login, password);
  }
  
  public String setDistributorPriceList_eTN(String distributorCode, String priceListName, pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTNPriceList priceList, String credentialsGuid) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.setDistributorPriceList_eTN(distributorCode, priceListName, priceList, credentialsGuid);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getDistributorPriceList(String distributorCode, String priceListName, String login, String password) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.getDistributorPriceList(distributorCode, priceListName, login, password);
  }
  
  public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getDistributorPriceList_eTN(String distributorCode, String priceListName, String credentialsGuid) throws java.rmi.RemoteException{
    if (customersSoap == null)
      _initCustomersSoapProxy();
    return customersSoap.getDistributorPriceList_eTN(distributorCode, priceListName, credentialsGuid);
  }
  
  
}
