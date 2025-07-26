public class TiendaCafe {
    public static void main(String[] args) throws Exception {
        cafe cafe1 = new cafe("Café Arábica", "Colombia", 15.50, 10);
        cafe cafe2 = new cafe("Café Robusta", "Brasil", 12.30, 20);
        cafe cafe3 = new cafe("Café Liberica", "Filipinas", 18.00, 5);

        System.out.println("--------------------------------");
        cafe1.mostrarInformacion();
        System.out.println();
        System.out.println("Precio total: " + cafe1.calcularPrecioTotal());
        System.out.println();

        System.out.println("--------------------------------");
        cafe2.mostrarInformacion();
        System.out.println();
        System.out.println("Precio total: " + cafe2.calcularPrecioTotal());
        System.out.println();

        System.out.println("--------------------------------");
        cafe3.mostrarInformacion();
        System.out.println();
        System.out.println("Precio total: " + cafe3.calcularPrecioTotal());
        System.out.println();
        // Actualizar la cantidad de café en kilos
        System.out.println("--------------------------------");
        System.out.println("Actualizando la cantidad de café 1...");
        cafe1.actualizarCantidad(15);
        System.out.println("Cantidad actualizada de café 1: " + cafe1.cantidadEnKilos);
         System.out.println("Nuevo precio total: " + cafe1.calcularPrecioTotal());
        System.out.println();
    }
}
