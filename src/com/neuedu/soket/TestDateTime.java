package com.neuedu.soket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class TestDateTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Date date=new Date();
//		// 默认 如果是无参构造那么获取到的是当时的系统时期和时间
//		System.out.println(date);
//		//获取到年的部分（当前年-1900）
//		System.out.print(date.getYear()+"  ");
//		//获取到月的部分（0-11）
//		System.out.print(date.getMonth()+1+"  ");
//		//获取到日的部分
//		System.out.print(date.getDate()+"  ");
//		//获取到星期部分（周日是0）
//		System.out.print(date.getDay()+"  ");
//		//获取到小时的部分
//		System.out.print(date.getHours()+":");
//		//获取到分钟的部分
//		System.out.println(date.getMinutes()+"");
//		//获取到秒的部分
//		System.out.println(date.getSeconds());
		
		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		try {
//			Date d2=sdf.parse("1998/04/12 12:12:12");
//			System.out.println(d2);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		
//		int[] a= {12,43,70,5,3,67,75,96};
//		Arrays.sort(a);
//		int[] b=Arrays.copyOf(a, 12);
//		System.out.println(Arrays.toString(b));
		
//		ArrayList l1=new ArrayList();
//		LinkedList l2=new LinkedList();
//		Date d1=new Date();
//		for(int i=1;i<=100000;i++) {
//			l1.add(0,i);
//		}
//		Date d2=new Date();
//		System.out.println(d2.getTime()-d1.getTime());
//		for(int i=1;i<=100000;i++) {
//			l2.add(0,i);
//		}
//		Date d3=new Date();
//		System.out.println(d3.getTime()-d2.getTime());
		//上下两种类型比较
//		Date d1=new Date();
//		for(Object object:l1) {
//			int a=Integer.parseInt(object.toString());
//		}
//		Date d2=new Date();
//		System.out.println(d2.getTime()-d1.getTime());
//		for(Object object:l2) {
//			int a=Integer.parseInt(object.toString());
//		}
//		Date d3=new Date();
//		System.out.println(d3.getTime()-d2.getTime());
		
//		ArrayList<Integer> l1=new ArrayList(200000);
//		for(int i=1;i<=200000;i++) {
//			l1.add(0,i);
//		}
//		Iterator<Integer> iterator=l1.iterator();
//		Date d1=new Date();
//		for(int i=0;i<=l1.size();i++) {
//			int a=l1.get(0);
//		}
//		Date d2=new Date();
//		System.out.println(d2.getTime()-d1.getTime());
//		for(int a:l1) {
//			int b=a;
//		}
//		Date d3=new Date();
//		System.out.println(d3.getTime()-d2.getTime());
//		while(iterator.hasNext()) {
//			int a=iterator.next();
//		}
//		Date d4=new Date();
//		System.out.println(d4.getTime()-d3.getTime());
		
		//复制文件
//		File from=new File("D:/eclipse-jee-oxygen-2-win32-x86_64.zip");
//		File to=new File("D:\\ww\\eclipse-jee-oxygen-2-win32-x86_64.zip");
//		byte[] b=new byte[1024];
//		InputStream is=new FileInputStream(from);
//		OutputStream os=new FileOutputStream(to,true);
//		int i=is.read(b);
//		while(i!=-1) {
//			os.write(b, 0, i);
//			i=is.read(b);
//		}
//		System.out.println("写入完成");
//		os.close();
//		is.close();
		
	}

}
