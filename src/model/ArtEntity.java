package model;

public abstract class ArtEntity {
    private int id;
    private String name;

    public ArtEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getType();
    public abstract boolean isValid();

    public String shortInfo() {
        return id + " - " + name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
