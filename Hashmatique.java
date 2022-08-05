import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("The Command", "Memphis May Fire");
        trackList.put("Better off Now", "Pillar");
        trackList.put("Bones Exposed", "Of Mice & Men");
        trackList.put("Prisoner", "Dance Gavin Dance");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            //System.out.println(key);
            System.out.println(String.format("Title: %s| Artist:%s", key,trackList.get(key)));
        }
    }
}