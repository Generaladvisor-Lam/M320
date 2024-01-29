import java.util.ArrayList;
import java.util.Scanner;

public class UnscSimulation {

    ArrayList<StateRepresentative> states;
    Scanner scan;

    public UnscSimulation() {
        states = new ArrayList<>() {{
            add(new StateRepresentative(new PermMember(), "USA"));
            add(new StateRepresentative(new PermMember(), "UK"));
            add(new StateRepresentative(new PermMember(), "France"));
            add(new StateRepresentative(new PermMember(), "Russia"));
            add(new StateRepresentative(new PermMember(), "China"));
            add(new StateRepresentative(new NonPermMember(), "Algeria"));
            add(new StateRepresentative(new NonPermMember(), "Ecuador"));
            add(new StateRepresentative(new NonPermMember(), "Guyana"));
            add(new StateRepresentative(new NonPermMember(), "Japan"));
            add(new StateRepresentative(new NonPermMember(), "Malta"));
            add(new StateRepresentative(new NonPermMember(), "Mozambique"));
            add(new StateRepresentative(new NonPermMember(), "South Korea"));
            add(new StateRepresentative(new NonPermMember(), "Sierra Leone"));
            add(new StateRepresentative(new NonPermMember(), "Slovenia"));
            add(new StateRepresentative(new NonPermMember(), "Switzerland"));
        }};

        scan = new Scanner(System.in);
    }

    public void runResolution() {

        System.out.print("Enter the name of the resolution: ");
        String resolutionName = scan.nextLine();

        System.out.println("Resolution: " + resolutionName + "\n");

        boolean vetoed = false;
        int inFavor = 0;

        for (StateRepresentative state : states) {
            try {
                if (!state.vote()) {
                    System.out.println(state.getName() + " voted against the resolution.");
                } else {
                    System.out.println(state.getName() + " voted in favor of the resolution.");
                    inFavor++;
                }
            } catch (VetoException e) {
                vetoed = true;
                System.out.println(state.getName() + " vetoed the resolution.");
            }
        }

        System.out.println("\n" + inFavor + " nations voted in favor.");

        if (vetoed) {
            System.out.println("\nThe resolution was vetoed.");
        } else if (inFavor >= 9) {
            System.out.println("\nThe resolution passed.");
        } else {
            System.out.println("\nThe resolution didn't pass");
        }
    }

}
