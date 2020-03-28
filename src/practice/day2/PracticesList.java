package practice.day2;

import java.util.*;

public class PracticesList {
    public static void main(String[] args) {
        List<String>  color = List.of("♠","♥","♦","♣");
        List<String>  numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String s : numbers) {
            for (String number : color) {
                poker.put(index, s + " " + number);
                pokerIndex.add(index);
                index++;
            }
        }
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> dizhu = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i >= 51)
                dizhu.add(pokerIndex.get(i));
            else if(i % 3 == 0)
                play1.add(pokerIndex.get(i));
            else if(i % 3 == 1)
                play2.add(pokerIndex.get(i));
            else
                play3.add(pokerIndex.get(i));
        }
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(dizhu);
        read("玩家1",poker,play1);
        read("玩家2",poker,play2);
        read("玩家3",poker,play3);
        read("地主牌",poker,dizhu);
    }
    public static void read(String name,HashMap<Integer,String> poker,List index){
        System.out.print(name+": ");
        for(Object i:index){
            System.out.print(poker.get(i)+" ");
        }
        System.out.println();
    }
}
