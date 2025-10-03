import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> actors;

    Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.actors = new ArrayList<>();
        this.director = director;
    }

    public void printDirectorInfo() {
        System.out.println(director.name + " " + director.surname);
    }

    public void printActorsList() {
        System.out.println("-".repeat(10));
        System.out.println("Список актеров " + title);
        for (Actor actor : actors) {
            System.out.println(actor.name + " " + actor.surname + "(" + actor.height + ")");
        }
        System.out.println(" ");
    }

    public void addActor(Actor newActor) {
        if (isActorInvolved(newActor.surname)) {
            System.out.println("Такой актер уже участвует\n");
        } else {
            actors.add(newActor);
            System.out.println("Актер " + newActor.surname + " введен в постановку " + title);
        }
    }


    public boolean isActorInvolved(String actorSurname) {
        boolean isActorInShow = false;
        for (Actor actor : actors) {
            if (actor.surname.equals(actorSurname)) {
                isActorInShow = true;
                break;
            }
        }
        return isActorInShow;
    }

    public void removeActor(String actorSurname) {
        actors.removeIf(actor -> actor.surname.equals(actorSurname));
    }

    public void changeActor(Actor newActor, String surname) {
        if (isActorInvolved(surname)) {
            removeActor(surname);
            actors.add(newActor);
            System.out.println("Введен актер " + newActor.name + " " + newActor.surname);
        } else {
            System.out.println("Актер " + surname + " не участвует в шоу\n");
        }

    }
}

