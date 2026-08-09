interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

public class MultipleInheritance
        implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {

        System.out.println("Taking photo");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing music");
    }

    public static void main(String[] args) {

        MultipleInheritance phone =
                new MultipleInheritance();

        phone.takePhoto();
        phone.playMusic();
    }
}