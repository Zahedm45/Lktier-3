import java.util.Scanner;
public class Dyrlyde {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        // erklær variable
        String dyrnavn;
        String out;

        // indlæs
        dyrnavn = keyb.next();

        // konverter til små bogstaver



        dyrnavn = dyrnavn.toLowerCase();


        while (!dyrnavn.equals("slut")) // IKKE dyrLyd != “slut”
        {
            switch (dyrnavn) {
                case "dog":
                    out = "Woof";
                    break;
                case "cat":
                    out = "Meow";
                    break;
                case "fish":
                    out = "Blob";
                    break;
                case "cow":
                    out = "Muh";
                    break;
                case "lion":
                    out = "Roar";
                    break;
                case "sheep":
                    out = "Bah";
                    break;
                case "duck":
                    out = "Quack";
                    break;
                case "bear":
                    out = "?";
                    break;
                default: out = "?";
            }

            // udskriv resultat
            System.out.println(out);

            // ny indlæsning
//           System.out.println();
            dyrnavn = keyb.next();

            // konverter til små bogstaver
            dyrnavn = dyrnavn.toLowerCase();
            //dyrnavn = dyrnavn.toLowerCase();
        }
        // sig Farvel
        System.out.println("Farvel");
        // luk scanner
        keyb.close();
    }

}
