import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

 private JTextField txtbx;
 private JLabel lbl1, lbl2, lbl3, lbl4;
 private JButton btn;
 public static String texto = "";

 public Bienvenida(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Bienvenido");
  getContentPane().setBackground(new Color(255, 0, 0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  
  ImageIcon imagen = new ImageIcon("images/logo-coca.png");
  lbl1 = new JLabel(imagen);
  lbl1.setBounds(25, 15, 300, 150);
  add(lbl1);

  lbl2 = new JLabel("Sistema de Control Vacacional");
  lbl2.setBounds(35, 135, 300, 30);
  lbl2.setFont(new Font("Andale Mono", 3, 18));
  lbl2.setForeground(new Color(255, 255, 255));
  add(lbl2);

  lbl3 = new JLabel("A continuacion ingrese su nombre: ");
  lbl3.setBounds(45, 212, 400, 30);
  lbl3.setFont(new Font("Andale Mono", 1, 14));
  lbl3.setForeground(new Color(255, 255, 255));
  add(lbl3);

  lbl4 = new JLabel("�2017 The Coca-Cola Company.");
  lbl4.setBounds(85, 375, 300, 30);
  lbl4.setFont(new Font("Andale Mono", 1, 12));
  lbl4.setForeground(new Color(255, 255, 255));
  add(lbl4);

  txtbx = new JTextField();
  txtbx.setBounds(45, 240, 255, 25);
  txtbx.setBackground(new Color(224, 224, 224));
  txtbx.setFont(new Font("Andale Mono", 1, 14));
  txtbx.setForeground(new Color(255, 0, 0));
  add(txtbx);

  btn = new JButton("Ingresar");
  btn.setBounds(125, 280, 100, 30);
  btn.setBackground(new Color(255, 255, 255));
  btn.setFont(new Font("Andale Mono", 1, 14));
  btn.setForeground(new Color(255, 0, 0));
  btn.addActionListener(this);
  add(btn);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn){
   texto = txtbx.getText().trim();
   if(texto.equals("")){
    JOptionPane.showMessageDialog(null, "Ingrese su nombre para ingresar.");
   } else {
     Licencia frm2 = new Licencia();
     frm2.setBounds(0, 0, 700, 460);
     frm2.setVisible(true);
     frm2.setResizable(false);
     frm2.setLocationRelativeTo(null);
     this.setVisible(false); 
   }
  }
 }

 public static void main(String args[]){
  Bienvenida frm1 = new Bienvenida();
  frm1.setBounds(0, 0, 350, 450);
  frm1.setVisible(true);
  frm1.setResizable(false);
  frm1.setLocationRelativeTo(null);  
 }
}