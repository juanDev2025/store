import Domain.Cliente;
import Domain.Detalles;
import Domain.Producto;
import Domain.Venta;
public class Main {


    public static void main(String[] args) {

        Cliente juan = new Cliente(1, "Juan", "torres", "@gmail", "Bogotá" );
        Producto cellphoner= new Producto( 1, "celular", 200000, 20 );
        Detalles det= new Detalles(1, 1, cellphoner, 4 );
        Venta sale= new Venta(1, juan, det);

        System.out.println(det.toString());
        System.out.println(sale.toString());
    }
}
