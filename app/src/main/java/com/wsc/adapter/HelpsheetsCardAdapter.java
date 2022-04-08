package com.wsc.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.wsc.activity.help.HelpSheetsActivity;
import com.wsc.dto.HelpSheetsDTO;

import com.wsc.main.R;


import java.util.ArrayList;

public class HelpsheetsCardAdapter extends RecyclerView.Adapter<HelpsheetsCardAdapter.Viewholder>
{

    private Context context;
    private ArrayList<HelpSheetsDTO> helpsheetsList;
    private HelpSheetsActivity helpsheetsWV = new HelpSheetsActivity();


    // Constructor
    public HelpsheetsCardAdapter(Context context, ArrayList<HelpSheetsDTO> helpsheetsList)
    {
        this.context = context;
        this.helpsheetsList = helpsheetsList;
    }

    @NonNull
    @Override
    public HelpsheetsCardAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.helpsheets_cardview, parent, false);
        return new HelpsheetsCardAdapter.Viewholder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull HelpsheetsCardAdapter.Viewholder holder, @SuppressLint("RecyclerView") int position)
    {
        // to set data to textview and imageview of each card layout
        HelpSheetsDTO helpsheet = helpsheetsList.get(position);

        holder.helpsheetTitle.setText(helpsheet.getHelpsheetTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (context instanceof HelpSheetsActivity) {
                    ((HelpSheetsActivity)context).getWebView(helpsheetsList.get(position).getHelpsheetPath());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return helpsheetsList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView helpsheetTitle;

        public Viewholder(@NonNull View itemView)
        {
            super(itemView);
            helpsheetTitle = itemView.findViewById(R.id.helpSheetTitle);

        }
    }
}
