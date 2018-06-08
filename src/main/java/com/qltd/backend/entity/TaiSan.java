/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "taisan", catalog = "tindung", schema = "")
public class TaiSan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MaTaiSan")
    private Integer maTaiSan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TenTaiSan")
    private String tenTaiSan;
    @Size(max = 300)
    @Column(name = "GhiChu")
    private String ghiChu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTaiSan")
    private List<TaiSanHopDong> taisanhopdongList;

    public TaiSan() {
    }

    public TaiSan(Integer maTaiSan) {
        this.maTaiSan = maTaiSan;
    }

    public TaiSan(Integer maTaiSan, String tenTaiSan) {
        this.maTaiSan = maTaiSan;
        this.tenTaiSan = tenTaiSan;
    }

    public Integer getMaTaiSan() {
        return maTaiSan;
    }

    public void setMaTaiSan(Integer maTaiSan) {
        this.maTaiSan = maTaiSan;
    }

    public String getTenTaiSan() {
        return tenTaiSan;
    }

    public void setTenTaiSan(String tenTaiSan) {
        this.tenTaiSan = tenTaiSan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public List<TaiSanHopDong> getTaisanhopdongList() {
        return taisanhopdongList;
    }

    public void setTaisanhopdongList(List<TaiSanHopDong> taisanhopdongList) {
        this.taisanhopdongList = taisanhopdongList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTaiSan != null ? maTaiSan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaiSan)) {
            return false;
        }
        TaiSan other = (TaiSan) object;
        if ((this.maTaiSan == null && other.maTaiSan != null) || (this.maTaiSan != null && !this.maTaiSan.equals(other.maTaiSan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Taisan[ maTaiSan=" + maTaiSan + " ]";
    }
    
}
