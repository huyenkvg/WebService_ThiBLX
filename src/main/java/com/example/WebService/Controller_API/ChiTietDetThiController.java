package com.example.WebService.Controller_API;

import com.example.WebService.DTO.ChiTietDeThiDto;
import com.example.WebService.Services.Impl.ChiTietDeThiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/de-thi/")
public class ChiTietDetThiController {
    @Autowired
    ChiTietDeThiServiceImpl chiTietDeThiService;
    @GetMapping("get-all")
    public List<ChiTietDeThiDto> getAdmin() {
        List<ChiTietDeThiDto> adminList = chiTietDeThiService.findAll();
        return adminList;
    }
}
