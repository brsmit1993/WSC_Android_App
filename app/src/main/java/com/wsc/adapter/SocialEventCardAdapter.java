package com.wsc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wsc.dto.EventDTO;
import com.wsc.main.R;

import java.util.ArrayList;

public class SocialEventCardAdapter extends RecyclerView.Adapter<SocialEventCardAdapter.Viewholder> {

    private Context context;
    private ArrayList<EventDTO> SocialEventsArray;

    // Constructor
    public SocialEventCardAdapter(Context context, ArrayList<EventDTO> SocialEventsArray)
    {
        this.context = context;
        this.SocialEventsArray = SocialEventsArray;
    }

    @NonNull
    @Override
    public SocialEventCardAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_cardview, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SocialEventCardAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        EventDTO event = SocialEventsArray.get(position);

        holder.eventName.setText(event.getEventName());
        holder.eventTime.setText(event.getEventTime());
        holder.eventDate.setText(event.getEventDate());
        holder.eventLocation.setText(event.getEventLocation());
        holder.eventIV.setImageResource(event.getEventImage());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return SocialEventsArray.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView eventIV;
        private TextView eventName, eventTime, eventDate, eventLocation;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            eventIV = itemView.findViewById(R.id.eventImage);
            eventName = itemView.findViewById(R.id.eventName);
            eventTime = itemView.findViewById(R.id.eventTime);
            eventDate = itemView.findViewById(R.id.eventDate);
            eventLocation = itemView.findViewById(R.id.eventLocation);

        }
    }
}
