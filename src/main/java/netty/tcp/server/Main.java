package netty.tcp.server;

public class Main {

    public static void main(String[] args) {
        try {
            SimpleNettyServerBootstrap simpleNettyServerBootstrap = new SimpleNettyServerBootstrap();
            simpleNettyServerBootstrap.start(8080);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
