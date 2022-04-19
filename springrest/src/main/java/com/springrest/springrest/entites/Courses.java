package com.springrest.springrest.entites;

public class Courses {
    private long id;
    private String title;
    private String description;

    public Courses(long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Courses() {
        super();
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
