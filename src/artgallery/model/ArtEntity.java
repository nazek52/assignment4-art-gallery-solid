package artgallery.model;

public abstract class ArtEntity {
    protected int id;
    protected String name;

    public ArtEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getType();
    public abstract boolean isValid();

    public void setId(int id) {
        this.id = id;
    }

    public String basicInfo() {
        return id + " - " + name + " (" + getType() + ")";
    }
}
