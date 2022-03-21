package com.example.WebService.Controller_API;

import com.example.WebService.DTO.UserDto;
import com.example.WebService.Entity_BangLaiXe.User;
import com.example.WebService.Services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserServiceImpl UserService;

    @GetMapping("get-all")
    public List<UserDto> getUser() {
        List<UserDto> list = UserService.findAll();
        return list;
    }
    @PostMapping("save")
    public void ínserUser(@RequestBody User x) {
        UserService.save(x);
    }

    @DeleteMapping("delete")
    public void removeUser(@RequestBody User x) {
        UserService.delete(x);
    }


}
