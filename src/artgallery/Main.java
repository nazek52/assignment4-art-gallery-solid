package artgallery;

import artgallery.model.*;
import artgallery.service.ArtworkService;
import artgallery.util.ReflectionUtils;
import artgallery.util.Validatable;

public class Main {
    public static void main(String[] args) {

        ArtworkService service = new ArtworkService();

        service.addArtwork(
                new Painting(0, "Starry Night", 1000000, "Oil",
                        "        ✦      ✦        ✦      \n" +
                                "   ✦        ~~~~~~~~         ✦  \n" +
                                "        ~~~~  @@@@  ~~~~        \n" +
                                "  ✦    ~~~  @@@@@@@@@  ~~~   ✦ \n" +
                                "       ~~~  @@@@@@@@@@@  ~~~    \n" +
                                "   ✦   ~~~   @@@@@@@@@   ~~~ ✦  \n" +
                                "        ~~~~    @@@@    ~~~~     \n" +
                                "    ✦       ~~~~~~~~~~~       ✦ \n" +
                                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                "        |||||||||||||||          \n" +
                                "        |||||||||||||||          \n",
                        null), 1
        );

        service.addArtwork(
                new Painting(0, "Mona Lisa", 850000, "Oil",
                        "      _____________      \n" +
                                "     /             \\     \n" +
                                "    |   o       o   |    \n" +
                                "    |      ___      |    \n" +
                                "    |     (___)     |    \n" +
                                "    |      \\___/    |    \n" +
                                "     \\             /     \n" +
                                "      \\___________/      \n" +
                                "        |||||||||         \n" +
                                "        |||||||||         \n",
                        null), 2
        );

        service.addArtwork(
                new Sculpture(0, "David", 500000, 200,
                        "        /////         \n" +
                                "       |  o o |        \n" +
                                "       |   ^   |        \n" +
                                "        \\_____/        \n" +
                                "          |||           \n" +
                                "      ____|||____       \n" +
                                "     |     |||     |    \n" +
                                "     |     |||     |    \n" +
                                "      \\____|||____/     \n",
                        null), 3
        );

        service.addArtwork(
                new Painting(0, "The Scream", 900000, "Tempera",
                        "      ███████████      \n" +
                                "     █    O   O    █     \n" +
                                "     █      ___    █     \n" +
                                "     █             █      \n" +
                                "     █       O     █     \n" +
                                "      ███████████      \n" +
                                "        |||||||         \n" +
                                "      //|||||||\\\\       \n" +
                                "    //  |||||||  \\\\     \n",
                        null), 1
        );

        service.addArtwork(
                new Sculpture(0, "The Thinker", 300000, 150,
                        "          ____          \n" +
                                "         | o__|         \n" +
                                "          /||           \n" +
                                "         / ||           \n" +
                                "        /  ||           \n" +
                                "       /___||___        \n" +
                                "           ||           \n" +
                                "          /  \\          \n",
                        null), 3
        );

        service.addArtwork(
                new Sculpture(0, "Venus de Milo", 400000, 180,
                        "         ____           \n" +
                                "        | 0 0|          \n" +
                                "        |__~__|          \n" +
                                "          ||            \n" +
                                "      ____||____        \n" +
                                "          ||           \n" +
                                "          ||           \n" +
                                "          ||            \n" +
                                "         /  \\           \n",
                        null), 2
        );

        System.out.println("\n--- ALL ARTWORKS ---");
        for (Artwork a : service.getAll()) {
            System.out.println(a.detailedInfo());
            System.out.println(a.getAsciiArt());
        }

        ReflectionUtils.inspectClass(Painting.class);
        Validatable.info();
    }
}
