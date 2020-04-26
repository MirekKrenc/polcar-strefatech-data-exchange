/**
 * UploadStockLevelsWithReportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class UploadStockLevelsWithReportResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult uploadStockLevelsWithReportResult;

    public UploadStockLevelsWithReportResponse() {
    }

    public UploadStockLevelsWithReportResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult uploadStockLevelsWithReportResult) {
           this.uploadStockLevelsWithReportResult = uploadStockLevelsWithReportResult;
    }


    /**
     * Gets the uploadStockLevelsWithReportResult value for this UploadStockLevelsWithReportResponse.
     * 
     * @return uploadStockLevelsWithReportResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult getUploadStockLevelsWithReportResult() {
        return uploadStockLevelsWithReportResult;
    }


    /**
     * Sets the uploadStockLevelsWithReportResult value for this UploadStockLevelsWithReportResponse.
     * 
     * @param uploadStockLevelsWithReportResult
     */
    public void setUploadStockLevelsWithReportResult(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportResponseUploadStockLevelsWithReportResult uploadStockLevelsWithReportResult) {
        this.uploadStockLevelsWithReportResult = uploadStockLevelsWithReportResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UploadStockLevelsWithReportResponse)) return false;
        UploadStockLevelsWithReportResponse other = (UploadStockLevelsWithReportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uploadStockLevelsWithReportResult==null && other.getUploadStockLevelsWithReportResult()==null) || 
             (this.uploadStockLevelsWithReportResult!=null &&
              this.uploadStockLevelsWithReportResult.equals(other.getUploadStockLevelsWithReportResult())));
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
        if (getUploadStockLevelsWithReportResult() != null) {
            _hashCode += getUploadStockLevelsWithReportResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadStockLevelsWithReportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevelsWithReportResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadStockLevelsWithReportResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "UploadStockLevelsWithReportResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevelsWithReportResponse>UploadStockLevelsWithReportResult"));
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
