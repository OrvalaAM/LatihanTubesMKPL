package src.test.java;

import org.junit.Test;
import src.main.java.MainProgram.DBconn;
import src.main.java.Model.Turnamen;
import java.sql.*;
import static org.junit.Assert.*;

public class DBTest {
    @Test
    public void testConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/6pm", "root", "");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(con, DBconn.getConnection());
    }
    
    public void testNamaTurnamen(){
        Turnamen turnamenTest = new Turnamen("Nama", "peserta");
        assertEquals("Nama", turnamenTest.getNamaTurnamen());
    }
    
}