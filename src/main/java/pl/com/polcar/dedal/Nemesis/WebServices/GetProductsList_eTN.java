/**
 * GetProductsList_eTN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetProductsList_eTN  implements java.io.Serializable {
    private int languageID;

    private int formatID;

    private String credentialsGuid;

    public GetProductsList_eTN() {
    }

    public GetProductsList_eTN(
           int languageID,
           int formatID,
           String credentialsGuid) {
           this.languageID = languageID;
           this.formatID = formatID;
           this.credentialsGuid = credentialsGuid;
    }


    /**
     * Gets the languageID value for this GetProductsList_eTN.
     * 
     * @return languageID
     */
    public int getLanguageID() {
        return languageID;
    }


    /**
     * Sets the languageID value for this GetProductsList_eTN.
     * 
     * @param languageID
     */
    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }


    /**
     * Gets the formatID value for this GetProductsList_eTN.
     * 
     * @return formatID
     */
    public int getFormatID() {
        return formatID;
    }


    /**
     * Sets the formatID value for this GetProductsList_eTN.
     * 
     * @param formatID
     */
    public void setFormatID(int formatID) {
        this.formatID = formatID;
    }


    /**
     * Gets the credentialsGuid value for this GetProductsList_eTN.
     * 
     * @return credentialsGuid
     */
    public String getCredentialsGuid() {
        return credentialsGuid;
    }


    /**
     * Sets the credentialsGuid value for this GetProductsList_eTN.
     * 
     * @param credentialsGuid
     */
    public void setCredentialsGuid(String credentialsGuid) {
        this.credentialsGuid = credentialsGuid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetProductsList_eTN)) return false;
        GetProductsList_eTN other = (GetProductsList_eTN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.languageID == other.getLanguageID() &&
            this.formatID == other.getFormatID() &&
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
        _hashCode += getLanguageID();
        _hashCode += getFormatID();
        if (getCredentialsGuid() != null) {
            _hashCode += getCredentialsGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductsList_eTN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsList_eTN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "LanguageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "FormatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
