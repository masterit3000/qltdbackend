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

  

    @Override
    public String toString() {
        return "genjpa.Khachhang[ maKhachHang=" + maKhachHang + " ]";
    }
    
}
