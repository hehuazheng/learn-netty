package netty.examples.timeserver.msg;

public class UnixTime {
    public UnixTime(int time) {
        this.time = time;
    }

    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
