package com.example.WebService.Controller_API;

import com.example.WebService.DTO.LoaiMeoDto;
import com.example.WebService.Entity_BangLaiXe.LoaiMeo;
import com.example.WebService.Entity_BangLaiXe.Meo;
import com.example.WebService.Services.Impl.LoaiMeoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loai-meo/")
public class LoaiMeoController {
    @Autowired
    private LoaiMeoServiceImpl loaiMeoService;

    @GetMapping("get-all")
    public List<LoaiMeoDto> getLoaiMeo() {
        List<LoaiMeoDto> list = loaiMeoService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserLoaiMeo(@RequestBody LoaiMeo x) {
        loaiMeoService.save(x);
    }

    @DeleteMapping("delete")
    public void removeMeo(@RequestBody LoaiMeo x) {
        loaiMeoService.delete(x);
    }
}
