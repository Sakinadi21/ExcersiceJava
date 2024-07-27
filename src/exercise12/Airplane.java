package exercise12;
//Airplane.jave
import javax.swing.*;
import java.time.LocalTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime scheduleDeparture;
    private int delayTime;

    public Airplane(String flightNumber,String destination,LocalTime scheduledDeparture){
        this.flightNumber = flightNumber;
        this.destination=destination;
        this.scheduleDeparture= scheduledDeparture;
        this.delayTime=0;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(){
        this.flightNumber= flightNumber;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestinationestination(String destination){
        this.destination= destination;
    }
    public LocalTime getScheduleDeperature(LocalTime scheduleDeparture){
        return scheduleDeparture;
    }
    public void setscheduleDeparture(){
        this.scheduleDeparture= scheduleDeparture;
    }

    public int getDelayTime() {
        return delayTime;
    }
    public void delay(int minutes){
        this.delayTime= minutes;
        this.scheduleDeparture= this.scheduleDeparture.plusMinutes(minutes);
    }
    public void checkStatus(){
        if (delayTime==0) {
            System.out.println("Flight " + flightNumber + "is on time ");
        } else {
              System.out.println("Flight "+flightNumber+" is delayed by" + delayTime+" minutes.");
            }
        }
    }

