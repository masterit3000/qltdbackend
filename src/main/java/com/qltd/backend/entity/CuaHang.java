/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "cuahang", catalog = "tindung", schema = "")
public class CuaHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaCuaHang")
    private Integer maCuaHang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TenCuahang")
    private String tenCuahang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "SoDienThoai")
    private String soDienThoai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NguoiDaiDien")
    private String nguoiDaiDien;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VonDauTu")
    private BigDecimal vonDauTu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TrangThai")
    private boolean trangThai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @Column(name = "QuyTienMat")
    private BigDecimal quyTienMat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maCuaHang")
    private List<HopDong> hopdongList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maCuaHang")
    private List<Khachhang> khachhangList;
    @JoinColumn(name = "MaDiaChi", referencedColumnName = "ma")
    @ManyToOne(optional = false)
    private Xa maDiaChi;
    @OneToMany(mappedBy = "maCuaHang")
    private List<NhanVien> nhanvienList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maCuaHang")
    private List<GopVon> gopvonList;

    public CuaHang() {
    }

    public CuaHang(Integer maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

    public CuaHang(Integer maCuaHang, String tenCuahang, String soDienThoai, String diaChi, String nguoiDaiDien, boolean trangThai, Date ngayTao) {
        this.maCuaHang = maCuaHang;
        this.tenCuahang = tenCuahang;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.nguoiDaiDien = nguoiDaiDien;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    public Integer getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(Integer maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

    public String getTenCuahang() {
        return tenCuahang;
    }

    public void setTenCuahang(String tenCuahang) {
        this.tenCuahang = tenCuahang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
    }

    public BigDecimal getVonDauTu() {
        return vonDauTu;
    }

    public void setVonDauTu(BigDecimal vonDauTu) {
        this.vonDauTu = vonDauTu;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public BigDecimal getQuyTienMat() {
        return quyTienMat;
    }

    public void setQuyTienMat(BigDecimal quyTienMat) {
        this.quyTienMat = quyTienMat;
    }

    public List<HopDong> getHopdongList() {
        return hopdongList;
    }

    public void setHopdongList(List<HopDong> hopdongList) {
        this.hopdongList = hopdongList;
    }

    public List<Khachhang> getKhachhangList() {
        return khachhangList;
    }

    public void setKhachhangList(List<Khachhang> khachhangList) {
        this.khachhangList = khachhangList;
    }

    public Xa getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(Xa maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public List<NhanVien> getNhanvienList() {
        return nhanvienList;
    }

    public void setNhanvienList(List<NhanVien> nhanvienList) {
        this.nhanvienList = nhanvienList;
    }

    public List<GopVon> getGopvonList() {
        return gopvonList;
    }

    public void setGopvonList(List<GopVon> gopvonList) {
        this.gopvonList = gopvonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCuaHang != null ? maCuaHang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuaHang)) {
            return false;
        }
        CuaHang other = (CuaHang) object;
        if ((this.maCuaHang == null && other.maCuaHang != null) || (this.maCuaHang != null && !this.maCuaHang.equals(other.maCuaHang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Cuahang[ maCuaHang=" + maCuaHang + " ]";
    }
    
}
