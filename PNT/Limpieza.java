public class Limpieza extends Productos{
    private int contenido;
    private String medida;

    public Limpieza(String nombre,int precio,int contenido, String medida){
        super(nombre, precio);    
        this.contenido = contenido;    
        this.medida = medida;
    }

    public int getContenido(){
        return this.contenido;
    }

    public String getMedida(){
        return this.medida;
    }
    
    public String toString(){
        return "Nombre: " + this.getNombre() + " /// Contenido: " + this.getContenido() + this.getMedida() + " /// Precio: $" + this.getPrecio();
    }
    
}