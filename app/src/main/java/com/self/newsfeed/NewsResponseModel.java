package com.self.newsfeed;

import java.util.List;

public class NewsResponseModel {
    private String success;
    private List<NewsDetailedModel> articles;
    public NewsResponseModel(String success, List<NewsDetailedModel> articles){
        this.success=success;
        this.articles=articles;
    }

    public String isSuccess(){return success;}
    public void setSuccess(String success){ this.success=success;}
    public List<NewsDetailedModel> getNews(){ return articles;}

    public void setNews(List<NewsDetailedModel> news){this.articles=news;}
}
