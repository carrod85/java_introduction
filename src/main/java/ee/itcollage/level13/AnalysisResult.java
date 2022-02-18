package ee.itcollage.level13;

import java.util.List;

public class AnalysisResult {

    private List<String> palidromes;
    private List<String> others;

    AnalysisResult(List <String>x,List <String> y) {
        this.palidromes = x;
        this.others = y;
    }

    public void addPalidromes(String palidromes) {
        this.palidromes.add(palidromes);
    }

    public void addOther(String others) {
        this.palidromes.add(others);
    }
    public List<String> getPalindromes(){
        return this.palidromes;
    }
    public List<String> getOthers(){
        return this.others;
    }
    public void  palindromesToString() {
        for (String pali : palidromes) {
            System.out.println(pali);
        }
    }
    public void  othersToString() {
        for (String pali : others) {
            System.out.println(pali);
        }
    }
}