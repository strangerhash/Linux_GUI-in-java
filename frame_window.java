import java.net.*;  
import javax.swing.*;    
import java.awt.event.*;
import javax.swing.JScrollPane;
//import java.awt.FlowLayout;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Color;

//All package and classes imported here
//class frame_wndow start here      
public class frame_window extends Thread implements ActionListener{

JFrame f=new JFrame("welcome");
//f.setBackground(Color.red);
//JLabel background=new JLabel(new ImageIcon ("hacker1.jpg")); 
//f.add(background); 

String line=null;
String message=null; 
String new_ip=null;   
JMenuBar mb;    
JMenu file,edit,help,file_permission,cmd_desc,Hacking_commands,helping_docs;    
JMenuItem coming,cut,cd,copy,paste,selectAll,ping,airmon,ls,choose_file,save,
save_as,new_file,delete,ifconfig,cat,touch;    
JTextArea ta=new JTextArea(20,20);

JScrollPane scrPane = new JScrollPane(ta);
//add(scrPane);
//scroll_pane ta=new scroll_pane();    
// objects configuration here
 
//JScrollPane scrollableTextArea = new JScrollPane(ta);  
frame_window()
{     //constructor   
f=new JFrame();    
//cut=new JMenuItem("cut");  
cd=new JMenuItem("cd");  
coming=new JMenuItem("coming"); 
copy=new JMenuItem("copy(ctrl+C)");    
paste=new JMenuItem("paste(ctrl+V)");    
selectAll=new JMenuItem("selectAll(ctrl+A)");
ping=new JMenuItem("ping the server(ping)");
ls=new JMenuItem("show dir(ls)");
airmon=new JMenuItem("airmon support");
cat=new JMenuItem("read file(cat)");
touch=new JMenuItem("create new file(touch)");
ifconfig=new JMenuItem("find ip(ifconfig)");

// choose_file=new JMenuItem("Choose File");
// save=new JMenuItem("Save");
// new_file=new JMenuItem("New File");
// save_as=new JMenuItem("Save As");


//adding menuvalues
airmon.addActionListener(this);
touch.addActionListener(this);
coming.addActionListener(this);
cd.addActionListener(this);
ping.addActionListener(this);

cat.addActionListener(this);

ifconfig.addActionListener(this);

ls.addActionListener(this);
ping.addActionListener(this);

//Assingning menu bars
mb=new JMenuBar();    
file_permission=new JMenu("File Permission");
cmd_desc=new JMenu("Basic commands");
Hacking_commands=new JMenu("Hacking commands");
helping_docs=new JMenu("Helping Docs");

//adding particullar menubars
cmd_desc.add(ls);
cmd_desc.add(ping);
cmd_desc.add(cd);
cmd_desc.add(ifconfig);
cmd_desc.add(touch);
cmd_desc.add(cat);
cmd_desc.add(coming);
Hacking_commands.add(airmon);
cmd_desc.add(ping);


//adding values to menu bar

mb.add(file_permission);
mb.add(helping_docs);
mb.add(cmd_desc);
mb.add(Hacking_commands);


//text area decidind size

//scrPane=new JScrollPane();    
scrPane.setBounds(20,100,700,400);
scrPane.setBackground(Color.red);
//scrPane.setBackground(new ImageIcon ("hacker1.jpg"));  
///
//setContentPane(new JLabel(new ImageIcon("hacker1.jpg")));
        
f.add(mb);
f.add(scrPane);  
 f.setTitle("INVENTION:LINUX GUI");
 JLabel background=new JLabel(new ImageIcon ("hacker1.jpg")); 
f.add(background);  
f.setJMenuBar(mb);
f.setBackground(Color.black);  
f.setLayout(null);    
f.setSize(800,600);    
f.setVisible(true);  
  
}     
//Action perform by clicking
public void actionPerformed(ActionEvent e) {    

if(e.getSource()==touch)
{     JFrame f=new JFrame();
      String name=JOptionPane.showInputDialog(f,"Enter Name");  
      //System.out.println(name); 
      try
		{ 
			 //ta.setText("This is event to display all files ...execute button in command line just click the button");
      Process process = Runtime.getRuntime().exec("touch "+name); 
       //process.Waitfor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            //line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line=buf.readLine())!=null) 
            {
            //ta.setText(line);
           // System.out.println(line);
              buffer.append(line+"\n");
           //System.out.println(line);
            }

             message = buffer.toString();

		} 
		catch (Exception y) 
		{ 
            y.printStackTrace(); 
        }
      System.out.println("file created");
          
}

if(e.getSource()==ping)
{     JFrame f=new JFrame();
      String name=JOptionPane.showInputDialog(f,"site name");  
      //System.out.println(name); 
      try
		{ 
			 //ta.setText("This is event to display all files ...execute button in command line just click the button");
      Process process = Runtime.getRuntime().exec("ping "+name); 
       process.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            //line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line=buf.readLine())!=null) 
            {
            //ta.setText(line);
           // System.out.println(line);
             buffer.append(line+"\n");
              
           //System.out.println(line);
            }

             message = buffer.toString();
             //ta.setText("currently thrad is running");

		} 
		catch (Exception y) 
		{ 
            y.printStackTrace(); 
        }
      //System.out.println("running");
          
}







// if(e.getSource()==ping)
// {
//       JFrame f=new JFrame();
//       String name=JOptionPane.showInputDialog(f,"site name please");  
// HttpURLConnection connection = null;
//     try {
//         URL u = new URL(name);
//         connection = (HttpURLConnection) u.openConnection();
//         connection.setRequestMethod("HEAD");
//         int code = connection.getResponseCode();
//         //System.out.println("" + code);
//         if(code==200)
//         {
//           message="server connected and responding";
//         }
//         else if(code==404)
//         {
//           message="Not found ,try again later";
//         }
        
//         // You can determine on HTTP return code received. 200 is success.
//     } catch (MalformedURLException er) {
//         // TODO Auto-generated catch block
//         er.printStackTrace();
//     } catch (IOException er) {
//         // TODO Auto-generated catch block
//         er.printStackTrace();
//     } finally {
//         if (connection != null) {
//             connection.disconnect();
//         }
//     }

//   }

if(e.getSource()==airmon)
{     JFrame f=new JFrame();
      String name=JOptionPane.showInputDialog(f,"Enter password");  
      //System.out.println(name); 
      try
		{ 
			 //ta.setText("This is event to display all files ...execute button in command line just click the button");
             String[] cmd = {"/bin/bash","-c","echo "+name+"| sudo -S airmon-ng start wlan0"};
             Process process = Runtime.getRuntime().exec(cmd); 
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            //line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line=buf.readLine())!=null) 
            {
            //ta.setText(line);
           // System.out.println(line);
              buffer.append(line+"\n");
           //System.out.println(line);
            }

             message = buffer.toString();

		} 
		catch (Exception y) 
		{ 
            y.printStackTrace(); 
        }
  // System.out.println("you are in"+name+"environment");
          
}

if(e.getSource()==ifconfig)
{     JFrame f=new JFrame();
    //  String name=JOptionPane.showInputDialog(f,"Enter path");  
      //System.out.println(name); 
      try
		{ 
			 //ta.setText("This is event to display all files ...execute button in command line just click the button");
			Process process = Runtime.getRuntime().exec("ifconfig"); 
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            //line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line=buf.readLine())!=null) 
            {
            //ta.setText(line);
           // System.out.println(line);
              buffer.append(line+"\n");
           //System.out.println(line);
            }

             message = buffer.toString();

		} 
		catch (Exception y) 
		{ 
            y.printStackTrace(); 
        }
//   System.out.println("you are in"+name+"environment");
          
}



if(e.getSource()==cd)
   {  //ta.setText("This is event to display all files ...execute button in command line just click the button");
       String name=JOptionPane.showInputDialog(f,"Enter path");  
   try
		{ 
			 //ta.setText("This is event to display all files ...execute button in command line just click the button");
          String[] cmd = { "/bin/sh", "-c", "cd /"+name+"; ls -l" };
            //Process p = Runtime.getRuntime().exec(cmd);
          Process process = Runtime.getRuntime().exec(cmd,null); 
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            //line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line=buf.readLine())!=null) {
            //ta.setText(line);
           // System.out.println(line);
           buffer.append(line+"\n");
           //System.out.println(line);
            }
             message = buffer.toString();
             ta.setText("succes");
		} 
		catch (Exception y) 
		{ 
            y.printStackTrace(); 
		}
          
    }    


        // ta.setText(message);




if(e.getSource()==ls)
   {  //ta.setText("This is event to display all files ...execute button in command line just click the button");
     try
		{ 
			 //ta.setText("This is event to display all files ...execute button in command line just click the button");
			Process process = Runtime.getRuntime().exec("ls"); 
            BufferedReader buf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            //line = "";
            StringBuffer buffer = new StringBuffer();
            while ((line=buf.readLine())!=null) {
            //ta.setText(line);
           // System.out.println(line);
           buffer.append(line+"\n");
           //System.out.println(line);
            }
             message = buffer.toString();
		} 
		catch (Exception y) 
		{ 
            y.printStackTrace(); 
		}
          
    }    
         
    ta.setText(message);
         //ta.setText("This is event to display all files ...execute button in command line just click the button");
}     
  }

