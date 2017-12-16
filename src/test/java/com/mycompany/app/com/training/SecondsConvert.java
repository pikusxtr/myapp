package com.mycompany.app.com.training;

import java.util.Scanner;

public class SecondsConvert {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        System.out.println("Please enter number of seconds");
        int secondsIn =  inScan.nextInt();
        final int SEC_IN_HOUR = 3600;
        final int SEC_IN_MIN = 60;
        int hours = secondsIn/SEC_IN_HOUR;
        int remainSecFromHour = secondsIn%SEC_IN_HOUR;
        int minutes = remainSecFromHour/SEC_IN_MIN;
        int seconds = remainSecFromHour%SEC_IN_MIN;
        System.out.println("Converted= "+ hours+" [hours] "+ minutes + " [minutes] "+ seconds + " [seconds]");

    }
}
