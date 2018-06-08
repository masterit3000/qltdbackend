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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "vaylai", catalog = "tindung", schema = "")
public class VayLai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaHopDong")
    private Integer maHopDong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TienVay")
    private long tienVay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "HinhThucLai")
    private String hinhThucLai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGianVay")
    private short thoiGianVay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChuKyLai")
    private short chuKyLai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lai")
    private long lai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "KieuTinhLai")
    private String kieuTinhLai;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private HopDong hopdong;

    public VayLai() {
    }

    public VayLai(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public VayLai(Integer maHopDong, long tienVay, String hinhThucLai, short thoiGianVay, short chuKyLai, long lai, String kieuTinhLai) {
        this.maHopDong = maHopDong;
        this.tienVay = tienVay;
        this.hinhThucLai = hinhThucLai;
        this.thoiGianVay = thoiGianVay;
        this.chuKyLai = chuKyLai;
        this.lai = lai;
        this.kieuTinhLai = kieuTinhLai;
    }

    public Integer getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public long getTienVay() {
        return tienVay;
    }

    public void setTienVay(long tienVay) {
        this.tienVay = tienVay;
    }

    public String getHinhThucLai() {
        return hinhThucLai;
    }

    public void setHinhThucLai(String hinhThucLai) {
        this.hinhThucLai = hinhThucLai;
    }

    public short getThoiGianVay() {
        return thoiGianVay;
    }

    public void setThoiGianVay(short thoiGianVay) {
        this.thoiGianVay = thoiGianVay;
    }

    public short getChuKyLai() {
        return chuKyLai;
    }

    public void setChuKyLai(short chuKyLai) {
        this.chuKyLai = chuKyLai;
    }

    public long getLai() {
        return lai;
    }

    public void setLai(long lai) {
        this.lai = lai;
    }

    public String getKieuTinhLai() {
        return kieuTinhLai;
    }

    public void setKieuTinhLai(String kieuTinhLai) {
        this.kieuTinhLai = kieuTinhLai;
    }

    public HopDong getHopdong() {
        return hopdong;
    }

    public void setHopdong(HopDong hopdong) {
        this.hopdong = hopdong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maHopDong != null ? maHopDong.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VayLai)) {
            return false;
        }
        VayLai other = (VayLai) object;
        if ((this.maHopDong == null && other.maHopDong != null) || (this.maHopDong != null && !this.maHopDong.equals(other.maHopDong))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Vaylai[ maHopDong=" + maHopDong + " ]";
    }
    
}
