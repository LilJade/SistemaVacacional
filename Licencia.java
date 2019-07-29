import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

 private JLabel lbl1, lbl2;
 private JCheckBox check;
 private JButton btn1, btn2;
 private JScrollPane scrllp;
 private JTextArea txtar;
 String nombre = "";

 public Licencia(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Licencia de Uso");
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  Bienvenida ventanaBienvenida = new Bienvenida();
  nombre = ventanaBienvenida.texto;
  
  lbl1 = new JLabel("TERMINOS Y CONDICIONES");
  lbl1.setBounds(255, 5, 200, 30);
  lbl1.setFont(new Font("Andale Mono", 1, 14));
  lbl1.setForeground(new Color(0, 0, 0));
  add(lbl1);

  txtar = new JTextArea();
  txtar.setEditable(false);
  txtar.setFont(new Font("Andale Mono", 0, 12));
  txtar.setText("\n\n          TERMINOS Y CONDICIONES" + 
		"\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DEL PROGRAMADOR LilJADE." + 
		"\n          B.PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
		"\n          C.LilJADE NO SE HACE RESPONSABLE DEL MAL USO DE  ESTE SISTEMA." +
		"\n\n        LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA " +
		"\n        DE ESTE SISTEMA, LilJADE NO SE RESPONSABILIZA DEL USO QUE USTED " +
		"\n        HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN 'ACEPTAR'." +
		"\n        SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN 'NO ACEPTO' Y NO UTILICE ESTE SISTEMA." +
		"\n\n        PARA MAYOR INFORMACION SOBRE NUESTROS SERVICIOS, POR FAVOR BUSQUE INFORMACION SOBRE" +
		"\n        ©THUNDER"
  );
  scrllp = new JScrollPane(txtar);
  scrllp.setBounds(10, 40, 675, 270);
  add(scrllp);

  check = new JCheckBox("Yo "+ nombre + ", Acepto.");
  check.setBounds(10, 325, 300, 30);
  check.addChangeListener(this);
  add(check);

  btn1 = new JButton("Continuar");
  btn1.setBounds(10, 360, 100, 30);
  btn1.addActionListener(this);
  btn1.setEnabled(false);
  add(btn1);

  btn2 = new JButton("Cancelar");
  btn2.setBounds(120, 360, 100, 30);
  btn2.addActionListener(this);
  btn2.setEnabled(true);
  add(btn2);

  ImageIcon imagen = new ImageIcon("images/coca-cola.png");
  lbl2 = new JLabel(imagen);
  lbl2.setBounds(425, 235, 250, 250);
  add(lbl2); 
 }

 public void stateChanged(ChangeEvent e){
  if(check.isSelected() == true){
   btn1.setEnabled(true);
   btn2.setEnabled(false);
  } else {
   btn1.setEnabled(false);
   btn2.setEnabled(true);
  }
 }
  
 public void actionPerformed(ActionEvent e){
  if(e.getSource() == btn1){
   Principal frm3 = new Principal();
   frm3.setBounds(0, 0, 640, 535);
   frm3.setVisible(true);
   frm3.setResizable(false);
   frm3.setLocationRelativeTo(null);
   this.setVisible(false);
  } else if(e.getSource() == btn2){
   Bienvenida frm1 = new Bienvenida();
   frm1.setBounds(0, 0, 350, 450);
   frm1.setVisible(true);
   frm1.setResizable(false);
   frm1.setLocationRelativeTo(null);  
   this.setVisible(false);
  }
 }

 public static void main(String args[]){
  Licencia frm2 = new Licencia();
  frm2.setBounds(0, 0, 700, 460);
  frm2.setVisible(true);
  frm2.setResizable(false);
  frm2.setLocationRelativeTo(null);
 }
}