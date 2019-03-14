/*
package lab12;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        GeographyList test = new GeographyList();
        
        test.addCountry("United Kingdom");
        test.addCountry("Germany");
        test.addCountry("France");
        test.addCountry("United Kingdom");
        test.addCountry("Korea");

        
        System.out.println(test.printList());
        test.removeDuplicates();
        test.sortAlphabetically();
        System.out.println(test.printList());
        
        test.replaceFirstAndLast("Austria", "Hungary");
        System.out.println(test.printList());
        
        test.sortReverseAlphabetical();
        System.out.println(test.printList());
    }
}
*/

package lab12;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Notebook test = new Notebook();
        
        test.addNotes("5+5 is probably 10");
        test.addNotes("Mitochondria is the powerhouse of the cell");
        test.addNotes("WW1 started in 1919");
        test.addNotes("Newton invented gravity");
        test.addNotes("WW1 started in 1919");
        
        System.out.println(test.listNotes());
        System.out.println(test.showNote(1));
        test.removeNotes(3);
        
        System.out.println(test.fullSearch("WW1 started in 1919"));
        System.out.println(test.searchForString("WW1 started in 1919"));
        
        System.out.println(test.fullSearch("WW2 started in 1939"));
        System.out.println(test.searchForString("English arrows can't pierce French steel"));
    }
}
