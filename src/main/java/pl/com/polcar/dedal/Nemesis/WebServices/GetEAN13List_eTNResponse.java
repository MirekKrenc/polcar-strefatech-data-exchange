/**
 * GetEAN13List_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetEAN13List_eTNResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getEAN13List_eTNResult;

    public GetEAN13List_eTNResponse() {
    }

    public GetEAN13List_eTNResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getEAN13List_eTNResult) {
           this.getEAN13List_eTNResult = getEAN13List_eTNResult;
    }


    /**
     * Gets the getEAN13List_eTNResult value for this GetEAN13List_eTNResponse.
     * 
     * @return getEAN13List_eTNResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getGetEAN13List_eTNResult() {
        return getEAN13List_eTNResult;
    }


    /**
     * Sets the getEAN13List_eTNResult value for this GetEAN13List_eTNResponse.
     * 
     * @param getEAN13List_eTNResult
     */
    public void setGetEAN13List_eTNResult(pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13List_eTNResponseGetEAN13List_eTNResult getEAN13List_eTNResult) {
        this.getEAN13List_eTNResult = getEAN13List_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetEAN13List_eTNResponse)) return false;
        GetEAN13List_eTNResponse other = (GetEAN13List_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEAN13List_eTNResult==null && other.getGetEAN13List_eTNResult()==null) || 
             (this.getEAN13List_eTNResult!=null &&
              this.getEAN13List_eTNResult.equals(other.getGetEAN13List_eTNResult())));
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
        if (getGetEAN13List_eTNResult() != null) {
            _hashCode += getGetEAN13List_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEAN13List_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetEAN13List_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEAN13List_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetEAN13List_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetEAN13List_eTNResponse>GetEAN13List_eTNResult"));
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
