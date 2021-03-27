/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {

    public static void main(String[] args) {
        //1. REQUERIMIENTOS:
        String driver = "com.mysql.jdbc.Driver";

        //2. URL (CADENA DE CONEXIÓN)
        String url = "jdbc:mysql://localhost:3306/hr"; //ip: 198.201.33.05 se puede poner solo la ip o el servidor

        try {
            Class.forName(driver);
            System.out.println("conexion exitosa");

        } catch (Exception e) {
            System.err.println("error de conexion!!!" + e.getMessage());
            return;
        }

        try {
            Connection cn = DriverManager.getConnection(url, "root", "root");
            System.out.println("conectado a la base de Datos");
            System.out.println("---------------------------------");
            
            String sql = "select * from employee";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastName"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getInt("phoneNumber"));
                System.out.println(rs.getDouble("salary"));
                System.out.println(rs.getString("hiredate"));
                System.out.println("---------------------------------");
                
                       
                        
                
            }

        } catch (Exception e) {
            System.err.println("Sin conexion a la base de datos!!!");
            return;

        }
    }
}
