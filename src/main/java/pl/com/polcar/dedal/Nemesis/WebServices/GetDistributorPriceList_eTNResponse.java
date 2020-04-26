/**
 * GetDistributorPriceList_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetDistributorPriceList_eTNResponse  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getDistributorPriceList_eTNResult;

    public GetDistributorPriceList_eTNResponse() {
    }

    public GetDistributorPriceList_eTNResponse(
           pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getDistributorPriceList_eTNResult) {
           this.getDistributorPriceList_eTNResult = getDistributorPriceList_eTNResult;
    }


    /**
     * Gets the getDistributorPriceList_eTNResult value for this GetDistributorPriceList_eTNResponse.
     * 
     * @return getDistributorPriceList_eTNResult
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getGetDistributorPriceList_eTNResult() {
        return getDistributorPriceList_eTNResult;
    }


    /**
     * Sets the getDistributorPriceList_eTNResult value for this GetDistributorPriceList_eTNResponse.
     * 
     * @param getDistributorPriceList_eTNResult
     */
    public void setGetDistributorPriceList_eTNResult(pl.com.polcar.dedal.Nemesis.WebServices.GetDistributorPriceList_eTNResponseGetDistributorPriceList_eTNResult getDistributorPriceList_eTNResult) {
        this.getDistributorPriceList_eTNResult = getDistributorPriceList_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDistributorPriceList_eTNResponse)) return false;
        GetDistributorPriceList_eTNResponse other = (GetDistributorPriceList_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDistributorPriceList_eTNResult==null && other.getGetDistributorPriceList_eTNResult()==null) || 
             (this.getDistributorPriceList_eTNResult!=null &&
              this.getDistributorPriceList_eTNResult.equals(other.getGetDistributorPriceList_eTNResult())));
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
        if (getGetDistributorPriceList_eTNResult() != null) {
            _hashCode += getGetDistributorPriceList_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDistributorPriceList_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetDistributorPriceList_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDistributorPriceList_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "GetDistributorPriceList_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetDistributorPriceList_eTNResponse>GetDistributorPriceList_eTNResult"));
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
