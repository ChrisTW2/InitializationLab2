package worsley.chris.InitializationLab2;

import java.awt.*;

/**
 * Created by christopherworsley on 9/11/16.
 */
public class ThingContainer {
    ColorfulThing[]colorfulThings;
    public int maxSize;
    public ThingContainer(int size){
        colorfulThings = new ColorfulThing[size];
        maxSize = size;
    }
    public void add(ColorfulThing newColor){
        if (colorfulThings[colorfulThings.length -1]!=null){
            System.out.println("Sorry, We're Full.");
            return;
        }
        for (int i = 0; i < colorfulThings.length; i ++) {
            if (colorfulThings[i] == null) {
                colorfulThings[i] = newColor;
                break;
            }

        }

    }
    public ColorfulThing pop(){
        ColorfulThing color = colorfulThings[colorfulThings.length-1];
        colorfulThings [colorfulThings.length-1] = null;
        return color;
    }
    public ColorfulThing remove(ColorfulThing colorfulThing){
        for (int c =0; c < maxSize; c++){
            if (colorfulThings[c]== colorfulThing){
                adjustArray(c);
                ColorfulThing color = colorfulThings[c];
                colorfulThings[c] = null;
                return color;
            }
        }
        return null;
    }
    public ColorfulThing remove(ColorfulThing.Color color){
        for (int c =0; c < maxSize; c++){
            if (colorfulThings[c].getColor() == color){
                adjustArray(c);
                return colorfulThings[c];
            }
        }
        return null;
    }

    public void printThings (){
        for (int i = 0; i < maxSize; i ++){
            if (colorfulThings[i] != null){
                System.out.println(colorfulThings[i].getColor());
            }

        }
    }
    public void adjustArray (int removedC){
        for (int C= removedC;C<maxSize;C++){

        }
    }
    public ThingContainer(ColorfulThing[] things){
        colorfulThings = things;
    }
}
