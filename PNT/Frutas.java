public class Frutas extends Productos{
    private String medida;

    public Frutas(String nombre,int precio, String medida){
        super(nombre, precio);
        this.medida = medida;
    }

    public String getMedida(){
        return this.medida;
    }
    
    public String toString(){
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: " + this.getMedida();
    }
    
}