package com.bishe.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bishe.dao.NoticeDao;
import com.bishe.entity.Notice;
import com.bishe.service.NoticeService;
import org.springframework.stereotype.Service;

/**
 * (Notice)表服务实现类
 *
 * @author 😀
 */
@Service("noticeService")
public class NoticeServiceImpl extends ServiceImpl<NoticeDao, Notice> implements NoticeService {

}

