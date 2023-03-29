package javacore.comparingobjects.equals;

import java.util.Objects;

public class Watch {

    private String brand;

    public Watch(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Watch watch = (Watch) o;
        return brand.equals(watch.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}
