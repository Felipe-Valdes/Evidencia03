public class EjemploSopaipillas {

    public static void main(String[] args) {
        VenderorSopaipillas MiVendedor = new VenderorSopaipillas("Juan");
        MiVendedor.setPrecioSopaipilla(350);
        MiVendedor.vender(4);
        MiVendedor.pagar(1400);
        MiVendedor.calcularVuelto();
        MiVendedor.getGanancias();

    }

}

//Felipe Valdés Viveros Programación ICC 264-1//