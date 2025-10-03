public class Director extends Human {

    public int numberOfShows;

    public Director(String name, String surname, Gender gender,int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}
