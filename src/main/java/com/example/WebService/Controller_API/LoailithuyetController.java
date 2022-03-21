package com.example.WebService.Controller_API;

import com.example.WebService.DTO.LoailithuyetDto;
import com.example.WebService.Services.Impl.LoailithuyetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loai-lithuyet/")
public class LoailithuyetController {
    @Autowired
    private LoailithuyetServiceImpl LoailithuyetService;

    @GetMapping("get-all")
    public List<LoailithuyetDto> getLoailithuyet() {
        List<LoailithuyetDto> list = LoailithuyetService.findAll();
        return list;
    }
}
