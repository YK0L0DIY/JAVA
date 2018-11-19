import java.text.SimpleDateFormat;
import java.util.Date;

public class cap2ex21 {
    public static void main(String[] args){
        Date hoje;
        SimpleDateFormat sdf;
        hoje =new Date();
        sdf =new SimpleDateFormat("EEEE MMMM dd, yyyy");
        System.out.println(sdf.format(hoje));
    }
}
