/**
 * GetCustomerPricesForListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetCustomerPricesForListResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getCustomerPricesForListResult;

    public GetCustomerPricesForListResponse() {
    }

    public GetCustomerPricesForListResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getCustomerPricesForListResult) {
           this.getCustomerPricesForListResult = getCustomerPricesForListResult;
    }


    /**
     * Gets the getCustomerPricesForListResult value for this GetCustomerPricesForListResponse.
     * 
     * @return getCustomerPricesForListResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getGetCustomerPricesForListResult() {
        return getCustomerPricesForListResult;
    }


    /**
     * Sets the getCustomerPricesForListResult value for this GetCustomerPricesForListResponse.
     * 
     * @param getCustomerPricesForListResult
     */
    public void setGetCustomerPricesForListResult(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForListResponseGetCustomerPricesForListResult getCustomerPricesForListResult) {
        this.getCustomerPricesForListResult = getCustomerPricesForListResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCustomerPricesForListResponse)) return false;
        GetCustomerPricesForListResponse other = (GetCustomerPricesForListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCustomerPricesForListResult==null && other.getGetCustomerPricesForListResult()==null) || 
             (this.getCustomerPricesForListResult!=null &&
              this.getCustomerPricesForListResult.equals(other.getGetCustomerPricesForListResult())));
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
        if (getGetCustomerPricesForListResult() != null) {
            _hashCode += getGetCustomerPricesForListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerPricesForListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesForListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCustomerPricesForListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesForListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForListResponse>GetCustomerPricesForListResult"));
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
