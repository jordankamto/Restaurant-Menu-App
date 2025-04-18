
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Logic {
    
    int op;
    String List = "";
    String word = "";
    int num = 0;
    String html = "<html><h3><b>Récapitulatif</b></h3></html>";
    
    public void Metod(){
        
        if(Restaurant.Box1.isSelected()){
            op = Integer.parseInt(Restaurant.ComboBox1.getSelectedItem().toString());
            op = op * 5;
            word += "Somoussas aux legumes " + op + " euro" + "\n";
            num += op;
        } 
        
        if(Restaurant.BoxGombo.isSelected()){
            op = Integer.parseInt(Restaurant.ComboGombo.getSelectedItem().toString());
            op = op * 8;
            word += "Gombo au champignions " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxNdole.isSelected()){
            op = Integer.parseInt(Restaurant.ComboNdole.getSelectedItem().toString());
            op = op * 7;
            word += "Ndole mignondo " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxSalade.isSelected()){
            op = Integer.parseInt(Restaurant.ComboSalade.getSelectedItem().toString());
            op = op * 3;
            word += "Salade de fruits " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxFonda.isSelected()){
            op = Integer.parseInt(Restaurant.ComboFonda.getSelectedItem().toString());
            op = op * 2;
            word += "Fonda au chocolat " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxTop.isSelected()){
            op = Integer.parseInt(Restaurant.ComboTop.getSelectedItem().toString());
            op = op * 3;
            word += "Top Green Ananas " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxJus.isSelected()){
            op = Integer.parseInt(Restaurant.ComboJus.getSelectedItem().toString());
            op = op * 2;
            word += "Jus de issap " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxGimgembre.isSelected()){
            op = Integer.parseInt(Restaurant.ComboGimgembre.getSelectedItem().toString());
            op = op * 3;
            word += "Jus de gimgembre " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxCoca.isSelected()){
            op = Integer.parseInt(Restaurant.ComboCoca.getSelectedItem().toString());
            op = op * 2;
            word += "Coca Cola " + op + " euro" + "\n";
            num += op;
        }
        
        if(Restaurant.BoxFanta.isSelected()){
            op = Integer.parseInt(Restaurant.ComboFanta.getSelectedItem().toString());
            op = op * 2;
            word += "Fanta oasis 7up " + op + " euro" + "\n";
            num += op;
        }
        
        if(op == 0){
            JOptionPane.showMessageDialog(null, "Aucune commande demandée pour l'instant");
        } else {
            List = html + "\n" + word + "-------------------------------------------------"
            + "\n" + "Total: " +  "                                    " + num + " euro";
            
            
            JOptionPane.showMessageDialog(null, "<html><h3><b>Récapitulatif</b></h3></html>" + "\n" + word + "-------------------------------------------------"
            + "\n" + "Total: " +  "                                    " + num + " euro");
        }
        
        try {
            String ruta = "C:/Users/DELL/Desktop/commandeclient.txt";
            File file = new File(ruta);
            
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(List);
            bw.close();
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        op = 0;
        num = 0;
        word = "";
    }
      }  

