package lab12;
import java.util.ArrayList;
import java.util.Collections;
public class GeographyList {
    private ArrayList<String> countries;
    public GeographyList(){
        countries = new ArrayList<>();
    }

    public ArrayList<String> getCountries() {
        return countries;
    }
    
    public void addCountry(String country){
        getCountries().add(country);
    }
    
    public String printList(){
        String output = "";
        for(String country:getCountries()){
            output += country + "\n";
        }
        return output;  
    }
    
    public void removeDuplicates(){
        for(int i=0;i<getCountries().size();i++){
            for(int j=0;j<getCountries().size();j++){
                if(getCountries().get(i).equals(getCountries().get(j)) && i!=j){
                    getCountries().remove(j);
                }
            }
        }
    }
    
    public void sortAlphabetically(){
        Collections.sort(getCountries(), String.CASE_INSENSITIVE_ORDER);
    }
    
    public void replaceFirstAndLast(String first, String last){
        getCountries().set(0, first);
        getCountries().set(getCountries().size()-1, last);
    }
    
    public void sortReverseAlphabetical(){
        Collections.sort(getCountries(), Collections.reverseOrder());
    }
}
