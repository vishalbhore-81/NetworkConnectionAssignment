public class HTTPConnection implements Connectable, Disconnectable, Sendable, Receivable{
    public void connect() {
        System.out.println("HTTP Connection Connect..");
    }
    public void disconnect() {
        System.out.println("HTTP Connction disconnct..");
    }

    public void  send(String message) {
        System.out.println("HTTP Message is print:" + " " + message);
    }

    @Override
    public void receive() {
        System.out.println("HTTP connection is receive..");
    }
}
