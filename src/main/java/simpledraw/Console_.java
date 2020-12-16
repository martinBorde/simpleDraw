/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledraw;

import java.util.List;

/**
 *
 * @author mborde01
 */
public class Console_ implements Draw_View{
    public Console_() {
        
    }
    public void notify( Drawing modele ) {
        List<Shape> liste = modele.getShape();
        System.out.println("Listes des shapes");
        for (int i=0;i<liste.size();i++){ 
            System.out.println(liste.get(i));
        }
    }
}
