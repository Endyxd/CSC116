import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Bakery GUI
 * Provide View of Bakery for purchasing cakes
 *
 * @author Suzanne Balik, 14 Mar 2002 
 */

public class BakeryGUI  extends JFrame  implements ActionListener {

  private Bakery bakery;

  private JButton btnBirthdayCake = new JButton("Order Birthday Cake");
  private JButton btnSheetCake = new JButton("Order Sheet Cake");
  private JButton btnWeddingCake = new JButton("Order Wedding Cake");
	
  private JLabel lblReceipt = new JLabel("Receipt");
  private JTextField txtReceipt = new JTextField(15);

  public BakeryGUI() {
		
    super("Bakery");
    setLocation(200,200);
    setSize (210,300);

    this.bakery = new Bakery();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setBackground (Color.white);
    c.setForeground (Color.black);
    c.setLayout(new FlowLayout());

    c.add (btnBirthdayCake);
    btnBirthdayCake.addActionListener(this);
		
    c.add (btnSheetCake);
    btnSheetCake.addActionListener(this);
		
    c.add (btnWeddingCake);
    btnWeddingCake.addActionListener(this);
    
    lblReceipt.setLabelFor(txtReceipt);
    c.add (lblReceipt);
    c.add (txtReceipt);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
	
    if (event.getSource() == btnBirthdayCake)
      txtReceipt.setText(bakery.buyCake(Bakery.BIRTHDAY_CAKE));
   
    if (event.getSource() == btnSheetCake)
      txtReceipt.setText(bakery.buyCake(Bakery.SHEET_CAKE));
     
    if (event.getSource() == btnWeddingCake)
      txtReceipt.setText(bakery.buyCake(Bakery.WEDDING_CAKE));
  }
  
  public static void main (String [] args) {

    BakeryGUI gui = new BakeryGUI();

  }      
}


