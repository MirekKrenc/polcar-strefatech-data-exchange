/**
 * GetStockLevelsForList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class GetStockLevelsForList  implements java.io.Serializable {
    private String login;

    private String password;

    private int branchID;

    private pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList partsList;

    public GetStockLevelsForList() {
    }

    public GetStockLevelsForList(
           String login,
           String password,
           int branchID,
           pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList partsList) {
           this.login = login;
           this.password = password;
           this.branchID = branchID;
           this.partsList = partsList;
    }


    /**
     * Gets the login value for this GetStockLevelsForList.
     * 
     * @return login
     */
    public String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this GetStockLevelsForList.
     * 
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }


    /**
     * Gets the password value for this GetStockLevelsForList.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this GetStockLevelsForList.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the branchID value for this GetStockLevelsForList.
     * 
     * @return branchID
     */
    public int getBranchID() {
        return branchID;
    }


    /**
     * Sets the branchID value for this GetStockLevelsForList.
     * 
     * @param branchID
     */
    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }


    /**
     * Gets the partsList value for this GetStockLevelsForList.
     * 
     * @return partsList
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList getPartsList() {
        return partsList;
    }


    /**
     * Sets the partsList value for this GetStockLevelsForList.
     * 
     * @param partsList
     */
    public void setPartsList(pl.com.polcar.dedal.Nemesis.WebServices.GetStockLevelsForListPartsList partsList) {
        this.partsList = partsList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetStockLevelsForList)) return false;
        GetStockLevelsForList other = (GetStockLevelsForList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.branchID == other.getBranchID() &&
            ((this.partsList==null && other.getPartsList()==null) || 
             (this.partsList!=null &&
              this.partsList.equals(other.getPartsList())));
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += getBranchID();
        if (getPartsList() != null) {
            _hashCode += getPartsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStockLevelsForList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">GetStockLevelsForList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "BranchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "PartsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>GetStockLevelsForList>PartsList"));
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
