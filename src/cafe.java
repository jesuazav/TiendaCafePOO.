public class cafe {
String nombre;
String region;
double precioPorKilo;
int cantidadEnKilos;

public cafe( String nombre, String region, double precioPorKilo, int cantidadEnKilos) {
    this.nombre=nombre;
    this.region=region;
    this.precioPorKilo=precioPorKilo;
    this.cantidadEnKilos=cantidadEnKilos;

}

public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Región: " + region);
    System.out.println("Precio por kilo: " + precioPorKilo);
    System.out.println("Cantidad en kilos: " + cantidadEnKilos);


}

public double calcularPrecioTotal() {
    return precioPorKilo * cantidadEnKilos;

}

public void actualizarCantidad(int nuevaCantidad) {
    this.cantidadEnKilos = nuevaCantidad;

}

}
