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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "lichsuthaotachopdong", catalog = "tindung", schema = "")
public class LichSuThaoTacHopDong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGian")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGian;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "NoiDung")
    private String noiDung;
    @Column(name = "SoTien")
    private Long soTien;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;
    @JoinColumn(name = "MaNhanVienThucHien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    private NhanVien maNhanVienThucHien;

    public LichSuThaoTacHopDong() {
    }

    public LichSuThaoTacHopDong(Integer ma) {
        this.ma = ma;
    }

    public LichSuThaoTacHopDong(Integer ma, Date thoiGian, String noiDung) {
        this.ma = ma;
        this.thoiGian = thoiGian;
        this.noiDung = noiDung;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Long getSoTien() {
        return soTien;
    }

    public void setSoTien(Long soTien) {
        this.soTien = soTien;
    }

    public HopDong getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(HopDong maHopDong) {
        this.maHopDong = maHopDong;
    }

    public NhanVien getMaNhanVienThucHien() {
        return maNhanVienThucHien;
    }

    public void setMaNhanVienThucHien(NhanVien maNhanVienThucHien) {
        this.maNhanVienThucHien = maNhanVienThucHien;
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
        if (!(object instanceof LichSuThaoTacHopDong)) {
            return false;
        }
        LichSuThaoTacHopDong other = (LichSuThaoTacHopDong) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Lichsuthaotachopdong[ ma=" + ma + " ]";
    }
    
}
