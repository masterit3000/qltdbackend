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
@Table(name = "chucvu", catalog = "tindung", schema = "")
public class ChucVu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "maChucVu")
    private Integer maChucVu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "chucvu")
    private String chucvu;
    @Size(max = 300)
    @Column(name = "mota")
    private String mota;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maChucVu")
    private List<QuyenChucVu> quyenchucvuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chucVu")
    private List<NhanVien> nhanvienList;

    public ChucVu() {
    }

    public ChucVu(Integer maChucVu) {
        this.maChucVu = maChucVu;
    }

    public ChucVu(Integer maChucVu, String chucvu) {
        this.maChucVu = maChucVu;
        this.chucvu = chucvu;
    }

    public Integer getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(Integer maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
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

    public List<NhanVien> getNhanvienList() {
        return nhanvienList;
    }

    public void setNhanvienList(List<NhanVien> nhanvienList) {
        this.nhanvienList = nhanvienList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maChucVu != null ? maChucVu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChucVu)) {
            return false;
        }
        ChucVu other = (ChucVu) object;
        if ((this.maChucVu == null && other.maChucVu != null) || (this.maChucVu != null && !this.maChucVu.equals(other.maChucVu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "genjpa.Chucvu[ maChucVu=" + maChucVu + " ]";
    }
    
}
