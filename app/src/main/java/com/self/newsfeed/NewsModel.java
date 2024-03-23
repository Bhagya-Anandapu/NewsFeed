package com.self.newsfeed;

public class NewsModel {
    // URL for more details
    private String url;
    private String title;
    private String author;
    private String imageUrl;
    private String description;
    private String publishedAt;

    public NewsModel(String title, String author, String imageUrl, String description, String publishedAt) {

        this.title = title;
        this.author = author;
        this.imageUrl = imageUrl;
        this.description = description;
        this.publishedAt = publishedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String url) {
        this.imageUrl = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
