public class Game {
    public static void main(String[] args) {
        Game one = new Game();
        one.play();
    }
    public void play(){
        final int width = 1000;
        final int height = 800;
        GameViewer GV = new GameViewer(width,height);
    }
}