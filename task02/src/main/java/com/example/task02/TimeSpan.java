package com.example.task02;

public class TimeSpan {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public int getHours(){
        return hours;
    }
    public void setHours(int hours){
        this.hours = hours;
    }

    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public int getSeconds(){
        return seconds;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    private void norm(){
        int all = seconds + minutes * 60 + hours * 3600;
        int sign = 1;
        if (all < 0){
            sign = -1;
        }

        hours = sign * (all/3600);
        minutes = (all % 3600) / 60;
        seconds = all % 60;
    }
    public TimeSpan(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void add(TimeSpan time){
        hours += time.hours;
        minutes += time.minutes;
        seconds += time.seconds;
        norm();
    }
    public void subtract(TimeSpan time){
        hours -= time.hours;
        minutes -= time.minutes;
        seconds -= time.seconds;
        norm();
    }

    @Override
    public String toString(){
        return hours + "ч." + minutes + "м." + seconds + "с.";
    }
}
