/**
 * UploadStockLevels_eTN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class UploadStockLevels_eTN  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels stockLevels;

    private String storeID;

    private String credentialsGuid;

    public UploadStockLevels_eTN() {
    }

    public UploadStockLevels_eTN(
           pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels stockLevels,
           String storeID,
           String credentialsGuid) {
           this.stockLevels = stockLevels;
           this.storeID = storeID;
           this.credentialsGuid = credentialsGuid;
    }


    /**
     * Gets the stockLevels value for this UploadStockLevels_eTN.
     * 
     * @return stockLevels
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels getStockLevels() {
        return stockLevels;
    }


    /**
     * Sets the stockLevels value for this UploadStockLevels_eTN.
     * 
     * @param stockLevels
     */
    public void setStockLevels(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevels_eTNStockLevels stockLevels) {
        this.stockLevels = stockLevels;
    }


    /**
     * Gets the storeID value for this UploadStockLevels_eTN.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this UploadStockLevels_eTN.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }


    /**
     * Gets the credentialsGuid value for this UploadStockLevels_eTN.
     * 
     * @return credentialsGuid
     */
    public String getCredentialsGuid() {
        return credentialsGuid;
    }


    /**
     * Sets the credentialsGuid value for this UploadStockLevels_eTN.
     * 
     * @param credentialsGuid
     */
    public void setCredentialsGuid(String credentialsGuid) {
        this.credentialsGuid = credentialsGuid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UploadStockLevels_eTN)) return false;
        UploadStockLevels_eTN other = (UploadStockLevels_eTN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stockLevels==null && other.getStockLevels()==null) || 
             (this.stockLevels!=null &&
              this.stockLevels.equals(other.getStockLevels()))) &&
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID()))) &&
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
        if (getStockLevels() != null) {
            _hashCode += getStockLevels().hashCode();
        }
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
        }
        if (getCredentialsGuid() != null) {
            _hashCode += getCredentialsGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadStockLevels_eTN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevels_eTN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StockLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevels_eTN>StockLevels"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StoreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
