package com.example.design_patterns.creational.prototype;

import java.util.Arrays;

public class Article implements ContentPrototype{

    private String title;
    private String body;
    private String author;
    private String[] tags;

    public Article(String title, String body, String author, String[] tags) {
        this.title = title;
        this.body = body;
        this.author = author;
        this.tags = tags;
    }

    @Override
    public Article clone() {
        return new Article(this.title, this.body, this.author, this.tags.clone());
    }

    @Override
    public String toString() {
        return "Title: "+title+"\n"
                +"Body: "+body+"\n"
                +"Author: "+author+"\n"
                +"tags: "+ Arrays.toString(tags);
    }
}
