/**
 * SetCustomerPrices_eTN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class SetCustomerPrices_eTN  implements java.io.Serializable {
    private String distributorCode;

    private String customerNumber;

    private pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices prices;

    private int howToDealWithPreviousPrices;

    private String credentialsGuid;

    public SetCustomerPrices_eTN() {
    }

    public SetCustomerPrices_eTN(
           String distributorCode,
           String customerNumber,
           pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices prices,
           int howToDealWithPreviousPrices,
           String credentialsGuid) {
           this.distributorCode = distributorCode;
           this.customerNumber = customerNumber;
           this.prices = prices;
           this.howToDealWithPreviousPrices = howToDealWithPreviousPrices;
           this.credentialsGuid = credentialsGuid;
    }


    /**
     * Gets the distributorCode value for this SetCustomerPrices_eTN.
     * 
     * @return distributorCode
     */
    public String getDistributorCode() {
        return distributorCode;
    }


    /**
     * Sets the distributorCode value for this SetCustomerPrices_eTN.
     * 
     * @param distributorCode
     */
    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }


    /**
     * Gets the customerNumber value for this SetCustomerPrices_eTN.
     * 
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this SetCustomerPrices_eTN.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the prices value for this SetCustomerPrices_eTN.
     * 
     * @return prices
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices getPrices() {
        return prices;
    }


    /**
     * Sets the prices value for this SetCustomerPrices_eTN.
     * 
     * @param prices
     */
    public void setPrices(pl.com.polcar.dedal.Nemesis.WebServices.SetCustomerPrices_eTNPrices prices) {
        this.prices = prices;
    }


    /**
     * Gets the howToDealWithPreviousPrices value for this SetCustomerPrices_eTN.
     * 
     * @return howToDealWithPreviousPrices
     */
    public int getHowToDealWithPreviousPrices() {
        return howToDealWithPreviousPrices;
    }


    /**
     * Sets the howToDealWithPreviousPrices value for this SetCustomerPrices_eTN.
     * 
     * @param howToDealWithPreviousPrices
     */
    public void setHowToDealWithPreviousPrices(int howToDealWithPreviousPrices) {
        this.howToDealWithPreviousPrices = howToDealWithPreviousPrices;
    }


    /**
     * Gets the credentialsGuid value for this SetCustomerPrices_eTN.
     * 
     * @return credentialsGuid
     */
    public String getCredentialsGuid() {
        return credentialsGuid;
    }


    /**
     * Sets the credentialsGuid value for this SetCustomerPrices_eTN.
     * 
     * @param credentialsGuid
     */
    public void setCredentialsGuid(String credentialsGuid) {
        this.credentialsGuid = credentialsGuid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetCustomerPrices_eTN)) return false;
        SetCustomerPrices_eTN other = (SetCustomerPrices_eTN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributorCode==null && other.getDistributorCode()==null) || 
             (this.distributorCode!=null &&
              this.distributorCode.equals(other.getDistributorCode()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.prices==null && other.getPrices()==null) || 
             (this.prices!=null &&
              this.prices.equals(other.getPrices()))) &&
            this.howToDealWithPreviousPrices == other.getHowToDealWithPreviousPrices() &&
            ((this.credentialsGuid==null && other.getCredentialsGuid()==null) || 
             (this.credentialsGuid!=null &&
              this.credentialsGuid.equals(other.getCredentialsGuid())));
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
        if (getDistributorCode() != null) {
            _hashCode += getDistributorCode().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getPrices() != null) {
            _hashCode += getPrices().hashCode();
        }
        _hashCode += getHowToDealWithPreviousPrices();
        if (getCredentialsGuid() != null) {
            _hashCode += getCredentialsGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomerPrices_eTN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">SetCustomerPrices_eTN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "DistributorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CustomerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Prices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>SetCustomerPrices_eTN>Prices"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("howToDealWithPreviousPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "HowToDealWithPreviousPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentialsGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "CredentialsGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
