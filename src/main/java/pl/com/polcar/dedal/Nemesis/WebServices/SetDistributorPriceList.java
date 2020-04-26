/**
 * SetDistributorPriceList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class SetDistributorPriceList  implements java.io.Serializable {
    private String distributorCode;

    private String priceListName;

    private pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList priceList;

    private String login;

    private String password;

    public SetDistributorPriceList() {
    }

    public SetDistributorPriceList(
           String distributorCode,
           String priceListName,
           pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList priceList,
           String login,
           String password) {
           this.distributorCode = distributorCode;
           this.priceListName = priceListName;
           this.priceList = priceList;
           this.login = login;
           this.password = password;
    }


    /**
     * Gets the distributorCode value for this SetDistributorPriceList.
     * 
     * @return distributorCode
     */
    public String getDistributorCode() {
        return distributorCode;
    }


    /**
     * Sets the distributorCode value for this SetDistributorPriceList.
     * 
     * @param distributorCode
     */
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }


    /**
     * Gets the priceListName value for this SetDistributorPriceList.
     * 
     * @return priceListName
     */
    public String getPriceListName() {
        return priceListName;
    }


    /**
     * Sets the priceListName value for this SetDistributorPriceList.
     * 
     * @param priceListName
     */
    public void setPriceListName(String priceListName) {
        this.priceListName = priceListName;
    }


    /**
     * Gets the priceList value for this SetDistributorPriceList.
     * 
     * @return priceList
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this SetDistributorPriceList.
     * 
     * @param priceList
     */
    public void setPriceList(pl.com.polcar.dedal.Nemesis.WebServices.SetDistributorPriceListPriceList priceList) {
        this.priceList = priceList;
    }


    /**
     * Gets the login value for this SetDistributorPriceList.
     * 
     * @return login
     */
    public String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this SetDistributorPriceList.
     * 
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }


    /**
     * Gets the password value for this SetDistributorPriceList.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SetDistributorPriceList.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetDistributorPriceList)) return false;
        SetDistributorPriceList other = (SetDistributorPriceList) obj;
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
            ((this.priceListName==null && other.getPriceListName()==null) || 
             (this.priceListName!=null &&
              this.priceListName.equals(other.getPriceListName()))) &&
            ((this.priceList==null && other.getPriceList()==null) || 
             (this.priceList!=null &&
              this.priceList.equals(other.getPriceList()))) &&
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
        if (getPriceListName() != null) {
            _hashCode += getPriceListName().hashCode();
        }
        if (getPriceList() != null) {
            _hashCode += getPriceList().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(SetDistributorPriceList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetDistributorPriceList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceListName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetDistributorPriceList>PriceList"));
        elemField.setMinOccurs(0);
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
