package worsley.chris.InitializationLab2;

/**
 * Created by christopherworsley on 9/11/16.
 */
public class ColorfulThing {
    private Color color;

    public ColorfulThing(Color color){

        this.color = color;
    }

    public Color getColor(){
        return color;

    }
    public enum Color {
        BLUE, BLACK, GREY, WHITE, SILVER
    }
    public void PrintColor(){
        System.out.println(color);
    }
}
