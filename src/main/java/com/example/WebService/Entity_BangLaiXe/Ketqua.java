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
import javax.persistence.*;
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
    @Column(name = "PHUONGAN", length = 1)
    private String phuongan;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @JoinColumn(name = "MACAUHOI", referencedColumnName = "MACAUHOI", nullable = false)
    @ManyToOne(optional = false)
    private Cauhoi macauhoi;
    @JoinColumn(name = "MAUSER", referencedColumnName = "EMAIL", nullable = false)
    @ManyToOne(optional = false)
    private User mauser;

    public Ketqua() {
    }



}
