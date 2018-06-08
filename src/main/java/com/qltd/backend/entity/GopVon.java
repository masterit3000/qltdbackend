/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "gopvon", catalog = "tindung", schema = "")
public class GopVon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NhaDauTu")
    private String nhaDauTu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DiaChi")
    private String diaChi;
    @Size(max = 15)
    @Column(name = "SoDienThoai")
    private String soDienThoai;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoTien")
    private BigDecimal soTien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HinhThucTinhLai")
    private boolean hinhThucTinhLai;
    @Size(max = 450)
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "SoLai")
    private Integer soLai;
    @JoinColumn(name = "MaCuaHang", referencedColumnName = "MaCuaHang")
    @ManyToOne(optional = false)
    private CuaHang maCuaHang;

    public GopVon() {
    }

    public GopVon(Integer ma) {
        this.ma = ma;
    }

    public GopVon(Integer ma, String nhaDauTu, String diaChi, BigDecimal soTien, boolean hinhThucTinhLai) {
        this.ma = ma;
        this.nhaDauTu = nhaDauTu;
        this.diaChi = diaChi;
        this.soTien = soTien;
        this.hinhThucTinhLai = hinhThucTinhLai;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getNhaDauTu() {
        return nhaDauTu;
    }

    public void setNhaDauTu(String nhaDauTu) {
        this.nhaDauTu = nhaDauTu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public BigDecimal getSoTien() {
        return soTien;
    }

    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    public boolean getHinhThucTinhLai() {
        return hinhThucTinhLai;
    }

    public void setHinhThucTinhLai(boolean hinhThucTinhLai) {
        this.hinhThucTinhLai = hinhThucTinhLai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Integer getSoLai() {
        return soLai;
    }

    public void setSoLai(Integer soLai) {
        this.soLai = soLai;
    }

    public CuaHang getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(CuaHang maCuaHang) {
        this.maCuaHang = maCuaHang;
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
        if (!(object instanceof GopVon)) {
            return false;
        }
        GopVon other = (GopVon) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Gopvon[ ma=" + ma + " ]";
    }
    
}
