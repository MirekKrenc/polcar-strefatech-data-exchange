/**
 * CustomersLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class CustomersLocator extends org.apache.axis.client.Service implements Customers {

    public CustomersLocator() {
    }


    public CustomersLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomersLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomersSoap
    private String CustomersSoap_address = "http://dedal.polcar.com:8080/Dystrybutorzy/Customers.asmx";

    public String getCustomersSoapAddress() {
        return CustomersSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CustomersSoapWSDDServiceName = "CustomersSoap";

    public String getCustomersSoapWSDDServiceName() {
        return CustomersSoapWSDDServiceName;
    }

    public void setCustomersSoapWSDDServiceName(String name) {
        CustomersSoapWSDDServiceName = name;
    }

    public CustomersSoap getCustomersSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomersSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomersSoap(endpoint);
    }

    public CustomersSoap getCustomersSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoapStub _stub = new pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoapStub(portAddress, this);
            _stub.setPortName(getCustomersSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomersSoapEndpointAddress(String address) {
        CustomersSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CustomersSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoapStub _stub = new pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoapStub(new java.net.URL(CustomersSoap_address), this);
                _stub.setPortName(getCustomersSoapWSDDServiceName());
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
        if ("CustomersSoap".equals(inputPortName)) {
            return getCustomersSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Customers");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomersSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomersSoap".equals(portName)) {
            setCustomersSoapEndpointAddress(address);
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
