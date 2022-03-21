package com.example.WebService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KetquaDto implements Serializable {
    @NotNull
    @Size(min = 1, max = 50)
    private  String mauser;
    @NotNull
    private int mabodethi;
    @NotNull
    private int macauhoi;
    @Size(max = 1)
    private  String phuongan;
}
