package ubp.doo.vista;

import java.awt.event.KeyEvent;
import ubp.doo.controlador.Controlador;

public interface InterfazVista {

    void setControlador(Controlador c);

    void iniciaVista();

    void imprimeMensaje(Exception... e);
    
    void limpiaVista();
    
    default void verificarInputTxt(KeyEvent e) {
        char c = e.getKeyChar();
        if (!((c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                || (c == KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB)
                || (Character.isDigit(c)))) {
            e.consume();
        }
    }
}
