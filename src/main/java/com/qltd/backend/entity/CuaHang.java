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

  

    @Override
    public String toString() {
        return "genjpa.Cuahang[ maCuaHang=" + maCuaHang + " ]";
    }
    
}
