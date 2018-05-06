package com.perepelitsya;

public class RoomRent {
    public void getHotelRoom(int numberOfR){
        switch (numberOfR){
            case 1:
                System.out.println("You will live in 1 room");
                break;
            case 2:
                System.out.println("You will live in 2 room");
                break;
            case 3:
                System.out.println("You will live in 3 room");
                break;
                default:
                    throw new UnsupportedOperationException("We have only 1,2 or 3 room");
        }
    }
}
