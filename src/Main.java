import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setUndecorated(true);
        frame.setSize(1,1);
        frame.setLocation(960,540);
//        frame.setFocusable(true);
        frame.setAlwaysOnTop(true);
//        frame.add(new Comp());
        frame.setVisible(true);
    }
}