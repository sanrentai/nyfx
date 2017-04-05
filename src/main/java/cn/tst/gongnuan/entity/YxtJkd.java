/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "YXT_JKD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YxtJkd.findAll", query = "SELECT y FROM YxtJkd y")
    , @NamedQuery(name = "YxtJkd.findByJkdId", query = "SELECT y FROM YxtJkd y WHERE y.yxtJkdPK.jkdId = :jkdId")
    , @NamedQuery(name = "YxtJkd.findByJkdName", query = "SELECT y FROM YxtJkd y WHERE y.jkdName = :jkdName")
    , @NamedQuery(name = "YxtJkd.findByJkdRemark", query = "SELECT y FROM YxtJkd y WHERE y.jkdRemark = :jkdRemark")
    , @NamedQuery(name = "YxtJkd.findByJkdIp", query = "SELECT y FROM YxtJkd y WHERE y.jkdIp = :jkdIp")
    , @NamedQuery(name = "YxtJkd.findByJkdPlc", query = "SELECT y FROM YxtJkd y WHERE y.jkdPlc = :jkdPlc")
    , @NamedQuery(name = "YxtJkd.findByOperator", query = "SELECT y FROM YxtJkd y WHERE y.operator = :operator")
    , @NamedQuery(name = "YxtJkd.findByOperatedate", query = "SELECT y FROM YxtJkd y WHERE y.operatedate = :operatedate")
    , @NamedQuery(name = "YxtJkd.findByClustercoding", query = "SELECT y FROM YxtJkd y WHERE y.yxtJkdPK.clustercoding = :clustercoding")
    , @NamedQuery(name = "YxtJkd.findByStatId", query = "SELECT y FROM YxtJkd y WHERE y.statId = :statId")
    , @NamedQuery(name = "YxtJkd.findByJkdFq", query = "SELECT y FROM YxtJkd y WHERE y.jkdFq = :jkdFq")
    , @NamedQuery(name = "YxtJkd.findByOrderid", query = "SELECT y FROM YxtJkd y WHERE y.orderid = :orderid")
    , @NamedQuery(name = "YxtJkd.findByJkdPort", query = "SELECT y FROM YxtJkd y WHERE y.jkdPort = :jkdPort")
    , @NamedQuery(name = "YxtJkd.findByCsFz", query = "SELECT y FROM YxtJkd y WHERE y.csFz = :csFz")
    , @NamedQuery(name = "YxtJkd.findByIsrun", query = "SELECT y FROM YxtJkd y WHERE y.isrun = :isrun")
    , @NamedQuery(name = "YxtJkd.findByJkdLx", query = "SELECT y FROM YxtJkd y WHERE y.jkdLx = :jkdLx")
    , @NamedQuery(name = "YxtJkd.findByTypes", query = "SELECT y FROM YxtJkd y WHERE y.types = :types")
    , @NamedQuery(name = "YxtJkd.findByPcode", query = "SELECT y FROM YxtJkd y WHERE y.pcode = :pcode")
    , @NamedQuery(name = "YxtJkd.findByUseparam", query = "SELECT y FROM YxtJkd y WHERE y.useparam = :useparam")
    , @NamedQuery(name = "YxtJkd.findByJkdRmiEnable", query = "SELECT y FROM YxtJkd y WHERE y.jkdRmiEnable = :jkdRmiEnable")
    , @NamedQuery(name = "YxtJkd.findByJkdRmiHost", query = "SELECT y FROM YxtJkd y WHERE y.jkdRmiHost = :jkdRmiHost")
    , @NamedQuery(name = "YxtJkd.findByJkdRmiPort", query = "SELECT y FROM YxtJkd y WHERE y.jkdRmiPort = :jkdRmiPort")
    , @NamedQuery(name = "YxtJkd.findByJkdRmiService", query = "SELECT y FROM YxtJkd y WHERE y.jkdRmiService = :jkdRmiService")})
