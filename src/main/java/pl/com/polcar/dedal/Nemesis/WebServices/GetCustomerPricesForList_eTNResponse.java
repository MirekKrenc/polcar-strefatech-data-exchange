/**
 * GetCustomerPricesForList_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetCustomerPricesForList_eTNResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getCustomerPricesForList_eTNResult;

    public GetCustomerPricesForList_eTNResponse() {
    }

    public GetCustomerPricesForList_eTNResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getCustomerPricesForList_eTNResult) {
           this.getCustomerPricesForList_eTNResult = getCustomerPricesForList_eTNResult;
    }


    /**
     * Gets the getCustomerPricesForList_eTNResult value for this GetCustomerPricesForList_eTNResponse.
     * 
     * @return getCustomerPricesForList_eTNResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getGetCustomerPricesForList_eTNResult() {
        return getCustomerPricesForList_eTNResult;
    }


    /**
     * Sets the getCustomerPricesForList_eTNResult value for this GetCustomerPricesForList_eTNResponse.
     * 
     * @param getCustomerPricesForList_eTNResult
     */
    public void setGetCustomerPricesForList_eTNResult(pl.com.polcar.dedal.Nemesis.WebServices.GetCustomerPricesForList_eTNResponseGetCustomerPricesForList_eTNResult getCustomerPricesForList_eTNResult) {
        this.getCustomerPricesForList_eTNResult = getCustomerPricesForList_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCustomerPricesForList_eTNResponse)) return false;
        GetCustomerPricesForList_eTNResponse other = (GetCustomerPricesForList_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCustomerPricesForList_eTNResult==null && other.getGetCustomerPricesForList_eTNResult()==null) || 
             (this.getCustomerPricesForList_eTNResult!=null &&
              this.getCustomerPricesForList_eTNResult.equals(other.getGetCustomerPricesForList_eTNResult())));
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
        if (getGetCustomerPricesForList_eTNResult() != null) {
            _hashCode += getGetCustomerPricesForList_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerPricesForList_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetCustomerPricesForList_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCustomerPricesForList_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetCustomerPricesForList_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetCustomerPricesForList_eTNResponse>GetCustomerPricesForList_eTNResult"));
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
