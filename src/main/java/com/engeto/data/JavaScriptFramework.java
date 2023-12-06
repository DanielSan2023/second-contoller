package com.engeto.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JavaScriptFramework {

    private int id;
    private String name;
    private String version;
    private int hypeLevel;
}
