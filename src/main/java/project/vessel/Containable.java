package main.java.project.vessel;

import main.java.project.stuff.Transformable;

//- interface Containable (implementing classes Bottle, Cup, Can)
// -- void addStuff (Transformable stuff) - adds some stuff (e.g. water, sand) to Containable object
// -- Transformable removeStuff() - removes all stuff away
// -- boolean isEmpty() - returns true if there is no stuff inside
// -- int getFreeSpace() - returns an integer value of free millilitres
// -- void open() - forces Containable to be opened
// -- void close() - forces Containable to be closed
public interface Containable {
    void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();


    void open();

    void warm(int temperature);
}
