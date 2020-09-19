package main.java.tasks.day6;

import java.util.Arrays;

public class ObjectContainer {
    Object [] container;

    public ObjectContainer(Object [] container){
        this.container = container;
    }


    public void add(Object o) {
        int index = 0;
            if (this.container[index] == null) {
                this.container[index] = o;
                index ++;
            }
            else {
                return;
            }
            }


    public Object removeLast() {
        for (int i = this.container.length - 1; i > 0; i--) {
            if (this.container[i] != null) {
                this.container = new Object[this.container.length - 1];
            }
            else {
                continue;
            }

//            System.out.println(this.container[i]);
        }
        return null;
    }

    public boolean isEmpty() {
        for (int i = this.container.length - 1; i > 0; i--) {
            if (this.container[i] != null) {
                return true;
            }
        }
        return false;
    }




}

