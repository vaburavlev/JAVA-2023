public class Main {
    public static void main(String[] args) {
        Device mediaPlayer = new MediaPlayer();
        Device speakers = new Speakers();
        Device headphones = new Headphones();

        MusicPlayer mediaPlayerPlayer = new MediaPlayerPlayer(mediaPlayer);
        MusicPlayer speakersPlayer = new SpeakersPlayer(speakers);
        MusicPlayer headphonesPlayer = new HeadphonesPlayer(headphones);

        mediaPlayerPlayer.playMusic();
        System.out.println("--------------");
        speakersPlayer.playMusic();
        System.out.println("--------------");
        headphonesPlayer.playMusic();
    }
}