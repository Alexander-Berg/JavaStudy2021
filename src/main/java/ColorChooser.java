import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class ColorChooser{

    public static void main(String[] args) {

        // JColorChooser = A GUI mechanism that let's a user choose a color

        new MyFrameH();
    }
}


class MyFrameH extends JFrame implements ActionListener{


    JButton button;
    JLabel label;

    MyFrameH(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);

            label.setForeground(color);
            //label.setBackground(color);
        }
    }
}