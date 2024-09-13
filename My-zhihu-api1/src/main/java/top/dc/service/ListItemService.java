package top.dc.service;

import top.dc.entity.ListItem;
import top.dc.entity.ListItem;

import java.util.List;

public interface ListItemService {
    List<ListItem> getItemsByPage(int page, int size);
    List<ListItem> getAllListItems();
}
