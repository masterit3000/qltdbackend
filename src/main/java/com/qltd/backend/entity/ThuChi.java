/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
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
@Table(name = "thuchi", catalog = "tindung", schema = "")
public class ThuChi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NoiDung")
    private String noiDung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThuChi")
    private boolean thuChi;
    @Column(name = "CacLoaiThuChi")
    private Short cacLoaiThuChi;
    @Column(name = "SoTien")
    private Long soTien;
    @JoinColumn(name = "MaNhanVienThucHien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    private NhanVien maNhanVienThucHien;

    public ThuChi() {
    }

    public ThuChi(Integer ma) {
        this.ma = ma;
    }

    public ThuChi(Integer ma, String noiDung, boolean thuChi) {
        this.ma = ma;
        this.noiDung = noiDung;
        this.thuChi = thuChi;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public boolean getThuChi() {
        return thuChi;
    }

    public void setThuChi(boolean thuChi) {
        this.thuChi = thuChi;
    }

    public Short getCacLoaiThuChi() {
        return cacLoaiThuChi;
    }

    public void setCacLoaiThuChi(Short cacLoaiThuChi) {
        this.cacLoaiThuChi = cacLoaiThuChi;
    }

    public Long getSoTien() {
        return soTien;
    }

    public void setSoTien(Long soTien) {
        this.soTien = soTien;
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
        if (!(object instanceof ThuChi)) {
            return false;
        }
        ThuChi other = (ThuChi) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Thuchi[ ma=" + ma + " ]";
    }
    
}
