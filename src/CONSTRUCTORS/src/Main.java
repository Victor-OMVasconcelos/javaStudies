public class Main {
    public static void main(String[] args) {
        //imagine the keyword "this" as a placeholder for human1 and/or human2
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        //System.out.println(human2.name);
        human2.eat();
        human1.drink();

    }
}