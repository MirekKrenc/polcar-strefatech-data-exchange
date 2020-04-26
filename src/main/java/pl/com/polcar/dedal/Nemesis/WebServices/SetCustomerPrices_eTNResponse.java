/**
 * SetCustomerPrices_eTNResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class SetCustomerPrices_eTNResponse  implements java.io.Serializable {
    private String setCustomerPrices_eTNResult;

    public SetCustomerPrices_eTNResponse() {
    }

    public SetCustomerPrices_eTNResponse(
           String setCustomerPrices_eTNResult) {
           this.setCustomerPrices_eTNResult = setCustomerPrices_eTNResult;
    }


    /**
     * Gets the setCustomerPrices_eTNResult value for this SetCustomerPrices_eTNResponse.
     * 
     * @return setCustomerPrices_eTNResult
     */
    public String getSetCustomerPrices_eTNResult() {
        return setCustomerPrices_eTNResult;
    }


    /**
     * Sets the setCustomerPrices_eTNResult value for this SetCustomerPrices_eTNResponse.
     * 
     * @param setCustomerPrices_eTNResult
     */
    public void setSetCustomerPrices_eTNResult(String setCustomerPrices_eTNResult) {
        this.setCustomerPrices_eTNResult = setCustomerPrices_eTNResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetCustomerPrices_eTNResponse)) return false;
        SetCustomerPrices_eTNResponse other = (SetCustomerPrices_eTNResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setCustomerPrices_eTNResult==null && other.getSetCustomerPrices_eTNResult()==null) || 
             (this.setCustomerPrices_eTNResult!=null &&
              this.setCustomerPrices_eTNResult.equals(other.getSetCustomerPrices_eTNResult())));
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
        if (getSetCustomerPrices_eTNResult() != null) {
            _hashCode += getSetCustomerPrices_eTNResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomerPrices_eTNResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPrices_eTNResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setCustomerPrices_eTNResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetCustomerPrices_eTNResult"));
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
