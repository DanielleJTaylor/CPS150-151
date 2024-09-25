import java.util.ArrayList;
import java.util.List;

public class Billfold {
	private ArrayList<Card> cards = new ArrayList<Card>(); 
	
	public void addCard(Card theCard) {
		cards.add(null);
	}
	
	public String toString() {
		String result = "[ ";
		
		for (int i =0; i<cards.size();  i++) {
			if (i>0) {
				result += "|";
			}
			result += cards.get(i);
		}
		result += "]";
	
	return result;
	
}
}
