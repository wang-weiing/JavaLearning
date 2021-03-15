package kechengbiao;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Data implements TableModel {
	  private String[] title = {
			  "周一","周二","周三",  "周四",  "周五",  "周六",  "周日"
	  };
	//是一个 管理者数组  没有字符串
	  private String[][] data = new String[8][7];
	  public  Data() {
		  for (int i=0;i<data.length;i++) {
			  for (int j=0;j<data[i].length;j++) {
			    data[i][j]=" ";
			  }
		  }
	  }
	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO 自动生成的方法存根
		return String.class;
	}

	@Override
	public int getColumnCount() {
		return 7 ;
	}

	@Override
	public String getColumnName(int arg0) {
		//  返回表头
		
		return title[arg0];
	}

	@Override
	public int getRowCount() {
		return 8;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO 自动生成的方法存根
		return data[arg0][arg1];
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO 自动生成的方法存根
		return true ;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO 自动生成的方法存根
		 data[arg1][arg2]=(String)arg0;

	}

}
