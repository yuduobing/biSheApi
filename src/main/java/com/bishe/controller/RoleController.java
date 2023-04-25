package com.bishe.controller;

import java.util.List;

import com.bishe.common.BaseController;
import com.bishe.common.core.domain.AjaxResult;
import com.bishe.entity.Admin;
import com.bishe.entity.R;
import com.bishe.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 用户表Controller
 * 
 * @author ruoyi
 * @date 2023-02-27
 */
@RestController
@RequestMapping("/system/admin")
public class RoleController extends BaseController
{
    @Autowired
    private IRoleService roleService;

    /**
     * 查询用户表列表
     */

    @GetMapping("/list")
    public R list(Admin admin)
    {
//        startPage();
        List<Admin> list = roleService.selectAdminList(admin);
        return new R(list);
    }


    /**
     * 获取用户表详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(roleService.selectAdminById(id));
    }

    /**
     * 新增用户表
     */

    @PostMapping
    public AjaxResult add(@RequestBody Admin admin)
    {
        return toAjax(roleService.insertAdmin(admin));
    }

    /**
     * 修改用户表
     */

    @PutMapping
    public AjaxResult edit(@RequestBody Admin admin)
    {
        return toAjax(roleService.updateAdmin(admin));
    }

    /**
     * 删除用户表
     */

	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(roleService.deleteAdminByIds(ids));
    }
}
