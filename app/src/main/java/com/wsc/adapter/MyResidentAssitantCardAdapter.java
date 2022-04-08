package com.wsc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.constants.DormTypeUtils;
import com.wsc.dto.ResidentAssistantDTO;
import com.wsc.main.R;

import java.util.ArrayList;

public class MyResidentAssitantCardAdapter extends RecyclerView.Adapter<MyResidentAssitantCardAdapter.Viewholder> {

    private Context context;
    private ArrayList<ResidentAssistantDTO> residentAssistantArray;
    private DormTypeUtils dormUtils = new DormTypeUtils();

    // Constructor
    public MyResidentAssitantCardAdapter(Context context, ArrayList<ResidentAssistantDTO> residentAssistantArray)
    {
        this.context = context;
        this.residentAssistantArray = residentAssistantArray;
    }

    @NonNull
    @Override
    public MyResidentAssitantCardAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_ra_cardview, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyResidentAssitantCardAdapter.Viewholder holder, int position)
    {
        // to set data to textview and imageview of each card layout
        ResidentAssistantDTO ra = residentAssistantArray.get(position);

        holder.raIV.setImageResource(ra.getRaImg());
        holder.raName.setText(ra.getfName() + " " + ra.getlName());
        holder.raDorm.setText(dormUtils.getDormStr(ra.getDorm()));
        holder.raRoomNum.setText(ra.getRoomNum());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return residentAssistantArray.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView raIV;
        private TextView raName, raDorm, raRoomNum, raDesc;

        public Viewholder(@NonNull View itemView)
        {
            super(itemView);
            raIV = itemView.findViewById(R.id.raImg);
            raName = itemView.findViewById(R.id.raName);
            raDorm = itemView.findViewById(R.id.dormName);
            raRoomNum = itemView.findViewById(R.id.roomNumber);
        }
    }
}
