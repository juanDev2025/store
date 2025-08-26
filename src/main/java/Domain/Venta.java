package Domain;
import java.time.LocalDate;

public class Venta {
    private int id;
    private LocalDate saleDate;
    private int clientId;
    private int total;

    public  Venta (){}

    public Venta(int id) {
        this.id = id;
    }

    public Venta(int id, Cliente cliente,Detalles detalles) {
        this.id= id;
        this.saleDate = LocalDate.now();
        this.clientId = cliente.getId();
        this.total = detalles.getSubtotal();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", saleDate='" + saleDate + '\'' +
                ", clientId=" + clientId +
                ", total=" + total +
                '}';
    }
}
