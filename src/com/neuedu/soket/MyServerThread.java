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
			//����� ��Ҫ��ȡ������
			InputStream is=socket.getInputStream();
			//���ֽ���ת�����ַ���
			InputStreamReader isr=new InputStreamReader(is);
			//������һ��bufferedreader �����ǿ��԰�������ȡ
			BufferedReader br=new BufferedReader(isr);
			//ѭ����ȡ socket�������е�����
			String str=br.readLine();
			while(str!=null) {
				System.out.println("�ͻ��˷�����Ϣ"+str);
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
