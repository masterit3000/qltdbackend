/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
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
@Table(name = "khachhang", catalog = "tindung", schema = "")
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaKhachHang")
    private Integer maKhachHang;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TenKhachHang")
    private String tenKhachHang;
    @Size(max = 50)
    @Column(name = "DiaChi")
    private String diaChi;
    @Size(max = 15)
    @Column(name = "DienThoai")
    private String dienThoai;
    @Column(name = "CMND")
    private Integer cmnd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TrangThai")
    private boolean trangThai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKhachHang")
    private List<HopDong> hopdongList;
    @JoinColumn(name = "MaCuaHang", referencedColumnName = "MaCuaHang")
    @ManyToOne(optional = false)
    private CuaHang maCuaHang;
    @JoinColumn(name = "MaDiaChi", referencedColumnName = "ma")
    @ManyToOne(optional = false)
    private Xa maDiaChi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKhachHang")
    private List<AnhKhachHang> anhkhachhangList;

    public Khachhang() {
    }

    public Khachhang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public Khachhang(Integer maKhachHang, String tenKhachHang, boolean trangThai, Date ngayTao) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public Integer getCmnd() {
        return cmnd;
    }

    public void setCmnd(Integer cmnd) {
        this.cmnd = cmnd;
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

    public List<HopDong> getHopdongList() {
        return hopdongList;
    }

    public void setHopdongList(List<HopDong> hopdongList) {
        this.hopdongList = hopdongList;
    }

    public CuaHang getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(CuaHang maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

    public Xa getMaDiaChi() {
        return maDiaChi;
    }

    public void setMaDiaChi(Xa maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public List<AnhKhachHang> getAnhkhachhangList() {
        return anhkhachhangList;
    }

    public void setAnhkhachhangList(List<AnhKhachHang> anhkhachhangList) {
        this.anhkhachhangList = anhkhachhangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maKhachHang != null ? maKhachHang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.maKhachHang == null && other.maKhachHang != null) || (this.maKhachHang != null && !this.maKhachHang.equals(other.maKhachHang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Khachhang[ maKhachHang=" + maKhachHang + " ]";
    }
    
}
