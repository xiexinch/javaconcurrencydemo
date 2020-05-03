package chapter09;

public class Sinleton {
    private static Sinleton instance = new Sinleton();
    private static int x = 0;
    private static int y;

    private Sinleton() {
        x++;
        y++;
    }

    public static Sinleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Sinleton sinleton = Sinleton.getInstance();
        System.out.println(sinleton.x);
        System.out.println(sinleton.y);
    }

}
