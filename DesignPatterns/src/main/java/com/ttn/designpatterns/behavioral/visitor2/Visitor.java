package com.ttn.designpatterns.behavioral.visitor2;

public interface Visitor {

    public void visit(Cart cart);

    public void visit(Package customer);

    public void visit(Hotel order);

    public void visit(Room item);
}
