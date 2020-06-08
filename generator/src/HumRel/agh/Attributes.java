package HumRel.agh;

import java.io.*;

public class Attributes {
    public String[] attributes = {
            "Jedzenie_polskie",
            "Jedzenie_japońskie",
            "Jedzenie_francuskie",
            "Jedzenie_włoskie",
            "Jedzenie_niemieckie",
            "Jedzenie_hinduskie",
            "Gotowanie",
            "Bieganie",
            "Tenis",
            "Piłka_nożna",
            "Siatkówka",
            "Joga",
            "Czytanie_kryminałów",
            "Jazda_na_rowerze",
            "Sztuka",
            "Imprezy",
            "Koszykówka",
            "Narciarstwo",
            "Podróżowanie_stopem",
            "Gra_na_instrumencie",
            "Śpiewanie",
            "Taniec"
    };
    public void generateAttributes() throws IOException {
        File attributesOutput = new File("attributes.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(attributesOutput);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        for(int i = 0;i<attributes.length;i++){
            int j=i+200;
            bufferedWriter.write("CREATE (" + attributes[i] + ":Attribute {id:'" + j + "', name_of_attribute:'" + attributes[i] +"'})");
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
