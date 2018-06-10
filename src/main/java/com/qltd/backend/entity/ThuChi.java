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
@Table(name = "thuchi", catalog = "tindung", schema = "")
public class ThuChi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NoiDung")
    private String noiDung;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThuChi")
    private boolean thuChi;
    @Column(name = "CacLoaiThuChi")
    private Short cacLoaiThuChi;
    @Column(name = "SoTien")
    private Long soTien;
    @JoinColumn(name = "MaNhanVienThucHien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    private NhanVien maNhanVienThucHien;

   
    @Override
    public String toString() {
        return "genjpa.Thuchi[ ma=" + ma + " ]";
    }
    
}
