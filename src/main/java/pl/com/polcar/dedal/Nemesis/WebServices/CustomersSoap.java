/**
 * CustomersSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public interface CustomersSoap extends java.rmi.Remote {
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getCustomerPricesForList(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListPartList partList, String distributorCode, String customerNumber, String login, String password) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getCustomerPricesForList_eTN(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList partList, String distributorCode, String customerNumber, String login, String password, String credentialsGuid) throws java.rmi.RemoteException;
    public String setCustomerPrices(String distributorCode, String customerNumber, pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices prices, int howToDealWithPreviousPrices, String login, String password) throws java.rmi.RemoteException;
    public String setCustomerPrices_eTN(String distributorCode, String customerNumber, pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices prices, int howToDealWithPreviousPrices, String credentialsGuid) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult getCustomerPrices(String distributorCode, String customerNumber, String login, String password) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getCustomerPrices_eTN(String distributorCode, String customerNumber, String credentialsGuid) throws java.rmi.RemoteException;
    public String setDistributorPriceList(String distributorCode, String priceListName, pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList priceList, String login, String password) throws java.rmi.RemoteException;
    public String setDistributorPriceList_eTN(String distributorCode, String priceListName, pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTNPriceList priceList, String credentialsGuid) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getDistributorPriceList(String distributorCode, String priceListName, String login, String password) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getDistributorPriceList_eTN(String distributorCode, String priceListName, String credentialsGuid) throws java.rmi.RemoteException;
}
