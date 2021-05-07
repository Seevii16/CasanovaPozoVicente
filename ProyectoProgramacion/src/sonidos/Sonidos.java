package sonidos;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class Sonidos {

	public static void sonido(){
		try {
		File sound = new File(".\\src\\sonidos\\kimetsu.wav");
        Clip c = AudioSystem.getClip();
        c.open(AudioSystem.getAudioInputStream(sound));
        c.start();
        
		}catch(LineUnavailableException |UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
	}
}
			
		

