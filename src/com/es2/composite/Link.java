package com.es2.composite;

public class Link extends Menu {
    private String URL;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public void showOptions() {
        System.out.println(this.getLabel());
        System.out.println(URL);
    }

}
