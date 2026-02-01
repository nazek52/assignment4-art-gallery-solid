package artgallery.service;

import artgallery.model.*;

import java.util.ArrayList;
import java.util.List;

public class ArtworkService {

    private List<Artwork> artworks = new ArrayList<>();
    private List<Artist> artists = new ArrayList<>();
    private int nextId = 1;

    public ArtworkService() {
        artists.add(new Artist(1, "Vincent van Gogh"));
        artists.add(new Artist(2, "Leonardo da Vinci"));
        artists.add(new Artist(3, "Auguste Rodin"));
    }

    public void addArtwork(Artwork artwork, int artistId) {
        for (Artist a : artists) {
            if (a.getId() == artistId) {
                artwork.setArtist(a);
            }
        }

        artwork.setId(nextId++);
        artwork.validate();
        artworks.add(artwork);

        System.out.println(
                "Added artwork: " + artwork.basicInfo() +
                        " price=" + artwork.getPrice() +
                        " artist=" + artwork.getArtist().getName()
        );
    }

    public List<Artwork> getAll() {
        return artworks;
    }
}
