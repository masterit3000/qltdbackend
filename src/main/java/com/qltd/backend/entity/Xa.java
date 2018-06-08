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

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "xa", catalog = "tindung", schema = "")
public class Xa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ten")
    private int ten;
    @JoinColumn(name = "mahuyen", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private Huyen mahuyen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDiaChi")
    private List<Khachhang> khachhangList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDiaChi")
    private List<CuaHang> cuahangList;

    public Xa() {
    }

    public Xa(Integer ma) {
        this.ma = ma;
    }

    public Xa(Integer ma, int ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public Huyen getMahuyen() {
        return mahuyen;
    }

    public void setMahuyen(Huyen mahuyen) {
        this.mahuyen = mahuyen;
    }

    public List<Khachhang> getKhachhangList() {
        return khachhangList;
    }

    public void setKhachhangList(List<Khachhang> khachhangList) {
        this.khachhangList = khachhangList;
    }

    public List<CuaHang> getCuahangList() {
        return cuahangList;
    }

    public void setCuahangList(List<CuaHang> cuahangList) {
        this.cuahangList = cuahangList;
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
        if (!(object instanceof Xa)) {
            return false;
        }
        Xa other = (Xa) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Xa[ ma=" + ma + " ]";
    }
    
}
