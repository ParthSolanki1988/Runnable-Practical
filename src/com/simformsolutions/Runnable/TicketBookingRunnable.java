package com.simformsolutions.Runnable;

public class TicketBookingRunnable implements Runnable{
  private String passengerName;
  private int numTickets;

  public TicketBookingRunnable(String passengerName, int numTickets) {
    this.passengerName = passengerName;
    this.numTickets = numTickets;
  }

  @Override
  public void run() {
    bookTickets();
  }

  private void bookTickets() {
      System.out.println("Booking " + numTickets + " ticket(s) for " + passengerName);
  }
}
