/**
 * ProductsSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class ProductsSoapStub extends org.apache.axis.client.Stub implements ProductsSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStockLevels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "BranchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsResponse>GetStockLevelsResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStockLevelsForList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "BranchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartsList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsForList>PartsList"), pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsForListResponse>GetStockLevelsForListResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsForListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStockLevelsForListOfProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "productRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ProductRequest"), ProductRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ProductResponse"));
        oper.setReturnClass(ProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsForListOfProductsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStockLevels_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StoreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevels_eTNResponse>GetStockLevels_eTNResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevels_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadStockLevels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StockLevels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevels>StockLevels"), pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsStockLevels.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "BranchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevelsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadStockLevelsWithReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StockLevels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevelsWithReport>StockLevels"), pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "BranchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevelsWithReportResponse>UploadStockLevelsWithReportResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevelsWithReportResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UploadStockLevels_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StockLevels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevels_eTN>StockLevels"), pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StoreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevels_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "FormatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetProductsListResponse>GetProductsListResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetProductsListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductsList_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "FormatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetProductsList_eTNResponse>GetProductsList_eTNResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetProductsList_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEAN13List");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "FormatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetEAN13ListResponse>GetEAN13ListResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetEAN13ListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEAN13List_eTN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "FormatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetEAN13List_eTNResponse>GetEAN13List_eTNResult"));
        oper.setReturnClass(pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetEAN13List_eTNResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public ProductsSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProductsSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProductsSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetEAN13List_eTNResponse>GetEAN13List_eTNResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetEAN13ListResponse>GetEAN13ListResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetProductsList_eTNResponse>GetProductsList_eTNResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetProductsListResponse>GetProductsListResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevels_eTNResponse>GetStockLevels_eTNResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsForList>PartsList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsForListResponse>GetStockLevelsForListResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsResponse>GetStockLevelsResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevels>StockLevels");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsStockLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevels_eTN>StockLevels");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevelsWithReport>StockLevels");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevelsWithReportResponse>UploadStockLevelsWithReportResult");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetEAN13List");
            cachedSerQNames.add(qName);
            cls = GetEAN13List.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetEAN13List_eTN");
            cachedSerQNames.add(qName);
            cls = GetEAN13List_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetEAN13List_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetEAN13ListResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsList");
            cachedSerQNames.add(qName);
            cls = GetProductsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsList_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsList_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsListResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevels_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevels_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForList");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForListOfProducts");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListOfProducts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForListOfProductsResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListOfProductsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForListResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevels");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevels_eTN");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevels_eTNResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevelsResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevelsWithReport");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevelsWithReportResponse");
            cachedSerQNames.add(qName);
            cls = pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ArrayOfProduct");
            cachedSerQNames.add(qName);
            cls = Product[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Product");
            qName2 = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Product");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Product");
            cachedSerQNames.add(qName);
            cls = Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ProductRequest");
            cachedSerQNames.add(qName);
            cls = ProductRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ProductResponse");
            cachedSerQNames.add(qName);
            cls = ProductResponse.class;
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

    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult getStockLevels(String login, String password, int branchID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetStockLevels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {login, password, new Integer(branchID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsResponseGetStockLevelsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getStockLevelsForList(String login, String password, int branchID, pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList partsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetStockLevelsForList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsForList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {login, password, new Integer(branchID), partsList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ProductResponse getStockLevelsForListOfProducts(ProductRequest productRequest, String login, String password, int languageID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetStockLevelsForListOfProducts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsForListOfProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {productRequest, login, password, new Integer(languageID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ProductResponse) _resp;
            } catch (Exception _exception) {
                return (ProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getStockLevels_eTN(String storeID, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetStockLevels_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevels_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {storeID, credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String uploadStockLevels(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsStockLevels stockLevels, int branchID, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/UploadStockLevels");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {stockLevels, new Integer(branchID), login, password});

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

    public pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult uploadStockLevelsWithReport(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels stockLevels, int branchID, String login, String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/UploadStockLevelsWithReport");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevelsWithReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {stockLevels, new Integer(branchID), login, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String uploadStockLevels_eTN(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels stockLevels, String storeID, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/UploadStockLevels_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevels_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {stockLevels, storeID, credentialsGuid});

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

    public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getProductsList(String login, String password, int languageID, int formatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetProductsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetProductsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {login, password, new Integer(languageID), new Integer(formatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getProductsList_eTN(int languageID, int formatID, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetProductsList_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetProductsList_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(languageID), new Integer(formatID), credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getEAN13List(String login, String password, int languageID, int formatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetEAN13List");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetEAN13List"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {login, password, new Integer(languageID), new Integer(formatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getEAN13List_eTN(int languageID, int formatID, String credentialsGuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://dedal.polcar.com.pl/Nemesis/WebServices/GetEAN13List_eTN");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetEAN13List_eTN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(languageID), new Integer(formatID), credentialsGuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult) _resp;
            } catch (Exception _exception) {
                return (pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult) org.apache.axis.utils.JavaUtils.convert(_resp, pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
