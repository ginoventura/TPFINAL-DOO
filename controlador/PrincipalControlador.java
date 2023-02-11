package ubp.doo.controlador;

import ubp.doo.modelo.Cliente;
import ubp.doo.modelo.Empleado;
import ubp.doo.modelo.Entrega;
import ubp.doo.modelo.Informe;
import ubp.doo.modelo.Modelo;
import ubp.doo.modelo.Pedido;
import ubp.doo.modelo.Producto;
import ubp.doo.vista.ConsultarCliente;
import ubp.doo.vista.GestionarEmpleados;
import ubp.doo.vista.GestionarEntregas;
import ubp.doo.vista.GestionarIngresos;
import ubp.doo.vista.GestionarPedidos;
import ubp.doo.vista.GestionarProductos;
import ubp.doo.vista.InterfazVista;
import ubp.doo.vista.InterfazVistaAbm;
import ubp.doo.vista.InterfazVistaPed;

public class PrincipalControlador extends Controlador {
    
    public PrincipalControlador(InterfazVista vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void consultarCliente (Controlador segundoControlador) {
        InterfazVistaAbm vista;
        Controlador control;
        
        this.MODELO = new Cliente();
        vista = new ConsultarCliente(null, true);
        control = new ClienteControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void gestionarPedidos (Controlador segundoControlador) {
        InterfazVistaPed vista;
        Controlador control;
        
        this.MODELO = new Pedido();
        vista = new GestionarPedidos(null, true);
        control = new PedidoControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void gestionarProductos (Controlador segundoControlador) {
        InterfazVistaAbm vista;
        Controlador control;
        
        this.MODELO = new Producto();
        vista = new GestionarProductos(null, true);
        control = new ProductoControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void gestionarEntregas (Controlador segundoControlador) {
        InterfazVistaAbm vista;
        Controlador control;
        
        this.MODELO = new Entrega();
        vista = new GestionarEntregas(null, true);
        control = new EntregaControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    
    public void gestionarEmpleados (Controlador segundoControlador) {
        InterfazVistaAbm vista;
        Controlador control;
        
        this.MODELO = new Empleado();
        vista = new GestionarEmpleados(null, true);
        control = new EmpleadoControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void gestionarIngresos (Controlador segundoControlador) {
        InterfazVistaAbm vista;
        Controlador control;
        
        this.MODELO = new Informe();
        vista = new GestionarIngresos(null, true);
        control = new InformeControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
}
