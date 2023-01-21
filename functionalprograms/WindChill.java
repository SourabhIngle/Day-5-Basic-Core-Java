package com.functionalprograms;

public class WindChill {
    public static void main(String[] args) {

        int temperature = Integer.parseInt(args[0]);  //temperature in Fahrenheit
        int velocity = Integer.parseInt(args[1]);    //wind speed is miles/hour.

        if (temperature > 50 || velocity > 120 || velocity < 3) {
            System.out.println("The formula is not valid if t is larger than 50 in absolute value or if v is larger\n" +
                    "than 120 or less than 3 (you may assume that the values you get are in that range.");
        } else {
            double windChill  = 35.74 + 0.6215 * temperature + (((0.4275 * temperature) - 35.75) * Math.pow(velocity, 0.16));
            System.out.println("Wind Chill "+windChill);
        }
    }
}
