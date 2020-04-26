/**
 * GetStockLevelsForListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetStockLevelsForListResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getStockLevelsForListResult;

    public GetStockLevelsForListResponse() {
    }

    public GetStockLevelsForListResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getStockLevelsForListResult) {
           this.getStockLevelsForListResult = getStockLevelsForListResult;
    }


    /**
     * Gets the getStockLevelsForListResult value for this GetStockLevelsForListResponse.
     * 
     * @return getStockLevelsForListResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getGetStockLevelsForListResult() {
        return getStockLevelsForListResult;
    }


    /**
     * Sets the getStockLevelsForListResult value for this GetStockLevelsForListResponse.
     * 
     * @param getStockLevelsForListResult
     */
    public void setGetStockLevelsForListResult(pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListResponseGetStockLevelsForListResult getStockLevelsForListResult) {
        this.getStockLevelsForListResult = getStockLevelsForListResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetStockLevelsForListResponse)) return false;
        GetStockLevelsForListResponse other = (GetStockLevelsForListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStockLevelsForListResult==null && other.getGetStockLevelsForListResult()==null) || 
             (this.getStockLevelsForListResult!=null &&
              this.getStockLevelsForListResult.equals(other.getGetStockLevelsForListResult())));
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
        if (getGetStockLevelsForListResult() != null) {
            _hashCode += getGetStockLevelsForListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStockLevelsForListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStockLevelsForListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetStockLevelsForListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsForListResponse>GetStockLevelsForListResult"));
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
