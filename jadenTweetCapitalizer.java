import java.util.HashMap;

public class jadenTweetCapitalizer {
	
	HashMap<String, String> jadenTweet = new HashMap<String, String>();
	
	jadenTweetCapitalizer(){
		jadenTweet.put("Jaden Smith","How Can Mirrors Be Real If Our Eyes Aren't Real");
		jadenTweet.put("Jaden Smith","Just Stare In The Mirror And Cry And You'll Be Good");
		jadenTweet.put("Jaden Smith","If A Bookstore Never Runs Out Of A Certain Book, Dose That Mean That Nobody Reads It, Or Everybody Reads It");
		
	}
	public HashMap getJadenTweetInfo() {
		return jadenTweet;
	}
}



