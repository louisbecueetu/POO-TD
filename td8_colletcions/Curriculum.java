package td8_colletcions;

import java.util.*;

public class Curriculum{
    private String name;
    private Map<Subject, Integer> subjects;

    public Curriculum(String name) {
        this.name = name;
        this.subjects = new HashMap<Subject, Integer>();
    }

    public String getName(){
            return this.name;
        }

    public Subject getCoeff(Subject s)throws IllegalStateException{
        if (!(this.subjectsExist(s))){
            throw new IllegalStateException();
        }
        return this.subjects.get(s);
    }

    public boolean subjectsExist(Subject s){
        return this.subjects.containsKey(s); 
    }
    
    public Set<Subject> allSubjects(){
        return this.subjects.keySet();
    }

    public void addSubject(Subject s, int coeff){
        this.subjects.put(s, coeff);
    }

    public void removeSubject(Subject s){
        this.subjects.remove(s);
    }

    public String toString(){
        String out = "";
        for(Subject s : this.allSubjects()){
            out += s + " : " + this.getCoeff(s) + "\n";
        }
        return out;
    }
    
}
