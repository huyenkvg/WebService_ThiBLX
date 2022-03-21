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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "KETQUA")
@Getter
@Setter
@AllArgsConstructor
public class Ketqua implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KetquaPK ketquaPK;
    @Size(max = 1)
    @Column(name = "PHUONGAN")
    private String phuongan;
    @JoinColumns({
        @JoinColumn(name = "MABODETHI", referencedColumnName = "MABODETHI", insertable = false, updatable = false),
        @JoinColumn(name = "MACAUHOI", referencedColumnName = "MACAUHOI", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ChiTietDeThi chiTietDeThi;
    @JoinColumn(name = "MAUSER", referencedColumnName = "EMAIL", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private User user;

    public Ketqua() {
    }

    public Ketqua(KetquaPK ketquaPK) {
        this.ketquaPK = ketquaPK;
    }

    public Ketqua(String mauser, int mabodethi, int macauhoi) {
        this.ketquaPK = new KetquaPK(mauser, mabodethi, macauhoi);
    }

}
