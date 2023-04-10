package com.javarush.task.task18.task1815;

import java.io.IOException;
import java.util.List;

/* 
Таблица
*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) throws IOException {
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
}