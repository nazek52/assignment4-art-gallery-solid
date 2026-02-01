package artgallery.model;

public class Painting extends Artwork {

    private String technique;

    public Painting(int id, String name, double price,
                    String technique, String asciiArt, Artist artist) {
        super(id, name, price, artist, asciiArt);
        this.technique = technique;
    }

    @Override
    public String getType() {
        return "Painting";
    }

    @Override
    public String detailedInfo() {
        return basicInfo() +
                " price=" + price +
                " technique=" + technique +
                " artist=" + artist.getName();
    }
}
