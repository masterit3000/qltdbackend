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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "quyen", catalog = "tindung", schema = "")
public class Quyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "maQuyen")
    private Integer maQuyen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "quyen")
    private String quyen;
    @Size(max = 300)
    @Column(name = "mota")
    private String mota;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maQuyen")
    private List<QuyenChucVu> quyenchucvuList;

    public Quyen() {
    }

    public Quyen(Integer maQuyen) {
        this.maQuyen = maQuyen;
    }

    public Quyen(Integer maQuyen, String quyen) {
        this.maQuyen = maQuyen;
        this.quyen = quyen;
    }

    public Integer getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(Integer maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public List<QuyenChucVu> getQuyenchucvuList() {
        return quyenchucvuList;
    }

    public void setQuyenchucvuList(List<QuyenChucVu> quyenchucvuList) {
        this.quyenchucvuList = quyenchucvuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maQuyen != null ? maQuyen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quyen)) {
            return false;
        }
        Quyen other = (Quyen) object;
        if ((this.maQuyen == null && other.maQuyen != null) || (this.maQuyen != null && !this.maQuyen.equals(other.maQuyen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Quyen[ maQuyen=" + maQuyen + " ]";
    }
    
}
