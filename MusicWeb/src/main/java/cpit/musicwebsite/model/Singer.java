package com.example.musicwebsite.model;

public class Singer {
    private Long id;
    private String name;
    private String imageUrl;
    private String introduction;

    public Singer(Long id, String name, String imageUrl, String introduction) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.introduction = introduction;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
