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
@Table(name = "nhanvien", catalog = "tindung", schema = "")
public class NhanVien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaNhanVien")
    private Integer maNhanVien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TenDangNhap")
    private String tenDangNhap;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "MatKhau")
    private String matKhau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TenNhanVien")
    private String tenNhanVien;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Email")
    private String email;
    @Size(max = 15)
    @Column(name = "SoDienThoai")
    private String soDienThoai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TrangThai")
    private boolean trangThai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayTao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maNhanVienThucHien")
    private List<ThuChi> thuchiList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maNhanVien")
    private List<HopDong> hopdongList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maNhanVienThucHien")
    private List<LichSuThaoTacHopDong> lichsuthaotachopdongList;
    @JoinColumn(name = "ChucVu", referencedColumnName = "maChucVu")
    @ManyToOne(optional = false)
    private ChucVu chucVu;
    @JoinColumn(name = "MaCuaHang", referencedColumnName = "MaCuaHang")
    @ManyToOne
    private CuaHang maCuaHang;

    public NhanVien() {
    }

    public NhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public NhanVien(Integer maNhanVien, String tenDangNhap, String matKhau, String tenNhanVien, boolean trangThai, Date ngayTao) {
        this.maNhanVien = maNhanVien;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.tenNhanVien = tenNhanVien;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
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

    public List<ThuChi> getThuchiList() {
        return thuchiList;
    }

    public void setThuchiList(List<ThuChi> thuchiList) {
        this.thuchiList = thuchiList;
    }

    public List<HopDong> getHopdongList() {
        return hopdongList;
    }

    public void setHopdongList(List<HopDong> hopdongList) {
        this.hopdongList = hopdongList;
    }

    public List<LichSuThaoTacHopDong> getLichsuthaotachopdongList() {
        return lichsuthaotachopdongList;
    }

    public void setLichsuthaotachopdongList(List<LichSuThaoTacHopDong> lichsuthaotachopdongList) {
        this.lichsuthaotachopdongList = lichsuthaotachopdongList;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
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
        hash += (maNhanVien != null ? maNhanVien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NhanVien)) {
            return false;
        }
        NhanVien other = (NhanVien) object;
        if ((this.maNhanVien == null && other.maNhanVien != null) || (this.maNhanVien != null && !this.maNhanVien.equals(other.maNhanVien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Nhanvien[ maNhanVien=" + maNhanVien + " ]";
    }
    
}
