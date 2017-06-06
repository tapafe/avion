package jpu2016.dogfight.controller;

import jpu2016.dogfight.controller.Order;

/**
 * Created by tapafe on 02/06/2017.
 */
public class UserOrder {

    private int player;

    public UserOrder(int player, Order order) {
        this.player = player;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
