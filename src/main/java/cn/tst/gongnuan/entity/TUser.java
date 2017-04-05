/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "T_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TUser.findAll", query = "SELECT t FROM TUser t")
    , @NamedQuery(name = "TUser.findByUsrCodeAndUsrPasswd", query = "SELECT t FROM TUser t WHERE t.usrCode = :usrCode And t.usrPasswd = :usrPasswd")
    , @NamedQuery(name = "TUser.findByUsrId", query = "SELECT t FROM TUser t WHERE t.usrId = :usrId")
    , @NamedQuery(name = "TUser.findByUsrName", query = "SELECT t FROM TUser t WHERE t.usrName = :usrName")
    , @NamedQuery(name = "TUser.findByUsrCard", query = "SELECT t FROM TUser t WHERE t.usrCard = :usrCard")
    , @NamedQuery(name = "TUser.findByUsrFlag", query = "SELECT t FROM TUser t WHERE t.usrFlag = :usrFlag")
    , @NamedQuery(name = "TUser.findByUsrMail", query = "SELECT t FROM TUser t WHERE t.usrMail = :usrMail")
    , @NamedQuery(name = "TUser.findByUsrPasswd", query = "SELECT t FROM TUser t WHERE t.usrPasswd = :usrPasswd")
    , @NamedQuery(name = "TUser.findByInvoicenumberzzs", query = "SELECT t FROM TUser t WHERE t.invoicenumberzzs = :invoicenumberzzs")})
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USR_CODE")
    private String usrCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USR_NAME")
    private String usrName;
    @Size(max = 18)
    @Column(name = "USR_CARD")
    private String usrCard;
    @Size(max = 3)
    @Column(name = "USR_FLAG")
    private String usrFlag;
    @Size(max = 120)
    @Column(name = "USR_MAIL")
    private String usrMail;
    @Size(max = 50)
    @Column(name = "USR_PASSWD")
    private String usrPasswd;
    @Size(max = 19)
    @Column(name = "USER_LOGIN")
    private String userLogin;
    @Size(max = 3)
    @Column(name = "USR_IFLOG")
    private String usrIflog;
    @Size(max = 20)
    @Column(name = "DEPT_ID")
    private String deptId;
    @Size(max = 38)
    @Column(name = "REGIST_TIME")
    private String registTime;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="电话/传真格式无效, 应为 xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 20)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Size(max = 20)
    @Column(name = "OPERATOR")
    private String operator;
    @Size(max = 20)
    @Column(name = "OPERATEDATE")
    private String operatedate;
    @Size(max = 10)
    @Column(name = "STYLE_ID")
    private String styleId;
    @Size(max = 10)
    @Column(name = "DN")
    private String dn;
    @Size(max = 10)
    @Column(name = "AGT")
    private String agt;
    @Size(max = 20)
    @Column(name = "OP_CODE")
    private String opCode;
    @Size(max = 19)
    @Column(name = "USER_LASTLOGIN")
    private String userLastlogin;
    @Size(max = 15)
    @Column(name = "USER_LASTLOGINIP")
    private String userLastloginip;
    @Size(max = 15)
    @Column(name = "USER_LOGINIP")
    private String userLoginip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CLUSTERCODING")
    private String clustercoding;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "IFADMIN")
    private String ifadmin;
    @Size(max = 40)
    @Column(name = "INVOICECODE")
    private String invoicecode;
    @Size(max = 20)
    @Column(name = "INVOICENUMBER")
    private String invoicenumber;
    @Size(max = 100)
    @Column(name = "IMAGE")
    private String image;
    @Size(max = 16)
    @Column(name = "IMSI")
    private String imsi;
    @Size(max = 10)
    @Column(name = "USBKEY")
    private String usbkey;
    @Size(max = 40)
    @Column(name = "INVOICECODEZZS")
    private String invoicecodezzs;
    @Size(max = 40)
    @Column(name = "INVOICENUMBERZZS")
    private String invoicenumberzzs;

    public TUser() {
    }

    public TUser(String usrCode) {
        this.usrCode = usrCode;
    }

    public TUser(String usrCode, String usrId, String usrName, String clustercoding, String ifadmin) {
        this.usrCode = usrCode;
        this.usrId = usrId;
        this.usrName = usrName;
        this.clustercoding = clustercoding;
        this.ifadmin = ifadmin;
    }

    public String getUsrCode() {
        return usrCode;
    }

    public void setUsrCode(String usrCode) {
        this.usrCode = usrCode;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrCard() {
        return usrCard;
    }

    public void setUsrCard(String usrCard) {
        this.usrCard = usrCard;
    }

    public String getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(String usrFlag) {
        this.usrFlag = usrFlag;
    }

    public String getUsrMail() {
        return usrMail;
    }

    public void setUsrMail(String usrMail) {
        this.usrMail = usrMail;
    }

    public String getUsrPasswd() {
        return usrPasswd;
    }

    public void setUsrPasswd(String usrPasswd) {
        this.usrPasswd = usrPasswd;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUsrIflog() {
        return usrIflog;
    }

    public void setUsrIflog(String usrIflog) {
        this.usrIflog = usrIflog;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getRegistTime() {
        return registTime;
    }

    public void setRegistTime(String registTime) {
        this.registTime = registTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(String operatedate) {
        this.operatedate = operatedate;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getAgt() {
        return agt;
    }

    public void setAgt(String agt) {
        this.agt = agt;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getUserLastlogin() {
        return userLastlogin;
    }

    public void setUserLastlogin(String userLastlogin) {
        this.userLastlogin = userLastlogin;
    }

    public String getUserLastloginip() {
        return userLastloginip;
    }

    public void setUserLastloginip(String userLastloginip) {
        this.userLastloginip = userLastloginip;
    }

    public String getUserLoginip() {
        return userLoginip;
    }

    public void setUserLoginip(String userLoginip) {
        this.userLoginip = userLoginip;
    }

    public String getClustercoding() {
        return clustercoding;
    }

    public void setClustercoding(String clustercoding) {
        this.clustercoding = clustercoding;
    }

    public String getIfadmin() {
        return ifadmin;
    }

    public void setIfadmin(String ifadmin) {
        this.ifadmin = ifadmin;
    }

    public String getInvoicecode() {
        return invoicecode;
    }

    public void setInvoicecode(String invoicecode) {
        this.invoicecode = invoicecode;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getUsbkey() {
        return usbkey;
    }

    public void setUsbkey(String usbkey) {
        this.usbkey = usbkey;
    }

    public String getInvoicecodezzs() {
        return invoicecodezzs;
    }

    public void setInvoicecodezzs(String invoicecodezzs) {
        this.invoicecodezzs = invoicecodezzs;
    }

    public String getInvoicenumberzzs() {
        return invoicenumberzzs;
    }

    public void setInvoicenumberzzs(String invoicenumberzzs) {
        this.invoicenumberzzs = invoicenumberzzs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrCode != null ? usrCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUser)) {
            return false;
        }
        TUser other = (TUser) object;
        if ((this.usrCode == null && other.usrCode != null) || (this.usrCode != null && !this.usrCode.equals(other.usrCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.tst.gongnuan.entity.TUser[ usrCode=" + usrCode + " ]";
    }
    
}
