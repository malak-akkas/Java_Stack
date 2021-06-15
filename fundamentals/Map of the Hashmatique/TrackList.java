import java.util.HashMap;

public class TrackList {
    public static void main(String[] args) {

        HashMap<String, String> tList = new HashMap<String, String>();

    // Add keys and values 
    tList.put("Le Temps Des Fleurs", " Dans une taverne du vieux Londres.... ");
    tList.put("Smile", "Light up your face with gladness, Hide every trace of sadness");
    tList.put("The impossible Dream", "To bear with unbearable sorrow, and to run where the brave dare not go");
    tList.put("I Have a Dream", "I Have a Dream, a song to sing");
//Retrieve one of the songs
    System.out.println(tList.get("Smile"));

    for (String i : tList.keySet()) {
        System.out.println("Track Name: " + i + " Lyrics: " + tList.get(i));
}

}
}