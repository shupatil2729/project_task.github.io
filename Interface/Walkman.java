package Interface;

public class Walkman implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("play music through DVD");
    }

    @Override
    public void pause() {
        System.out.println("play music through DVD");
    }

    @Override
    public void forward() {
        System.out.println("play next music song");
    }

    @Override
    public void backward() {
        System.out.println("play privius music song");
    }
}
