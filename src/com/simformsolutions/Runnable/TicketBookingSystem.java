package com.simformsolutions.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBookingSystem {
  public static void main(String[] args) {

    TicketBookingRunnable ticketBooking1 = new TicketBookingRunnable("Passenger 1", 5);
    TicketBookingRunnable ticketBooking2 = new TicketBookingRunnable("Passenger 2", 4);
    TicketBookingRunnable ticketBooking3 = new TicketBookingRunnable("Passenger 3", 2);

    Thread thread1 = new Thread(ticketBooking1);
    Thread thread2 = new Thread(ticketBooking2);
    Thread thread3 = new Thread(ticketBooking3);

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
