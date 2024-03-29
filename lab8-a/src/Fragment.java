public class Fragment {
    final public Position starting, following;

    public Fragment(Position starting, Position following) {
        this.starting = starting;
        this.following = following;
    }

    @Override
    public String toString() {
        return starting.toString() + "-" + following.toString();
    }
}
