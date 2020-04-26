/**
 * GetProductsListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetProductsListResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getProductsListResult;

    public GetProductsListResponse() {
    }

    public GetProductsListResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getProductsListResult) {
           this.getProductsListResult = getProductsListResult;
    }


    /**
     * Gets the getProductsListResult value for this GetProductsListResponse.
     * 
     * @return getProductsListResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getGetProductsListResult() {
        return getProductsListResult;
    }


    /**
     * Sets the getProductsListResult value for this GetProductsListResponse.
     * 
     * @param getProductsListResult
     */
    public void setGetProductsListResult(pl.com.polcar.dedal.Nemesis.WebServices.GetProductsListResponseGetProductsListResult getProductsListResult) {
        this.getProductsListResult = getProductsListResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetProductsListResponse)) return false;
        GetProductsListResponse other = (GetProductsListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getProductsListResult==null && other.getGetProductsListResult()==null) || 
             (this.getProductsListResult!=null &&
              this.getProductsListResult.equals(other.getGetProductsListResult())));
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
        if (getGetProductsListResult() != null) {
            _hashCode += getGetProductsListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductsListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getProductsListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetProductsListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetProductsListResponse>GetProductsListResult"));
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
