package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    private static final Map<String, String> arr = new HashMap<>();

    static {
        arr.put("dog", "con chó");
        arr.put("cat", "con mèo");
        arr.put("mouse", "con chuột");
        arr.put("monkey", "con khỉ");
    }

    @GetMapping("/change")
    public String ChangeMoney(@RequestParam String word, Model model) {
        String result = "";
        String messager = "";

        for (Map.Entry<String, String> entry : arr.entrySet()) {
            if (entry.getKey().equals(word)) {
                result = entry.getValue();
                model.addAttribute("word", result);
            }
        }
        if (result.equals("")) {
            messager = "không tìm thấy";
        }
        model.addAttribute("messager", messager);
        return "result";
    }
}