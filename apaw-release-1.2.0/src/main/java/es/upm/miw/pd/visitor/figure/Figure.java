package es.upm.miw.pd.visitor.figure;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double numberOfSides();

}
