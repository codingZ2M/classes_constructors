package structural.design.pattern.adapter.pattern;



class MediaAdapter implements MediaPlayer {
	
    AdvancedMediaPlayer advancedPlayer;

    MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedPlayer = new VlcPlayer();
        else if(audioType.equalsIgnoreCase("mp3"))
            advancedPlayer = new Mp3Player();
    }

    public void play(String audioType, String fileName) {
        advancedPlayer.play(fileName);
    }
}
