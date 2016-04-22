package NineSquares;

import javax.swing.JFrame;
import java.awt.GridLayout;

public class MainFrame extends JFrame{
  public MainFrame(){
    super("Nine Squares");
    getContentPane().setLayout(new GridLayout(3,3));
    for (int i=0; i<9; i++){
      getContentPane().add(new EachSquare());
    }
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
