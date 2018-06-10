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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author MIP
 */
 @Data
@NoArgsConstructor
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

   

    @Override
    public String toString() {
        return "genjpa.Nhanvien[ maNhanVien=" + maNhanVien + " ]";
    }
    
}
