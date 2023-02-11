package ubp.doo.dao;

public interface Dao {
    default void abrirConexion() {
        
    }
    
    default void cerrarConexion() {
        ConexionSql.getInstancia().desconectar();
    };
}
