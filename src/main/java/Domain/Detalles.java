package Domain;
import Domain.Producto;

public class Detalles {
    private int id;
    private int ventaId;
    private int productId;
    private int cantidades;
    private int subtotal;

    public  Detalles(int id){
        this.id= id;
    }

    public Detalles(int id, int ventaId, Producto producto,int cantidades) {
        this.id= id;
        this.ventaId = ventaId;
        this.productId = producto.getProductId();
        this.cantidades = cantidades;
        this.subtotal = producto.getPrecio() * this.cantidades;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(Producto productId) {
        this.productId = productId.getProductId();
    }

    public int getCantidades() {
        return cantidades;
    }

    public void setCantidades(int cantidades) {
        this.cantidades = cantidades;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Producto producto) {
        int productoPrecio= producto.getPrecio();
        this.subtotal = productoPrecio + getCantidades();
    }

    @Override
    public String toString() {
        return "Detalles{" +
                "id=" + id +
                ", ventaId=" + ventaId +
                ", productId=" + productId +
                ", cantidades=" + cantidades +
                ", subtotal=" + subtotal +
                '}';
    }
}
