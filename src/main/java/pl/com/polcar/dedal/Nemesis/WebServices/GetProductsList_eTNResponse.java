/**
 * GetProductsList_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetProductsList_eTNResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getProductsList_eTNResult;

    public GetProductsList_eTNResponse() {
    }

    public GetProductsList_eTNResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getProductsList_eTNResult) {
           this.getProductsList_eTNResult = getProductsList_eTNResult;
    }


    /**
     * Gets the getProductsList_eTNResult value for this GetProductsList_eTNResponse.
     * 
     * @return getProductsList_eTNResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getGetProductsList_eTNResult() {
        return getProductsList_eTNResult;
    }


    /**
     * Sets the getProductsList_eTNResult value for this GetProductsList_eTNResponse.
     * 
     * @param getProductsList_eTNResult
     */
    public void setGetProductsList_eTNResult(pl.com.polcar.dedal.Nemesis.WebServices.GetProductsList_eTNResponseGetProductsList_eTNResult getProductsList_eTNResult) {
        this.getProductsList_eTNResult = getProductsList_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetProductsList_eTNResponse)) return false;
        GetProductsList_eTNResponse other = (GetProductsList_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getProductsList_eTNResult==null && other.getGetProductsList_eTNResult()==null) || 
             (this.getProductsList_eTNResult!=null &&
              this.getProductsList_eTNResult.equals(other.getGetProductsList_eTNResult())));
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
        if (getGetProductsList_eTNResult() != null) {
            _hashCode += getGetProductsList_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductsList_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetProductsList_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getProductsList_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetProductsList_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetProductsList_eTNResponse>GetProductsList_eTNResult"));
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
