package com.example.WebService.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CauhoiDto implements Serializable {
    @NotNull
    private Integer macauhoi;
    @Size(max = 100)
    private  String noidung;
    @Size(max = 30)
    private  String a;
    @Size(max = 30)
    private  String b;
    @Size(max = 30)
    private  String c;
    @Size(max = 30)
    private String d;
    @Size(max = 10)
    private  String dapan;
    @NotNull
    private Integer maLoaiLiThuyet;
}
