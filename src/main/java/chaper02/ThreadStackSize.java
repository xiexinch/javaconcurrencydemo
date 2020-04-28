package chaper02;

public class ThreadStackSize {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter the stack size.");
            System.exit(1);
        }

        ThreadGroup group = new ThreadGroup("TestGroup");
        Runnable runnable = new Runnable() {
            final int MAX = Integer.MAX_VALUE;
            @Override
            public void run() {
                int i = 0;
                recurse(i);
            }
            private void recurse(int i) {
                System.out.println(i);
                if (i < MAX) {
                    recurse(i + 1);
                }
            }
        };
        Thread thread = new Thread(group, runnable, "Test", Integer.parseInt(args[0]));
        thread.start();
    }
}
