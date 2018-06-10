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
@Table(name = "ghino", catalog = "tindung", schema = "")
public class GhiNo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ma")
    private Integer ma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayGhi")
    @Temporal(TemporalType.DATE)
    private Date ngayGhi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoTien")
    private long soTien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "NoTra")
    private String noTra;
    @JoinColumn(name = "MaHopDong", referencedColumnName = "Ma")
    @ManyToOne(optional = false)
    private HopDong maHopDong;

    

    @Override
    public String toString() {
        return "genjpa.Ghino[ ma=" + ma + " ]";
    }
    
}
