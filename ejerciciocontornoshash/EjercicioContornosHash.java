package ejerciciocontornoshash;

public class EjercicioContornosHash {

    public static void main(String[] args) {
//        ClashHash prueba1 = new ClashHash();
//        ClassList prueba2 = new ClassList();
//
//        prueba1.putValue(0, "1");
//        System.out.println(prueba1.getValue(0));
//        prueba2.putElement("1");
//        System.out.println(prueba2.getElement(0));
//        
//        MostrarClassList mostrar = new MostrarClassList();
//        mostrar.Mostrar(prueba2);
//        
        
//        ClassList miLista = new ClassList();
//        miLista.putElement("Uno");
//        miLista.putElement("Dos");
//        miLista.putElement("Tres");
//        
//        MostrarClassList.Mostrar(miLista);
        
        ClashHash miHash = new ClashHash();
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");
        
        Hash2List miHash2List = new Hash2List(miHash);
        MostrarClassList.Mostrar(miHash2List);
    }

}
