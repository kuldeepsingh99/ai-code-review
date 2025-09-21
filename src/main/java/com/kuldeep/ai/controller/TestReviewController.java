package com.kuldeep.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestReviewController {

    @GetMapping("/objects")
    public List<Map<String, Object>> getObjects() {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> obj1 = new HashMap<>();
        obj1.put("id", 1);
        obj1.put("name", "First");

        Map<String, Object> obj2 = new HashMap<>();
        obj2.put("id", 2);
        obj2.put("name", "Second");

        Map<String, Object> obj3 = new HashMap<>();
        obj3.put("id", 3);
        obj3.put("name", "Third");

        Map<String, Object> obj4 = new HashMap<>();
        obj4.put("id", 4);
        obj4.put("name", "Fourth");

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        return list;
    }
}
