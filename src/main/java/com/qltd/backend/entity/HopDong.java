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
import javax.persistence.OneToOne;
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

   
    @Override
    public String toString() {
        return "genjpa.Hopdong[ ma=" + ma + " ]";
    }
    
}
