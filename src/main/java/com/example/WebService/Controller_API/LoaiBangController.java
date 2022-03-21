package com.example.WebService.Controller_API;

import com.example.WebService.DTO.LoaibangDto;
import com.example.WebService.Entity_BangLaiXe.Loaibang;
import com.example.WebService.Services.Impl.LoaibangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bang/")
public class LoaiBangController {
    @Autowired
    private LoaibangServiceImpl loaibangService;

    @GetMapping("get-all")
    public List<LoaibangDto> getLoaibang() {
        List<LoaibangDto> list = loaibangService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserloaiBang(@RequestBody Loaibang x) {
        loaibangService.save(x);
    }

    @DeleteMapping("delete")
    public void removeloaiBang(@RequestBody Loaibang x) {
        loaibangService.delete(x);
    }

}
