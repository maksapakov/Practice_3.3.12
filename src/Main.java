import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.age = 36;
        human.name = "Gleb";
        human.secondName = "Jeglov";
        human.favoriteSport = "Hokkey";
        Human human1 = new Human((byte) 12, "Boris", "Ivanov");
        Human human2 = new Human((byte) 31, "Ivan", "Sidorov", "soccer");

    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {
        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this(age, name, secondName);
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
