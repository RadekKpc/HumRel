package HumRel.agh;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Creator creator = new Creator();
       //creator.generateRandomPeople();
        //Attributes attributes = new Attributes();
        //attributes.generateAttributes();
        Attr_Creator attr_creator = new Attr_Creator();
        attr_creator.generateAttToCreator();
    }
}
