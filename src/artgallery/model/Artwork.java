package artgallery.model;

import artgallery.util.PricedItem;
import artgallery.util.Validatable;

public abstract class Artwork extends ArtEntity
        implements Validatable, PricedItem {

    protected double price;
    protected Artist artist;
    protected String asciiArt;

    public Artwork(int id, String name, double price,
                   Artist artist, String asciiArt) {
        super(id, name);
        this.price = price;
        this.artist = artist;
        this.asciiArt = asciiArt;
    }

    @Override
    public boolean isValid() {
        return price > 0 && artist != null;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    public Artist getArtist() {
        return artist;
    }

    public String getAsciiArt() {
        return asciiArt;
    }

    public abstract String detailedInfo();
}
