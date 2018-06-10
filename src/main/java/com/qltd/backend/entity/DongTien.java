/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "dongtien", catalog = "tindung", schema = "")
public class DongTien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayBatDau")
    @Temporal(TemporalType.DATE)
    private Date ngayBatDau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayKetThuc")
    @Temporal(TemporalType.DATE)
    private Date ngayKetThuc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoTien")
    private BigDecimal soTien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TrangThai")
    private boolean trangThai;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;

    
    @Override
    public String toString() {
        return "genjpa.Dongtien[ ma=" + ma + " ]";
    }
    
}
