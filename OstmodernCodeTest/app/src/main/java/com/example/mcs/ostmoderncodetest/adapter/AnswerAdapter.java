package com.example.mcs.ostmoderncodetest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mcs.ostmoderncodetest.data.model.Object;

import java.util.ArrayList;
import java.util.List;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.ViewHolder> {

    private List<Object> mObjects;
    private Context mContext;
    private PostObjectListener mObjectListener;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView titleTv;

        PostObjectListener mObjectListener;

        public ViewHolder(View objectView, PostObjectListener postObjectListener) {
            super(objectView);
            titleTv = objectView.findViewById(android.R.id.text1);

            this.mObjectListener = postObjectListener;
            objectView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Object object = getObject(getAdapterPosition());
            this.mObjectListener.onPostClick(object.getCachedFilmCount());

            notifyDataSetChanged();
        }
    }

    public AnswerAdapter(Context context, ArrayList<java.lang.Object> posts, PostObjectListener objectListener) {
        mObjects = posts;
        mContext = context;
        mObjectListener = objectListener;
    }

    @Override
    public AnswerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View postView = inflater.inflate(android.R.layout.simple_expandable_list_item_1, parent, false);

        ViewHolder viewHolder = new ViewHolder(postView, this.mObjectListener);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(AnswerAdapter.ViewHolder holder, int position){

        Object object = mObjects.get(position);
        TextView textView = holder.titleTv;
        textView.setText(object.getUid());
    }

    @Override
    public int getItemCount(){
        return mObjects.size();
    }

    public void updateAnswers(List<Object> objects){
        mObjects = objects;
        notifyDataSetChanged();
    }

    private Object getObject(int adapterPosition){
        return mObjects.get(adapterPosition);
    }

    public interface PostObjectListener{
        void onPostClick(int tempId);
    }
}
