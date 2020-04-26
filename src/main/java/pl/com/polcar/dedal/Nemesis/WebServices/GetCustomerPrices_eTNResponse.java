/**
 * GetCustomerPrices_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetCustomerPrices_eTNResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getCustomerPrices_eTNResult;

    public GetCustomerPrices_eTNResponse() {
    }

    public GetCustomerPrices_eTNResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getCustomerPrices_eTNResult) {
           this.getCustomerPrices_eTNResult = getCustomerPrices_eTNResult;
    }


    /**
     * Gets the getCustomerPrices_eTNResult value for this GetCustomerPrices_eTNResponse.
     * 
     * @return getCustomerPrices_eTNResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getGetCustomerPrices_eTNResult() {
        return getCustomerPrices_eTNResult;
    }


    /**
     * Sets the getCustomerPrices_eTNResult value for this GetCustomerPrices_eTNResponse.
     * 
     * @param getCustomerPrices_eTNResult
     */
    public void setGetCustomerPrices_eTNResult(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPrices_eTNResponseGetCustomerPrices_eTNResult getCustomerPrices_eTNResult) {
        this.getCustomerPrices_eTNResult = getCustomerPrices_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCustomerPrices_eTNResponse)) return false;
        GetCustomerPrices_eTNResponse other = (GetCustomerPrices_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCustomerPrices_eTNResult==null && other.getGetCustomerPrices_eTNResult()==null) || 
             (this.getCustomerPrices_eTNResult!=null &&
              this.getCustomerPrices_eTNResult.equals(other.getGetCustomerPrices_eTNResult())));
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
        if (getGetCustomerPrices_eTNResult() != null) {
            _hashCode += getGetCustomerPrices_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerPrices_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPrices_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCustomerPrices_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPrices_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPrices_eTNResponse>GetCustomerPrices_eTNResult"));
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
