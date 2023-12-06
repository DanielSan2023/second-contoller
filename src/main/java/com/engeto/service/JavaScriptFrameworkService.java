package com.engeto.service;

import com.engeto.data.JavaScriptFramework;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JavaScriptFrameworkService {


    private List<JavaScriptFramework> frameworks = new ArrayList<>();

    public void createDefaultFramework() {
        JavaScriptFramework angular = new JavaScriptFramework(1, "Angular", "15", 9);
        JavaScriptFramework react = new JavaScriptFramework(2, "React", "13.2", 7);
        JavaScriptFramework vue = new JavaScriptFramework(3, "Vue.js", "8.2", 2);
        frameworks.add(angular);
        frameworks.add(react);
        frameworks.add(vue);
    }

    public List<JavaScriptFramework> getAll() {
        createDefaultFramework();
        return frameworks;
    }


    public JavaScriptFramework getById(int id) {
        createDefaultFramework();
        return frameworks.get(id - 1);
    }
}
