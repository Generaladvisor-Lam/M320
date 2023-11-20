import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Citizen> citizens = new ArrayList<Citizen>() {{
            add(new Director("Daniel"));
            add(new Secretary("Ben"));
            add(new Teacher("Larry"));
            add(new Student("Dwain"));
            add(new SocialWorker("Paige"));
        }};
        System.out.println(citizens);
        citizens.remove(2);
        System.out.println(citizens);
        for (Citizen c : citizens){
            System.out.println(c.getName());
        }
    }
}