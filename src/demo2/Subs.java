package demo2;

import java.util.Objects;

public class Subs {

    private String substitles;

    public Subs(String substitles) {
        this.substitles = substitles;
    }

    public String getSubstitles() {
        return substitles;
    }

    public void setSubstitles(String substitles) {
        this.substitles = substitles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subs subs = (Subs) o;
        return Objects.equals(substitles, subs.substitles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(substitles);
    }

    @Override
    public String toString() {
        return "Subs{" +
                "substitles='" + substitles + '\'' +
                '}';
    }
}
