package jadenSmithTest;

import java.util.ArrayList;

public class smithMain {
	
	public static void main(String[]args) {
		smithQuotes jadenQuotes = new smithQuotes();
		smithPage jadenPage = new smithPage();
		
		ArrayList<String> jadenArray = jadenQuotes.getSmithQuotes();
		
		String[] jadenData = jadenArray.toArray(new String[0]);
		
		jadenPage.setListData(jadenData);
		
		jadenPage.jadenizeButton();
		
	}

}
