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
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "CHI_TIET_DE_THI")

@Getter
@Setter
@AllArgsConstructor
public class ChiTietDeThi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChiTietDeThiPK chiTietDeThiPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chiTietDeThi")
    private Collection<Ketqua> ketquaCollection;
    @JoinColumn(name = "MABODETHI", referencedColumnName = "MABODETHI", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bodethi bodethi;
    @JoinColumn(name = "MACAUHOI", referencedColumnName = "MACAUHOI", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cauhoi cauhoi;

    public ChiTietDeThi() {
    }

    public ChiTietDeThi(ChiTietDeThiPK chiTietDeThiPK) {
        this.chiTietDeThiPK = chiTietDeThiPK;
    }

    public ChiTietDeThi(int mabodethi, int macauhoi) {
        this.chiTietDeThiPK = new ChiTietDeThiPK(mabodethi, macauhoi);
    }

}
