package com.example.WebService.Controller_API;

import com.example.WebService.DTO.BodethiDto;
import com.example.WebService.Entity_BangLaiXe.Admin;
import com.example.WebService.Entity_BangLaiXe.Bodethi;
import com.example.WebService.Services.Impl.BodethiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bo-de/")
public class BodethiController {
    @Autowired
    private BodethiServiceImpl bodethiService;

    @GetMapping("get-all")
    public List<BodethiDto> getBodethi() {
        List<BodethiDto> list = bodethiService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserBodethi(@RequestBody Bodethi x) {
        bodethiService.save(x);
    }

    @DeleteMapping("delete")
    public void removeBodethi(@RequestBody Bodethi x) {
        bodethiService.delete(x);
    }


}
