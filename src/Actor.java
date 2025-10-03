import java.util.Objects;

public class Actor extends Human {

    public int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname,gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        if (height != actor.height) return false;
        if (!name.equals(actor.name)) return false;
        return surname.equals(actor.surname);
    }


}
