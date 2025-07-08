package structural.design.pattern.adapter.pattern;

class AudioPlayer implements MediaPlayer {
	
	@Override
    public void play(String audioType, String fileName) {
    	
        if(audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file: " + fileName);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp3")) {
            MediaAdapter adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid format: " + audioType);
        }
    }
    
}