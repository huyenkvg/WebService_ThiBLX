/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BangLaiXe;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author HUYENKUTE
 */
@Entity
@Table(name = "BODETHI")
@Getter
@Setter
@AllArgsConstructor
public class Bodethi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MABODETHI")
    private Integer mabodethi;
    @JoinColumn(name = "MALOAIBANG", referencedColumnName = "MALOAIBANG")
    @ManyToOne(optional = false)
    private Loaibang maloaibang;
    @JoinColumn(name = "MALOAIDE", referencedColumnName = "MALOAIDE")
    @ManyToOne(optional = false)
    private Loaide maloaide;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bodethi")
    private Collection<ChiTietDeThi> chiTietDeThiCollection;

    public Bodethi() {
    }

    public Bodethi(Integer mabodethi) {
        this.mabodethi = mabodethi;
    }
    
}
