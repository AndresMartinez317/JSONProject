
package groceryapp;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author sn-cm
 */
public class ButtonRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JButton ){
            return (JButton) value;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }
    
    
}
