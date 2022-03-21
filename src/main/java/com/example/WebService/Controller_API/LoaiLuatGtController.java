package com.example.WebService.Controller_API;

import com.example.WebService.DTO.LoaiLuatGtDto;
import com.example.WebService.Services.Impl.LoaiLuatGtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loai-luat/")
public class LoaiLuatGtController {
    @Autowired
    private LoaiLuatGtServiceImpl LoaiLuatGtService;

    @GetMapping("get-all")
    public List<LoaiLuatGtDto> getLoaiLuatGt() {
        List<LoaiLuatGtDto> list = LoaiLuatGtService.findAll();
        return list;
    }
}
