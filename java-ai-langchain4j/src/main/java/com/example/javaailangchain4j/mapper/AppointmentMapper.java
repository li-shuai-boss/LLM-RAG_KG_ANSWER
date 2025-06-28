package com.example.javaailangchain4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javaailangchain4j.model.Appointment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}