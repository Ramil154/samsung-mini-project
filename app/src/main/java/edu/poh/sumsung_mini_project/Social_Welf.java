package edu.poh.sumsung_mini_project;

public class Social_Welf{
    private int current_social_welf;
    public Social_Welf(int soc){
        this.current_social_welf=soc;
    }
    public void change_social_welf(int sw){
        current_social_welf+=sw;
    }
    public int getCurrent_social_welf() {
        return current_social_welf;
    }
}
