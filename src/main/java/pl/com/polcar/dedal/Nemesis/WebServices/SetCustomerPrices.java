/**
 * SetCustomerPrices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class SetCustomerPrices  implements java.io.Serializable {
    private String distributorCode;

    private String customerNumber;

    private pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices prices;

    private int howToDealWithPreviousPrices;

    private String login;

    private String password;

    public SetCustomerPrices() {
    }

    public SetCustomerPrices(
           String distributorCode,
           String customerNumber,
           pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices prices,
           int howToDealWithPreviousPrices,
           String login,
           String password) {
           this.distributorCode = distributorCode;
           this.customerNumber = customerNumber;
           this.prices = prices;
           this.howToDealWithPreviousPrices = howToDealWithPreviousPrices;
           this.login = login;
           this.password = password;
    }


    /**
     * Gets the distributorCode value for this SetCustomerPrices.
     * 
     * @return distributorCode
     */
    public String getDistributorCode() {
        return distributorCode;
    }


    /**
     * Sets the distributorCode value for this SetCustomerPrices.
     * 
     * @param distributorCode
     */
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }


    /**
     * Gets the customerNumber value for this SetCustomerPrices.
     * 
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this SetCustomerPrices.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the prices value for this SetCustomerPrices.
     * 
     * @return prices
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices getPrices() {
        return prices;
    }


    /**
     * Sets the prices value for this SetCustomerPrices.
     * 
     * @param prices
     */
    public void setPrices(pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPricesPrices prices) {
        this.prices = prices;
    }


    /**
     * Gets the howToDealWithPreviousPrices value for this SetCustomerPrices.
     * 
     * @return howToDealWithPreviousPrices
     */
    public int getHowToDealWithPreviousPrices() {
        return howToDealWithPreviousPrices;
    }


    /**
     * Sets the howToDealWithPreviousPrices value for this SetCustomerPrices.
     * 
     * @param howToDealWithPreviousPrices
     */
    public void setHowToDealWithPreviousPrices(int howToDealWithPreviousPrices) {
        this.howToDealWithPreviousPrices = howToDealWithPreviousPrices;
    }


    /**
     * Gets the login value for this SetCustomerPrices.
     * 
     * @return login
     */
    public String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this SetCustomerPrices.
     * 
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }


    /**
     * Gets the password value for this SetCustomerPrices.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SetCustomerPrices.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetCustomerPrices)) return false;
        SetCustomerPrices other = (SetCustomerPrices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributorCode==null && other.getDistributorCode()==null) || 
             (this.distributorCode!=null &&
              this.distributorCode.equals(other.getDistributorCode()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.prices==null && other.getPrices()==null) || 
             (this.prices!=null &&
              this.prices.equals(other.getPrices()))) &&
            this.howToDealWithPreviousPrices == other.getHowToDealWithPreviousPrices() &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDistributorCode() != null) {
            _hashCode += getDistributorCode().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getPrices() != null) {
            _hashCode += getPrices().hashCode();
        }
        _hashCode += getHowToDealWithPreviousPrices();
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomerPrices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPrices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Prices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetCustomerPrices>Prices"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("howToDealWithPreviousPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "HowToDealWithPreviousPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
