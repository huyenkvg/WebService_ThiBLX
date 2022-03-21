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

/**
 *
 * @author HUYENKUTE
 */
@Embeddable
@Getter
@Setter
public class ChiTietDeThiPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "MABODETHI")
    private int mabodethi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MACAUHOI")
    private int macauhoi;

    public ChiTietDeThiPK() {
    }

    public ChiTietDeThiPK(int mabodethi, int macauhoi) {
        this.mabodethi = mabodethi;
        this.macauhoi = macauhoi;
    }

    public int getMabodethi() {
        return mabodethi;
    }

    public void setMabodethi(int mabodethi) {
        this.mabodethi = mabodethi;
    }

    public int getMacauhoi() {
        return macauhoi;
    }

    public void setMacauhoi(int macauhoi) {
        this.macauhoi = macauhoi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) mabodethi;
        hash += (int) macauhoi;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChiTietDeThiPK)) {
            return false;
        }
        ChiTietDeThiPK other = (ChiTietDeThiPK) object;
        if (this.mabodethi != other.mabodethi) {
            return false;
        }
        if (this.macauhoi != other.macauhoi) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.WebService.BangLaiXe.ChiTietDeThiPK[ mabodethi=" + mabodethi + ", macauhoi=" + macauhoi + " ]";
    }
    
}
