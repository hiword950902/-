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
			System.out.println("��������");
			//����������  Ŀ��Ϊ����̨����
			InputStreamReader isr=new InputStreamReader(System.in);
			//����bufferdreader ���� ���԰�������
			BufferedReader br=new BufferedReader(isr);
			//��ȡsocket�����
			OutputStream os=socket.getOutputStream();
			//���� printstream ����ʵ�ְ������
			PrintStream ps=new PrintStream(os);
			//���� ����̨���������
			String str=br.readLine();
			while(str!=null) {
				//������д�뵽socket���������
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
