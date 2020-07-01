public class Productos implements Comparable<Productos>{
    private final String nombre;	
    private int precio;

    public Productos(String nombre,int precio){
        this.nombre = nombre;
        this.precio = precio;
    }    

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int compareTo(Productos producto){
        return Integer.compare(this.precio, producto.precio);
    }

    
}