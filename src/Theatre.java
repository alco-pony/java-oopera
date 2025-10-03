public class Theatre {

    public static void main(String[] args) {

        Actor ivanov = new Actor("Иван", "Иванов", Gender.MALE, 182);
        Actor petrov = new Actor("Петр", "Петров", Gender.MALE, 165);
        Actor sidorova = new Actor("Мария", "Сидорова", Gender.FEMALE, 177);

        Director chausov = new Director("Сергей", "Чаусов", Gender.MALE, 3);
        Director viazemskiy = new Director("Даниил", "Вяземский", Gender.MALE, 33);

        Ballet ozero = new Ballet("Озеро", 80, viazemskiy, "Слава Мэрлоу", "Ты горишь" +
                "как огонь, у меня огония", "Валерий Леоньтев");
        Opera grozniy = new Opera("Иван Грозный", 100, chausov, "Юрий Антонов",
                "На маленьком плотуууу", 12);
        Show gamlet = new Show("Гамлет", 66, chausov);

        gamlet.addActor(ivanov);
        gamlet.addActor(petrov);
        gamlet.addActor(sidorova);

        grozniy.addActor(petrov);

        ozero.addActor(ivanov);
        ozero.addActor(sidorova);

        ozero.printActorsList();
        gamlet.printActorsList();
        grozniy.printActorsList();

        ozero.changeActor(petrov,"Сидорова");
        ozero.printActorsList();

        grozniy.changeActor(sidorova,  "Дикаприо");

        ozero.printLibrettoText();
        grozniy.printLibrettoText();





    }
}
