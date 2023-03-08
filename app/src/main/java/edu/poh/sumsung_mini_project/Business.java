package edu.poh.sumsung_mini_project;


import android.util.Log;

public class Business {
    public MainActivity mainActivity;
    private String story;
    private int true_t;
    private int true_m;
    private int true_r;
    private int true_sw;
    private int false_t;
    private int false_m;
    private int false_r;
    private int false_sw;
    public Business(String story,int true_sw,int true_m,int true_r,
                    int true_t,int false_sw,int false_m,int false_r,int false_t){
        this.story=story;
        this.true_sw=true_sw;
        this.true_m=true_m;
        this.true_r=true_r;
        this.true_t=true_t;
        this.false_sw=false_sw;
        this.false_m=false_m;
        this.false_r=false_r;
        this.false_t=false_t;
    }

    public String getStory() {
        return story;
    }
    public void change_of_true(){
        mainActivity.sw.change_social_welf(true_sw);
        mainActivity.m.change_military(true_m);
        mainActivity.r.change_religion(true_r);
        mainActivity.t.change_tresor(true_t);
        Log.d("Tagm", mainActivity.sw.getCurrent_social_welf() + " " + mainActivity.m.getCurrent_military()+""+mainActivity.r.getCurrent_religion()+""+mainActivity.t.getCurrent_tresor());
    }
    public void set_object_main(MainActivity main){
        this.mainActivity=main;
    }
    public void change_of_false(){
        mainActivity.sw.change_social_welf(false_sw);
        mainActivity.m.change_military(false_m);
        mainActivity.r.change_religion(false_r);
        mainActivity.t.change_tresor(false_t);
    }
}
