/**
 * @author mketzalli
 */

//importar librerias
import javax.swing.*;
import java.awt.event.*;
//creacion de clase menu que podra crear ventanas y generar eventos
public class Menu extends JFrame implements ActionListener {
    //declaracion de botones y etiqueta
    private JButton ventas, inventario, personal, salir;
    private JLabel pruebas;
    //creacion de metodo constructor
    public Menu() {
        //creacion de una ventana basica (los componentes creados no se ajustan)
        setLayout(null);
        //inicializacion de botones
        ventas = new JButton("Ventas");
        inventario = new JButton("Inventario");
        personal = new JButton("Personal");
        salir = new JButton("Salir");
        //ubicacion y dimensiones de botones
        ventas.setBounds(50, 10, 100, 30);
        inventario.setBounds(50, 60, 100, 30);
        personal.setBounds(50, 110, 100, 30);
        salir.setBounds(50, 160, 100, 30);
        //agregar botones
        add(ventas);
        add(inventario);
        add(personal);
        add(salir);
        //aviso de escucha a botones
        ventas.addActionListener(this);
        inventario.addActionListener(this);
        personal.addActionListener(this);
        salir.addActionListener(this);
        //inicializacion etiqueta
        pruebas = new JLabel("esperando");
        //ubicacion y dimension de etiqueta
        pruebas.setBounds(50, 200, 300, 30);
        //agregar etiqueta
        add(pruebas);
    }
    //añadir la funcion al evento detectado
    public void actionPerformed(ActionEvent e) {
        //si el evento detectado ocurrio en ventas
        if (e.getSource() == ventas) {
            //el texto de la etiqueta cambiara
            pruebas.setText("ventas presionado");
        }
        //si el evento detectado ocurrio en inventario
        if (e.getSource() == inventario) {
            //el texto de la etiqueta cambiara
            pruebas.setText("inventario presionado");
        }
        //si el evento detectado ocurrio en personal
        if (e.getSource() == personal) {
            //el texto de la etiqueta cambiara
            pruebas.setText("personal presionado");
        }
        //si el evento detectado ocurrio en salir
        if (e.getSource() == salir) {
            //el programa se cerrara
            System.exit(0);
        }
    }
    //creacion de metodo main
    public static void main(String[] args) {
        //creacion de objeto menu
        Menu menu = new Menu();
        //definicion de tamaño de menu
        menu.setBounds(0, 0, 200, 300);
        //visibilidad de menu
        menu.setVisible(true);
        //menu alineado al centro de la pantalla
        menu.setLocationRelativeTo(null);
        //evitar modificar tamaño de menu
        menu.setResizable(false);
    }
}
