package basic.multithreading.example;

//Multithreading is best suitable at programming level.
//Java already defined API for multithreading 
class Video {
	static void playVideo() {
		System.out.println("Video started");
	}
}

class Music {
	static void playMusic() {
		System.out.println("Music Played");
	}
}

public class VLC {

	public static void main(String[] args) {
		Video.playVideo();
		Music.playMusic();
	}

}
