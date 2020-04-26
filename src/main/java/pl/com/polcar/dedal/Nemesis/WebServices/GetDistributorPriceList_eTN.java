/**
 * GetDistributorPriceList_eTN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetDistributorPriceList_eTN  implements java.io.Serializable {
    private String distributorCode;

    private String priceListName;

    private String credentialsGuid;

    public GetDistributorPriceList_eTN() {
    }

    public GetDistributorPriceList_eTN(
           String distributorCode,
           String priceListName,
           String credentialsGuid) {
           this.distributorCode = distributorCode;
           this.priceListName = priceListName;
           this.credentialsGuid = credentialsGuid;
    }


    /**
     * Gets the distributorCode value for this GetDistributorPriceList_eTN.
     * 
     * @return distributorCode
     */
    public String getDistributorCode() {
        return distributorCode;
    }


    /**
     * Sets the distributorCode value for this GetDistributorPriceList_eTN.
     * 
     * @param distributorCode
     */
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }


    /**
     * Gets the priceListName value for this GetDistributorPriceList_eTN.
     * 
     * @return priceListName
     */
    public String getPriceListName() {
        return priceListName;
    }


    /**
     * Sets the priceListName value for this GetDistributorPriceList_eTN.
     * 
     * @param priceListName
     */
    public void setPriceListName(String priceListName) {
        this.priceListName = priceListName;
    }


    /**
     * Gets the credentialsGuid value for this GetDistributorPriceList_eTN.
     * 
     * @return credentialsGuid
     */
    public String getCredentialsGuid() {
        return credentialsGuid;
    }


    /**
     * Sets the credentialsGuid value for this GetDistributorPriceList_eTN.
     * 
     * @param credentialsGuid
     */
    public void setCredentialsGuid(String credentialsGuid) {
        this.credentialsGuid = credentialsGuid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDistributorPriceList_eTN)) return false;
        GetDistributorPriceList_eTN other = (GetDistributorPriceList_eTN) obj;
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
        if (getDistributorCode() != null) {
            _hashCode += getDistributorCode().hashCode();
        }
        if (getPriceListName() != null) {
            _hashCode += getPriceListName().hashCode();
        }
        if (getCredentialsGuid() != null) {
            _hashCode += getCredentialsGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDistributorPriceList_eTN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceList_eTN"));
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
