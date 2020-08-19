/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Beans.OrderBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shameen karunanayake
 */
public class OrderController {
    
      public  OrderController () {

        connectToDb();
    }

    Statement st;

   public void addOrder(OrderBean orderBean) {
try {
        String sql = "INSERT INTO orderinfo VALUES ('" + orderBean.getName() + "','" + orderBean.getAddress()+ "','" + orderBean.getSize()+ "','" + orderBean.getFlavour()+ "'," + orderBean.getQuantity() + "," + orderBean.calculateAmount() + ")";
        st.executeUpdate(sql);
}
 catch (Exception  ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*

     void updateMovie(String mtitle, String mprod, String mdir, int myear) throws SQLException {
       
        String sql = "UPDATE  movie_tbl SET title='" + mtitle + "', producer=' " + mprod + "',director='" + mdir + "' WHERE year ="+myear+"";
        st.executeUpdate(sql);
    }
        void deleteMovie(int myear) throws SQLException {
       
        String sql = "DELETE FROM  movie_tbl  WHERE year ="+myear+"";
        st.executeUpdate(sql);
    }*/
    private void connectToDb() {
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/Pizza";
            Connection con = DriverManager.getConnection(url, "root", "");
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
