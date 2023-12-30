import java.awt.*;
import java.awt.event.*;
//MenuBar in java AWT
class appMenu extends Frame{
    MenuBar m ;
    public appMenu(){
        super("Siva");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        m = new MenuBar();

        Menu menu = new Menu("Menu");
        Menu subMenu = new Menu("Sub Menu");

        MenuItem i1 = new MenuItem();   //Inculde the menu item " item - 1 ";
        MenuItem i2 = new MenuItem();
        MenuItem i3 = new MenuItem();
        MenuItem i4 = new MenuItem();
        MenuItem i5 = new MenuItem();

        menu.add();
        menu.add(i2);
        menu.add(i3);

        subMenu.add(i4);
        subMenu.add(i5);

        menu.add(subMenu);
        m.add(menu);
        //close Button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
}
public class MenuItem {
    public static void main(String[] args){

    }
}


