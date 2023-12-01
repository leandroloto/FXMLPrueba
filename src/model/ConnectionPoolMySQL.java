/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Discar
 */
public class ConnectionPoolMySQL {
    
    private final String DB = "fxmlprueba";
    private final String URL = "jdbc:mysql://localhost:3306/"+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USER = "root";
    private final String PASS = "";
    
    private static ConnectionPoolMySQL dataSource;
//    private BasicDataSource basicDataSource=null;
//    
//    
//    private ConnectionPoolMySQL(){
//        basicDataSource = new BasicDataSource();
//        basicDataSource
//    
}