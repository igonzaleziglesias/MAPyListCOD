package ejerciciocontornoshash;

import java.util.HashMap;

public class ClashHash implements InterfaceHash {


    public HashMap<Integer, String> map = new HashMap<Integer, String>();


    @Override
    public void putValue(int indice, String dato) {
        map.put(indice, dato);
    }

    @Override
    public String getValue(int indice) {
        return map.get(indice);
    }


}
