/* Katas
 * Author: Rene Hütter
 * Datum: 20.05.2022
 * Version: 01.0
 */
public class Katas {

    public static void main(String[] args) {
        sterne(0);
        int [] zahlen = {3,-4,1,2,1,-3,8,10,-5};
        array(zahlen);
        balken(zahlen);
        String text = "Hallo ich bin ein Testtext Morgen wird es regnen Auf zum Atom Hallo auf zum Testtext ";
        textzerlegung(text);
    }

    /***
     * Methode zum Zeichnen von Sterne
     * @param max ist die maximal Zahl von Sterne
     */
    public static void sterne(int max){
        for (int i = 0; i < max; i++){
            System.out.print("*");
        }
    }

    /***
     * Ihr wird der Array inhalt an die Methode Stern übergeben.
     * @param array gibt mir an wie viele Sterne gezeichneten
     */
    public static void array(int[]array){
        for (int j : array) {
            sterne(j);
            System.out.println();
        }
    }

    /***
     * Methode balken erzeugt aus der Methode array und stern ein Diagram in der Konsole.
     * @param array wird übergeben von Array zahlen.
     * Var maxnegativPositv wird von, der negative Zahl von der Methode maxnegativ *-1 gespeist.
     * if block ist für den Positive bereich also nach den "|" wo die Sterne ausgeben wird.
     * im else block ist für den negativ bereich wo vor den "|" die Sterne ausgeben wird.
     * Var inhaltArrayPositv ergibt sich aus array[i] inhalt *-1.
     * Var anzahlSP ergibt sich aus maxnegativPositv - inhaltArrayPositv.
     */
    public static void balken(int[] array) {
        int maxnegativPositv = maxnegativ(array)*-1;
        for (int k : array) {
            if (k >= 0) {
                for (int j = 0; j < maxnegativPositv; j++) {
                    System.out.print(" ");
                }
                System.out.print("|");
                sterne(k);
                System.out.println();
            } else {
                int inhaltArrayPositv = k * -1;
                int anzahlSp = maxnegativPositv - inhaltArrayPositv;
                for (int x = 0; x < anzahlSp; x++) {
                    System.out.print(" ");
                }
                sterne(inhaltArrayPositv);
                System.out.print("|");
                System.out.println();
            }
        }
    }

    /***
     * Ihr wird die größte negative Zahl ermittelt aus dem Array
     * @param number ist das Array was übergeben wird
     * @return negativ gibt eine negative zahl zurück
     */
    public static int maxnegativ(int[] number){
        int negativ = 0;
        for (int j : number) {
            if (j < 0) {
                negativ = j;
            }
        }
        return negativ;
    }
    public static String[] textzerlegung(String text) {
        String[] textteile = text.split(" ");
        for (String s : textteile) {
            System.out.println(s);
        }
        return textteile;
    }

    public static void wortzähler(){

    }
}
