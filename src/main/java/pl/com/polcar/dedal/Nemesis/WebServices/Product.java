/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class Product  implements java.io.Serializable {
    private String partNumber;

    private String quantityAvaliable;

    private String partName;

    public Product() {
    }

    public Product(
           String partNumber,
           String quantityAvaliable,
           String partName) {
           this.partNumber = partNumber;
           this.quantityAvaliable = quantityAvaliable;
           this.partName = partName;
    }


    /**
     * Gets the partNumber value for this Product.
     * 
     * @return partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this Product.
     * 
     * @param partNumber
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the quantityAvaliable value for this Product.
     * 
     * @return quantityAvaliable
     */
    public String getQuantityAvaliable() {
        return quantityAvaliable;
    }


    /**
     * Sets the quantityAvaliable value for this Product.
     * 
     * @param quantityAvaliable
     */
    public void setQuantityAvaliable(String quantityAvaliable) {
        this.quantityAvaliable = quantityAvaliable;
    }


    /**
     * Gets the partName value for this Product.
     * 
     * @return partName
     */
    public String getPartName() {
        return partName;
    }


    /**
     * Sets the partName value for this Product.
     * 
     * @param partName
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.quantityAvaliable==null && other.getQuantityAvaliable()==null) || 
             (this.quantityAvaliable!=null &&
              this.quantityAvaliable.equals(other.getQuantityAvaliable()))) &&
            ((this.partName==null && other.getPartName()==null) || 
             (this.partName!=null &&
              this.partName.equals(other.getPartName())));
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
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getQuantityAvaliable() != null) {
            _hashCode += getQuantityAvaliable().hashCode();
        }
        if (getPartName() != null) {
            _hashCode += getPartName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvaliable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "QuantityAvaliable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartName"));
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
