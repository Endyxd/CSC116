import javax.swing.*;

public class MyGraphics{
    public static void main(String[] args){
        String sAge = JOptionPane.showInputDialog(null, "Please input your age");
        int age = Integer.parseInt(sAge);
        if(age < 18){
            JOptionPane.showMessageDialog(null, "Access Restricted");
        }else{
            JOptionPane.showMessageDialog(null, "please enter");
        }
    }
}