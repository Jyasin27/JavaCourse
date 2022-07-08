package chapter14;

import java.security.SecureRandom;
import java.util.Random;

public class Coin {

    private String side;
    private int heads = 4;
    private int tails = 2;

    public int getHeads() {
        return heads;
    }

    public void setHeads(int heads) {
        this.heads = heads;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }


    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public static String flip(String side)
    {
        System.out.println("Flip coin!");
        Random random = new Random();

        return side;

    }





}
