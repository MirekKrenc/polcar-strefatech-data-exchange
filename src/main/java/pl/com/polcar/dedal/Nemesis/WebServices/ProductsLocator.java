/**
 * ProductsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class ProductsLocator extends org.apache.axis.client.Service implements Products {

    public ProductsLocator() {
    }


    public ProductsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductsSoap
    private String ProductsSoap_address = "http://dedal.polcar.com:8080/Dystrybutorzy/Products.asmx";

    public String getProductsSoapAddress() {
        return ProductsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String ProductsSoapWSDDServiceName = "ProductsSoap";

    public String getProductsSoapWSDDServiceName() {
        return ProductsSoapWSDDServiceName;
    }

    public void setProductsSoapWSDDServiceName(String name) {
        ProductsSoapWSDDServiceName = name;
    }

    public ProductsSoap getProductsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductsSoap(endpoint);
    }

    public ProductsSoap getProductsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoapStub _stub = new pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoapStub(portAddress, this);
            _stub.setPortName(getProductsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductsSoapEndpointAddress(String address) {
        ProductsSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ProductsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoapStub _stub = new pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoapStub(new java.net.URL(ProductsSoap_address), this);
                _stub.setPortName(getProductsSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ProductsSoap".equals(inputPortName)) {
            return getProductsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Products");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ProductsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductsSoap".equals(portName)) {
            setProductsSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
