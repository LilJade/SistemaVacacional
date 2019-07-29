import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

 private JMenuBar mnbr;
 private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
 private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
 private JLabel lblLogo, lblBienvenido, lblTitle, lblNombre, lblAPaterno, lblAMaterno,
		lblDepart, lblAntiguedad, lblResultado, lblfooter;
 private JTextField txtNombre, txtAPaterno, txtAMaterno;
 private JComboBox cmbDepart, cmbAntiguedad;
 private JScrollPane scrllp;
 private JTextArea txtar;
 String nombreAdmin = "";

 public Principal(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Pantalla Principal");
  getContentPane().setBackground(new Color(255, 0, 0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  Bienvenida ventanaBienvenida = new Bienvenida();
  nombreAdmin = ventanaBienvenida.texto;

  mnbr = new JMenuBar();
  mnbr.setBackground(new Color(255, 0, 0));
  setJMenuBar(mnbr);

  menuOpciones = new JMenu("Opciones");
  menuOpciones.setBackground(new Color(255, 0, 0));
  menuOpciones.setFont(new Font("Andale Mono", 1, 14));
  menuOpciones.setForeground(new Color(255, 255, 255));
  mnbr.add(menuOpciones);

  menuCalcular = new JMenu("Calcular");
  menuCalcular.setBackground(new Color(255, 0, 0));
  menuCalcular.setFont(new Font("Andale Mono", 1, 14));
  menuCalcular.setForeground(new Color(255, 255, 255));
  mnbr.add(menuCalcular);

  menuAcercaDe = new JMenu("Acerca de");
  menuAcercaDe.setBackground(new Color(255, 0, 0));
  menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
  menuAcercaDe.setForeground(new Color(255, 255, 255));
  mnbr.add(menuAcercaDe);

  miNuevo = new JMenuItem("Nueva Consulta");
  miNuevo.setFont(new Font("Andale Mono", 1, 14));
  miNuevo.setForeground(new Color(255, 0, 0));
  menuOpciones.add(miNuevo);
  miNuevo.addActionListener(this);

  menuColorFondo = new JMenu("Color de Fondo");
  menuColorFondo.setBackground(new Color(255, 0, 0));
  menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
  menuColorFondo.setForeground(new Color(255, 0, 0));
  menuOpciones.add(menuColorFondo);

  miRojo = new JMenuItem("Rojo");
  miRojo.setFont(new Font("Andale Mono", 1, 14));
  miRojo.setForeground(new Color(255, 0, 0));
  menuColorFondo.add(miRojo);
  miRojo.addActionListener(this);

  miNegro = new JMenuItem("Negro");
  miNegro.setFont(new Font("Andale Mono", 1, 14));
  miNegro.setForeground(new Color(255, 0, 0));
  menuColorFondo.add(miNegro);
  miNegro.addActionListener(this);

  miMorado = new JMenuItem("Morado");
  miMorado.setFont(new Font("Andale Mono", 1, 14));
  miMorado.setForeground(new Color(255, 0, 0));
  menuColorFondo.add(miMorado);
  miMorado.addActionListener(this);

  miSalir = new JMenuItem("Salir");
  miSalir.setFont(new Font("Andale Mono", 1, 14));
  miSalir.setForeground(new Color(255, 0, 0));
  menuOpciones.add(miSalir);
  miSalir.addActionListener(this);

  miCalculo = new JMenuItem("Vacaciones");
  miCalculo.setFont(new Font("Andale Mono", 1, 14));
  miCalculo.setForeground(new Color(255, 0, 0));
  menuCalcular.add(miCalculo);
  miCalculo.addActionListener(this);

  miElCreador = new JMenuItem("El creador");
  miElCreador.setFont(new Font("Andale Mono", 1, 14));
  miElCreador.setForeground(new Color(255, 0, 0));
  menuAcercaDe.add(miElCreador);
  miElCreador.addActionListener(this);

  ImageIcon imagen = new ImageIcon("images/logo-coca.png");
  lblLogo = new JLabel(imagen);
  lblLogo.setBounds(5, 5, 250, 100);
  add(lblLogo);

  lblBienvenido = new JLabel("Bienvenido " + nombreAdmin);
  lblBienvenido.setBounds(280, 30, 400, 60);
  lblBienvenido.setFont(new Font("Andale Mono", 1, 28));
  lblBienvenido.setForeground(new Color(255, 255, 255));
  add(lblBienvenido);

  lblTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
  lblTitle.setBounds(45, 140, 900, 25);
  lblTitle.setFont(new Font("Andale Mono", 1, 14));
  lblTitle.setForeground(new Color(255, 255, 255));
  add(lblTitle);

  lblNombre = new JLabel("Nombre Completo: ");
  lblNombre.setBounds(25, 188, 180, 25);
  lblNombre.setFont(new Font("Andale Mono", 1, 14));
  lblNombre.setForeground(new Color(255, 255, 255));
  add(lblNombre);
  txtNombre = new JTextField();
  txtNombre.setBounds(25, 213, 150, 25);
  txtNombre.setBackground(new java.awt.Color(224, 224, 224));
  txtNombre.setFont(new java.awt.Font("Andale Mono", 1, 14));
  txtNombre.setForeground(new java.awt.Color(255, 0, 0));
  add(txtNombre);

  lblAPaterno = new JLabel("Apellido Paterno:");
  lblAPaterno.setBounds(25, 248, 180, 25);
  lblAPaterno.setFont(new Font("Andale Mono", 1, 14));
  lblAPaterno.setForeground(new Color(255, 255, 255));
  add(lblAPaterno);
  txtAPaterno = new JTextField();
  txtAPaterno.setBounds(25, 273, 150, 25);
  txtAPaterno.setBackground(new java.awt.Color(224, 224, 224));
  txtAPaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
  txtAPaterno.setForeground(new java.awt.Color(255, 0, 0));
  add(txtAPaterno);

  lblAMaterno = new JLabel("Apellido Materno: ");
  lblAMaterno.setBounds(25, 308, 180, 25);
  lblAMaterno.setFont(new Font("Andale Mono", 1, 14));
  lblAMaterno.setForeground(new Color(255, 255, 255));
  add(lblAMaterno);
  txtAMaterno = new JTextField();
  txtAMaterno.setBounds(25, 334, 150, 25);
  txtAMaterno.setBackground(new java.awt.Color(224, 224, 224));
  txtAMaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
  txtAMaterno.setForeground(new java.awt.Color(255, 0, 0));
  add(txtAMaterno);

  lblDepart = new JLabel("Seleccione su Departamento: ");
  lblDepart.setBounds(220, 188, 250, 25);
  lblDepart.setFont(new Font("Andale Mono", 1, 14));
  lblDepart.setForeground(new Color(255, 255, 255));
  add(lblDepart);
 
  cmbDepart = new JComboBox();
  cmbDepart.setBounds(220, 213, 220, 25);
  cmbDepart.setBackground(new java.awt.Color(224, 224, 224));
  cmbDepart.setFont(new java.awt.Font("Andale Mono", 1, 14));
  cmbDepart.setForeground(new java.awt.Color(255, 0, 0));
  add(cmbDepart);
  cmbDepart.addItem("");
  cmbDepart.addItem("Atencion al Cliente");
  cmbDepart.addItem("Departamento de Logistica");
  cmbDepart.addItem("Departamento de Gerencia");

  lblAntiguedad = new JLabel("Seleccione su Antiguedad: ");
  lblAntiguedad.setBounds(220, 250, 200, 25);
  lblAntiguedad.setFont(new Font("Andale Mono", 1, 14));
  lblAntiguedad.setForeground(new Color(255, 255, 255));
  add(lblAntiguedad);
 
  cmbAntiguedad = new JComboBox();
  cmbAntiguedad.setBounds(220, 273, 220, 25);
  cmbAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
  cmbAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
  cmbAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
  add(cmbAntiguedad);
  cmbAntiguedad.addItem("");
  cmbAntiguedad.addItem("1 año de servicio");
  cmbAntiguedad.addItem("2 a 6 años de servicio");
  cmbAntiguedad.addItem("7 o mas años de servicio");

  lblResultado = new JLabel("Vacaciones correspondientes: ");
  lblResultado.setBounds(220, 307, 300, 25);
  lblResultado.setFont(new Font("Andale Mono", 1, 14));
  lblResultado.setForeground(new Color(255, 255, 255));
  add(lblResultado);

  txtar = new JTextArea();
  txtar.setEditable(false);
  txtar.setBackground(new Color(224, 224, 224));
  txtar.setFont(new Font("Andale Mono", 1, 14));
  txtar.setForeground(new Color(255, 0, 0));
  txtar.setText("\n   Resultados.");
  scrllp = new JScrollPane(txtar);
  scrllp.setBounds(220, 350, 385, 90);
  add(scrllp);

  lblfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados.");
  lblfooter.setBounds(135, 445, 500, 30);
  lblfooter.setFont(new java.awt.Font("Andale Mono", 1, 14));
  lblfooter.setForeground(new java.awt.Color(255, 255, 255));
  add(lblfooter);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == miCalculo){
   String nombre = txtNombre.getText();
   String AP = txtAPaterno.getText();
   String AM = txtAMaterno.getText();
   String depart = cmbDepart.getSelectedItem().toString();
   String Ant = cmbAntiguedad.getSelectedItem().toString();

   if(nombre.equals("") || AP.equals("") || AM.equals("") || 
      depart.equals("") || Ant.equals("")){

    JOptionPane.showMessageDialog(null, "Asegurese de rellenar todos los campos.");

   } else {
     if(depart.equals("Atencion al Cliente")){
        if(Ant.equals("1 año de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 1 año"+ 
			"\n   Vacaciones: goza de 6 dias de vaciones.");
        }
        if(Ant.equals("2 a 6 años de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 2 a 6 años" + 
			"\n   Vacaciones: goza de 14 dias de vaciones.");          
        }
        if(Ant.equals("7 o mas años de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 7 o mas años" + 
			"\n   Vacaciones: goza de 20 dias de vaciones.");          
        }
     } else if(depart.equals("Departamento de Logistica")){
        if(Ant.equals("1 año de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 1 año" + 
			"\n   Vacaciones: goza de 7 dias de vaciones.");
        }
        if(Ant.equals("2 a 6 años de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 2 a 6 años" + 
			"\n   Vacaciones: goza de 15 dias de vaciones.");          
        }
        if(Ant.equals("7 o mas años de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 7 o mas años" + 
			"\n   Vacaciones: goza de 22 dias de vaciones.");          
        }
     } else if(depart.equals("Departamento de Gerencia")){
        if(Ant.equals("1 año de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 1 año" + 
			"\n   Vacaciones: goza de 10 dias de vaciones.");
        }
        if(Ant.equals("2 a 6 años de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 2 a 6 años" + 
			"\n   Vacaciones: goza de 20 dias de vaciones.");          
        }
        if(Ant.equals("7 o mas años de servicio")){
          txtar.setText("   Nombre: " + nombre + " " + AP + " " + AM +
			"\n   Departamento: " + depart + 
			"\n   Años de trabajo: 7 o mas años" + 
			"\n   Vacaciones: goza de 30 dias de vaciones.");          
        }
     }
   }
  }
  if(e.getSource() == miRojo){
   mnbr.setBackground(new Color(255, 0, 0));
   getContentPane().setBackground(new Color(255, 0, 0));
  }
  if(e.getSource() == miNegro){
   mnbr.setBackground(new Color(0, 0, 0));
   getContentPane().setBackground(new Color(0, 0, 0));
  }  
  if(e.getSource() == miMorado){
   mnbr.setBackground(new Color(51, 0, 51));
   getContentPane().setBackground(new Color(51, 0, 51));
  }
  if(e.getSource() == miNuevo){
   txtNombre.setText("");
   txtAPaterno.setText("");
   txtAMaterno.setText("");
   cmbDepart.setSelectedIndex(0);
   cmbAntiguedad.setSelectedIndex(0);
   txtar.setText("\n   Resultados.");
  }
  if(e.getSource() == miSalir){
   Bienvenida frm1 = new Bienvenida();
   frm1.setBounds(0, 0, 350, 450);
   frm1.setVisible(true);
   frm1.setResizable(false);
   frm1.setLocationRelativeTo(null);  
   this.setVisible(false);
  }
  if(e.getSource() == miElCreador){
   JOptionPane.showMessageDialog(null, "Desarrollado por LilJade, integrante de ©THUNDER." +
				 "\nBajo la tutela, orientacion y el conocimiento de La Geekipedia de Ernesto." +
				 "\nhttps://www.youtube.com/channel/UCeEW6PHNJlIwI-rKChmqqkw");
  }
 }

 public static void main(String args[]){
  Principal frm3 = new Principal();
  frm3.setBounds(0, 0, 640, 535);
  frm3.setVisible(true);
  frm3.setResizable(false);
  frm3.setLocationRelativeTo(null);
 }
}