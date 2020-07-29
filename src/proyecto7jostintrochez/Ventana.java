package proyecto7jostintrochez;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JPanel panel; // Agregamos el panel como un atributo
    private JComboBox lista1, lista2;
    private JTextField cajaTexto;
    private JLabel etiqueta5;
    private JButton boton;

    Double valor;
    
    public Ventana (){
        setTitle ("Convertidor de Divisas - Jostin Tróchez"); // Inserta el título de la ventana emergente
        this.setSize(720, 720); // Agrega el tamaño de la ventana
        setLocationRelativeTo(null); //Establece la ventanta en posición central
        setResizable(false); // Decide si la ventana puede cambiar de tamaño
        
        iniciarComponentes ();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Termina la ejecución por completo del programa
    }
    
    private void iniciarComponentes (){
        colocarPanel();
        colocarEtiquetas();
        colocarImagen();
        colocarBoton();
        colocarCajaDeTexto();
        colocarListas();
        
        cajaTexto.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoActionPerformed(evt);
            }
        });
        
        boton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
    }
    
    private void colocarPanel (){
        panel = new JPanel (); // Añade el nuevo panel
        panel.setOpaque(true); // Establecer el pintado de fondo del panel
        panel.setBackground(Color.WHITE); // Cambio de color de fondo del panel
        panel.setLayout(null); // Desactiva el diseño del panel por defecto
        this.getContentPane().add(panel); // Agrega el panel a la ventana emergente
    }

    private void colocarEtiquetas (){
        JLabel titulo = new JLabel ("CONVERSOR DE MONEDAS", SwingConstants.CENTER); // Nueva etiqueta, alineación de texto centrado
        titulo.setBounds(0, 0, 720, 50); // Establece la posicion y el tamaño de la etiqueta
        titulo.setOpaque(true); // Establecer el pintado de fondo de la etiqueta
        titulo.setBackground(Color.DARK_GRAY); // Cambio de color de fondo de la etiqueta 
        titulo.setForeground(Color.WHITE); // Cambio de color de letra de la etiqueta
        titulo.setFont(new Font ("Century Gothic", 1, 24)); // Establece el tipo de fuente del texto        
        panel.add(titulo); // Agrega la etiqueta al panel
        
        JLabel etiqueta1 = new JLabel ("Cantidad:", SwingConstants.CENTER);
        etiqueta1.setBounds(0, 100, 240, 50);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.lightGray);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setFont(new Font("Verdana", 0, 16));
        panel.add(etiqueta1);
               
        JLabel etiqueta2 = new JLabel ("De:", SwingConstants.CENTER);
        etiqueta2.setBounds(0, 200, 240, 50);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.lightGray);
        etiqueta2.setForeground(Color.BLACK);
        etiqueta2.setFont(new Font("Verdana", 0, 14));
        panel.add(etiqueta2);
        
        JLabel etiqueta3 = new JLabel ("A:", SwingConstants.CENTER);
        etiqueta3.setBounds(0, 300, 240, 50);
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.lightGray);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setFont(new Font("Verdana", 0, 14));
        panel.add(etiqueta3);
        
        JLabel etiqueta4 = new JLabel ("El total es:", SwingConstants.CENTER);
        etiqueta4.setBounds(0, 500, 240, 50);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.lightGray);
        etiqueta4.setForeground(Color.BLACK);
        etiqueta4.setFont(new Font("Verdana", 0, 16));
        panel.add(etiqueta4); 
        
        etiqueta5 = new JLabel ("", SwingConstants.CENTER);
        etiqueta5.setBounds(280, 500, 400, 50);       
        etiqueta5.setForeground(Color.BLACK);
        etiqueta5.setFont(new Font("Verdana", 1, 18));
        panel.add(etiqueta5);
    }

    private void colocarImagen (){
        // Agrega el Logo de UTH a la ventana emergente
        ImageIcon imagen1 = new ImageIcon ("UTH.png");        
        JLabel imagen = new JLabel ("UNIVERSIDAD TECNOLÓGICA DE HONDURAS", SwingConstants.CENTER);
        imagen.setBounds(0, 595, 720, 100);
        imagen.setOpaque(true);
        imagen.setForeground(Color.BLACK);
        imagen.setBackground(Color.LIGHT_GRAY);
        imagen.setFont(new Font("Century Gothic", 1, 22));
        imagen.setIcon (new ImageIcon(imagen1.getImage().getScaledInstance(150,92,Image.SCALE_SMOOTH)));
        panel.add(imagen);
    }
    
    private void colocarBoton(){
        boton = new JButton ("CONVERTIR");
        boton.setBounds(280, 400, 150, 50);
        boton.setFont(new Font("Arial Rounded MT Bold",1,16));
        panel.add(boton);                     
    } 
    
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField ();
        cajaTexto.setBounds(280, 100, 400, 50);
        cajaTexto.setHorizontalAlignment(SwingConstants.CENTER);
        cajaTexto.setFont(new Font("Calibri",0,16));
        panel.add(cajaTexto);
    }
    
    private void colocarListas(){
        String[] divisas = {"Dólar (USD)", "Euro (EUR)", "Lempira (HNL)"};  // Se coloca un arreglo, siendo guardados en 0,1 y 2 respectivamente 
        lista1 = new JComboBox (divisas);
        lista1.setBounds(280, 200, 400, 50);
        lista1.setFont(new Font("Verdana",0,16));
        panel.add(lista1);        
        
        lista2 = new JComboBox (divisas);
        lista2.setBounds(280, 300, 400, 50);
        lista2.setFont(new Font("Verdana",0,16));
        lista2.setSelectedItem("Lempira (HNL)"); // Selecciona por defecto la moneda Lempira
        panel.add(lista2);
    }

    private void cajaTextoActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void botonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        valor = Double.parseDouble(cajaTexto.getText());       
        int divisa = lista1.getSelectedIndex ();
        int otradivisa = lista2.getSelectedIndex ();

        ConversionesDivisas conversiones = new ConversionesDivisas ();       
        conversiones.setValor(valor);
        conversiones.setDivisa(divisa);
        conversiones.setOtradivisa(otradivisa);
        
        conversiones.convertir();
        
        etiqueta5.setText("");
        
        etiqueta5.setText("" + conversiones.convertir());
    }
}