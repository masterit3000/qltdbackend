/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qltd.backend.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "lichsuthaotachopdong", catalog = "tindung", schema = "")
public class LichSuThaoTacHopDong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGian")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGian;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "NoiDung")
    private String noiDung;
    @Column(name = "SoTien")
    private Long soTien;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;
    @JoinColumn(name = "MaNhanVienThucHien", referencedColumnName = "MaNhanVien")
    @ManyToOne(optional = false)
    private NhanVien maNhanVienThucHien;

   
    @Override
    public String toString() {
        return "genjpa.Lichsuthaotachopdong[ ma=" + ma + " ]";
    }
    
}
