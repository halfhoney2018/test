/**
 * 2019年4月13日
 *EchoServer
 *
 *
 */
package serviceInte;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class EchoServer {
	
	private static class  ClientThread implements Runnable{
		private Socket clientSocket=null;
		private Scanner scan=null;
		private PrintStream out=null;
		private boolean flag = true ; // 循环标记
		public ClientThread(Socket clientSocket) throws Exception {
			super();
			this.clientSocket = clientSocket;
			this.scan = new Scanner(clientSocket.getInputStream()) ; 	// 客户端输入流
			scan.useDelimiter("\n") ; // 设置分隔符
			this.out = new PrintStream(clientSocket.getOutputStream()) ; // 客户端输出流
		}
		
		
		@Override
		public void run() {
			while (flag) {
				if(scan.hasNext()) {	// 现在有数据发送
					String val = scan.next().trim() ; // 接收发送的数据
					if ("byebye".equalsIgnoreCase(val)) {
						out.println("ByeByeBye....");
						flag = false ; // 结束循环
					} else {
						out.println("【ECHO】" + val);
					}
				}
				
				
			}
			try {
				scan.close();
				out.close();
				this.clientSocket.close();
//				server.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999) ; // 设置服务器端的监听端口
		System.out.println("等待客户端连接.............");
//		Socket client = server.accept() ; // 有客户端连接
		// 首先需要先接收客户端发送来的信息，而后才可以将信息处理之后发送回客户端
		boolean flag=true;
		while(flag) {
			Socket clientSocket=server.accept();
			new Thread(new ClientThread(clientSocket)).start();
			
		}
		server.close();
		
		
		
	}
}

