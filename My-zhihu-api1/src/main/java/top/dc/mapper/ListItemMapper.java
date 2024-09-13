package top.dc.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.dc.entity.ListItem;


import java.util.List;

@Mapper
public interface ListItemMapper {
    List<ListItem> findAll();
    // 新增分页查询方法
    List<ListItem> findByPage(int offset, int limit);
}
