package com.bishe.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bishe.entity.Notice;
import com.bishe.entity.R;
import com.bishe.service.AdminService;
import com.bishe.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 公告 接口
 */

@RestController
@RequestMapping("/notice")
public class NoticeController{

    @Autowired
    private NoticeService service;
    @Autowired
    private AdminService adminService;


    @PostMapping("/save")
    public R save(@RequestBody Notice entity, @RequestHeader String Token) {
        Integer userId = Integer.valueOf(Token.split("_")[1]);
        entity.setUserId(userId);

        boolean b = service.saveOrUpdate(entity);
        if (b) {
            return new R();
        } else  {
            return new R(20001, "服务异常，保存失败！");
        }
    }

    @GetMapping("deleteById")
    public R deleteById(Integer id) {
        boolean b = service.removeById(id);
        if (b) {
            return new R();
        } else {
            return new R(20001, "服务异常，删除失败！");
        }
    }

    @GetMapping("/getAll")
    public R getAll() {
        QueryWrapper<Notice> query = Wrappers.query();
        query.orderByDesc("id");
        List<Notice> list = service.list(query);
        for (Notice record : list) {
            record.setAdmin(record.getUserId() == null ? null : adminService.getById(record.getUserId()));
        }
        return new R(list);
    }

    @GetMapping("/getPage")
    public R getPage(Integer pageNum, Integer pageSize) {

        Page<Notice> p = new Page<>(pageNum, pageSize);
        QueryWrapper<Notice> query = Wrappers.query();
        query.orderByDesc("id"); // 根据id倒序

        Page<Notice> res = service.page(p, query);
        for (Notice record : res.getRecords()) {
            record.setAdmin(record.getUserId() == null ? null : adminService.getById(record.getUserId()));
        }
        return new R(res);
    }

}
