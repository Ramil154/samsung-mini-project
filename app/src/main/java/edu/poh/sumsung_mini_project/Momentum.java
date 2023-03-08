package edu.poh.sumsung_mini_project;

import java.util.HashMap;
import java.util.Map;

public class Momentum {
    public Map<Integer, Business> map = new HashMap<>();
    public Momentum(){
        map.put(0,new Business("Провести ремонт больниц в неблагополучных районах?",20,
                0,5,-20,-20,0,0,15));
        map.put(1,new Business("В соседнем государстве произошли революция. Послать добровольцев?",-20,
                20,0,-5,-15,-20,0,0));
        map.put(2,new Business("Церковь требует провести большой праздник. Провести?",15,
                0,20,-15,-5,0,-15,15));
        map.put(3,new Business("Военные нарушают порядок на улицах во время своего праздника. Предпринять меры?",10,
                -10,0,0,-15,10,0,10));
        map.put(4,new Business("Случилось землятресение. Выдать пострадавшим компенсацию?",15,
                0,5,-15,-20,0,-10,15));
        map.put(5,new Business("Провести военные сборы совместно с соседними странами?",5,
                15,0,-10,-5,-15,0,10));
        map.put(6,new Business("Церковь требует выдать им деньги на строительство нового храма",0,
                0,10,-15,-5,0,-15,10));
        map.put(7,new Business("Увеличить пенсионный возраст?",-15,
                0,0,10,5,0,0,-15));
        map.put(8,new Business("Увеличить срок службы в армии?",-15,
                15,0,-10,0,-20,0,5));
        map.put(9,new Business("Глава церкви посмел оскорбить главу соседней страны. Сместить его с поста главы церкви?",-15,
                0,-30,0,10,0,10,0));
        map.put(10,new Business("Армия требует выдать деньги на новое вооружение. Выдать?",5,
                15,0,-20,0,-25,0,10));
        map.put(11,new Business("В большом городе отключило электричество из-за чайника. Помочь жителям?",10,
                0,0,-10,-15,0,0,10));
        map.put(12,new Business("Отправить экспедицию в космос для изучения новых планет",5,
                -5,0,-15,-15,0,0,10));
    }
}
