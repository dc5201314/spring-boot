package top.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.entity.Special;

import java.util.List;

@Mapper
public interface SpecialMapper {
    @Select("SELECT * FROM list ORDER BY updated DESC ")
    List<Special> findAll();
}