/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BangLaiXe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "LUAT_GT")

@Getter
@Setter
@AllArgsConstructor
public class LuatGt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "MALUAT")
    private String maluat;
    @Size(max = 10)
    @Column(name = "NOIDUNG")
    private String noidung;
    @JoinColumn(name = "MA_LOAI_LUAT_GT", referencedColumnName = "MA_LOAI_LUAT_GT")
    @ManyToOne
    private LoaiLuatGt maLoaiLuatGt;

    public LuatGt() {
    }

    public LuatGt(String maluat) {
        this.maluat = maluat;
    }

    
}
