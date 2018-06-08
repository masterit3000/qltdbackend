/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "ghino", catalog = "tindung", schema = "")
public class GhiNo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayGhi")
    @Temporal(TemporalType.DATE)
    private Date ngayGhi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoTien")
    private long soTien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "NoTra")
    private String noTra;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;

    public GhiNo() {
    }

    public GhiNo(Integer ma) {
        this.ma = ma;
    }

    public GhiNo(Integer ma, Date ngayGhi, long soTien, String noTra) {
        this.ma = ma;
        this.ngayGhi = ngayGhi;
        this.soTien = soTien;
        this.noTra = noTra;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public Date getNgayGhi() {
        return ngayGhi;
    }

    public void setNgayGhi(Date ngayGhi) {
        this.ngayGhi = ngayGhi;
    }

    public long getSoTien() {
        return soTien;
    }

    public void setSoTien(long soTien) {
        this.soTien = soTien;
    }

    public String getNoTra() {
        return noTra;
    }

    public void setNoTra(String noTra) {
        this.noTra = noTra;
    }

    public HopDong getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(HopDong maHopDong) {
        this.maHopDong = maHopDong;
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
        if (!(object instanceof GhiNo)) {
            return false;
        }
        GhiNo other = (GhiNo) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Ghino[ ma=" + ma + " ]";
    }
    
}
