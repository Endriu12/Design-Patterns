package com.perepelitsya;


public class HotelFacade {
    private FastFood ozzy = new FastFood();
    private SwimmingPool pool = new SwimmingPool();
    private RoomRent roomRent = new RoomRent();

    public void haveGoodRest(int numberOfRoom) {
        ozzy.getBigMenu();
        pool.getOneDayOfSwimming();
        roomRent.getHotelRoom(numberOfRoom);
    }

    public void haveUsualWeekend(){
        ozzy.getSmallMenu();
        pool.getOneHourOfSwimming();
    }
}
