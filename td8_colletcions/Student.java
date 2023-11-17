package td8_colletcions;

import java.util.*;
public class Student {
    private Identity id;
    private String num;
    private Curriculum curri;
    private HashMap<Subject, ArrayList<Double>> results;

    public Student(Identity id, String num, Curriculum curri){
        this.id = id;
        this. num = num;
        this.curri = curri;
        this.results = new HashMap<Subject, ArrayList<Double>>();
        for(Subject s : curri.allSubjects()){
            this.results.put(s, new ArrayList<Double>());
        }
    }

    public Double getMoyenne(Subject s){
        List<Double> notes = this.getResult(s);
        double moyenne = 0;
        Iterator it = notes.iterator();
        while(it.hasNext()){
            moyenne = moyenne + it.next();
        }
        return moyenne / notes.size();
    }

    public Double getMoyenne(){
        double moyenne = 0;
        int i = 0;
        for(Subject s : this.curri.allSubjects()){
            moyenne = moyenne + this.getMoyenne(s) + this.curri.getCoeff(s);
            i = i + this.get
            
        }
        return moyenne / i;
    }
    
}
