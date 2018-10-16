package com.darian.BaTJ_face_Question._11_bIONioAio;


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <br>
 * <br>Darian
 **/
public class BIOServer {

    private final  static Map<ServerSocket,String> socketMap= new HashMap<>();

    public static void main(String[] args) {

    }

    public static void server1() {
        ServerSocket server = null;
        Socket socket = null;
        InputStream in = null;
        OutputStream out = null;
        try {
            server = new ServerSocket(8000);
            System.out.println("服务端启动成功，监听端口为 8000，等待客户端连接......");
            socket = server.accept();
            in = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            // 读取客户端的数据
            while ((len = in.read(buffer)) > 0) {
                System.out.println(buffer.toString());
            }
            // 向客户端写数据
            out = socket.getOutputStream();
            out.write("hello everybody!".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void server2() {
        ServerSocket server = null;
        try {
            server = new ServerSocket(8000);
            System.out.println("服务端启动成功，监听端口为 8000，等待客户端连接......");
            while (true) {
                Socket socket = server.accept();
                new Thread(new ServerHandler(socket)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void server3() {
        ServerSocket server = null;
        ExecutorService executorService = Executors.newFixedThreadPool(60);
        try {
            server = new ServerSocket(8000);
            System.out.println("服务端启动成功，监听端口为 8000，等待客户端连接......");
            while (true) {
                Socket socket = server.accept();
                executorService.execute(new ServerHandler(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void server4() {
        ServerSocket server = null;
        ExecutorService executorService = Executors.newFixedThreadPool(60);
        try {
            server = new ServerSocket(8000);

            System.out.println("服务端启动成功，监听端口为 8000，等待客户端连接......");
            while (true) {
                Socket socket = server.accept();

                socketMap.put(server,"connected");
                // 如果你需要 IO  操作的时候，我才为你创建线程
                executorService.execute(new ServerHandler(socket));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
