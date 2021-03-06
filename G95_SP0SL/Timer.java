/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author krish
 */
/**
 * Timer class for roughly calculating running time of programs
 *
 * @author rbk Usage: Timer timer = new Timer(); timer.start(); timer.end();
 * System.out.println(timer); // output statistics
 */
public class Timer {

    long startTime, endTime, elapsedTime, memAvailable, memUsed;

    Timer() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public Timer end() {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        memAvailable = Runtime.getRuntime().totalMemory();
        memUsed = memAvailable - Runtime.getRuntime().freeMemory();
        return this;
    }

    public String toString() {
        return "Time: " + elapsedTime + " msec.\n" + "Memory: " + (memUsed / 1000000) + " MB / " + (memAvailable / 1000000) + " MB.";
    }

}
