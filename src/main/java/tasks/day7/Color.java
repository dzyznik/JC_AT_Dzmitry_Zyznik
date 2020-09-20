package main.java.tasks.day7;

import java.util.Objects;

public class Color {
    int hash;
    String colorName;

    public Color (int hash, String colorName){
        this.hash = hash;
        this.colorName = colorName;
    }
    public int getHash() {
        return hash;
    }
    public String getColorName() {
        return colorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return hash == color.hash &&
                colorName.equals(color.colorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash, colorName);
    }
}
