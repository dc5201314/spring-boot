package top.dc.common;

import java.util.HashMap;
import java.util.Map;

public class Response<T> {
    private Map<String, Object> paging;
    private T data;

    public Response(boolean isEnd, int total, T data) {
        this.paging = new HashMap<>();
        this.paging.put("is_end", isEnd);
        this.paging.put("total", total);
        this.paging.put("next", null);
        this.paging.put("previous", null);
        this.data = data;
    }

    // Getters and Setters
    public Map<String, Object> getPaging() {
        return paging;
    }

    public T getData() {
        return data;
    }
}

