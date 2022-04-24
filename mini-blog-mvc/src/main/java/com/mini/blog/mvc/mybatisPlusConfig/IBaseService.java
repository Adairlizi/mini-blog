package com.mini.blog.mvc.mybatisPlusConfig;

import com.baomidou.mybatisplus.extension.service.IService;

public interface IBaseService<T> extends IService<T> {

    T queryOne(T dto);
}
