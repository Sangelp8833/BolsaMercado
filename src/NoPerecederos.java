public class NoPerecederos extends Producto{

    private int contenido;
    private int calorias;

    public NoPerecederos(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getContenido(){
        return this.contenido;
    }

    public int getCalorias(){
        return this.calorias;
    }
}
