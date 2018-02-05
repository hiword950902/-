package com.neuedu.soket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) {
		try {
			//����һ��������
			ServerSocket server =new ServerSocket(8989);
			while(true) {
				//�ȴ��ͻ�������(���������û�пͻ������������������)
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
 