package com.ttn.designpatterns.behavioral.visitor3;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Visitable {

    private List<Package> packages = new ArrayList<Package>();

    public void addPackage(Package aPackage) {
        packages.add(aPackage);
    }

    public void accept(Visitor visitor) {
        for (Package aPackage : packages) {
            visitor.visit(aPackage);
        }
    }

}