public class YxtJkd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected YxtJkdPK yxtJkdPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "JKD_NAME")
    private String jkdName;
    @Size(max = 500)
    @Column(name = "JKD_REMARK")
    private String jkdRemark;
    @Size(max = 100)
    @Column(name = "JKD_IP")
    private String jkdIp;
    @Size(max = 100)
    @Column(name = "JKD_PLC")
    private String jkdPlc;
    @Size(max = 20)
    @Column(name = "OPERATOR")
    private String operator;
    @Size(max = 20)
    @Column(name = "OPERATEDATE")
    private String operatedate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "STAT_ID")
    private String statId;
    @Size(max = 20)
    @Column(name = "JKD_FQ")
    private String jkdFq;
    @Column(name = "ORDERID")
    private Integer orderid;
    @Size(max = 20)
    @Column(name = "JKD_PORT")
    private String jkdPort;
    @Size(max = 4000)
    @Column(name = "CS_FZ")
    private String csFz;
    @Size(max = 2)
    @Column(name = "ISRUN")
    private String isrun;
    @Size(max = 50)
    @Column(name = "JKD_LX")
    private String jkdLx;
    @Column(name = "TYPES")
    private Short types;
    @Size(max = 20)
    @Column(name = "PCODE")
    private String pcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USEPARAM")
    private short useparam;
    @Size(max = 2)
    @Column(name = "JKD_RMI_ENABLE")
    private String jkdRmiEnable;
    @Size(max = 20)
    @Column(name = "JKD_RMI_HOST")
    private String jkdRmiHost;
    @Size(max = 20)
    @Column(name = "JKD_RMI_PORT")
    private String jkdRmiPort;
    @Size(max = 20)
    @Column(name = "JKD_RMI_SERVICE")
    private String jkdRmiService;

    public YxtJkd() {
    }

    public YxtJkd(YxtJkdPK yxtJkdPK) {
        this.yxtJkdPK = yxtJkdPK;
    }

    public YxtJkd(YxtJkdPK yxtJkdPK, String jkdName, String statId, short useparam) {
        this.yxtJkdPK = yxtJkdPK;
        this.jkdName = jkdName;
        this.statId = statId;
        this.useparam = useparam;
    }

    public YxtJkd(String jkdId, String clustercoding) {
        this.yxtJkdPK = new YxtJkdPK(jkdId, clustercoding);
    }

    public YxtJkdPK getYxtJkdPK() {
        return yxtJkdPK;
    }

    public void setYxtJkdPK(YxtJkdPK yxtJkdPK) {
        this.yxtJkdPK = yxtJkdPK;
    }

    public String getJkdName() {
        return jkdName;
    }

    public void setJkdName(String jkdName) {
        this.jkdName = jkdName;
    }

    public String getJkdRemark() {
        return jkdRemark;
    }

    public void setJkdRemark(String jkdRemark) {
        this.jkdRemark = jkdRemark;
    }

    public String getJkdIp() {
        return jkdIp;
    }

    public void setJkdIp(String jkdIp) {
        this.jkdIp = jkdIp;
    }

    public String getJkdPlc() {
        return jkdPlc;
    }

    public void setJkdPlc(String jkdPlc) {
        this.jkdPlc = jkdPlc;
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

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        this.statId = statId;
    }

    public String getJkdFq() {
        return jkdFq;
    }

    public void setJkdFq(String jkdFq) {
        this.jkdFq = jkdFq;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getJkdPort() {
        return jkdPort;
    }

    public void setJkdPort(String jkdPort) {
        this.jkdPort = jkdPort;
    }

    public String getCsFz() {
        return csFz;
    }

    public void setCsFz(String csFz) {
        this.csFz = csFz;
    }

    public String getIsrun() {
        return isrun;
    }

    public void setIsrun(String isrun) {
        this.isrun = isrun;
    }

    public String getJkdLx() {
        return jkdLx;
    }

    public void setJkdLx(String jkdLx) {
        this.jkdLx = jkdLx;
    }

    public Short getTypes() {
        return types;
    }

    public void setTypes(Short types) {
        this.types = types;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public short getUseparam() {
        return useparam;
    }

    public void setUseparam(short useparam) {
        this.useparam = useparam;
    }

    public String getJkdRmiEnable() {
        return jkdRmiEnable;
    }

    public void setJkdRmiEnable(String jkdRmiEnable) {
        this.jkdRmiEnable = jkdRmiEnable;
    }

    public String getJkdRmiHost() {
        return jkdRmiHost;
    }

    public void setJkdRmiHost(String jkdRmiHost) {
        this.jkdRmiHost = jkdRmiHost;
    }

    public String getJkdRmiPort() {
        return jkdRmiPort;
    }

    public void setJkdRmiPort(String jkdRmiPort) {
        this.jkdRmiPort = jkdRmiPort;
    }

    public String getJkdRmiService() {
        return jkdRmiService;
    }

    public void setJkdRmiService(String jkdRmiService) {
        this.jkdRmiService = jkdRmiService;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yxtJkdPK != null ? yxtJkdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YxtJkd)) {
            return false;
        }
        YxtJkd other = (YxtJkd) object;
        if ((this.yxtJkdPK == null && other.yxtJkdPK != null) || (this.yxtJkdPK != null && !this.yxtJkdPK.equals(other.yxtJkdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.tst.gongnuan.entity.YxtJkd[ yxtJkdPK=" + yxtJkdPK + " ]";
    }
    
}
