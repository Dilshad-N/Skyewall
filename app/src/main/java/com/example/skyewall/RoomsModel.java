package com.example.skyewall;

public class RoomsModel {
    private String room;
    private int image;

    public RoomsModel(String room, int image) {
        this.room = room;
        this.image = image;

    }

    public void setRoom(String room) {
        this.room = room;

    }

    public String getRoom() {
        return room;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {

        return image;
    }
}


