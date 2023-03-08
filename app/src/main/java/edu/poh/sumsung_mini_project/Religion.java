package edu.poh.sumsung_mini_project;

public class Religion {
    private int current_religion;
    public Religion(int rel){
        this.current_religion=rel;
    }
    public int getCurrent_religion() {
        return current_religion;
    }
    public void change_religion(int r){
        current_religion+=r;
    }
}
