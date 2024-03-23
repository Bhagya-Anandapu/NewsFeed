package com.self.newsfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    List<NewsModel> list;

    public NewsAdapter(List<NewsModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_article, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        holder.setData(list.get(position).getTitle(),list.get(position).getAuthor(),list.get(position).getImageUrl(),list.get(position).getDescription(),list.get(position).getPublishedAt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title,author,description,publishedAt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.news_icon);
            author = itemView.findViewById(R.id.author);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            publishedAt = itemView.findViewById(R.id.date);
        }



        private void setData(String titlev, String authorv,String imageUrlv,String descriptionv,String publishedAtv) {
            title.setText(titlev);
            author.setText("Author: " + authorv);
            description.setText(descriptionv);
            publishedAt.setText("Published on:"+publishedAtv);
                Glide.with(itemView.getContext())
                        .load(imageUrlv)
                        .error(R.drawable.search_bg)
                        .placeholder(R.drawable.search_bg)
                        .into(image);


        }
    }
}
