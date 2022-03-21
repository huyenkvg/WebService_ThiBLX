package com.example.WebService.DTO;

import com.example.WebService.Entity_BangLaiXe.Bodethi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietDeThiDto implements Serializable {
    private int mabodethi;
    private int macauhoi;
}
