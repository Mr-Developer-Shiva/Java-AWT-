import java.awt.*;
import java.awt.event.*;

class convas extends Canvas{
    public convas(){
      setSize(300,300);
      setBackground(Color.GRAY);  
    }
    public void paint(Graphics g ){
        g.setColor(Color.red);
        g.fillOval(75,70,150,150);
    }
}
class MyappCanvas extends Frame{
    MyappCanvas(){
        super("Title");
        setSize(1000,600);
        setVisible(true);
        setLayout(null);

        add(new convas());
        //close code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ew){
                System.exit(0);
            }
        });
    }
}
public class CanvasItem {
    public static void main(String[] args){
        MyappCanvas m = new MyappCanvas();
    }
}
