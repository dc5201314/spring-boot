package top.dc.springbootquickstart.service;

import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.enums.RequestType;

@Service
public class CustomerService {
    public String handleRequest(RequestType requestType) {
        return switch (requestType) {
            case QUERY -> handleQuery();
            case COMPLAINT -> handleComplaint();
            case SUGGESTION -> handleSuggestion();
        };
    }
    private String handleQuery() {
        return "处理用户查询";
    }
    private String handleComplaint() {
        return "处理用户投诉";
    }
    private String handleSuggestion() {
        return "处理用户建议";
    }
}

