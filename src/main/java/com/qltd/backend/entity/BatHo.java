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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author MIP
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "batho", catalog = "tindung", schema = "")
public class BatHo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaHopDong")
    private Integer maHopDong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TienDuaKhach")
    private long tienDuaKhach;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TongTien")
    private long tongTien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TongSoNgay")
    private short tongSoNgay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChuKyDongTien")
    private short chuKyDongTien;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private HopDong hopdong;

   

    @Override
    public String toString() {
        return "genjpa.Batho[ maHopDong=" + maHopDong + " ]";
    }
    
}
