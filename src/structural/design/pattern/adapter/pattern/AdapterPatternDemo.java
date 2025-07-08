package structural.design.pattern.adapter.pattern;

/*
   Structural Design Patterns in Java (and in general) are concerned with how classes and objects are composed 
   to form larger structures, while keeping the system flexible and efficient. These patterns help ensure that 
   components are organized in a way that makes them easier to work with, extend, and maintain.
 */

/*
  Adapter Pattern
	🔧 Purpose: Converts one interface into another expected by the client, enabling incompatible interfaces to work together.
	   Example: Adapting a SquarePeg to fit into a RoundHole by using a PegAdapter.

	✅ Real-World Analogy: You have a European plug and a US socket. An adapter allows the plug to fit the socket.
 */

/*
  🖥 Java Example: Suppose you have a modern media player that supports mp4, but you need it to support vlc and mp3 too.
 */
public class AdapterPatternDemo {
	
    public static void main(String[] args) {
    	
        MediaPlayer player = new AudioPlayer();
        player.play("mp4", "video.mp4");
        player.play("mp3", "music.mp3");
        player.play("vlc", "movie.vlc");
        player.play("avi", "clip.avi");
    }
}