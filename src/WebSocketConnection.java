public class WebSocketConnection implements Connectable, Disconnectable, Sendable, Receivable{
    @Override
    public void connect() {
        System.out.println("WebSocket connction is connect..");
    }

    @Override
    public void disconnect() {
        System.out.println("WebSocket connection is disconnect..");
    }

    @Override
    public void send(String message) {
        System.out.println("WebSocket message is print:" +" "+ message);
    }

    @Override
    public void receive() {
        System.out.println("WebSocket Connetion is receive..");
    }
}
