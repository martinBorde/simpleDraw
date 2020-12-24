/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledraw;

import java.util.ArrayList;

/**
 *
 * @author mborde01
 */
public class Group_ {
    private ArrayList<Shape> ArrayShapes;
    
    public Group_(ArrayList<Shape> shape) {
            setShapes(shape);
    }

    public ArrayList<Shape> getShapes() {
            return ArrayShapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
            this.ArrayShapes = shapes;
    }
}
