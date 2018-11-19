import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class cap2ex20 {
    public static void main(String[] args){
        Date hoje;
        SimpleDateFormat sdf;
        hoje =new Date();
        sdf =new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(hoje));

    }

}
