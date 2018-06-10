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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author MIP
 */
 @Data
@NoArgsConstructor
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

   

    @Override
    public String toString() {
        return "genjpa.Xa[ ma=" + ma + " ]";
    }
    
}
