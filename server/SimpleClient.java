public class SimpleClient{
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleClient(String ip, int port){
        socket.connect(ip,port);
    }

    public void sendMessage(String msg){
        
    }
}