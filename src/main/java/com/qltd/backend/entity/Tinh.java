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
@Table(name = "tinh", catalog = "tindung", schema = "")
public class Tinh implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTinh")
    private List<Huyen> huyenList;

    public Tinh() {
    }

    public Tinh(Integer ma) {
        this.ma = ma;
    }

    public Tinh(Integer ma, int ten) {
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

    public List<Huyen> getHuyenList() {
        return huyenList;
    }

    public void setHuyenList(List<Huyen> huyenList) {
        this.huyenList = huyenList;
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
        if (!(object instanceof Tinh)) {
            return false;
        }
        Tinh other = (Tinh) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Tinh[ ma=" + ma + " ]";
    }
    
}
