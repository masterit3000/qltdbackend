/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "anhtaisan", catalog = "tindung", schema = "")
public class AnhTaiSan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "DuongDan")
    private String duongDan;
    @JoinColumn(name = "MaTaiSanHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private TaiSanHopDong maTaiSanHopDong;

    public AnhTaiSan() {
    }

    public AnhTaiSan(Integer ma) {
        this.ma = ma;
    }

    public AnhTaiSan(Integer ma, String duongDan) {
        this.ma = ma;
        this.duongDan = duongDan;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public TaiSanHopDong getMaTaiSanHopDong() {
        return maTaiSanHopDong;
    }

    public void setMaTaiSanHopDong(TaiSanHopDong maTaiSanHopDong) {
        this.maTaiSanHopDong = maTaiSanHopDong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ma != null ? ma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnhTaiSan)) {
            return false;
        }
        AnhTaiSan other = (AnhTaiSan) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Anhtaisan[ ma=" + ma + " ]";
    }
    
}
