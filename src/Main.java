import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    String kodovani = "windows-1250";
    String nazevSouboru = "text.txt";
    try (PrintWriter zapis = new PrintWriter(new File(nazevSouboru), kodovani))
    {
    zapis.println("Matyáš Rolinc");
    zapis.close();

    }
    catch (FileNotFoundException e) {
        System.err.println("soubor: " + nazevSouboru +"se nepodařilo najít :(" + e.getLocalizedMessage());
    } catch (UnsupportedEncodingException e) {

    }
    }


    }
