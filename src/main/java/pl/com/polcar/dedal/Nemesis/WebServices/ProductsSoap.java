/**
 * ProductsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public interface ProductsSoap extends java.rmi.Remote {
    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult getStockLevels(String login, String password, int branchID) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getStockLevelsForList(String login, String password, int branchID, pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList partsList) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.ProductResponse getStockLevelsForListOfProducts(pl.com.polcar.dedal.Nemesis.WebServices.ProductRequest productRequest, String login, String password, int languageID) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getStockLevels_eTN(String storeID, String credentialsGuid) throws java.rmi.RemoteException;
    public String uploadStockLevels(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsStockLevels stockLevels, int branchID, String login, String password) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult uploadStockLevelsWithReport(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels stockLevels, int branchID, String login, String password) throws java.rmi.RemoteException;
    public String uploadStockLevels_eTN(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels stockLevels, String storeID, String credentialsGuid) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getProductsList(String login, String password, int languageID, int formatID) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getProductsList_eTN(int languageID, int formatID, String credentialsGuid) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getEAN13List(String login, String password, int languageID, int formatID) throws java.rmi.RemoteException;
    public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getEAN13List_eTN(int languageID, int formatID, String credentialsGuid) throws java.rmi.RemoteException;
}
