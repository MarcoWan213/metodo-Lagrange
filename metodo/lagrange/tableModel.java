
package metodolagrange;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author usuario
 */
public class tableModel extends AbstractTableModel{

    public static String[] columnas = {"i", "Temperatura", "Dencidad"};
    public ArrayList<Punto> datos = new ArrayList<Punto>();
    
    public tableModel() {
    }
    
    
    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Punto p = this.datos.get(i);
        switch(i1){
            case 0: return p.getI();
            case 1: return p.getX();
            case 2: return p.getY();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return super.isCellEditable(i, i1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }

    public void addPunto(Punto p){
        p.setI(this.datos.size());
        this.datos.add(p);
        this.fireTableRowsInserted(this.datos.size()-1, this.datos.size()-1);
        
    }
    
    
}
