package com.example.skyewall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RoomNameAdapter extends RecyclerView.Adapter<RoomNameAdapter.ViewHolder> {
    private RoomsModel[] roomsModels;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.picked_for_you, parent, false);

        ViewHolder viewHolder = new ViewHolder(listItem);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        final RoomsModel roomsModel = roomsModels[position];
        holder.title.setText(roomsModel.getRoom());
        holder.image.setImageResource(roomsModel.getImage());

    }

    @Override
    public int getItemCount() {
        return roomsModels.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView image;

        public ViewHolder( View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.picked_card_title);
            image = itemView.findViewById(R.id.picked_card_img);
        }
    }
    public RoomNameAdapter(RoomsModel[] roomsModels) {
        this.roomsModels = roomsModels;

    }

}
