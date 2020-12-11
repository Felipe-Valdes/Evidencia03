//Felipe Valdés Viveros Programación ICC 264-1 //
public class VenderorSopaipillas {
    public String nombre;
    public int precioSopaipilla, cantidadVendida,ganancias,pago,vuelto;

    public VenderorSopaipillas() {
    }

    public VenderorSopaipillas(String nuevoNombre){
    nombre = nuevoNombre;
        System.out.println("El nombre del vendedor es: "+nombre);
    }

    public int setPrecioSopaipilla(int nuevoPrecio){
        System.out.println("El precio de cada sopaipilla fue fijado en: "+nuevoPrecio+" pesos");
        precioSopaipilla = nuevoPrecio;
        return this.precioSopaipilla;
    }

    public int vender(int nuevaCantidadVendida){
        cantidadVendida = nuevaCantidadVendida;
        System.out.println("Se vendieron "+cantidadVendida+" sopaipillas");
        return this.cantidadVendida;
    }

    public int pagar(int nuevoPago){
        pago = nuevoPago;
        System.out.println("Se realizó el pago con: "+pago+" pesos");
        return this.pago;
    }

    public int calcularVuelto(){
        int precio = cantidadVendida*precioSopaipilla;
        vuelto = pago-precio;
        if (pago>=precio) {
            System.out.println("El vuelto es de: " + vuelto + " pesos");
        }else
            System.out.println("La cantidad pagada no es suficiente");
            return this.vuelto;
    }

    public int getGanancias(){
        ganancias = cantidadVendida*precioSopaipilla;
        System.out.println("Las ganancias fueron de: "+ganancias+" pesos");
        return ganancias;
    }

}
//Felipe Valdés Viveros Programación ICC 264-1 //

