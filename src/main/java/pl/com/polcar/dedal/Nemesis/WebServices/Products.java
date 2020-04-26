/**
 * Products.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public interface Products extends javax.xml.rpc.Service {
    public String getProductsSoapAddress();

    public pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoap getProductsSoap() throws javax.xml.rpc.ServiceException;

    public pl.com.polcar.dedal.Nemesis.WebServices.ProductsSoap getProductsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
