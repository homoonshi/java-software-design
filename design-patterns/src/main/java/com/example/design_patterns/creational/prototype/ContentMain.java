package com.example.design_patterns.creational.prototype;

public class ContentMain {

    public static void main(String[] args) {

        Article article = new Article("JavaScript", "I'll study", "me", new String[]{"frontend", "replay"});
        Article clone = article.clone();

        System.out.println(article.toString());
        System.out.println("");
        System.out.println(clone.toString());

    }

}
