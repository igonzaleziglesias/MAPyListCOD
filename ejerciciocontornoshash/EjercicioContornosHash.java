package ejerciciocontornoshash;

public class EjercicioContornosHash {

    public static void main(String[] args) {
        ClashHash prueba1 = new ClashHash();
        ClassList prueba2 = new ClassList();

        prueba1.putValue(0, "1");
        System.out.println(prueba1.getValue(0));
        prueba2.putElement("1");
        System.out.println(prueba2.getElement(0));
        
        MostrarClassList mostrar = new MostrarClassList();
        mostrar.Mostrar(prueba2);
    }

}
