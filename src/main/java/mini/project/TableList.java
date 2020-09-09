package mini.project;

import java.util.ArrayList;

public class TableList {
	
	final int CAPACITY= 13;
	ArrayList<Integer> tableList = new ArrayList<>(CAPACITY);
	int tableNum;
	
	
	public TableList findByNum(int value) {
	    Object[] tables = tableList.toArray();

	    for (Object obj : tables) {
	    	
	      if (value == (int)obj) {
	        return ;
	      }
	    }
	    return null;
	  }

}
