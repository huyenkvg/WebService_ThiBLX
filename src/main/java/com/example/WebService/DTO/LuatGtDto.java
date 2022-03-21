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
public class LuatGtDto implements Serializable {
    @NotNull
    @Size(min = 1, max = 200)
    private  String maluat;
    @Size(max = 10)
    private String noidung;
    @NotNull
    private  Integer maLoaiLuat;
}
