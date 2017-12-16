package com.mycompany.app.com.training;

public enum  Day {

    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5);
    private int value;

    private Day(int value){
        this.value = value;}
    public int getValue(){
        return this.value;
    }
}
