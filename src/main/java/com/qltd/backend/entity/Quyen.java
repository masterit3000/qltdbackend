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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author MIP
 */
 @Data
@NoArgsConstructor
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

  
    @Override
    public String toString() {
        return "genjpa.Quyen[ maQuyen=" + maQuyen + " ]";
    }
    
}
