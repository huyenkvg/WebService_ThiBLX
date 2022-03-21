/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BangLaiXe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "CAUHOI")
@Getter
@Setter
@AllArgsConstructor
public class Cauhoi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MACAUHOI")
    private Integer macauhoi;
    @Size(max = 100)
    @Column(name = "NOIDUNG")
    private String noidung;
    @Size(max = 30)
    @Column(name = "A")
    private String a;
    @Size(max = 30)
    @Column(name = "B")
    private String b;
    @Size(max = 30)
    @Column(name = "C")
    private String c;
    @Size(max = 30)
    @Column(name = "D")
    private String d;
    @Size(max = 10)
    @Column(name = "DAPAN")
    private String dapan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cauhoi")
    private Collection<ChiTietDeThi> chiTietDeThiCollection;
    @JoinColumn(name = "MA_LOAI_LI_THUYET", referencedColumnName = "MA_LOAI_LI_THUYET")
    @ManyToOne
    private Loailithuyet maLoaiLiThuyet;

    public Cauhoi() {
    }

    public Cauhoi(Integer macauhoi) {
        this.macauhoi = macauhoi;
    }

}
