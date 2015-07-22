package com.livejournal.karino2.tobinq.app;

import java.io.Serializable;

public class CsvTable implements Serializable {
	private static final long serialVersionUID = -4495806481680407463L;
	String[][] m_lines;
	public CsvTable(String[][] lines) {
		m_lines = lines;
	}
	public int getRowNum() { return m_lines.length; }
	public int getColNum() 
	{
		if(m_lines.length == 0)
			return 0;
		return m_lines[0].length; 
	}
	public boolean isNA(int row, int col) {
		String cellVal = getCell(row, col);
		return cellVal.equals("...") || cellVal.equals("");
	}
	public double getCellNumeric(int row, int col) {
		return Double.parseDouble(getCell(row, col));
	}
	public String getCell(int row, int col) { 
		return m_lines[row][col];
		/*
		String[][] ret = {{"00", "01", "02"}, {"10", "11", "12" }};
		return ret[row][col];
		*/
	}
}
