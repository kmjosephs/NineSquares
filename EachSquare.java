package NineSquares;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JColorChooser;

public class EachSquare extends JPanel{
  public EachSquare(){
    setBackground(new Color((int) (Math.random() * 16777215)));
    addMouseListener(new MouseClickListener());
  }

  public class MouseClickListener extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
      setBackground(JColorChooser.showDialog(
      EachSquare.this, "Choose Background Color", getBackground()
      ));
    }
  }
}
