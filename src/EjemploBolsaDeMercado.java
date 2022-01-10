
import java.util.Scanner;

public class EjemploBolsaDeMercado {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer tipo;

        BolsaDeMercado<Fruta> bolsaFrutas = new BolsaDeMercado<>();
        BolsaDeMercado<Lacteo> bolsaLacteos = new BolsaDeMercado<>();
        BolsaDeMercado<Limpieza> bolsaLimpieza = new BolsaDeMercado<>();
        BolsaDeMercado<NoPerecederos> bolsaNoPerecederos = new BolsaDeMercado<>();

        int ind;
        System.out.println("¿Desea iniciar el registro de la compra?" +
                "\nMarque (1) para comenzar o (0) para cerrar este menú");
        ind = s.nextInt();
        s.nextLine();

        while(ind != 0) {

            System.out.println("**** Registre los productos ****");
            System.out.println("\nTipo de producto: " +
                    "\n1- Fruta" + "\n2- Lacteo" + "\n3- Limpieza"
                    + "\n4- No Perecedero");

            tipo = s.nextInt();
            s.nextLine();


            System.out.println("Leyendo nombre del producto... ");
            String nombre = s.nextLine();
            System.out.println("Leyendo precio del product... ");
            double precio = s.nextDouble();
            s.nextLine();

            switch (tipo){
                case 1:
                    System.out.println("Leyendo el peso... ");
                    double peso = s.nextDouble();
                    s.nextLine();
                    System.out.println("Leyendo el color... ");
                    String color = s.nextLine();
                    bolsaFrutas.addProducto(new Fruta(nombre,precio,peso,color));
                    break;
                case 2:
                    System.out.println("Leyendo la cantidad... ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    System.out.println("Leyendo las proteinas...");
                    int proteinas = s.nextInt();
                    s.nextLine();
                    bolsaLacteos.addProducto((new Lacteo(nombre,precio,cantidad,proteinas)));
                    break;
                case 3:
                    System.out.println("Leyendo los compoenentes....");
                    String compoenentes = s.nextLine();
                    System.out.println("Leyendo los litros...");
                    double litros = s.nextDouble();
                    s.nextLine();
                    bolsaLimpieza.addProducto(new Limpieza(nombre,precio,compoenentes,litros));
                    break;
                case 4:
                    System.out.println("Leyendo el contenido...");
                    int contenido = s.nextInt();
                    s.nextLine();
                    System.out.println("Leyendo las calorias...");
                    int calorias = s.nextInt();
                    s.nextLine();
                    bolsaNoPerecederos.addProducto(new NoPerecederos(nombre,precio,contenido,calorias));
                    break;
            }

            System.out.println("\n(1) registrar nuevo producto o (0) para finalizar");
            ind = s.nextInt();
            s.nextLine();
            if(ind == 0){
                for(Fruta f: bolsaFrutas.getProductos()){
                    System.out.println("************** FRUTAS ************");
                    System.out.println("nombre: " + f.getNombre());
                    System.out.println("precio: " + f.getPrecio());
                    System.out.println("Peso: " + f.getPeso());
                    System.out.println("Color: " + f.getColor());
                }
                for(Lacteo l: bolsaLacteos.getProductos()){
                    System.out.println("************* LACTEOS ************");
                    System.out.println("nombre: " + l.getNombre());
                    System.out.println("precio: " + l.getPrecio());
                    System.out.println("Cantidad: " + l.getCantidad());
                    System.out.println("Proteinas: " + l.getProteinas());
                }
                for(Limpieza l: bolsaLimpieza.getProductos()){
                    System.out.println("************* LIMPIEZA ***********");
                    System.out.println("nombre: " + l.getNombre());
                    System.out.println("precio: " + l.getPrecio());
                    System.out.println("Componentes: " + l.getComponentes());
                    System.out.println("Litros: " + l.getLitros());
                }
                for(NoPerecederos n: bolsaNoPerecederos.getProductos()){
                    System.out.println("************ LIMPIEZA ************");
                    System.out.println("nombre: " + n.getNombre());
                    System.out.println("precio: " + n.getPrecio());
                    System.out.println("Contenido: " + n.getContenido());
                    System.out.println("Calorías: " + n.getCalorias());
                }
            }
        }



    }
}
