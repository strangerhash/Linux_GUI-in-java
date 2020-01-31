import java.awt.*;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class Main{
public static void main(String[] args)
 {    
            
            frame_window real_frame=new frame_window();
           
            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
            Date dateobj = new Date();
            real_frame.ta.setText("Hello Guys....Feeling Bore with linux...welcome!\nstranger@satyendra:\nNote:plz go to environment in which you want to work....\n"+df.format(dateobj));
            real_frame.ta.setBackground(Color.black);
            real_frame.ta.setForeground(Color.green);
//System.out.println(df.format(dateobj));
 }
}