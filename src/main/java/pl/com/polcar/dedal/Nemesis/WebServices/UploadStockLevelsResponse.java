/**
 * UploadStockLevelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class UploadStockLevelsResponse  implements java.io.Serializable {
    private String uploadStockLevelsResult;

    public UploadStockLevelsResponse() {
    }

    public UploadStockLevelsResponse(
           String uploadStockLevelsResult) {
           this.uploadStockLevelsResult = uploadStockLevelsResult;
    }


    /**
     * Gets the uploadStockLevelsResult value for this UploadStockLevelsResponse.
     * 
     * @return uploadStockLevelsResult
     */
    public String getUploadStockLevelsResult() {
        return uploadStockLevelsResult;
    }


    /**
     * Sets the uploadStockLevelsResult value for this UploadStockLevelsResponse.
     * 
     * @param uploadStockLevelsResult
     */
    public void setUploadStockLevelsResult(String uploadStockLevelsResult) {
        this.uploadStockLevelsResult = uploadStockLevelsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UploadStockLevelsResponse)) return false;
        UploadStockLevelsResponse other = (UploadStockLevelsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uploadStockLevelsResult==null && other.getUploadStockLevelsResult()==null) || 
             (this.uploadStockLevelsResult!=null &&
              this.uploadStockLevelsResult.equals(other.getUploadStockLevelsResult())));
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
        if (getUploadStockLevelsResult() != null) {
            _hashCode += getUploadStockLevelsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadStockLevelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadStockLevelsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevelsResult"));
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
