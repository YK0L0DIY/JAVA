import java.text.SimpleDateFormat;
import java.util.Date;

public class cap2ex23 {
    public static void main(String[] args){
        Date hoje;
        SimpleDateFormat sdf;
        hoje =new Date();
        sdf =new SimpleDateFormat("hh:mm:ss a");
        System.out.println(sdf.format(hoje));
    }
}

