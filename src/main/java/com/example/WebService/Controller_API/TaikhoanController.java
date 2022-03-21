package com.example.WebService.Controller_API;

import com.example.WebService.DTO.TaikhoanDto;
import com.example.WebService.Entity_BangLaiXe.Taikhoan;
import com.example.WebService.Services.Impl.TaiKhoanServiceImpl;
import com.example.WebService.Services.Impl.TaiKhoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tai-khoan/")
public class TaikhoanController {
    @Autowired
    private TaiKhoanServiceImpl TaikhoanService;

    @GetMapping("get-all")
    public List<TaikhoanDto> getTaikhoan() {
        List<TaikhoanDto> list = TaikhoanService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserTaikhoan(@RequestBody Taikhoan x) {
        TaikhoanService.save(x);
    }

    @DeleteMapping("delete")
    public void removeTaikhoan(@RequestBody Taikhoan x) {
        TaikhoanService.delete(x);
    }


}
