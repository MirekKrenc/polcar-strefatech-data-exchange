/**
 * SetCustomerPricesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class SetCustomerPricesResponse  implements java.io.Serializable {
    private String setCustomerPricesResult;

    public SetCustomerPricesResponse() {
    }

    public SetCustomerPricesResponse(
           String setCustomerPricesResult) {
           this.setCustomerPricesResult = setCustomerPricesResult;
    }


    /**
     * Gets the setCustomerPricesResult value for this SetCustomerPricesResponse.
     * 
     * @return setCustomerPricesResult
     */
    public String getSetCustomerPricesResult() {
        return setCustomerPricesResult;
    }


    /**
     * Sets the setCustomerPricesResult value for this SetCustomerPricesResponse.
     * 
     * @param setCustomerPricesResult
     */
    public void setSetCustomerPricesResult(String setCustomerPricesResult) {
        this.setCustomerPricesResult = setCustomerPricesResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetCustomerPricesResponse)) return false;
        SetCustomerPricesResponse other = (SetCustomerPricesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setCustomerPricesResult==null && other.getSetCustomerPricesResult()==null) || 
             (this.setCustomerPricesResult!=null &&
              this.setCustomerPricesResult.equals(other.getSetCustomerPricesResult())));
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
        if (getSetCustomerPricesResult() != null) {
            _hashCode += getSetCustomerPricesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomerPricesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPricesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setCustomerPricesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "SetCustomerPricesResult"));
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
