import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class GridLayout implements LayoutManager {

    public GridLayout(long i, long i1, long i2, long i3) {

    }

    public GridLayout(float i, float i1) {

    }

    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout for components within a container

        // GridLayout = 	places components in a grid of cells.
        //					Each component takes all the available space within its cell,
        //					and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.GridLayout(3,3,0,0));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {

    }
}