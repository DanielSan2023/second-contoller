package com.engeto.controller;

import com.engeto.data.JavaScriptFramework;
import com.engeto.model.Student;
import com.engeto.service.JavaScriptFrameworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JavaScriptFrameworkController {

    @Autowired
    private JavaScriptFrameworkService javaScriptFrameworkService;

    @GetMapping("frameworks")
    public List<JavaScriptFramework> getFrameworks() {
        return javaScriptFrameworkService.getAll();
    }

//    @PostMapping("createFrameworks")
//    public void createFramework(@RequestBody JavaScriptFramework javaScriptFramework) {
//        javaScriptFrameworkService.createDefaultFramework();
//    }

    @PostMapping("/createFrameworks")
    public void createFramework() {
        javaScriptFrameworkService.createDefaultFramework();
    }

    @GetMapping("frameworks/{id}")
    public JavaScriptFramework getFrameworkById(@PathVariable int id) {
        return javaScriptFrameworkService.getById(id);
    }


}

