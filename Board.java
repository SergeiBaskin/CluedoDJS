import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Board extends JPanel {
    private BufferedImage image;

    public Board() {
        try {
            image = ImageIO.read(new File("C:\\Users\\Eddie\\Pictures\\cluedoboard.jpg"));
            ImageIcon icon=new ImageIcon(image);
            JFrame frame=new JFrame();
            frame.add(new Board());
            frame.setLayout(new FlowLayout());
            frame.setSize(600,600);
            frame.setTitle("Game Board");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        } catch (IOException ex) {
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
    }



    public static void main(String args[]) {
        Board gui = new Board();
        InfoPanel ip = new InfoPanel();




    }
}

