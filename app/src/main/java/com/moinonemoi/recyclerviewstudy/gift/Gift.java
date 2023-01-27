package com.moinonemoi.recyclerviewstudy.gift;

public class Gift {
    private String address;
    private int size;
    private String color;

    public Gift(String address, int size, String color) {
        this.address = address;
        this.color = color;
        this.size = size;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int Size) {
        this.size = Size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }
}
