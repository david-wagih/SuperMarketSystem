/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket_project;

import supermarket_project.helpers.Admin;
import supermarket_project.helpers.Report;
import supermarket_project.GUI.login;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author asaid
 */
public class Supermarket_project {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
       login l=new login();
      // User u = new User(10, "ahmed", "said", 
             //  500, "admin",011,"ahh","aaa", "bbb");
       Report r =new Report();
       Admin a = new Admin();
       r.readFileUsers();
       r.view();
       
       /*FileOutputStream write_id_file = new FileOutputStream("Invoices_id.bin");
            DataOutputStream dos = new DataOutputStream(write_id_file);
            dos.writeInt(1);*/
    }
    
}
