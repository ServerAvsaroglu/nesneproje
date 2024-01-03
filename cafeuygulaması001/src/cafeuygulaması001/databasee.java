/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeuygulaması001;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yilma
 */
public class databasee {
    static Connection myConn1;
	static Statement myState1;
	static ResultSet myRs1;
        static ResultSet yap() {
		try {
			myConn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebabci","root","630663");
			myState1=myConn1.createStatement();
			myRs1 = myState1.executeQuery("SELECT * FROM uygulama");
			return myRs1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRs1;
	}
	static void ekle(String sql_sorgu) throws SQLException {
		myState1.executeUpdate(sql_sorgu);
	}
	static void update(String sql_sorgu) throws SQLException {
		myState1.executeUpdate(sql_sorgu);
	}
	static ResultSet bul(String sql) throws SQLException {
		ResultSet myRs1=null;
		myConn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/kebabci","root","630663");
		myState1=myConn1.createStatement();
		myRs1 = myState1.executeQuery(sql);
		return myRs1;
	}
    
}
