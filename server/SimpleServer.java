import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleServer(int port)throws Exception{
        serverSocket=new ServerSocket(port);
    }
    
    public void acceptClient()throws Exception{
        socket=serverSocket.accept();
        in=new Scanner(socket.getInputStream());
        out=new PrintWriter(socket.getOutputStream());
    }

    public String receiveMessage(){
        return in.nextLine();
    }

    public void sendMessage(String msg){
        out.println(msg);
    }

    public void close() throws Exception{
        serverSocket.close();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws Exception{
        SimpleServer smp = new SimpleServer(port:9090);
        smp.acceptClient();
        while(true){
            smp.sendMessage(msg: "hello");
            String msg=smp.receiveMessage();
            System.out.println("Reply"+msg);
            if(msg.equals("stop")){
                break;
            }
        }
        smp.close();
    }
}