/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BangLaiXe;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author HUYENKUTE
 */
@Embeddable

@Getter
@Setter
public class KetquaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MAUSER")
    private String mauser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MABODETHI")
    private int mabodethi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MACAUHOI")
    private int macauhoi;

    public KetquaPK() {
    }

    public KetquaPK(String mauser, int mabodethi, int macauhoi) {
        this.mauser = mauser;
        this.mabodethi = mabodethi;
        this.macauhoi = macauhoi;
    }

  
    
}
