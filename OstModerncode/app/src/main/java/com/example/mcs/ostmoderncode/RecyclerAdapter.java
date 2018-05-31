package com.example.mcs.ostmoderncode;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Show> shows;

    public RecyclerAdapter(List<Show> shows){
        this.shows = shows;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.Title.setText(shows.get(position).getTitle());
        holder.imageUrl.setText(shows.get(position).getQuote());

    }

    @Override
    public int getItemCount() {
        return shows.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Title, imageUrl;

        public MyViewHolder(View itemView) {
            super(itemView);
            Title = (TextView)itemView.findViewById(R.id.title);
            imageUrl = (TextView)itemView.findViewById(R.id.imageUrl);
        }
    }
}
