package ejerciciocontornoshash;

public class MostrarClassList {

    public void Mostrar(ClassList list) {

        System.out.println("indice elemento");
        for (int i=0;i<=list.lista.size()-1;i++) { 
            System.out.println(i+"      "+list.getElement(i));
        }

    }

}
