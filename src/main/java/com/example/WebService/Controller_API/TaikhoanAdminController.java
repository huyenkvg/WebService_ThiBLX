package com.example.WebService.Controller_API;

import com.example.WebService.DTO.TaikhoanAdminDto;
import com.example.WebService.Entity_BangLaiXe.TaikhoanAdmin;
import com.example.WebService.Services.Impl.TaiKhoanAdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tai-khoan-admin/")
public class TaikhoanAdminController {
    @Autowired
    private TaiKhoanAdminServiceImpl TaikhoanAdminService;

    @GetMapping("get-all")
    public List<TaikhoanAdminDto> getTaikhoanAdmin() {
        List<TaikhoanAdminDto> list = TaikhoanAdminService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserTaikhoanAdmin(@RequestBody TaikhoanAdmin x) {
        TaikhoanAdminService.save(x);
    }

    @DeleteMapping("delete")
    public void removeTaikhoanAdmin(@RequestBody TaikhoanAdmin x) {
        TaikhoanAdminService.delete(x);
    }


}
