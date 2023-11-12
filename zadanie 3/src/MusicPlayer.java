public abstract class MusicPlayer {
    protected Device device;

    public MusicPlayer(Device device) {
        this.device = device;
    }

    public abstract void playMusic();
}
