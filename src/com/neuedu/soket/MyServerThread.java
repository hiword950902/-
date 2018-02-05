package com.neuedu.soket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyServerThread implements Runnable {
	private Socket socket;
	public MyServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket=socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//如果读 需要获取输入流
			InputStream is=socket.getInputStream();
			//把字节流转换成字符流
			InputStreamReader isr=new InputStreamReader(is);
			//在套用一个bufferedreader 作用是可以按行来读取
			BufferedReader br=new BufferedReader(isr);
			//循环读取 socket输入流中的内容
			String str=br.readLine();
			while(str!=null) {
				System.out.println("客户端发来消息"+str);
				str=br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
