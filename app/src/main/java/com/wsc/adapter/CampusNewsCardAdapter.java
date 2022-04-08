package com.wsc.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.dto.CampusNewsDTO;

import com.wsc.main.R;

import java.util.ArrayList;

public class CampusNewsCardAdapter extends RecyclerView.Adapter<CampusNewsCardAdapter.Viewholder> {

    private Context context;
    private ArrayList<CampusNewsDTO> campusNewsDTOS;


    // Constructor
    public CampusNewsCardAdapter(Context context, ArrayList<CampusNewsDTO> campusNewsDTOS)
    {
        this.context = context;
        this.campusNewsDTOS = campusNewsDTOS;
    }

    @NonNull
    @Override
    public CampusNewsCardAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.campusnews_cardview, parent, false);
        return new Viewholder(view);
    }

    private int mExpandedPosition = -1;

    @Override
    public void onBindViewHolder(@NonNull CampusNewsCardAdapter.Viewholder holder, @SuppressLint("RecyclerView") int position)
    {
        // to set data to textview and imageview of each card layout
        CampusNewsDTO news = campusNewsDTOS.get(position);


        holder.newsTitle.setText(news.getNewsTitle());
        holder.newsDate.setText(news.getNewsDate());
        holder.newsIV.setImageResource(news.getNewsImg());
        holder.newsContent.setText(news.getNewsContent());

        final boolean isExpanded = position==mExpandedPosition;
        holder.newsContent.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        holder.itemView.setActivated(isExpanded);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExpandedPosition = isExpanded ? -1:position;
                notifyItemChanged(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return campusNewsDTOS.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView newsIV;
        private TextView newsTitle, newsDate, newsContent;

        public Viewholder(@NonNull View itemView)
        {
            super(itemView);
            newsTitle = itemView.findViewById(R.id.newsTitle);
            newsDate = itemView.findViewById(R.id.newsDate);
            newsIV = itemView.findViewById(R.id.newsImg);
            newsContent = itemView.findViewById(R.id.newsContent);
        }
    }
}
