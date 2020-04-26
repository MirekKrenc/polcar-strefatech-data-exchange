/**
 * GetStockLevels_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetStockLevels_eTNResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getStockLevels_eTNResult;

    public GetStockLevels_eTNResponse() {
    }

    public GetStockLevels_eTNResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getStockLevels_eTNResult) {
           this.getStockLevels_eTNResult = getStockLevels_eTNResult;
    }


    /**
     * Gets the getStockLevels_eTNResult value for this GetStockLevels_eTNResponse.
     * 
     * @return getStockLevels_eTNResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getGetStockLevels_eTNResult() {
        return getStockLevels_eTNResult;
    }


    /**
     * Sets the getStockLevels_eTNResult value for this GetStockLevels_eTNResponse.
     * 
     * @param getStockLevels_eTNResult
     */
    public void setGetStockLevels_eTNResult(pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevels_eTNResponseGetStockLevels_eTNResult getStockLevels_eTNResult) {
        this.getStockLevels_eTNResult = getStockLevels_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetStockLevels_eTNResponse)) return false;
        GetStockLevels_eTNResponse other = (GetStockLevels_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStockLevels_eTNResult==null && other.getGetStockLevels_eTNResult()==null) || 
             (this.getStockLevels_eTNResult!=null &&
              this.getStockLevels_eTNResult.equals(other.getGetStockLevels_eTNResult())));
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
        if (getGetStockLevels_eTNResult() != null) {
            _hashCode += getGetStockLevels_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStockLevels_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevels_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStockLevels_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevels_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevels_eTNResponse>GetStockLevels_eTNResult"));
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
