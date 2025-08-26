package Domain;

public class Producto {
    private int productId;
    private String name;
    private int precio;
    private int units;

    public Producto(){}

    public Producto(int productId) {
        this.productId = productId;
    }

    public Producto(String name, int precio, int units) {
        this.name = name;
        this.precio = precio;
        this.units = units;
    }

    public Producto (int productId,String name, int precio, int units){
        this(name, precio, units);
        this.productId= productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                ", units=" + units +
                '}';
    }
}



