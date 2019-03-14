package lab12;
import java.util.*;
public class Notebook {
    private ArrayList<String> notes;
    public Notebook(){
        notes = new ArrayList<String>();
    }

    public ArrayList<String> getNotes() {
        return notes;
    }
    
    public void addNotes(String notes) {
        getNotes().add(notes);
    }
    
    public void addNotes(String notes, int index) {
        getNotes().set(index, notes);
    }
    
    public void removeNotes(int index) {
        if(index>=getNotes().size()||index<0){
            System.out.println("Index not valid.");
        }
        else{
            getNotes().remove(index);
        }
    }
    
    public String listNotes(){
        String output = "";
        for(int i=0;i<getNotes().size();i++){
            output += i+1 + ") " + getNotes().get(i) + "\n";
        }
        return output;
    }
    
    public String showNote(int index){
        if(index>=getNotes().size()||index<0){
            System.out.println("Index not valid.");
            return "";
        }
        else{
            return getNotes().get(index);
        }
    }
    
    public String fullSearch(String search){
        String output = "";
        for(String note:notes){
            if(note.equals(search)){
                output += note + "\n";
            }
        }
        if(output.equals("")){
            return "Search term not found";
        }
        return output;
    }
    
    public String searchForString(String search){
        String output = "";
        int i=0;
        while(i<getNotes().size()){    
            if(getNotes().get(i).equals(search)){
                output += getNotes().get(i);
                return output;
            }
            i++;
        }
        return "Search term not found";
    }
}
