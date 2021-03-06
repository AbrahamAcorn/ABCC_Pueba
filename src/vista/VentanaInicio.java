package vista;
import javax.swing.*;

import controlador.AlumnoDAO;
import modelo.Alumno;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;	

public class VentanaInicio extends JFrame {
	
	public VentanaInicio() {
		crearComponentes();
	}
	
	JInternalFrame frameAltas, frameBajas, frameModificaciones, frameConsultas;
	private JButton btnCancelar3;
	private JButton btnBuscar3;
	
	public void crearComponentes() {
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ALTAS, BAJAS, CAMBIOS Y CONSULTAS");
		setSize(710, 660);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JDesktopPane pane = new JDesktopPane();
		
		//-------------------------------------- MENU PRINCIPAL ----------------------------------
		AlumnoDAO dao=new AlumnoDAO();
		Alumno alumno=new Alumno();
		JMenuBar menuBar = new JMenuBar();
			JMenu menu = new JMenu("Menu Alumnos");
				JMenuItem menuAlt = new JMenuItem("Altas");
				menuAlt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
				menuAlt.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frameAltas.setVisible(true);
						
						
					}
				});
				menu.add(menuAlt);
				
				JMenuItem menuBaj = new JMenuItem("Bajas");
				menuBaj.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
				menuBaj.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frameBajas.setVisible(true);
					}
				});
				menu.add(menuBaj);
				
				JMenuItem menuMod = new JMenuItem("Modificaciones");
				menuMod.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.ALT_MASK));
				menuMod.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frameModificaciones.setVisible(true);
					}
				});
				menu.add(menuMod);
				
				JMenuItem menuCon = new JMenuItem("Consultas");
				menuCon.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
				menuCon.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						frameConsultas.setVisible(true);
					}
				});
				menu.add(menuCon);
				
			menuBar.add(menu);
		setJMenuBar(menuBar);
		
		//--------------------------------------- FIN DE MENU -------------------------------------
		
		//------------------------------------------ ALTAS ----------------------------------------
		frameAltas = new JInternalFrame();
		frameAltas.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frameAltas.setLayout(null);
		frameAltas.setSize(700, 595);
		frameAltas.setTitle("ALTAS");
		frameAltas.setClosable(true);
		frameAltas.setIconifiable(true);
		frameAltas.setMaximizable(true);
		frameAltas.setResizable(true);
		frameAltas.setVisible(false);
		
		Font f1 = new Font("Arial", Font.ITALIC, 12);		
		JPanel panel1 = new JPanel();
			panel1.setBackground(new Color(124, 252, 0));
			panel1.setLayout(null);
			panel1.setPreferredSize(new Dimension(700, 190));
			panel1.setBounds(0, 0, 700, 80);
			
			JLabel lbl1 = new JLabel("ALTAS ALUMNOS");
			lbl1.setFont(new Font("Arial", Font.BOLD, 24));
			lbl1.setForeground(new Color(255, 255, 255));
			lbl1.setBounds(30, 30, 400, 20);
			panel1.add(lbl1);
			
		frameAltas.add(panel1);
		
		Font f2 = new Font("Arial", Font.CENTER_BASELINE, 14);
		JPanel panel2 = new JPanel();
			panel2.setLayout(null);
			panel2.setPreferredSize(new Dimension(700, 190));
			panel2.setBounds(0, 80, 700, 330);
			
			JLabel lblNumControl = new JLabel("N�MERO DE CONTROL: ");
			lblNumControl.setFont(f2);
			lblNumControl.setBounds(100, 30, 400, 25);
			panel2.add(lblNumControl);
			
			JTextField txtNumControl = new JTextField(10);
			txtNumControl.setFont(f2);
			txtNumControl.setBounds(280, 30, 150, 23);
			panel2.add(txtNumControl);
			
			JLabel lblNombres = new JLabel("NOMBRES:");
			lblNombres.setFont(f2);
			lblNombres.setBounds(100, 70, 300, 25);
			panel2.add(lblNombres);
			
			JTextField txtNombres = new JTextField(10);
			txtNombres.setFont(f2);
			txtNombres.setBounds(200, 70, 230, 23);
			panel2.add(txtNombres);
			
			JLabel lblApePaterno = new JLabel("APELLIDO PATERNO:");
			lblApePaterno.setFont(f2);
			lblApePaterno.setBounds(100, 110, 300, 25);
			panel2.add(lblApePaterno);
			
			JTextField txtApePaterno = new JTextField(10);
			txtApePaterno.setFont(f2);
			txtApePaterno.setBounds(255, 110, 176, 23);
			panel2.add(txtApePaterno);
			
			JLabel lblApeMaterno = new JLabel("APELLIDO MATERNO:");
			lblApeMaterno.setFont(f2);
			lblApeMaterno.setBounds(100, 150, 300, 25);
			panel2.add(lblApeMaterno);
			
			JTextField txtApeMaterno = new JTextField(10);
			txtApeMaterno.setFont(f2);
			txtApeMaterno.setBounds(255, 150, 176, 23);
			panel2.add(txtApeMaterno);
			
			JLabel lblSemestre = new JLabel("SEMESTRE:");
			lblSemestre.setFont(f2);
			lblSemestre.setBounds(100, 200, 300, 25);
			panel2.add(lblSemestre);
			
			JComboBox<String> cboSemestre = new JComboBox<String>();
			cboSemestre.addItem("Elige Semestre...");
			cboSemestre.addItem("1");
			cboSemestre.addItem("2");
			cboSemestre.addItem("3");
			cboSemestre.addItem("4");
			cboSemestre.addItem("5");
			cboSemestre.addItem("6");
			cboSemestre.addItem("7");
			cboSemestre.addItem("8");
			cboSemestre.addItem("9");
			cboSemestre.addItem("10");
			cboSemestre.setFont(f1);
			cboSemestre.setBounds(255, 200, 175, 23);
			panel2.add(cboSemestre);
			
			JLabel lblCarrera = new JLabel("CARRERA:");
			lblCarrera.setFont(f2);
			lblCarrera.setBounds(100, 240, 300, 25);
			panel2.add(lblCarrera);
			
			JComboBox<String> cboCarrera = new JComboBox<String>();
			cboCarrera.setFont(f1);
			cboCarrera.addItem("Elige Carrera...");
			cboCarrera.addItem("Ingenier�a en Sistemas Computacionales");
			cboCarrera.addItem("Ingenieria Industrias Alimentarias");
			cboCarrera.addItem("Ingenieria en Mecatr�nica");
			cboCarrera.addItem("Lincenciatura en Administraci�n");
			cboCarrera.addItem("Lincenciatura en Contador Publico");
			cboCarrera.setBounds(255, 240, 175, 23);
			panel2.add(cboCarrera);
			
			JButton btnAgregar = new JButton("AGREGAR");
			btnAgregar.setFont(f2);
			btnAgregar.setBounds(460, 100, 120, 30);
			panel2.add(btnAgregar);
			
			JButton btnCancelar = new JButton("CERRAR");
			btnCancelar.setFont(f2);
			btnCancelar.setBounds(460, 200, 120, 30);
			btnCancelar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frameAltas.setVisible(false);
				}
			});
			panel2.add(btnCancelar);
			
			JButton btnRestablecer = new JButton("RESTABLECER");
			btnRestablecer.setFont(f2);
			btnRestablecer.setBounds(255, 290, 174, 25);
			panel2.add(btnRestablecer);
			
		frameAltas.add(panel2);
		
		JPanel panel3 = new JPanel();
			panel3.setLayout(null);
			panel3.setPreferredSize(new Dimension(700, 190));
			panel3.setBounds(0, 410, 700, 152);
			
			String columnas[] = {"Num Control", "Nombres", "Primer Ap", "Segundo Ap", "Edad", "Semestre",
								"Carrera"};
			String datos[][] = {{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
								{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
								{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
								{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
								{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""}};
			
			JTable table = new JTable(datos, columnas);
			JScrollPane scroll = new JScrollPane(table);
			scroll.setBounds(5, 9, 678, 135);
			panel3.add(scroll);
			
			frameAltas.add(panel3);
			
			pane.add(frameAltas);
		//------------------------------------- ALTAS ---------------------------------------
		
		//------------------------------------- BAJAS ---------------------------------------
		frameBajas = new JInternalFrame();
		frameBajas.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frameBajas.setLayout(null);
		frameBajas.setSize(700, 595);
		frameBajas.setTitle("BAJAS");
		frameBajas.setClosable(true);
		frameBajas.setIconifiable(true);
		frameBajas.setMaximizable(true);
		frameBajas.setResizable(true);
		frameBajas.setVisible(false);
		
		JPanel panel4 = new JPanel();
			panel4.setBackground(new Color(255, 0, 0));
			panel4.setLayout(null);
			panel4.setPreferredSize(new Dimension(700, 190));
			panel4.setBounds(0, 0, 700, 80);
			
			JLabel lbl2 = new JLabel("BAJAS ALUMNOS");
			lbl2.setFont(new Font("Arial", Font.BOLD, 24));
			lbl2.setForeground(new Color(255, 255, 255));
			lbl2.setBounds(30, 30, 400, 20);
			panel4.add(lbl2);
			
		frameBajas.add(panel4);
		
		JPanel panel5 = new JPanel();
			panel5.setLayout(null);
			panel5.setPreferredSize(new Dimension(700, 190));
			panel5.setBounds(0, 80, 700, 80);
			
			JLabel lblNumControl2 = new JLabel("N�MERO DE CONTROL:");
			lblNumControl2.setFont(f2);
			lblNumControl2.setBounds(80, 30, 400, 25);
			panel5.add(lblNumControl2);
			
			JTextField txtNumControl2 = new JTextField(10);
			txtNumControl2.setFont(f2);
			txtNumControl2.setBounds(250, 30, 150, 23);
			panel5.add(txtNumControl2);
			
			JButton btnBuscar = new JButton(new ImageIcon("Iconos/Buscar.png"));
			btnBuscar.setBounds(420, 20, 50, 45);
			panel5.add(btnBuscar);
			
			JButton btnBorrar2 = new JButton("RESTABLECER");
			btnBorrar2.setFont(f2);
			btnBorrar2.setBounds(510, 25, 140, 25);
			panel5.add(btnBorrar2);
			
			JLabel lblLinea = new JLabel("_____________________________________________________________________________");
			lblLinea.setFont(f2);
			lblLinea.setBounds(0, 60, 630, 20);
			panel5.add(lblLinea);
			
		frameBajas.add(panel5);
		
		JPanel panel6 = new JPanel();
			panel6.setLayout(null);
			panel6.setPreferredSize(new Dimension(700, 190));
			panel6.setBounds(0, 160, 700, 250);
			
			JLabel lblNombres2 = new JLabel("NOMBRE(S):");
			lblNombres2.setFont(f2);
			lblNombres2.setBounds(100, 30, 400, 25);
			panel6.add(lblNombres2);
			
			JTextField txtNombres2 = new JTextField(10);
			txtNombres2.setFont(f2);
			txtNombres2.setBounds(280, 30, 176, 23);
			panel6.add(txtNombres2);
			
			JLabel lblApePaterno2 = new JLabel("APELLIDO PATERNO:");
			lblApePaterno2.setFont(f2);
			lblApePaterno2.setBounds(100, 70, 300, 25);
			panel6.add(lblApePaterno2);
			
			JTextField txtApePaterno2 = new JTextField(10);
			txtApePaterno2.setFont(f2);
			txtApePaterno2.setBounds(280, 70, 176, 23);
			panel6.add(txtApePaterno2);
			
			JLabel lblApeMaterno2 = new JLabel("APELLIDO MATERNO:");
			lblApeMaterno2.setFont(f2);
			lblApeMaterno2.setBounds(100, 110, 300, 25);
			panel6.add(lblApeMaterno2);
			
			JTextField txtApeMaterno2 = new JTextField(10);
			txtApeMaterno2.setFont(f2);
			txtApeMaterno2.setBounds(280, 110, 176, 23);
			panel6.add(txtApeMaterno2);
			
			JLabel lblSemestre2 = new JLabel("SEMESTRE:");
			lblSemestre2.setFont(f2);
			lblSemestre2.setBounds(100, 150, 300, 25);
			panel6.add(lblSemestre2);
			
			JSpinner sprSemestre = new JSpinner();
			sprSemestre.setAutoscrolls(true);
			sprSemestre.setBounds(280, 150, 176, 23);
			panel6.add(sprSemestre);
			
			JLabel lblCarrera2 = new JLabel("CARRERA:");
			lblCarrera2.setFont(f2);
			lblCarrera2.setBounds(100, 190, 300, 25);
			panel6.add(lblCarrera2);
			
			JComboBox<String> cboCarrera2 = new JComboBox<String>();
			cboCarrera2.addItem("Elige Carrera...");
			cboCarrera2.addItem("Ingenieria en Sistemas Computacionales");
			cboCarrera2.addItem("Ingenieria en Industrias Alimentarias");
			cboCarrera2.addItem("Ingenieria en Mecatronica");
			cboCarrera2.addItem("Licenciatura en Administracion");
			cboCarrera2.addItem("Licenciatura en Contador Publico");
			cboCarrera2.setFont(f1);
			cboCarrera2.setBounds(280, 190, 175, 23);
			panel6.add(cboCarrera2);
			
			JButton btnEliminar = new JButton("ELIMINAR");
			btnEliminar.setFont(f2);
			btnEliminar.setBounds(480, 45, 135, 25);
			panel6.add(btnEliminar);
			
			JButton btnRestablecer2 = new JButton("RESTABLECER");
			btnRestablecer2.setFont(f2);
			btnRestablecer2.setBounds(480, 170, 135, 25);
			panel6.add(btnRestablecer2);
			
			JButton btnCancelar2 = new JButton("CERRAR");
			btnCancelar2.setFont(f2);
			btnCancelar2.setBounds(480, 110, 135, 25);
			btnCancelar2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frameBajas.setVisible(false);
				}
			});
			panel6.add(btnCancelar2);
			
		frameBajas.add(panel6);	
		
		JPanel panel7 = new JPanel();
			panel7.setLayout(null);
			panel7.setPreferredSize(new Dimension(700, 190));
			panel7.setBounds(0, 410, 700, 152);
			
			String columnas2[] = {"Num Control", "Nombres", "Primer Ap", "Segundo Ap", "Edad", "Semestre",
							"Carrera"};
			String datos2[][] = {{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
							{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
							{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
							{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
							{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""}};
		
			JTable table2 = new JTable(datos, columnas);
			JScrollPane scroll2 = new JScrollPane(table2);
			scroll2.setBounds(5, 9, 678, 135);
		panel7.add(scroll2);
		
		frameBajas.add(panel7);
		
		pane.add(frameBajas);
		
		//------------------------------------- BAJAS ---------------------------------------
		
		//--------------------------------- MODIFICACIONES ----------------------------------
		frameModificaciones = new JInternalFrame();
		frameModificaciones.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frameModificaciones.setLayout(null);
		frameModificaciones.setSize(700, 595);
		frameModificaciones.setTitle("MODIFICACIONES");
		frameModificaciones.setClosable(true);
		frameModificaciones.setIconifiable(true);
		frameModificaciones.setMaximizable(true);
		frameModificaciones.setResizable(true);
		frameModificaciones.setVisible(false);
		
		JPanel panel8 = new JPanel();
			panel8.setBackground(new Color(255, 165, 0));
			panel8.setLayout(null);
			panel8.setPreferredSize(new Dimension(700, 190));
			panel8.setBounds(0, 0, 700, 80);
		
			JLabel lbl3 = new JLabel("MODIFICACIONES ALUMNOS");
			lbl3.setFont(new Font("Arial", Font.BOLD, 24));
			lbl3.setForeground(new Color(255, 255, 255));
			lbl3.setBounds(30, 30, 400, 20);
		panel8.add(lbl3);
		
		frameModificaciones.add(panel8);
		
		JPanel panel9 = new JPanel();
			panel9.setLayout(null);
			panel9.setPreferredSize(new Dimension(700, 190));
			panel9.setBounds(0, 80, 700, 80);
		
			JLabel lblNumControl3 = new JLabel("N�MERO DE CONTROL:");
			lblNumControl3.setFont(f2);
			lblNumControl3.setBounds(80, 30, 400, 25);
			panel9.add(lblNumControl3);
			
			JTextField txtNumControl3 = new JTextField(10);
			txtNumControl3.setFont(f2);
			txtNumControl3.setBounds(250, 30, 150, 23);
			panel9.add(txtNumControl3);
			
			JButton btnBuscar2 = new JButton(new ImageIcon("Iconos/Buscar.png"));
			btnBuscar2.setBounds(420, 20, 50, 45);
			panel9.add(btnBuscar2);
		
			JButton btnBorrar3 = new JButton("RESTABLECER");
			btnBorrar3.setFont(f2);
			btnBorrar3.setBounds(510, 25, 140, 25);
			panel9.add(btnBorrar3);
			
			JLabel lblLinea2 = new JLabel("_____________________________________________________________________________");
			lblLinea2.setFont(f2);
			lblLinea2.setBounds(0, 60, 630, 20);
			panel9.add(lblLinea2);
		
		frameModificaciones.add(panel9);
		
		JPanel panel10 = new JPanel();
			panel10.setLayout(null);
			panel10.setPreferredSize(new Dimension(700, 190));
			panel10.setBounds(0, 160, 700, 250);
		
			JLabel lblNombres3 = new JLabel("NOMBRE(S):");
			lblNombres3.setFont(f2);
			lblNombres3.setBounds(100, 30, 400, 25);
			panel10.add(lblNombres3);
			
			JTextField txtNombres3 = new JTextField(10);
			txtNombres3.setFont(f2);
			txtNombres3.setBounds(280, 30, 176, 23);
			panel10.add(txtNombres3);
			
			JLabel lblApePaterno3 = new JLabel("APELLIDO PATERNO:");
			lblApePaterno3.setFont(f2);
			lblApePaterno3.setBounds(100, 70, 300, 25);
			panel10.add(lblApePaterno3);
		//pepe	
			JTextField txtApePaterno3 = new JTextField(10);
			txtApePaterno3.setFont(f2);
			txtApePaterno3.setBounds(280, 70, 176, 23);
			panel10.add(txtApePaterno3);
			
			JLabel lblApeMaterno3 = new JLabel("APELLIDO MATERNO:");
			lblApeMaterno3.setFont(f2);
			lblApeMaterno3.setBounds(100, 110, 300, 25);
			panel10.add(lblApeMaterno3);
			
			JTextField txtApeMaterno3 = new JTextField(10);
			txtApeMaterno3.setFont(f2);
			txtApeMaterno3.setBounds(280, 110, 176, 23);
			panel10.add(txtApeMaterno3);
			
			JLabel lblSemestre3 = new JLabel("SEMESTRE:");
			lblSemestre3.setFont(f2);
			lblSemestre3.setBounds(100, 150, 300, 25);
			panel10.add(lblSemestre3);
			
			JSpinner sprSemestre2 = new JSpinner();
			sprSemestre2.setAutoscrolls(true);
			sprSemestre2.setBounds(280, 150, 176, 23);
			panel10.add(sprSemestre2);
			
			JLabel lblCarrera3 = new JLabel("CARRERA:");
			lblCarrera3.setFont(f2);
			lblCarrera3.setBounds(100, 190, 300, 25);
			panel10.add(lblCarrera3);
			
			JComboBox<String> cboCarrera3 = new JComboBox<String>();
			cboCarrera3.addItem("Elige Carrera...");
			cboCarrera3.addItem("Ingenieria en Sistemas Computacionales");
			cboCarrera3.addItem("Ingenieria en Industrias Alimentarias");
			cboCarrera3.addItem("Ingenieria en Mecatr�nica");
			cboCarrera3.addItem("Lincenciatura en Administracion");
			cboCarrera3.addItem("Licenciatura en Contador Publico");
			cboCarrera3.setFont(f1);
			cboCarrera3.setBounds(280, 190, 175, 23);
			panel10.add(cboCarrera3);
			
			JButton btnEliminar2 = new JButton("MODIFICAR");
			btnEliminar2.setFont(f2);
			btnEliminar2.setBounds(480, 45, 135, 25);
			panel10.add(btnEliminar2);
			
			JButton btnRestablecer3 = new JButton("RESTABLECER");
			btnRestablecer3.setFont(f2);
			btnRestablecer3.setBounds(480, 170, 135, 25);
			panel10.add(btnRestablecer3);
			
			btnCancelar3 = new JButton("CERRAR");
			btnCancelar3.setFont(f2);
			btnCancelar3.setBounds(480, 110, 135, 25);
			btnCancelar3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frameModificaciones.setVisible(false);
				}
			});
			panel10.add(btnCancelar3);
			
		frameModificaciones.add(panel10);
		
		JPanel panel11 = new JPanel();
			panel11.setLayout(null);
			panel11.setPreferredSize(new Dimension(700, 190));
			panel11.setBounds(0, 410, 700, 152);
			
			String columnas3[] = {"Num Control", "Nombres", "Primer Ap", "Segundo Ap", "Edad", "Semestre",
						"Carrera"};
			String datos3[][] = {{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
						{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
						{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
						{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
						{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""}};
			
			JTable table3 = new JTable(datos, columnas);
			JScrollPane scroll3 = new JScrollPane(table3);
			scroll3.setBounds(5, 9, 678, 135);
		panel11.add(scroll3);
	
		frameModificaciones.add(panel11);
		
		pane.add(frameModificaciones);
		
		//--------------------------------- MODIFICACIONES ----------------------------------
		
		//----------------------------------- CONSULTAS -------------------------------------
		frameConsultas = new JInternalFrame();
		frameConsultas.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frameConsultas.setLayout(null);
		frameConsultas.setSize(700, 595);
		frameConsultas.setTitle("CONSULTAS");
		frameConsultas.setClosable(true);
		frameConsultas.setIconifiable(true);
		frameConsultas.setMaximizable(true);
		frameConsultas.setResizable(true);
		frameConsultas.setVisible(false);
		
		JPanel panel12 = new JPanel();
			panel12.setBackground(new Color(0, 0, 255));
			panel12.setLayout(null);
			panel12.setPreferredSize(new Dimension(700, 190));
			panel12.setBounds(0, 0, 700, 80);
			
			JLabel lbl4 = new JLabel("CONSULTAS ALUMNOS");
			lbl4.setFont(new Font("Arial", Font.BOLD, 24));
			lbl4.setForeground(new Color(255, 255, 255));
			lbl4.setBounds(30, 30, 400, 20);
		
		panel12.add(lbl4);
		
		frameConsultas.add(panel12);
		
		JPanel panel13 = new JPanel();
			panel13.setLayout(null);
			panel13.setPreferredSize(new Dimension(700, 190));
			panel13.setBounds(0, 80, 700, 330);
			
			JLabel lblSeleccion = new JLabel("Selecciona criterio de busqueda:");
			lblSeleccion.setFont(f2);
			lblSeleccion.setBounds(10, 15, 300, 25);
			panel13.add(lblSeleccion);
			
			JRadioButton rbtTodos = new JRadioButton("Todos");
			rbtTodos.setFont(f2);
			rbtTodos.setBounds(20, 70, 80, 25);
			panel13.add(rbtTodos);
			
			JRadioButton rbtNombre = new JRadioButton("NOMBRE:");
			rbtNombre.setFont(f2);
			rbtNombre.setBounds(100, 70, 100, 25);
			panel13.add(rbtNombre);
			
			JTextField txtNombres4 = new JTextField(10);
			txtNombres4.setFont(f2);
			txtNombres4.setBounds(280, 70, 176, 23);
			panel13.add(txtNombres4);
			
			JRadioButton rbtApePaterno = new JRadioButton("APELLIDO PATERNO:");
			rbtApePaterno.setFont(f2);
			rbtApePaterno.setBounds(100, 120, 180, 25);
			panel13.add(rbtApePaterno);
			
			JTextField txtApePaterno4 = new JTextField(10);
			txtApePaterno4.setFont(f2);
			txtApePaterno4.setBounds(280, 120, 176, 23);
			panel13.add(txtApePaterno4);
			
			JRadioButton rbtApeMaterno = new JRadioButton("APELLIDO MATERNO:");
			rbtApeMaterno.setFont(f2);
			rbtApeMaterno.setBounds(100, 170, 180, 25);
			panel13.add(rbtApeMaterno);
			
			JTextField txtApeMaterno4 = new JTextField(10);
			txtApeMaterno4.setFont(f2);
			txtApeMaterno4.setBounds(280, 170, 176, 23);
			panel13.add(txtApeMaterno4);
			
			JRadioButton rbtSemestre = new JRadioButton("SEMESTRE:");
			rbtSemestre.setFont(f2);
			rbtSemestre.setBounds(100, 220, 180, 25);
			panel13.add(rbtSemestre);
			
			JSpinner sprSemestre3 = new JSpinner();
			sprSemestre3.setAutoscrolls(true);
			sprSemestre3.setBounds(280, 220, 176, 23);
			panel13.add(sprSemestre3);
			
			JRadioButton rbtCarrera = new JRadioButton("CARRERA:");
			rbtCarrera.setFont(f2);
			rbtCarrera.setBounds(100, 270, 180, 25);
			panel13.add(rbtCarrera);
			
			JComboBox<String> cboCarrera4 = new JComboBox<String>();
			cboCarrera4.addItem("Elige Carrera...");
			cboCarrera4.addItem("Ingenieria en Sistemas Ccomputacionales");
			cboCarrera4.addItem("Ingenieria en Industrias Alimentarias");
			cboCarrera4.addItem("Ingenieria en Mecatronica");
			cboCarrera4.addItem("Licenciatura en Administracion");
			cboCarrera4.addItem("Licenciatura en Contador Publico");
			cboCarrera4.setFont(f1);
			cboCarrera4.setBounds(280, 270, 176, 23);
			panel13.add(cboCarrera4);
			
			btnBuscar3 = new JButton(new ImageIcon("Iconos/Buscar.png"));
			btnBuscar3.setBounds(480, 85, 135, 45);
			panel13.add(btnBuscar3);
			
			JButton btnRestablecer4 = new JButton("RESTABLECER");
			btnRestablecer4.setFont(f2);
			btnRestablecer4.setBounds(480, 170, 135, 35);
			panel13.add(btnRestablecer4);
			
			JButton btnCancelar4 = new JButton("CERRAR");
			btnCancelar4.setFont(f2);
			btnCancelar4.setBounds(480, 245, 135, 35);
			btnCancelar4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frameConsultas.setVisible(false);
				}
			});
			panel13.add(btnCancelar4);
			
		frameConsultas.add(panel13);
		
		JPanel panel14 = new JPanel();
			panel14.setLayout(null);
			panel14.setPreferredSize(new Dimension(700, 190));
			panel14.setBounds(0, 410, 700, 152);
			
			String columnas4[] = {"Num Control", "Nombres", "Primer Ap", "Segundo Ap", "Edad", "Semestre",
					"Carrera"};
			String datos4[][] = {{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
					{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
					{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
					{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""},
					{"", "", "", "", "", "", ""}, {"", "", "", "", "", "", ""}};
			
			JTable table4 = new JTable(datos, columnas);
			JScrollPane scroll4 = new JScrollPane(table4);
			scroll4.setBounds(5, 9, 678, 135);
		panel14.add(scroll4);

		frameConsultas.add(panel14);
		
		pane.add(frameConsultas);
		
		//----------------------------------- CONSULTAS -------------------------------------
		
		add(pane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
		//++++++HAY QUE DECLARAR TODOS LOS COMPONENTES DEL FRAME ANTES DE QUE LOS INSTANCIE
		//FALTA AGREGAR 
		/*
		public Alumno(String numControl, String nombre, String primerAp, 
		String segundoAp, byte edad, byte semestre, String carrera)
		Alumno a1=new Alumno("1656","juarez","juarez","Damasio",(byte)(3),(byte)(3),"IM");
		AlumnoDAO adao=new AlumnoDAO();
		adao.agregarAlumno(a1);
		adao.eliminarAlumnos("2");
		*/
	}
}