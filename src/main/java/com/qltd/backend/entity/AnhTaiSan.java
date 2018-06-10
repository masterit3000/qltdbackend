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
@Table(name = "anhtaisan", catalog = "tindung", schema = "")
public class AnhTaiSan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "DuongDan")
    private String duongDan;
    @JoinColumn(name = "MaTaiSanHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private TaiSanHopDong maTaiSanHopDong;

    
    @Override
    public String toString() {
        return "genjpa.Anhtaisan[ ma=" + ma + " ]";
    }
    
}
