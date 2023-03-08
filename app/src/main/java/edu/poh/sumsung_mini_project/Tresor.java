package edu.poh.sumsung_mini_project;

public class Tresor {
    private int current_tresor;
    public Tresor(int ters){
        this.current_tresor=ters;
    }
    public int getCurrent_tresor() {
        return current_tresor;
    }
    public void change_tresor(int t){
        current_tresor+=t;
    }
}
