package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EventLog {

    private List<Event> eventList;

    public EventLog() {
        this.eventList = new ArrayList<>();
    }

    public boolean addEvent(Event event) {
        if (event.getName() == null || event.getAction() == null) {
            throw new IllegalArgumentException("Ensure event has a name and action");
        } else if (Objects.equals(event.getAction(), "Face2Face") ||
                Objects.equals(event.getAction(), "PhoneCall") ||
                Objects.equals(event.getAction(), "TextMessaging") ||
                Objects.equals(event.getAction(), "Unknown")) {
            eventList.add(event);
            return true;
        } else {
            throw new IllegalArgumentException("Invalid action");
        }
    }

    public int getNumEvents() {
        return eventList.size();
    }

    public List<Event> getEventList() {
        return eventList;
    }
}
