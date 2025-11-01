import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SampleMusicPlayer {
    public static void main(String[] args) {

        String filepath = "src\\filename.wav";
        File file = new File(filepath);

        try(Scanner sc = new Scanner(System.in)) {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while (!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = sc.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("You chosen Invalid option");
                }
            }

        }
        catch (FileNotFoundException f){
            System.out.println("Could not locate file");
        }
        catch (UnsupportedAudioFileException u){
            System.out.println("Audio file not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access the audio resource");
        }
        catch (IOException e){
            System.out.println("Something was wrong");
        }
        finally {
            System.out.println("Bye!!");
        }

    }
}
