import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname,gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        if (height != actor.height) return false;
        if (!name.equals(actor.name)) return false;
        return surname.equals(actor.surname);
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
