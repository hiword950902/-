package com.neuedu.soket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) {
		try {
			Socket socket=new Socket("10.25.130.178", 8989);
			System.out.println("接入服务端");
			//创建输入流  目标为控制台输入
			InputStreamReader isr=new InputStreamReader(System.in);
			//套用bufferdreader 作用 可以按行来读
			BufferedReader br=new BufferedReader(isr);
			//获取socket输出流
			OutputStream os=socket.getOutputStream();
			//套用 printstream 可以实现按行输出
			PrintStream ps=new PrintStream(os);
			//接收 控制台输入的内容
			String str=br.readLine();
			while(str!=null) {
				//将内容写入到socket的输出流中
				ps.print(str);
				str=br.readLine();
			}
			ps.close();
			os.close();
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
