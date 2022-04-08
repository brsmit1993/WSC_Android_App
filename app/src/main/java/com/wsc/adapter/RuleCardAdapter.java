package com.wsc.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.dto.DormRegulationDTO;
import com.wsc.main.R;


import java.util.ArrayList;

public class RuleCardAdapter extends RecyclerView.Adapter<RuleCardAdapter.Viewholder>
{

    private Context context;
    private ArrayList<DormRegulationDTO> dormRegList;


    // Constructor
    public RuleCardAdapter(Context context, ArrayList<DormRegulationDTO> dormRegList)
    {
        this.context = context;
        this.dormRegList = dormRegList;
    }

    @NonNull
    @Override
    public RuleCardAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dorm_rule_cardview, parent, false);
        return new RuleCardAdapter.Viewholder(view);
    }

    private int mExpandedPosition = -1;

    @Override
    public void onBindViewHolder(@NonNull RuleCardAdapter.Viewholder holder, @SuppressLint("RecyclerView") int position)
    {
        // to set data to textview and imageview of each card layout
        DormRegulationDTO rule = dormRegList.get(position);

        holder.ruleName.setText(rule.getRegTitle());
        holder.ruleDesc.setText(rule.getRegDesc());

        final boolean isExpanded = position==mExpandedPosition;
        holder.ruleDesc.setVisibility(isExpanded?View.VISIBLE:View.GONE);
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
        return dormRegList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView ruleName, ruleDesc;

        public Viewholder(@NonNull View itemView)
        {
            super(itemView);
            ruleName = itemView.findViewById(R.id.regName);
            ruleDesc = itemView.findViewById(R.id.regDesc);
        }



    }
}
