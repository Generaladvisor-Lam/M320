import java.util.Random;

public class PermMember implements MemberState {

    Random random = new Random();

    public boolean vote() throws VetoException {
        boolean voteResult = random.nextBoolean();
        if (!voteResult) {
            throw new VetoException("Vetoed by permanent member");
        }
        return true;
    }
}
