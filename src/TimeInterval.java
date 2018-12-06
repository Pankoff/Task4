import java.util.Date;
import java.util.List;

public class TimeInterval {

    private class PopularInterval{
        private Date entered;
        private Date exited;
    }

    public PopularInterval findPopInter(List<Visitor> visitors){
        for (int i = 0; i <visitors.size(); i++) {
            Comparison(visitors.get(i), visitors);
        }
    return null;
    }

    public void Comparison(Visitor visitor,List<Visitor> visitors){
    }

}
