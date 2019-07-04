package Cats;

import java.awt.*;
import java.util.*;

/**
 * Задание: в зависимости от цвета, присваивать котам разный тип питания.
 * ну там сделай какое-нибудь подходящее для этого поле.
 * tip: switch-case
 * и надо будет потренировать цикл foreach
 * потренируйся выводить форичем какую-то информацию о коте.
 * если он белый, ты выводишь имя
 * если его возраст >4, ты выводишь цвет
 * ну и почитай про set и map, HashSet, HashMap
 */
public class Main {
    public static void main(String[] args) {

       /* Calendar calendar = new GregorianCalendar((int)(Math.random()*20+2000), (int)(Math.random()*11) , (int)(Math.random()*31));
        Date date = calendar.getTime();
        System.out.println(date);*/

        ArrayList<Cat> catList = new ArrayList<>();   //catList - это коллекция
        for (int i = 0; i < 40; i++) {
            Cat cats = new Cat();       // создали cats (кота) из класса Cat
            System.out.println(cats.toString());
            catList.add(cats);
            System.out.println(catList.get(i));
        }
        for (int i = 0; i < catList.size(); i++) {
            if ((i + 1) % 2 == 0 && (i + 1) % 5 != 0) {
                catList.get(i).setColor(Colorcat.BLACK);
                System.out.println(i + 1 + " " + catList.get(i).getColor());
                //System.out.println(Colorcat.BLACK.name());
            }
            if ((i + 1) % 2 == 1 && (i + 1) % 5 != 0) {
                catList.get(i).setColor(Colorcat.GREEN);
                System.out.println(i + 1 + " " + catList.get(i).getColor());
            }
            if ((i + 1) % 5 == 0) {
                catList.get(i).setColor(Colorcat.getRandom());
                System.out.println(i + 1 + " " + catList.get(i).getColor());
                //System.out.println(Colorcat.getRandom().name());
            }
            // System.out.println("Cats color is "+catList.get(i).getColor());
            catList.get(i).CatsMeal();
        }
        for (int i = 0; i < catList.size(); i++) {
            Calendar calendar = new GregorianCalendar((int)(Math.random()*20+2000), (int)(Math.random()*11) , (int)(Math.random()*31));
            Date date = calendar.getTime();
            catList.get(i).setDate(date);
            System.out.println(date);
        }
        for(Cat currentCat: catList){
            if(currentCat.getColor()==Colorcat.WHITE){
                System.out.println(currentCat.getName());
            }
            if(currentCat.getAge()>4){
                System.out.println(currentCat.getColor());
            }
        }

        Map<String, Cat> etochtoto=new HashMap<>();
        for(Cat currentCat: catList){
            etochtoto.put(currentCat.getName(),currentCat);
        }

        for(Map.Entry<String,Cat> currentCatI: etochtoto.entrySet()){
            if(currentCatI.getKey().contains("o")){
                etochtoto.remove(currentCatI.getKey());
            }
        }
        System.out.println(etochtoto);
        //for (int i =0; i<catList.size(); i++){
        catList.iterator();

        catList.forEach(element -> element.setColor(Colorcat.GREEN));
        System.out.println(catList);
        //catList.get(i).CatsMeal(Colorcat.);

        // }

    }
}
