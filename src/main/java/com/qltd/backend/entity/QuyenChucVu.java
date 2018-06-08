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

/**
 *
 * @author MIP
 */
@Entity
@Table(name = "quyenchucvu", catalog = "tindung", schema = "")
public class QuyenChucVu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ma")
    private Integer ma;
    @JoinColumn(name = "maChucVu", referencedColumnName = "maChucVu")
    @ManyToOne(optional = false)
    private ChucVu maChucVu;
    @JoinColumn(name = "maQuyen", referencedColumnName = "maQuyen")
    @ManyToOne(optional = false)
    private Quyen maQuyen;

    public QuyenChucVu() {
    }

    public QuyenChucVu(Integer ma) {
        this.ma = ma;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public ChucVu getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(ChucVu maChucVu) {
        this.maChucVu = maChucVu;
    }

    public Quyen getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(Quyen maQuyen) {
        this.maQuyen = maQuyen;
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
        if (!(object instanceof QuyenChucVu)) {
            return false;
        }
        QuyenChucVu other = (QuyenChucVu) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Quyenchucvu[ ma=" + ma + " ]";
    }
    
}
