package com.neuedu.soket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		try {
			//创建一个服务器
			ServerSocket server =new ServerSocket(8989);
			while(true) {
				//等待客户端连接(阻塞，如果没有客户端连接则会阻塞在这)
				Socket socket=server.accept();
				MyServerThread myServerThread=new MyServerThread(socket);
				Thread t=new Thread(myServerThread);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 