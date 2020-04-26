/**
 * GetCustomerPricesForList_eTN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetCustomerPricesForList_eTN  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList partList;

    private String distributorCode;

    private String customerNumber;

    private String login;

    private String password;

    private String credentialsGuid;

    public GetCustomerPricesForList_eTN() {
    }

    public GetCustomerPricesForList_eTN(
           pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList partList,
           String distributorCode,
           String customerNumber,
           String login,
           String password,
           String credentialsGuid) {
           this.partList = partList;
           this.distributorCode = distributorCode;
           this.customerNumber = customerNumber;
           this.login = login;
           this.password = password;
           this.credentialsGuid = credentialsGuid;
    }


    /**
     * Gets the partList value for this GetCustomerPricesForList_eTN.
     * 
     * @return partList
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList getPartList() {
        return partList;
    }


    /**
     * Sets the partList value for this GetCustomerPricesForList_eTN.
     * 
     * @param partList
     */
    public void setPartList(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNPartList partList) {
        this.partList = partList;
    }


    /**
     * Gets the distributorCode value for this GetCustomerPricesForList_eTN.
     * 
     * @return distributorCode
     */
    public String getDistributorCode() {
        return distributorCode;
    }


    /**
     * Sets the distributorCode value for this GetCustomerPricesForList_eTN.
     * 
     * @param distributorCode
     */
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }


    /**
     * Gets the customerNumber value for this GetCustomerPricesForList_eTN.
     * 
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this GetCustomerPricesForList_eTN.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the login value for this GetCustomerPricesForList_eTN.
     * 
     * @return login
     */
    public String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this GetCustomerPricesForList_eTN.
     * 
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }


    /**
     * Gets the password value for this GetCustomerPricesForList_eTN.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetCustomerPricesForList_eTN.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the credentialsGuid value for this GetCustomerPricesForList_eTN.
     * 
     * @return credentialsGuid
     */
    public String getCredentialsGuid() {
        return credentialsGuid;
    }


    /**
     * Sets the credentialsGuid value for this GetCustomerPricesForList_eTN.
     * 
     * @param credentialsGuid
     */
    public void setCredentialsGuid(String credentialsGuid) {
        this.credentialsGuid = credentialsGuid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCustomerPricesForList_eTN)) return false;
        GetCustomerPricesForList_eTN other = (GetCustomerPricesForList_eTN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partList==null && other.getPartList()==null) || 
             (this.partList!=null &&
              this.partList.equals(other.getPartList()))) &&
            ((this.distributorCode==null && other.getDistributorCode()==null) || 
             (this.distributorCode!=null &&
              this.distributorCode.equals(other.getDistributorCode()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.credentialsGuid==null && other.getCredentialsGuid()==null) || 
             (this.credentialsGuid!=null &&
              this.credentialsGuid.equals(other.getCredentialsGuid())));
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
        if (getPartList() != null) {
            _hashCode += getPartList().hashCode();
        }
        if (getDistributorCode() != null) {
            _hashCode += getDistributorCode().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCredentialsGuid() != null) {
            _hashCode += getCredentialsGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerPricesForList_eTN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesForList_eTN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList_eTN>PartList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialsGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
