import java.util.ArrayList;
import java.util.List;

public class BolsaDeMercado<T> {

    private List<T> bolsaMercado;
    private int max = 5;

    public BolsaDeMercado(){
        this.bolsaMercado = new ArrayList<>();
    }

    public void addProducto(T t){
        if (this.bolsaMercado.size() <= max) {
            this.bolsaMercado.add(t);
        } else {
            throw new RuntimeException("La bolsa no tiene más espacio.");
        }
    }

    public List<T> getProductos(){
        return this.bolsaMercado;
    }
}
