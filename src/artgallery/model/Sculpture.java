package artgallery.model;

public class Sculpture extends Artwork {

    private int height;

    public Sculpture(int id, String name, double price,
                     int height, String asciiArt, Artist artist) {
        super(id, name, price, artist, asciiArt);
        this.height = height;
    }

    @Override
    public String getType() {
        return "Sculpture";
    }

    @Override
    public String detailedInfo() {
        return basicInfo() +
                " price=" + price +
                " height=" + height + "cm" +
                " artist=" + artist.getName();
    }
}
