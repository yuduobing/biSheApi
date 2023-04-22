package com.bishe.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bishe.common.BaseController;
import com.bishe.entity.Myuser;
import com.bishe.entity.R;
import com.bishe.service.MyuserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Myuser)表控制层
 *
 * @author 😀
 */
@RestController
@RequestMapping("myuser")
public class MyuserController extends BaseController {
    
    @Resource
    private MyuserService userService;


    /**
     * 获取用户基本信息
     * @return
     */
    @GetMapping("/getById")
    public R getById(Integer id){
        Myuser byId = userService.getById(id);
        return new R(byId);
    }

    @GetMapping("deleteById")
    public R deleteById(int id) {
        boolean b = userService.removeById(id);
        if (b) {
            return new R();
        } else {
            return new R(20001, "服务异常，删除失败！");
        }
    }

    @GetMapping("/getPage")
    public R getAll(Integer pageNum, Integer pageSize) {
        Page<Myuser> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Myuser> query = Wrappers.query();
        query.orderByDesc("id");

        Page<Myuser> resData = userService.page(page, query);
        return new R(resData);
    }


    @PostMapping("/update")
    public R update(@RequestBody Myuser user) {
        boolean b = userService.updateById(user);
        if (b) {
            return new R();
        } else {
            return new R(20001, "服务异常，更新失败！");
        }
    }



}

