package com.springboot.jdbc.oracle.model;

public class Publish {

    private String name;
    private String title;
    private long publishyear;

    @Override
    public String toString() {
        return "Publish{" +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", publishyear='" + publishyear + '\'' +
                '}';
    }

    public Publish() {
    }

    public Publish(String name, String title, long publishyear) {
        this.name = name;
        this.title = title;
        this.publishyear = publishyear;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getpublishyear() {
        return publishyear;
    }

    public void setpublishyear(long publishyear) {
        this.publishyear = publishyear;
    }


}

