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
import javax.persistence.OneToOne;
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
@Table(name = "hopdong", catalog = "tindung", schema = "")
public class HopDong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayLap")
    @Temporal(TemporalType.DATE)
    private Date ngayLap;
    @Size(max = 300)
    @Column(name = "GhiChu")
    private String ghiChu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LoaiHopDong")
    private boolean loaiHopDong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TrangThai")
    private short trangThai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maHopDong")
    private List<DongTien> dongtienList;
    @JoinColumn(name = "MaKhachHang", referencedColumnName = "MaKhachHang")
    @ManyToOne(optional = false)
    private Khachhang maKhachHang;
    @JoinColumn(name = "MaCuaHang", referencedColumnName = "MaCuaHang")
    @ManyToOne(optional = false)
    private CuaHang maCuaHang;
    @JoinColumn(name = "MaNhanVien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    private NhanVien maNhanVien;
    @OneToMany(mappedBy = "maHopDongGoc")
    private List<HopDong> hopdongList;
    @JoinColumn(name = "MaHopDongGoc", referencedColumnName = "Ma")
    @ManyToOne
    private HopDong maHopDongGoc;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "hopdong")
    private VayLai vaylai;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "hopdong")
    private BatHo batho;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maHopDong")
    private List<GhiNo> ghinoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maHopDong")
    private List<LichSuThaoTacHopDong> lichsuthaotachopdongList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maHopDong")
    private List<TaiSanHopDong> taisanhopdongList;

    public HopDong() {
    }

    public HopDong(Integer ma) {
        this.ma = ma;
    }

    public HopDong(Integer ma, Date ngayLap, boolean loaiHopDong, short trangThai) {
        this.ma = ma;
        this.ngayLap = ngayLap;
        this.loaiHopDong = loaiHopDong;
        this.trangThai = trangThai;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean getLoaiHopDong() {
        return loaiHopDong;
    }

    public void setLoaiHopDong(boolean loaiHopDong) {
        this.loaiHopDong = loaiHopDong;
    }

    public short getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(short trangThai) {
        this.trangThai = trangThai;
    }

    public List<DongTien> getDongtienList() {
        return dongtienList;
    }

    public void setDongtienList(List<DongTien> dongtienList) {
        this.dongtienList = dongtienList;
    }

    public Khachhang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Khachhang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public CuaHang getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(CuaHang maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public List<HopDong> getHopdongList() {
        return hopdongList;
    }

    public void setHopdongList(List<HopDong> hopdongList) {
        this.hopdongList = hopdongList;
    }

    public HopDong getMaHopDongGoc() {
        return maHopDongGoc;
    }

    public void setMaHopDongGoc(HopDong maHopDongGoc) {
        this.maHopDongGoc = maHopDongGoc;
    }

    public VayLai getVaylai() {
        return vaylai;
    }

    public void setVaylai(VayLai vaylai) {
        this.vaylai = vaylai;
    }

    public BatHo getBatho() {
        return batho;
    }

    public void setBatho(BatHo batho) {
        this.batho = batho;
    }

    public List<GhiNo> getGhinoList() {
        return ghinoList;
    }

    public void setGhinoList(List<GhiNo> ghinoList) {
        this.ghinoList = ghinoList;
    }

    public List<LichSuThaoTacHopDong> getLichsuthaotachopdongList() {
        return lichsuthaotachopdongList;
    }

    public void setLichsuthaotachopdongList(List<LichSuThaoTacHopDong> lichsuthaotachopdongList) {
        this.lichsuthaotachopdongList = lichsuthaotachopdongList;
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
        hash += (ma != null ? ma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HopDong)) {
            return false;
        }
        HopDong other = (HopDong) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Hopdong[ ma=" + ma + " ]";
    }
    
}
