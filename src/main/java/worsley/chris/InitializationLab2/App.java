package worsley.chris.InitializationLab2;

/**
 * Created by christopherworsley on 9/11/16.
 */
public class App {
    public static void main(String[] args) {
        ColorfulThing blue = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing black = new ColorfulThing(ColorfulThing.Color.BLACK);
        ThingContainer coolThings = new ThingContainer(1);
        coolThings.add(blue);
        coolThings.add(black);
        coolThings.printThings();
    }

}
