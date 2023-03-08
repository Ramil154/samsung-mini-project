package edu.poh.sumsung_mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Momentum moment=new Momentum();
    int i=0;
    public Military m;// = new Military(50);
    public Social_Welf sw;//=new Social_Welf(50);
    public Religion r;//=new Religion(50);
    public Tresor t;//=new Tresor(50);
    public Business b;//=new Business("Вас атаковало государство X, подписать мирный договор?",20,
            //0,0,0,-50,-50,-50,-50);
    TextView military;//=(TextView) findViewById(R.id.military_potential);
    TextView religion;//=(TextView) findViewById(R.id.religion);
    TextView social;//=(TextView) findViewById(R.id.social_welfare);
    TextView tresor;//=(TextView) findViewById(R.id.trеsor);
    TextView situation;
    Button tr_but;
    Button f_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m =new Military(50);
        sw =new Social_Welf(50);
        r =new Religion(50);
        t =new Tresor(50);
        b=moment.map.get(i);
        assert b != null;
        b.set_object_main(this);
        tr_but=findViewById(R.id.true_sight);
        f_but=findViewById(R.id.false_sight);
        military=findViewById(R.id.military_potential);
        religion=findViewById(R.id.religion);
        social=findViewById(R.id.social_welfare);
        tresor=findViewById(R.id.trеsor);
        situation=findViewById(R.id.situation);
        set_texts();
        situation.setText(b.getStory());
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setMessage("Добро пожаловать! Вы глава государства X, вам предстоит принять решения в непростых ситуациях и сохранить государство.");
        alert.show();

    }

    private void set_texts(){
        military.setText(Integer.toString(m.getCurrent_military()));
        religion.setText(Integer.toString(r.getCurrent_religion()));
        social.setText(Integer.toString(sw.getCurrent_social_welf()));
        tresor.setText(Integer.toString(t.getCurrent_tresor()));
    }
    @SuppressLint("ResourceType")
    private void return_to_start(String why,int x){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(why);
        builder.setTitle("Важное событие!");
        switch (x){
            case 1:
                builder.setIcon(R.drawable.social_);
                break;
            case 2:
                builder.setIcon(R.drawable.military);
                break;
            case 3:
                builder.setIcon(R.drawable.religion);
                break;
            case 4:
                builder.setIcon(R.drawable.tresor);
                break;
        }
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        m =new Military(50);
        sw =new Social_Welf(50);
        r =new Religion(50);
        t =new Tresor(50);
        set_texts();
        i = 0;
        change_situation();
    }

    private void change_situation(){
        b=moment.map.get(i);
        situation.setText(b.getStory());
        b.set_object_main(MainActivity.this);
    }

    public void YES_Clicked(View view) {
        b.change_of_true();
        set_texts();
        if (sw.getCurrent_social_welf()<=0){
            return_to_start("Произошло восстание из-за вашей политки, люди крайне недовольны,стремяться провести революцию и сместить вас с поста главы государства.",1);
            return;
        }
        if (m.getCurrent_military()<=0){
            return_to_start("Ваши противники заметили слабость вашей армми и предриняли попытку захватить вас. Вы потерпели поражение и ваша страна захвачена.",2);
            return;
        }
        if (r.getCurrent_religion()<=0){
            return_to_start("Веруюшие увидели в вашей политике нелюбовь к местному богу.Чтобы он простил их, они начали крестовый поход.",3);
            return;
        }
        if (t.getCurrent_tresor()<=0){
            return_to_start("В вашей казне недостаточно золота и денег, вы неспособны противостоять на мировой арене. Более сильные государства сделали вас своей марианеткой, таким образом вы потярли свою независимость",4);
            return;
        }
        if (i==12){
            return_to_start("Поздравляю, вы успешно смогли управлять страной и не привели ее к краху!!!",0);
            return;
        }
        i+=1;
        change_situation();
    }

    public void NO_Clicked(View view) {
        b.change_of_false();
        set_texts();
        if (sw.getCurrent_social_welf()<=0){
            return_to_start("Произошло восстание из-за вашей политки, люди крайне недовольны,стремяться провести революцию и сместить вас с поста главы государства.",1);
            return;
        }
        if (m.getCurrent_military()<=0){
            return_to_start("Ваши противники заметили слабость вашей армми и предриняли попытку захватить вас. Вы потерпели поражение и ваша страна захвачена.",2);
            return;
        }
        if (r.getCurrent_religion()<=0){
            return_to_start("Веруюшие увидели в вашей политике неюбовь к местному богу.Чтобы он простил их, они начали крестовый поход.",3);
            return;
        }
        if (t.getCurrent_tresor()<=0){
            return_to_start("В вашей казне недостаточно золота и денег, вы неспособны противостоять на мировой арене. Более сильные государства сделали вас своей марианеткой, таким образом вы потярли свою независимость",4);
            return;
        }
        if (i==12){
            return_to_start("Поздравляю, вы успешно смогли управлять страной и не привели ее к краху!!!",0);
            return;

        }
        i+=1;
        change_situation();
    }
}