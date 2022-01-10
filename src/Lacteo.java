public class Lacteo extends Producto {

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public int getProteinas(){
        return this.proteinas;
    }
}
