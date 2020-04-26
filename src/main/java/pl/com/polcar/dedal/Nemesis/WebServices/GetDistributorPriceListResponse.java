/**
 * GetDistributorPriceListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetDistributorPriceListResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getDistributorPriceListResult;

    public GetDistributorPriceListResponse() {
    }

    public GetDistributorPriceListResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getDistributorPriceListResult) {
           this.getDistributorPriceListResult = getDistributorPriceListResult;
    }


    /**
     * Gets the getDistributorPriceListResult value for this GetDistributorPriceListResponse.
     * 
     * @return getDistributorPriceListResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getGetDistributorPriceListResult() {
        return getDistributorPriceListResult;
    }


    /**
     * Sets the getDistributorPriceListResult value for this GetDistributorPriceListResponse.
     * 
     * @param getDistributorPriceListResult
     */
    public void setGetDistributorPriceListResult(pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceListResponseGetDistributorPriceListResult getDistributorPriceListResult) {
        this.getDistributorPriceListResult = getDistributorPriceListResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDistributorPriceListResponse)) return false;
        GetDistributorPriceListResponse other = (GetDistributorPriceListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDistributorPriceListResult==null && other.getGetDistributorPriceListResult()==null) || 
             (this.getDistributorPriceListResult!=null &&
              this.getDistributorPriceListResult.equals(other.getGetDistributorPriceListResult())));
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
        if (getGetDistributorPriceListResult() != null) {
            _hashCode += getGetDistributorPriceListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDistributorPriceListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDistributorPriceListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetDistributorPriceListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetDistributorPriceListResponse>GetDistributorPriceListResult"));
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
