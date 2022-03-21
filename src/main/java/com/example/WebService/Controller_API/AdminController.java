package com.example.WebService.Controller_API;


import com.example.WebService.DTO.AdminDto;
import com.example.WebService.Entity_BangLaiXe.Admin;
import com.example.WebService.Services.AdminService;
import com.example.WebService.Services.Impl.LoaibangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/")
public class AdminController {
    @Autowired
    private AdminService adminService;
    //lay toàn bộ thông tin
    @GetMapping("get")
    public List<AdminDto> getAdmin() {
        List<AdminDto> adminList = adminService.listAll();
        return adminList;
    }
    // Ví dụ Sử  dụng query tự viết
    @PostMapping("add")
    public void addAdmin(@RequestBody Admin ad) {
        adminService.insert(ad.getEmail(), ad.getCmnd(), ad.getHoten(), ad.getSdt());
        return;
    }
    @PostMapping("save")
    public void ínsertOrUpdateAdmin(@RequestBody Admin ad) {
        adminService.save(ad);
    }

    @DeleteMapping("delete")
    public void removeAdmin(@RequestBody Admin ad) {
        adminService.delete(ad.getEmail());
    }


}