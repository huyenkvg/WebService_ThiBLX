package com.example.WebService.Controller;

import com.example.WebService.DTO.LoailithuyetDTO;
import com.example.WebService.Services.LoailithuyetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loailt/")
public class LoailithuyetController {
    @Autowired
    private LoailithuyetService loailithuyetService;

    @GetMapping("get")
    public List<LoailithuyetDTO> getLoailt(){
        List<LoailithuyetDTO> loailt = loailithuyetService.getListLoailt();
        return loailt;
    }
    @GetMapping("{id}")
    public LoailithuyetDTO getLoailtById(@PathVariable Integer id){
        LoailithuyetDTO loailt = loailithuyetService.getLoailtByID(id);
        return loailt;
    }
}
