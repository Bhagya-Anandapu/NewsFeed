package com.self.newsfeed;

import com.google.gson.annotations.SerializedName;




public class NewsDetailedModel {


    @SerializedName("urlToImage")
    private String imageUrl;

    @SerializedName("title")
    private String title;

    @SerializedName("author")
    private String author;

    @SerializedName("description")
    private String description;

    @SerializedName("publishedAt")
    private String publishedAt;



    private Source source;

    public static class Source{
        private String id;
        private String name;

        public Source(String id,String name){
            this.id=id;
            this.name=name;
        }

        public String getId(){ return id; }

        public void setId(String url){ this.id=url; }

        public String getName(){ return name; }

        public void setName(String url){ this.name=url; }

    }


    public NewsDetailedModel(String imageUrl,String title,String author,String description,String publishedAt){

        this.imageUrl=imageUrl;
        this.author=author;
        this.title=title;
        this.description=description;
        this.publishedAt=publishedAt;
    }

    public String getImageUrl(){ return imageUrl; }

    public void setImageUrl(String url){ this.imageUrl=url; }

    public String getAuthor(){ return author; }

    public void setAuthor(String url){ this.author=url; }

    public String getDescription(){ return description; }

    public void setDescription(String url){ this.description=url; }

    public String getPublishedAt(){ return publishedAt; }

    public void setPublishedAt(String url){ this.publishedAt=url; }

    public String getTitle(){ return title; }

    public void setTitle(String url){ this.title=url; }

}




