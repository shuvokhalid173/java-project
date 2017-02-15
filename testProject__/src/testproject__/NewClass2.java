
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class NewClass2 {
    public static void main (String [] args ) throws FileNotFoundException, IOException {
        InputStream in = new FileInputStream (""); 
        AudioStream a = new AudioStream (in); 
        AudioPlayer.player.start(a);
    }
}
