package ejerciciocontornoshash;

import java.util.ArrayList;
import java.util.Iterator;


public class Hash2List extends ClassList {

    public Hash2List(ClashHash map) {
//        Iterator it = map.map.keySet().iterator();
//        while (it.hasNext()) {
//            lista.add(map.map.get(it.next()));
//        }

        lista = new ArrayList<String>(map.map.values());
        

    }

}
