public class StateRepresentative implements MemberState {

    MemberState memberState;
    String name;

    public StateRepresentative(MemberState memberState, String name) {
        this.memberState = memberState;
        this.name = name;
    }

    public boolean vote() throws VetoException {
        return memberState.vote();
    }

    public String getName() {
        return name;
    }
}

