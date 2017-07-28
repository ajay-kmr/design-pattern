package com.ttn.designpatterns.behavioral.visitor2;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements Visitable {

    private String name;
    private List<Room> rooms = new ArrayList<Room>();

    public Hotel(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        return name != null ? name.equals(hotel.name) : hotel.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Hotel withRoom(Room room) {
        addRoom(room);
        return this;
    }

    public void accept(Visitor visitor) {
        for (Room room : rooms) {
            visitor.visit(room);
        }
    }
}
