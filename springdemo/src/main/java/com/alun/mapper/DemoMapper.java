package com.alun.mapper;

import com.alun.entity.Demo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
}
