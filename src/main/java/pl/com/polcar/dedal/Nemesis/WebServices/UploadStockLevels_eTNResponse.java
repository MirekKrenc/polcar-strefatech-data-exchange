/**
 * UploadStockLevels_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class UploadStockLevels_eTNResponse  implements java.io.Serializable {
    private String uploadStockLevels_eTNResult;

    public UploadStockLevels_eTNResponse() {
    }

    public UploadStockLevels_eTNResponse(
           String uploadStockLevels_eTNResult) {
           this.uploadStockLevels_eTNResult = uploadStockLevels_eTNResult;
    }


    /**
     * Gets the uploadStockLevels_eTNResult value for this UploadStockLevels_eTNResponse.
     * 
     * @return uploadStockLevels_eTNResult
     */
    public String getUploadStockLevels_eTNResult() {
        return uploadStockLevels_eTNResult;
    }


    /**
     * Sets the uploadStockLevels_eTNResult value for this UploadStockLevels_eTNResponse.
     * 
     * @param uploadStockLevels_eTNResult
     */
    public void setUploadStockLevels_eTNResult(String uploadStockLevels_eTNResult) {
        this.uploadStockLevels_eTNResult = uploadStockLevels_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UploadStockLevels_eTNResponse)) return false;
        UploadStockLevels_eTNResponse other = (UploadStockLevels_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uploadStockLevels_eTNResult==null && other.getUploadStockLevels_eTNResult()==null) || 
             (this.uploadStockLevels_eTNResult!=null &&
              this.uploadStockLevels_eTNResult.equals(other.getUploadStockLevels_eTNResult())));
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
        if (getUploadStockLevels_eTNResult() != null) {
            _hashCode += getUploadStockLevels_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadStockLevels_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevels_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadStockLevels_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevels_eTNResult"));
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
