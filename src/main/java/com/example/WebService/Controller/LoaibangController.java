package com.example.WebService.Controller;

import com.example.WebService.DTO.LoaibangDTO;
import com.example.WebService.DTO.TaikhoanDTO;
import com.example.WebService.Services.LoaibangService;
import com.example.WebService.Services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loaibang/")
public class LoaibangController {
    @Autowired
    private LoaibangService loaibangService;

    @GetMapping("get")
    public List<LoaibangDTO> getListLoaibang() {
        List<LoaibangDTO> list = loaibangService.getListLoaibang();
        return list;
    }
}
