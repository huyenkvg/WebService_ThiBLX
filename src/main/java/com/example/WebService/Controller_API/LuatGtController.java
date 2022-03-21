package com.example.WebService.Controller_API;

import com.example.WebService.DTO.LuatGtDto;
import com.example.WebService.Entity_BangLaiXe.LuatGt;
import com.example.WebService.Services.Impl.LuatGtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/luat-gt/")
public class LuatGtController {
    @Autowired
    private LuatGtServiceImpl LuatGtService;

    @GetMapping("get-all")
    public List<LuatGtDto> getLuatGt() {
        List<LuatGtDto> list = LuatGtService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserLuatGt(@RequestBody LuatGt x) {
        LuatGtService.save(x);
    }

    @DeleteMapping("delete")
    public void removeLuatGt(@RequestBody LuatGt x) {
        LuatGtService.delete(x);
    }
}
