package com.example.WebService.Controller_API;

import com.example.WebService.DTO.LoaideDto;
import com.example.WebService.Services.Impl.LoaideServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loai-de/")
public class LoaiDeController {
    @Autowired
    private LoaideServiceImpl LoaideService;

    @GetMapping("get-all")
    public List<LoaideDto> getLoaide() {
        List<LoaideDto> list = LoaideService.findAll();
        return list;
    }
}
