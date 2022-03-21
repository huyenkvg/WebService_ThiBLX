package com.example.WebService.Controller_API;

import com.example.WebService.DTO.KetquaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ket-qua/")
public class KetquaController {
    @Autowired
    private com.example.WebService.Services.KetquaService KetquaService;

    @GetMapping("get-all")
    public List<KetquaDto> getKetqua() {
        List<KetquaDto> list = KetquaService.findAll();
        return list;
    }

}
