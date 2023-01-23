public class CicloFor {
    public static void main(String[] args) {
        String[] nombres ={"Facundo", "Nancy", "Eugenio", "Derbez"};

        for( String nombre: nombres){
            System.out.println("Hola " + nombre);
        }

        for(int i =0; i < nombres.length; i++){
            System.out.println("Hola buenos dias " + nombres[i]);
        }
    }
}
