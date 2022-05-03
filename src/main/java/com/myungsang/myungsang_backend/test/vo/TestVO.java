package com.myungsang.myungsang_backend.test.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

public class TestVO {
    private int id;
    private String name;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
