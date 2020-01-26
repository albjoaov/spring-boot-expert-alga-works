package com.algaworks.algafood;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping()
    @ResponseBody
    public List<Serializable> hello() {
        HashMap map = new HashMap<String, String>();
        map.put("a", "b");
        List<Serializable> collect = Stream.of("a", "b", 1, 3, map).collect(Collectors.toList());
        return collect;
    }

    @GetMapping(path = "/a")
    @ResponseBody
    public Map<String, String> a() {
        HashMap map = new HashMap<String, String>();
        map.put("a", "b");
        return map;
    }
}
