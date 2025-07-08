package structural.design.pattern.adapter.pattern;


class VlcPlayer implements AdvancedMediaPlayer {
	
    public void play(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    
}
