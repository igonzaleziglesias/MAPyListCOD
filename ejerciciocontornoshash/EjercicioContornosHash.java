package ejerciciocontornoshash;

public class EjercicioContornosHash {

    public static void main(String[] args) {

//        ClashHash miHash = new ClashHash();
//        miHash.putValue(10, "uno");
//        miHash.putValue(11, "dos");
//        miHash.putValue(12, "tres");
//        
//        Hash2List miHash2List = new Hash2List(miHash);
//        MostrarClassList.Mostrar(miHash2List);
//
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
        ClashHash miHash = new ClashHash();
        miHash.putValue(10, "uno");
        miHash.putValue(11, "dos");
        miHash.putValue(12, "tres");
        
        Hash2List miHash2List = new Hash2List(miHash);
        MostrarClassList.Mostrar(miHash2List);
    }

}
