import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Productos> listaProductos = new ArrayList<Productos>();
        
        listaProductos.add(new Bebidas("Coca-Cola Zero", 20, 1.5));
        listaProductos.add(new Bebidas("Coca-Cola", 18, 1.5));
        listaProductos.add(new Limpieza("Shampoo Sedal", 19, 500, "ml"));
        listaProductos.add(new Frutas ("Frutillas", 64, "kilo"));

        for(Productos e: listaProductos){
            System.out.println(e.toString());
        }
        System.out.println("=============================");
        
        System.out.println("Producto mas caro: " + Collections.max(listaProductos).getNombre());
        System.out.println("Producto mas barato: " + Collections.min(listaProductos).getNombre());

    }
}
