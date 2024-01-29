import java.util.Random;

public class NonPermMember implements MemberState {

    Random random = new Random();

    public boolean vote() {
        return random.nextBoolean();
    }
}
