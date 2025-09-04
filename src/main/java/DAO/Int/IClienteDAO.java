package DAO.interfaces;
import Domain.Cliente;
import java.util.List;

public interface IClienteDAO {
    List <Cliente> listClientes();
    Cliente searchById(int id);
    boolean addClient (Cliente cliente);
    boolean updateClient(Cliente cliente);
    boolean deleteClient(int id);
}
