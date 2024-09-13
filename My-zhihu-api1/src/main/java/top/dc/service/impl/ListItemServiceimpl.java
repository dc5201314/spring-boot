package top.dc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dc.entity.ListItem;
import top.dc.mapper.ListItemMapper;
import top.dc.service.ListItemService;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class ListItemServiceimpl implements ListItemService {

    @Autowired
    private ListItemMapper listItemMapper;
    // 格式化日期的方法
    private void formatUpdatedTimestamp(List<ListItem> items) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        items.forEach(item -> {
            // 将 Unix 时间戳从秒转换为毫秒并格式化为日期字符串
            String formattedDate = df.format(new Date(Long.parseLong(item.getUpdated() + "000")));
            item.setUpdated(formattedDate);
        });
    }
    @Override
    public List<ListItem> getItemsByPage(int page, int size) {
        List<ListItem> items = listItemMapper.findByPage(page, size);
        formatUpdatedTimestamp(items);  // 调用时间戳格式化方法
        return items;
    }

    @Override
    public List<ListItem> getAllListItems() {
        List<ListItem> items = listItemMapper.findAll();
        formatUpdatedTimestamp(items);  // 调用时间戳格式化方法
        return items;
    }

}
