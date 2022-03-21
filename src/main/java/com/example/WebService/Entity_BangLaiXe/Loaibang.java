/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebService.Entity_BangLaiXe;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "LOAIBANG")

@Getter
@Setter
public class Loaibang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.AUTO)
    @Column(name = "MALOAIBANG")
    private Integer maloaibang;
    @Size(max = 50)
    @Column(name = "TENLOAIBANG")
    private String tenloaibang;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maloaibang")
    private Collection<Bodethi> bodethiCollection;

    public Loaibang() {
    }

    public Loaibang(Integer maloaibang) {
        this.maloaibang = maloaibang;
    }


}
