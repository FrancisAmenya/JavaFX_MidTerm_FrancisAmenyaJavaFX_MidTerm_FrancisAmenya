/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_francis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author graffitiAddikt
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    GridPane gpTT;
    
    
    String [] days;
    String [][] time;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        days = new String [] {
            " Time ",
            " Monday ",
            " Teusday ",
            " Wednesday ",
            " Thursday ",
            " Friday "};
        time = new String [][] {
            {
            " 8:30 AM - 10:30 PM ",
            " 11:00 AM - 1:0 PM ",
            " 2:00 PM - 4:00 PM ",
            " 4:30 PM - 6:30 PM ",
            " 6:30 PM - 8:30 PM "},
            
            {
            " - ",
            " Adobe After Effects ",
            " Game Dev 001 - Introduction to Game Development (Unity, Unreal) ",
            " - ",
            " Intro to iOS Apps ( Swift )"},
            
            {
            " - ",
            " - ",
            " Intro to 3D Modelling ",
            " - ",
            " - "},
            
            {
            " - ",
            " - ",
            " - ",
            " - ",
            " - "},
            
            {
            " Design 003 - UX Design Tools (XD) ",
            " - ",
            " - ",
            " - ",
            " - "},
            
            {
            " Emerging Technologies 2 - Blockchain Technology ",
            " Java 003 - Intro to Android/Windows Apps ",
            " - ",
            " - ",
            " - "}};

        
        int slowInt = 1;
        
        for (int topRow = 0; topRow < days.length; topRow++) {
            gpTT.add(new Label(days[topRow]), topRow, 0);
            
            for (int oRow = 0; oRow < time[oRow].length; oRow++) {
                
                for (int zCount = 0; zCount < time.length; zCount++) {
                    
                    if(!time[zCount][oRow].equals(time[1][0])){
            
                
            
                        gpTT.add(new Label(time[zCount][oRow]), zCount, slowInt);
                    }
                }
            }
            slowInt++;
            
        }
        
        
        
    }    
    
}
