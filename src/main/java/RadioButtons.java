import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButtons{

    public static void main(String[] args) {

        // JRadioButton = One or more buttons in a grouping in which only 1 may be selected per group

        new MyFrameD();

    }
}
// ***********************************************************************


class MyFrameD extends JFrame implements ActionListener{

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFrameD(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //pizzaIcon = new ImageIcon("pizza.png");
        //hamburgerIcon = new ImageIcon("hamburger.png");
        //hotdogIcon = new ImageIcon("hotdog.png");

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    private void setLayout(FlowLayout flowLayout) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza!");
        }
        else if(e.getSource()==hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        }
        else if(e.getSource()==hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
