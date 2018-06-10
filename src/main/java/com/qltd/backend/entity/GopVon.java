/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "gopvon", catalog = "tindung", schema = "")
public class GopVon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NhaDauTu")
    private String nhaDauTu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DiaChi")
    private String diaChi;
    @Size(max = 15)
    @Column(name = "SoDienThoai")
    private String soDienThoai;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoTien")
    private BigDecimal soTien;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HinhThucTinhLai")
    private boolean hinhThucTinhLai;
    @Size(max = 450)
    @Column(name = "GhiChu")
    private String ghiChu;
    @Column(name = "SoLai")
    private Integer soLai;
    @JoinColumn(name = "MaCuaHang", referencedColumnName = "MaCuaHang")
    @ManyToOne(optional = false)
    private CuaHang maCuaHang;

   
    @Override
    public String toString() {
        return "genjpa.Gopvon[ ma=" + ma + " ]";
    }
    
}
