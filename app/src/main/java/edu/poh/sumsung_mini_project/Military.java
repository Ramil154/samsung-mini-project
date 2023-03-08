package edu.poh.sumsung_mini_project;

public class Military {
    private int current_military;
    public Military(int mil){
        this.current_military=mil;
    }
    public int getCurrent_military() {
        return current_military;
    }
    public void change_military(int m){
        current_military+=m;
    }
}
