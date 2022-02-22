package com.springboot.jdbc.oracle.model;

public class Author {

    private long id;
    private String name;
    private String title;
    private String briefProfile;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", briefProfile='" + briefProfile + '\'' +
                '}';
    }

    public Author() {
    }

    public Author(String name, String title, String briefProfile) {
        this.name = name;
        this.title = title;
        this.briefProfile = briefProfile;
    }

    public Author(long id, String name, String title, String briefProfile) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.briefProfile = briefProfile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getBriefProfile() {
        return briefProfile;
    }

    public void setBriefProfile(String briefProfile) {
        this.briefProfile = briefProfile;
    }


}
