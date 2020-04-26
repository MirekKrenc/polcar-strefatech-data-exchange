/**
 * GetEAN13ListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetEAN13ListResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getEAN13ListResult;

    public GetEAN13ListResponse() {
    }

    public GetEAN13ListResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getEAN13ListResult) {
           this.getEAN13ListResult = getEAN13ListResult;
    }


    /**
     * Gets the getEAN13ListResult value for this GetEAN13ListResponse.
     * 
     * @return getEAN13ListResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getGetEAN13ListResult() {
        return getEAN13ListResult;
    }


    /**
     * Sets the getEAN13ListResult value for this GetEAN13ListResponse.
     * 
     * @param getEAN13ListResult
     */
    public void setGetEAN13ListResult(pl.com.polcar.dedal.Nemesis.WebServices.GetEAN13ListResponseGetEAN13ListResult getEAN13ListResult) {
        this.getEAN13ListResult = getEAN13ListResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetEAN13ListResponse)) return false;
        GetEAN13ListResponse other = (GetEAN13ListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEAN13ListResult==null && other.getGetEAN13ListResult()==null) || 
             (this.getEAN13ListResult!=null &&
              this.getEAN13ListResult.equals(other.getGetEAN13ListResult())));
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
        if (getGetEAN13ListResult() != null) {
            _hashCode += getGetEAN13ListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEAN13ListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetEAN13ListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEAN13ListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetEAN13ListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetEAN13ListResponse>GetEAN13ListResult"));
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
