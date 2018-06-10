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
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author MIP
 */
 @Data
@NoArgsConstructor
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

   

    @Override
    public String toString() {
        return "genjpa.Quyenchucvu[ ma=" + ma + " ]";
    }
    
}
