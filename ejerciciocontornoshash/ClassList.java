package ejerciciocontornoshash;

import java.util.ArrayList;

public class ClassList implements InterfaceList {

    public ArrayList<String> lista = new ArrayList<String>();

    @Override
    public void putElement(String e) {
        lista.add(e);
    }

    @Override
    public String getElement(int pos) {
        return lista.get(pos);
    }
       

}
