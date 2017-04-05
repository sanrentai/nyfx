/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Embeddable
public class YxtJkdPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "JKD_ID")
    private String jkdId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CLUSTERCODING")
    private String clustercoding;

    public YxtJkdPK() {
    }

    public YxtJkdPK(String jkdId, String clustercoding) {
        this.jkdId = jkdId;
        this.clustercoding = clustercoding;
    }

    public String getJkdId() {
        return jkdId;
    }

    public void setJkdId(String jkdId) {
        this.jkdId = jkdId;
    }

    public String getClustercoding() {
        return clustercoding;
    }

    public void setClustercoding(String clustercoding) {
        this.clustercoding = clustercoding;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jkdId != null ? jkdId.hashCode() : 0);
        hash += (clustercoding != null ? clustercoding.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YxtJkdPK)) {
            return false;
        }
        YxtJkdPK other = (YxtJkdPK) object;
        if ((this.jkdId == null && other.jkdId != null) || (this.jkdId != null && !this.jkdId.equals(other.jkdId))) {
            return false;
        }
        if ((this.clustercoding == null && other.clustercoding != null) || (this.clustercoding != null && !this.clustercoding.equals(other.clustercoding))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cn.tst.gongnuan.entity.YxtJkdPK[ jkdId=" + jkdId + ", clustercoding=" + clustercoding + " ]";
    }
    
}
