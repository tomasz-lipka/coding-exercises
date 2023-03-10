package plainjava.designpatterns.creational.builder;

public class Planet {
    private final String name;
    private final int diameter;
    private final boolean hasWater;

    public Planet(PlanetBuilder planetBuilder) {
        this.name = planetBuilder.name;
        this.diameter = planetBuilder.diameter;
        this.hasWater = planetBuilder.hasWater;
    }

    @Override
    public String toString() {
        String waterAccess = "";
        if (!hasWater) {
            waterAccess = " no";
        }
        return "The '" + name + "' planet is size of " + diameter + " and has" + waterAccess + " water.";
    }

    public static class PlanetBuilder {
        private String name;

        private int diameter;
        private boolean hasWater;

        public PlanetBuilder(String name) {
            this.name = name;
        }

        public PlanetBuilder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public PlanetBuilder supplyWater() {
            this.hasWater = true;
            return this;
        }

        public Planet create() {
            return new Planet(this);
        }
    }
}