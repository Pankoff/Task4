import java.util.Date;

public class PopularTime {
    PopularTime popularTime;
    private Date entered;
    private Date exited;
    private int countInterval;

    private PopularTime(Date entered, Date exited){
        this.entered=entered;
        this.exited=exited;
    }

    public PopularTime getInstance(Date entered, Date exited){
        if(popularTime==null){
            popularTime = new PopularTime(entered, exited);
        }
        return popularTime;
    }

    public Date getEntered() {
        return entered;
    }

    public void setEntered(Date entered) {
        this.entered = entered;
    }

    public Date getExited() {
        return exited;
    }

    public void setExited(Date exited) {
        this.exited = exited;
    }

    public int getCountInterval() {
        return countInterval;
    }

    public void setCountInterval(int countInterval) {
        this.countInterval = countInterval;
    }
}
