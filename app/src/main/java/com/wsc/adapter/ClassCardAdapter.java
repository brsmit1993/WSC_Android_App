package com.wsc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.dto.ClassDTO;

import com.wsc.main.R;

import java.util.ArrayList;

public class ClassCardAdapter extends RecyclerView.Adapter<ClassCardAdapter.Viewholder> {

    private Context context;
    private ArrayList<ClassDTO> classDTOArrayList;

    // Constructor
    public ClassCardAdapter(Context context, ArrayList<ClassDTO> classDTOArrayList)
    {
        this.context = context;
        this.classDTOArrayList = classDTOArrayList;
    }

    @NonNull
    @Override
    public ClassCardAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_classes_cardview, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassCardAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        ClassDTO classDTO = classDTOArrayList.get(position);
        holder.className.setText(classDTO.getClassName());
        holder.classTime.setText("" + classDTO.getClassTime());
        holder.clasIV.setImageResource(classDTO.getClassImage());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return classDTOArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder
    {
        private ImageView clasIV;
        private TextView className, classTime;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            clasIV = itemView.findViewById(R.id.classImage);
            className = itemView.findViewById(R.id.className);
            classTime = itemView.findViewById(R.id.classTime);


        }
    }
}
