package com.company;

public class Main {

    public static void main(String[] args) {
        EventLog events = new EventLog();
        Event party = new Event();

        party.setName("Birthday");
        party.setAction("Face2Face");

        events.addEvent(party);

        System.out.println(events.getNumEvents());
        for (Event event: events.getEventList()) {
            System.out.println(event.getName() + ", " + event.getAction());
        }

    }
}
