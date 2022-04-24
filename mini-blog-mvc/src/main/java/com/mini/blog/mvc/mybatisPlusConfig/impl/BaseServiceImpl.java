package com.mini.blog.mvc.mybatisPlusConfig.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mini.blog.mvc.exceptionConfig.ServiceException;
import com.mini.blog.mvc.mybatisPlusConfig.IBaseService;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Administrator
 * @version 1.0
 * @description: TODO
 * @date 2022/4/4 22:37
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T>, InitializingBean {

    public BaseServiceImpl() {
    }

    @Override
    public T queryOne(T dto) {
        if (dto == null){
            throw new ServiceException("参数不能为空");
        }else {
            return (T) super.baseMapper.selectOne(new QueryWrapper(dto));
        }
    }



    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
