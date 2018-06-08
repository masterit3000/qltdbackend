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
@Table(name = "huyen", catalog = "tindung", schema = "")
public class Huyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ten")
    private int ten;
    @JoinColumn(name = "MaTinh", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private Tinh maTinh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mahuyen")
    private List<Xa> xaList;

    public Huyen() {
    }

    public Huyen(Integer ma) {
        this.ma = ma;
    }

    public Huyen(Integer ma, int ten) {
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

    public Tinh getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(Tinh maTinh) {
        this.maTinh = maTinh;
    }

    public List<Xa> getXaList() {
        return xaList;
    }

    public void setXaList(List<Xa> xaList) {
        this.xaList = xaList;
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
        if (!(object instanceof Huyen)) {
            return false;
        }
        Huyen other = (Huyen) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Huyen[ ma=" + ma + " ]";
    }
    
}
