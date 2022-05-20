/* Katas
 * Author: Rene Hütter
 * Datum: 20.05.2022
 * Version: 01.0
 */
public class Catas {

    public static void main(String[] args) {
        sterne(0);
        int [] zahlen = {3,-4,1,2,1,-3,8,10,-5};
        array(zahlen);
        balken(zahlen);

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
        for (int i = 0; i < array.length; i++) {
            sterne(array[i]);
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
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                for (int j = 0; j < maxnegativPositv; j++){
                    System.out.print(" ");
                }
                System.out.print("|");
                sterne(array[i]);
                System.out.println();
            } else {
                int inhaltArrayPositv = array[i]*-1;
                int anzahlSp = maxnegativPositv - inhaltArrayPositv;
                for (int x = 0; x < anzahlSp; x++){
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
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                negativ = number[i];
            } else if (number[i] < negativ) {
                negativ = number[i];
            }
        }
        return negativ;
    }
}
