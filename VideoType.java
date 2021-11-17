public abstract class VideoType {
    int penalty;

    public VideoType(int penalty){
        this.penalty = penalty;
    }

    public int getPenalty() {
        return penalty;
    }
}
