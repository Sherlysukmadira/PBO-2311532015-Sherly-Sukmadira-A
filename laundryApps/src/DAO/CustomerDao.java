package DAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Customer;

public interface  CustomerDao {
	void save(Customer customer);
	public List<Customer> show();
	public void delete(String id);
	public void update(Customer customer);
}
