package com.demo;

/**
 * Created by morbo on 6/2/16.
 */
public class Event {

    public Event(String title){
        this.setTitle(title);
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
