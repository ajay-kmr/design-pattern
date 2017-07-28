package com.ttn.designpatterns.behavioral.visitor3;

import java.util.ArrayList;
import java.util.List;

public class Package implements Visitable {

    private String id;
    private String name;
    private List<Hotel> hotels = new ArrayList<Hotel>();

    public Package(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        return id != null ? id.equals(aPackage.id) : aPackage.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    //Builder Design Pattern
    public Package withHotel(Hotel hotel) {
        this.addHotel(hotel);
        return this;
    }

    public void accept(Visitor visitor) {
        for (Hotel hotel : hotels) {
            visitor.visit(hotel);
        }
    }
}
