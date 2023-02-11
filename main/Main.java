package ubp.doo.main;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.PrincipalControlador;
import ubp.doo.modelo.Cliente;
import ubp.doo.modelo.Modelo;
import ubp.doo.vista.InterfazVista;
import ubp.doo.vista.PaginaPrincipal;

public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Failed to initialize LaF");
                }
                //modelo:
                Modelo modelo = new Cliente();
                
                //vista:            
                InterfazVista vista = PaginaPrincipal.getInstancia();

                //controlador:
                Controlador control = new PrincipalControlador(vista, null);

                //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                vista.setControlador(control);

                //y arrancamos la interfaz:
                vista.iniciaVista();
            }
        });
    }   
}