package top.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.dc.common.Response;
import top.dc.entity.ListItem;
import top.dc.service.ListItemService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ListItemController {

    @Autowired
    private ListItemService listItemService;

    @GetMapping("/list-items")
    public Response<List<ListItem>> getListItems() {
        List<ListItem> listItems = listItemService.getAllListItems();
        return new Response<>(false, listItems.size(), listItems);
    }

    @GetMapping("/items")
    public ResponseResult getItems(@RequestParam(defaultValue = "1") int page,
                                   @RequestParam(defaultValue = "10") int size) {
        Map<String,Object> map =new HashMap<>();
        List <ListItem> specials =listItemService.getItemsByPage(page,size);
        map.put("specials",specials);
        map.put("total",listItemService.getAllListItems().size());
        return ResponseResult.builder()
                .code(200)
                .data(map)
                .build();
    }
}