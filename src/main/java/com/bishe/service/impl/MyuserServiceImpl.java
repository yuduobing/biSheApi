package com.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bishe.dao.MyuserDao;
import com.bishe.entity.Myuser;
import com.bishe.service.MyuserService;
import org.springframework.stereotype.Service;

/**
 * (Myuser)表服务实现类
 *
 * @author 😀
 */
@Service("myuserService")
public class MyuserServiceImpl extends ServiceImpl<MyuserDao, Myuser> implements MyuserService {

}

