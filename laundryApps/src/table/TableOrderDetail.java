package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.OrderDetail;

public class TableOrderDetail extends AbstractTableModel{
	List<OrderDetail> ls;
	private String[] columnNames = {"Id", "Jenis", "Quantity", "Total"};
	public TableOrderDetail(List <OrderDetail> ls) {
		this.ls = ls;
	}
	@Override
	public int getRowCount() {
		return ls.size();
	}
	@Override
	public int getColumnCount() {
		return 4;
	}
	public String getColumnName (int column) {
		return columnNames[column];
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return ls.get(rowIndex).getId();
		case 1:
			return ls.get(rowIndex).getJenis();
		case 2:
			return ls.get(rowIndex).getQty();
		case 3:
			return ls.get(rowIndex).getTotal();
		default :
		return null;
		}
	}
}