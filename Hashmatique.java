import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("I Love a Rainy Night", "I love to hear the thunder" );
        trackList.put("Blue Monday", "Tell me, how do I feel?");
        trackList.put("Counting Stars", "Everything that kills me makes me feel alive");
        trackList.put("Paint it Black", "I see a red door");

        String lyrics = trackList.get("Counting Stars");
        System.out.println("Lyrics are: " + lyrics);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}