package com.bishe.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.bishe.entity.Admin;
import com.bishe.entity.R;
import com.bishe.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 管理员控制层
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @PostMapping("/login")
    public R login(@RequestBody Admin admin){
        R r = adminService.verifyLogin(admin);
        return r;
    }

    /**
     * 获取用户基本信息
     * @return
     */
    @GetMapping("/info")
    public R info(@RequestHeader String Token){

        return new R(adminService.getById(Token.split("_")[1]));

    }

    @GetMapping("/logout")
    public R logout(){
        return new R();
    }

    @PostMapping("/save")
    public R save(@RequestBody Admin admin) {

        if (admin.getId() == 0) {
            String phone = admin.getPhone();
            QueryWrapper<Admin> query = Wrappers.query();
            query.eq("phone", phone);
            List<Admin> list = adminService.list(query);
            if (list.size() != 0) {
                return new R(20001, "手机号已经存在！添加失败！！");
            }
        }

        boolean b = adminService.saveOrUpdate(admin);
        if (b) {
            return new R();
        } else  {
            return new R(20001, "服务异常，保存失败！");
        }
    }

    @GetMapping("deleteById")
    public R deleteById(int id) {
        boolean b = adminService.removeById(id);
        if (b) {
            return new R();
        } else {
            return new R(20001, "服务异常，删除失败！");
        }
    }

    @GetMapping("/getAll")
    public R getAll() {
        List<Admin> list = adminService.list();
        return new R(list);
    }

}
