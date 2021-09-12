package com.example.skyewall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ServiceRoomHolder> {

    int[] image;
    String[] titl;
    Context context;


    public ServiceAdapter(int[] img, String[] title, FragmentActivity activity) {

        this.image = img;
        this.titl = title;
        this.context = activity;


    }




    @NonNull
    @Override
    public ServiceRoomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.serviceroom_card_design,parent, false);
        ServiceRoomHolder serviceRoomHolder = new ServiceRoomHolder(view);
        return serviceRoomHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceRoomHolder holder, int position) {


        holder.service_room.setBackgroundResource(image[position]);
        holder.title.setText(titl[position]);

    }

    @Override
    public int getItemCount() {
        return image.length;
    }


    public static class ServiceRoomHolder extends RecyclerView.ViewHolder{

        LinearLayout service_room;
        TextView title;

        public ServiceRoomHolder(@NonNull View itemView) {
            super(itemView);


            service_room = itemView.findViewById(R.id.service_room);
            title = itemView.findViewById(R.id.serviceRoom_text );

        }
    }

}

