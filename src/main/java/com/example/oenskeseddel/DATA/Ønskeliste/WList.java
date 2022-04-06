package com.example.oenskeseddel.DATA.Ønskeliste;

import java.util.ArrayList;

public class WList {

    private String wish;
    private ArrayList<String> wishlist = new ArrayList();

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public void createWList(ArrayList<String> WishList){
        this.wishlist = WishList;
    }
}
