package com.self.newsfeed;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsService {

    private static NewsAPI retrofit;
    private static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    public static NewsAPI getInstance() {
        if (retrofit == null) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://newsapi.org/v2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()
                    .create(NewsAPI.class);
        }
        return retrofit;
    }

}
