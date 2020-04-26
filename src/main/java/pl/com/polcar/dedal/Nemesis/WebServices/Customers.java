/**
 * Customers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public interface Customers extends javax.xml.rpc.Service {
    public String getCustomersSoapAddress();

    public pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoap getCustomersSoap() throws javax.xml.rpc.ServiceException;

    public pl.com.polcar.dedal.Nemesis.WebServices.CustomersSoap getCustomersSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
