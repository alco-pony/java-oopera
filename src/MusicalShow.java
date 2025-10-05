public class MusicalShow extends Show {
private String musicAuthor;
private String librettoText;

    MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

public void printLibrettoText() {
        System.out.println(librettoText);
}



}
