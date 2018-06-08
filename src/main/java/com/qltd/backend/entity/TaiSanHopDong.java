/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "taisanhopdong", catalog = "tindung", schema = "")
public class TaiSanHopDong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ThongTin")
    private String thongTin;
    @Size(max = 100)
    @Column(name = "NoiLuuTru")
    private String noiLuuTru;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTaiSanHopDong")
    private List<AnhTaiSan> anhtaisanList;
    @JoinColumn(name = "MaTaiSan", referencedColumnName = "MaTaiSan")
    @ManyToOne(optional = false)
    private TaiSan maTaiSan;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;

    public TaiSanHopDong() {
    }

    public TaiSanHopDong(Integer ma) {
        this.ma = ma;
    }

    public TaiSanHopDong(Integer ma, String thongTin) {
        this.ma = ma;
        this.thongTin = thongTin;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getThongTin() {
        return thongTin;
    }

    public void setThongTin(String thongTin) {
        this.thongTin = thongTin;
    }

    public String getNoiLuuTru() {
        return noiLuuTru;
    }

    public void setNoiLuuTru(String noiLuuTru) {
        this.noiLuuTru = noiLuuTru;
    }

    public List<AnhTaiSan> getAnhtaisanList() {
        return anhtaisanList;
    }

    public void setAnhtaisanList(List<AnhTaiSan> anhtaisanList) {
        this.anhtaisanList = anhtaisanList;
    }

    public TaiSan getMaTaiSan() {
        return maTaiSan;
    }

    public void setMaTaiSan(TaiSan maTaiSan) {
        this.maTaiSan = maTaiSan;
    }

    public HopDong getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(HopDong maHopDong) {
        this.maHopDong = maHopDong;
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
        if (!(object instanceof TaiSanHopDong)) {
            return false;
        }
        TaiSanHopDong other = (TaiSanHopDong) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Taisanhopdong[ ma=" + ma + " ]";
    }
    
}
