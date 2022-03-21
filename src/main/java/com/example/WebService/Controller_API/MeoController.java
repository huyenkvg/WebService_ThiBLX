package com.example.WebService.Controller_API;

import com.example.WebService.DTO.MeoDto;
import com.example.WebService.Entity_BangLaiXe.Meo;
import com.example.WebService.Services.Impl.MeoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meo/")
public class MeoController {
    @Autowired
    private MeoServiceImpl MeoService;

    @GetMapping("get-all")
    public List<MeoDto> getMeo() {
        List<MeoDto> list = MeoService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserMeo(@RequestBody Meo x) {
        MeoService.save(x);
    }
//    @PutMapping("edit")
//    public void editMeo(@RequestBody Meo x) {
//        MeoService.save(x);
//    }

    @DeleteMapping("delete")
    public void removeMeo(@RequestBody Meo x) {
        MeoService.delete(x);
    }


}
