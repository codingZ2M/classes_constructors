package structural.design.pattern.adapter.pattern;

class Mp3Player implements AdvancedMediaPlayer {
	
    public void play(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
    
}