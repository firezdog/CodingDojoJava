import java.util.HashMap;
import java.util.Set;

public class Hash {

    public static void main(String[] args) {
        
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        trackList.put("Song1", "Lyrics1");
        trackList.put("Song2", "Lyrics2");
        trackList.put("Song3", "Lyrics3");
        trackList.put("Song4", "Lyrics4");
        System.out.println(trackList.get("Song1"));
        
        Set<String> trackListKeys = trackList.keySet();

        for (String key : trackListKeys) {
            System.out.printf("%s: %s", key, trackList.get(key));
            System.out.println();
        }

    
    }

}