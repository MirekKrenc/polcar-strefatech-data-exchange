/**
 * CustomersSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class CustomersSoapStub extends org.apache.axis.client.Stub implements CustomersSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerPricesForList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList>PartList"), pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListPartList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForListResponse>GetCustomerPricesForListResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesForListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerPricesForList_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList_eTN>PartList"), pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList_eTNResponse>GetCustomerPricesForList_eTNResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesForList_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetCustomerPrices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Prices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetCustomerPrices>Prices"), pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "HowToDealWithPreviousPrices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetCustomerPricesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetCustomerPrices_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Prices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetCustomerPrices_eTN>Prices"), pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "HowToDealWithPreviousPrices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetCustomerPrices_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerPrices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesResponse>GetCustomerPricesResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerPrices_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPrices_eTNResponse>GetCustomerPrices_eTNResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPrices_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetDistributorPriceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceListName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetDistributorPriceList>PriceList"), pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetDistributorPriceListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetDistributorPriceList_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceListName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetDistributorPriceList_eTN>PriceList"), pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTNPriceList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetDistributorPriceList_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDistributorPriceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceListName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetDistributorPriceListResponse>GetDistributorPriceListResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetDistributorPriceListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDistributorPriceList_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceListName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetDistributorPriceList_eTNResponse>GetDistributorPriceList_eTNResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetDistributorPriceList_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public CustomersSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CustomersSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CustomersSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPrices_eTNResponse>GetCustomerPrices_eTNResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList>PartList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListPartList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList_eTN>PartList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList_eTNResponse>GetCustomerPricesForList_eTNResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForListResponse>GetCustomerPricesForListResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesResponse>GetCustomerPricesResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetDistributorPriceList_eTNResponse>GetDistributorPriceList_eTNResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetDistributorPriceListResponse>GetDistributorPriceListResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetCustomerPrices>Prices");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetCustomerPrices_eTN>Prices");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetDistributorPriceList>PriceList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetDistributorPriceList_eTN>PriceList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTNPriceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPrices");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPrices_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPrices_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesForList_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesForList_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesForListResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceList_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceList_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceListResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPrices");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPrices_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPrices_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPricesResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetDistributorPriceList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetDistributorPriceList_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetDistributorPriceList_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetDistributorPriceListResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getCustomerPricesForList(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListPartList partList, String distributorCode, String customerNumber, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetCustomerPricesForList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesForList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {partList, distributorCode, customerNumber, login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getCustomerPricesForList_eTN(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList partList, String distributorCode, String customerNumber, String login, String password, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetCustomerPricesForList_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesForList_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {partList, distributorCode, customerNumber, login, password, credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String setCustomerPrices(String distributorCode, String customerNumber, pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices prices, int howToDealWithPreviousPrices, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/SetCustomerPrices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetCustomerPrices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, customerNumber, prices, new Integer(howToDealWithPreviousPrices), login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String setCustomerPrices_eTN(String distributorCode, String customerNumber, pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices prices, int howToDealWithPreviousPrices, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/SetCustomerPrices_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetCustomerPrices_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, customerNumber, prices, new Integer(howToDealWithPreviousPrices), credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult getCustomerPrices(String distributorCode, String customerNumber, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetCustomerPrices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPrices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, customerNumber, login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesResponseGetCustomerPricesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getCustomerPrices_eTN(String distributorCode, String customerNumber, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetCustomerPrices_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPrices_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, customerNumber, credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String setDistributorPriceList(String distributorCode, String priceListName, pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList priceList, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/SetDistributorPriceList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetDistributorPriceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, priceListName, priceList, login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String setDistributorPriceList_eTN(String distributorCode, String priceListName, pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceList_eTNPriceList priceList, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/SetDistributorPriceList_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetDistributorPriceList_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, priceListName, priceList, credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getDistributorPriceList(String distributorCode, String priceListName, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetDistributorPriceList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetDistributorPriceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, priceListName, login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getDistributorPriceList_eTN(String distributorCode, String priceListName, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetDistributorPriceList_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetDistributorPriceList_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {distributorCode, priceListName, credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
