/**
 * SetDistributorPriceList_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class SetDistributorPriceList_eTNResponse  implements java.io.Serializable {
    private String setDistributorPriceList_eTNResult;

    public SetDistributorPriceList_eTNResponse() {
    }

    public SetDistributorPriceList_eTNResponse(
           String setDistributorPriceList_eTNResult) {
           this.setDistributorPriceList_eTNResult = setDistributorPriceList_eTNResult;
    }


    /**
     * Gets the setDistributorPriceList_eTNResult value for this SetDistributorPriceList_eTNResponse.
     * 
     * @return setDistributorPriceList_eTNResult
     */
    public String getSetDistributorPriceList_eTNResult() {
        return setDistributorPriceList_eTNResult;
    }


    /**
     * Sets the setDistributorPriceList_eTNResult value for this SetDistributorPriceList_eTNResponse.
     * 
     * @param setDistributorPriceList_eTNResult
     */
    public void setSetDistributorPriceList_eTNResult(String setDistributorPriceList_eTNResult) {
        this.setDistributorPriceList_eTNResult = setDistributorPriceList_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetDistributorPriceList_eTNResponse)) return false;
        SetDistributorPriceList_eTNResponse other = (SetDistributorPriceList_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setDistributorPriceList_eTNResult==null && other.getSetDistributorPriceList_eTNResult()==null) || 
             (this.setDistributorPriceList_eTNResult!=null &&
              this.setDistributorPriceList_eTNResult.equals(other.getSetDistributorPriceList_eTNResult())));
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
        if (getSetDistributorPriceList_eTNResult() != null) {
            _hashCode += getSetDistributorPriceList_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetDistributorPriceList_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetDistributorPriceList_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setDistributorPriceList_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetDistributorPriceList_eTNResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
