/**
 * 2019年4月14日
 *JdbcDemo
 *
 *
 */
package org.acess.sql;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

/**
 * @author mac
 *
 */
public class JdbcDemo {
	private  static final String DATABASE_DRIVER="oracle.jdbc.driver.OracleDriver";
	private  static final String DATABASE_URL="jdbc:oracle:thin:@183.2.247.164:1521:oracle";
	private  static final String DATABASER_USER="scott";
	private  static final String DATABASER_PASSWORD="tiger";
	public static void main(String[] args) throws Exception {
		Connection connection=null;
		Class.forName(DATABASE_DRIVER);
		connection=(Connection) DriverManager.getConnection(DATABASE_URL,DATABASER_USER,DATABASER_PASSWORD);
		System.out.println(connection);
		connection.close();
	}
}
