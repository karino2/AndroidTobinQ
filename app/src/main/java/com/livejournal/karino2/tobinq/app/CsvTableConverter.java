package com.livejournal.karino2.tobinq.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karino on 4/14/14.
 */
public class CsvTableConverter {
    CsvTable table;
    public enum DataType {
        NUMERIC,
        STRING,
        UNDEFINED
    }


    ArrayList<DataType> colTypes = new ArrayList<DataType>();

    public CsvTableConverter(CsvTable table) {
        this.table = table;
    }

    private void setupColsNames(CsvTable table, QObject rowNames,
                                       ArrayList<QList> cols, QObjectBuilder nameBldr) {
        for(int i = 0; i < table.getColNum(); i++)
        {
            QList col = QList.createDataFrame();
            col.set(0, QObject.createNumeric(0));

            QObject name = null;
            name = QObject.createCharacter(table.getCell(0, i));

            nameBldr.add(name);
            col.setNamesAttr(name);
            col.setRowNamesAttr(rowNames);
            cols.add(col);
        }
    }

    void copyDatas(CsvTable table, ArrayList<QList> cols) {
        for(int row = 0; row < table.getRowNum()-1; row++)
        {
            for(int col = 0; col < table.getColNum(); col++)
            {
                if(table.isNA(row+1, col))
                    cols.get(col).rawSetByRowCol(row, 0, QObject.NA.QClone());
                else {
                    if(DataType.NUMERIC == getColumnType(col)) {
                        cols.get(col).rawSetByRowCol(row, 0, QObject.createNumeric(table.getCellNumeric(row + 1, col)));
                    } else {
                        cols.get(col).rawSetByRowCol(row, 0, QObject.createCharacter(table.getCell(row + 1, col)));
                    }
                }
            }
        }
    }

    public QList doConvert() {
        QList ret = QList.createDataFrame();
        ArrayList<QList> cols = setupRowCols(ret);
        guessColumnTypes();

        copyDatas(table, cols);

        for(int k = 0; k < table.getColNum(); k++)
        {
            ret.set(k, cols.get(k));
        }
        return ret;

    }

    // make public for test purpose.
    public void guessColumnTypes() {
        for(int col=0; col < table.getColNum(); col++) {
            guessOneColumnType(col);
        }
    }

    public DataType getColumnType(int col) {
        return colTypes.get(col);
    }

    private void guessOneColumnType(int col) {
        for(int row =1; row < table.getRowNum(); row++) {
            try {
                String cell = table.getCell(row, col);
                if (table.isNA(row, col))
                    continue;

                try {
                    Integer.parseInt(cell);
                    colTypes.add(col, DataType.NUMERIC);
                    return;
                } catch (NumberFormatException ne) {

                }
                try {
                    Double.parseDouble(cell);
                    colTypes.add(col, DataType.NUMERIC);
                    return;
                } catch (NumberFormatException ne) {

                }
                colTypes.add(col, DataType.STRING);
            }catch(IndexOutOfBoundsException ie) {
                continue;
            }
        }
        // unknown. treat as string.
        colTypes.add(col, DataType.STRING);
    }

    private ArrayList<QList> setupRowCols(QList ret) {
        QObject rowNames = setupRowNames(ret);

        ArrayList<QList> cols = new ArrayList<QList>();
        setupColNames(ret, rowNames, cols);
        return cols;
    }

    private void setupColNames(QList ret, QObject rowNames, ArrayList<QList> cols) {
        QObjectBuilder nameBldr = new QObjectBuilder();

        setupColsNames(table, rowNames, cols, nameBldr);
        ret.setNamesAttr(nameBldr.result());
    }

    private QObject setupRowNames(QList ret) {
        QObject rowNames = QList.defaultRowNames(table.getRowNum());
        ret.setRowNamesAttr(rowNames);
        return rowNames;
    }
}
