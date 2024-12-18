package level27;

import java.util.List;

public class Table {
    public class TableInterfaceWrapper implements TableInterface{
       TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface){
            this.tableInterface = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface{
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {

    }

}
