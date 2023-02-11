package ubp.doo.dao;

import java.lang.reflect.InvocationTargetException;

public abstract class FabricaDao {

    public static Dao getDao(String nombreClase){
        try {            
            return (Dao) Class.forName(FabricaDao.class.getPackageName() + "." + nombreClase).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.err.println(e);
            throw new IllegalArgumentException();
        }
    }
}
