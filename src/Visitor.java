import java.text.*;
import java.util.Date;

public class Visitor {
    private int id;
    private Date entered;
    private Date exited;
    private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

    public int getId() {
        return id;
    }

    public Date getEntered() {
        return entered;
    }

    public Date getExited() {
        return exited;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setEntered(String entered){
        try {
            this.entered = timeFormat.parse(entered);
        }catch (ParseException pex){
            System.out.println(pex);
        }
    }

    public void setExited(String exited){
     try{this.exited = timeFormat.parse(exited);
    }catch (ParseException pex){
        System.out.println(pex);
    }

    }
}