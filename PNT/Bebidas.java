public class Bebidas extends Productos {    
    private double contenido;
    
    public Bebidas(String nombre, int precio, double contenido){
        super(nombre, precio);        
        this.contenido = contenido;

    }
    public double getContenido(){
        return contenido;
    }

    public String toString(){
        return "Nombre: " + this.getNombre() + " /// Litros: " + this.getContenido() + " /// Precio: $" + this.getPrecio();
    }
}