package main.java.project.stuff;

//- interface Transformable (implementing classes Water, Sand)
// -- void mix() - mixes particles of stuff against each other
public interface Transformable {
    void setOpened();
    void setTemperature(int temperature);
    void mix();
    int getTemperature();

}
