package Practice;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class GetDayNumber {
    public static void main(String[] args)throws Exception {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Todays date:"+sdf.format(cal.getTime()));
        Format f=new SimpleDateFormat("EEEE");
        String str=f.format(new Date());
        System.out.println("Day Name"+str);
    }
}
