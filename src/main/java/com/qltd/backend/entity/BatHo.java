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

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "batho", catalog = "tindung", schema = "")
public class BatHo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaHopDong")
    private Integer maHopDong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TienDuaKhach")
    private long tienDuaKhach;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TongTien")
    private long tongTien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TongSoNgay")
    private short tongSoNgay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChuKyDongTien")
    private short chuKyDongTien;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private HopDong hopdong;

    public BatHo() {
    }

    public BatHo(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public BatHo(Integer maHopDong, long tienDuaKhach, long tongTien, short tongSoNgay, short chuKyDongTien) {
        this.maHopDong = maHopDong;
        this.tienDuaKhach = tienDuaKhach;
        this.tongTien = tongTien;
        this.tongSoNgay = tongSoNgay;
        this.chuKyDongTien = chuKyDongTien;
    }

    public Integer getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(Integer maHopDong) {
        this.maHopDong = maHopDong;
    }

    public long getTienDuaKhach() {
        return tienDuaKhach;
    }

    public void setTienDuaKhach(long tienDuaKhach) {
        this.tienDuaKhach = tienDuaKhach;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public short getTongSoNgay() {
        return tongSoNgay;
    }

    public void setTongSoNgay(short tongSoNgay) {
        this.tongSoNgay = tongSoNgay;
    }

    public short getChuKyDongTien() {
        return chuKyDongTien;
    }

    public void setChuKyDongTien(short chuKyDongTien) {
        this.chuKyDongTien = chuKyDongTien;
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
        if (!(object instanceof BatHo)) {
            return false;
        }
        BatHo other = (BatHo) object;
        if ((this.maHopDong == null && other.maHopDong != null) || (this.maHopDong != null && !this.maHopDong.equals(other.maHopDong))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Batho[ maHopDong=" + maHopDong + " ]";
    }
    
}
