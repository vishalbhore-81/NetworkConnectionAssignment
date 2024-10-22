public class FTPConnection implements Connectable, Disconnectable, Sendable{
    @Override
    public void connect() {
        System.out.println("FTP Connction is connect..");
    }

    @Override
    public void disconnect() {
        System.out.println("FTP Connction is disconnct..");
    }

    @Override
    public void send(String message) {
        System.out.println("FTP message is print:" +" " + message);
    }

}
