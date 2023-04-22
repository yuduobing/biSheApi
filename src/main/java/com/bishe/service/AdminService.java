package com.bishe.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bishe.entity.Admin;
import com.bishe.entity.R;

public interface AdminService extends IService<Admin> {

    public R verifyLogin(Admin admin);

}
