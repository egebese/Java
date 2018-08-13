package com.egedev.metodlarveclasslar;

public class Blog {

    private String title;
    private String url;
    private String pass;
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blog(String title, String url, String pass, int id) {
        this.title = title;
        this.url = url;
        this.pass = pass;
        this.id = id;

    }
}





