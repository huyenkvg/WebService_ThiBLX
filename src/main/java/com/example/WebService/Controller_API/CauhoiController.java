package com.example.WebService.Controller_API;

import com.example.WebService.DTO.CauhoiDto;
import com.example.WebService.Services.Impl.CauhoiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cau-hoi/")
public class CauhoiController {
    @Autowired
    private CauhoiServiceImpl cauhoiService;

    @GetMapping("get-all")
    public List<CauhoiDto> getCauhoi() {
        List<CauhoiDto> list = cauhoiService.findAll();
        return list;
    }
}
