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
@Table(name = "taisanhopdong", catalog = "tindung", schema = "")
public class TaiSanHopDong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ThongTin")
    private String thongTin;
    @Size(max = 100)
    @Column(name = "NoiLuuTru")
    private String noiLuuTru;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maTaiSanHopDong")
    private List<AnhTaiSan> anhtaisanList;
    @JoinColumn(name = "MaTaiSan", referencedColumnName = "MaTaiSan")
    @ManyToOne(optional = false)
    private TaiSan maTaiSan;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;

    
    @Override
    public String toString() {
        return "genjpa.Taisanhopdong[ ma=" + ma + " ]";
    }
    
}
