/**
 * UploadStockLevelsWithReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.com.polcar.dedal.Nemesis.WebServices;

public class UploadStockLevelsWithReport  implements java.io.Serializable {
    private pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels stockLevels;

    private int branchID;

    private String login;

    private String password;

    public UploadStockLevelsWithReport() {
    }

    public UploadStockLevelsWithReport(
           pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels stockLevels,
           int branchID,
           String login,
           String password) {
           this.stockLevels = stockLevels;
           this.branchID = branchID;
           this.login = login;
           this.password = password;
    }


    /**
     * Gets the stockLevels value for this UploadStockLevelsWithReport.
     * 
     * @return stockLevels
     */
    public pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels getStockLevels() {
        return stockLevels;
    }


    /**
     * Sets the stockLevels value for this UploadStockLevelsWithReport.
     * 
     * @param stockLevels
     */
    public void setStockLevels(pl.com.polcar.dedal.Nemesis.WebServices.UploadStockLevelsWithReportStockLevels stockLevels) {
        this.stockLevels = stockLevels;
    }


    /**
     * Gets the branchID value for this UploadStockLevelsWithReport.
     * 
     * @return branchID
     */
    public int getBranchID() {
        return branchID;
    }


    /**
     * Sets the branchID value for this UploadStockLevelsWithReport.
     * 
     * @param branchID
     */
    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }


    /**
     * Gets the login value for this UploadStockLevelsWithReport.
     * 
     * @return login
     */
    public String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this UploadStockLevelsWithReport.
     * 
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }


    /**
     * Gets the password value for this UploadStockLevelsWithReport.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UploadStockLevelsWithReport.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UploadStockLevelsWithReport)) return false;
        UploadStockLevelsWithReport other = (UploadStockLevelsWithReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stockLevels==null && other.getStockLevels()==null) || 
             (this.stockLevels!=null &&
              this.stockLevels.equals(other.getStockLevels()))) &&
            this.branchID == other.getBranchID() &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getStockLevels() != null) {
            _hashCode += getStockLevels().hashCode();
        }
        _hashCode += getBranchID();
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadStockLevelsWithReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">UploadStockLevelsWithReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockLevels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", "StockLevels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dedal.polcar.com.pl/Nemesis/WebServices", ">>UploadStockLevelsWithReport>StockLevels"));
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
