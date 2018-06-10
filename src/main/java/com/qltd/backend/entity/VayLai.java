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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "vaylai", catalog = "tindung", schema = "")
public class VayLai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaHopDong")
    private Integer maHopDong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TienVay")
    private long tienVay;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "HinhThucLai")
    private String hinhThucLai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGianVay")
    private short thoiGianVay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChuKyLai")
    private short chuKyLai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lai")
    private long lai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "KieuTinhLai")
    private String kieuTinhLai;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private HopDong hopdong;

   

    @Override
    public String toString() {
        return "genjpa.Vaylai[ maHopDong=" + maHopDong + " ]";
    }
    
}
