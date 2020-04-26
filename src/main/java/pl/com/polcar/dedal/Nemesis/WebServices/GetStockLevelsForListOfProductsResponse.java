/**
 * GetStockLevelsForListOfProductsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetStockLevelsForListOfProductsResponse  implements java.io.Serializable {
    private ProductResponse getStockLevelsForListOfProductsResult;

    public GetStockLevelsForListOfProductsResponse() {
    }

    public GetStockLevelsForListOfProductsResponse(
           ProductResponse getStockLevelsForListOfProductsResult) {
           this.getStockLevelsForListOfProductsResult = getStockLevelsForListOfProductsResult;
    }


    /**
     * Gets the getStockLevelsForListOfProductsResult value for this GetStockLevelsForListOfProductsResponse.
     * 
     * @return getStockLevelsForListOfProductsResult
     */
    public ProductResponse getGetStockLevelsForListOfProductsResult() {
        return getStockLevelsForListOfProductsResult;
    }


    /**
     * Sets the getStockLevelsForListOfProductsResult value for this GetStockLevelsForListOfProductsResponse.
     * 
     * @param getStockLevelsForListOfProductsResult
     */
    public void setGetStockLevelsForListOfProductsResult(ProductResponse getStockLevelsForListOfProductsResult) {
        this.getStockLevelsForListOfProductsResult = getStockLevelsForListOfProductsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetStockLevelsForListOfProductsResponse)) return false;
        GetStockLevelsForListOfProductsResponse other = (GetStockLevelsForListOfProductsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStockLevelsForListOfProductsResult==null && other.getGetStockLevelsForListOfProductsResult()==null) || 
             (this.getStockLevelsForListOfProductsResult!=null &&
              this.getStockLevelsForListOfProductsResult.equals(other.getGetStockLevelsForListOfProductsResult())));
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
        if (getGetStockLevelsForListOfProductsResult() != null) {
            _hashCode += getGetStockLevelsForListOfProductsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStockLevelsForListOfProductsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForListOfProductsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStockLevelsForListOfProductsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsForListOfProductsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "ProductResponse"));
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
