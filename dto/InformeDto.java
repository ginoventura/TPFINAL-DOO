package ubp.doo.dto;

public class InformeDto {
    private int idPedido;
    private String zona;
    private String medioPago;
    private String monto;

    public InformeDto() {
    }

    public InformeDto(String zona, String medioPago, String monto, int idPedido) {
        this.zona = zona;
        this.medioPago = medioPago;
        this.monto = monto;
        this.idPedido = idPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
}
