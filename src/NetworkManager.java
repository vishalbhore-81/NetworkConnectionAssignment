public class NetworkManager {
    private Object[] connections;

    public NetworkManager(Object[] connections) {
        this.connections = connections;
    }

    public void connectAll() {
        for(Object connection : connections) {
            if(connection instanceof Connectable) {
                ((Connectable)connection).connect();
            }
        }
    }

    public void sendAll(String message) {
        for(Object connection : connections) {
            if(connection instanceof Sendable) {
                ((Sendable)connection).send(message);
            }
        }
    }

    public void receiveAll() {
        for(Object connection : connections) {
            if(connection instanceof Receivable) {
                ((Receivable)connection).receive();
            }
        }
    }

    public void disconnectAll() {
        for(Object connection : connections ) {
            if(connection instanceof  Disconnectable) {
                ((Disconnectable)connection).disconnect();
            }
        }
    }


}
