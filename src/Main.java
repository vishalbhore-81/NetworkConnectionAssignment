public class Main {
    public static void main(String[] args) {
        HTTPConnection http = new HTTPConnection();
        FTPConnection ftp = new FTPConnection();
        WebSocketConnection wsc = new WebSocketConnection();

        Object[] connections = {http,ftp,wsc};

        NetworkManager networkManager = new NetworkManager(connections);

        System.out.println("Connecting All:");
        networkManager.connectAll();

        System.out.println();

        System.out.println("Send Message:");
        networkManager.sendAll("Hii Network..");

        System.out.println();

        System.out.println("Receiving Message:");
        networkManager.receiveAll();

        System.out.println();

        System.out.println("Disconnecting All:");
        networkManager.disconnectAll();


    }
}