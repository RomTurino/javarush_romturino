package level18;

import java.util.ArrayList;
import java.util.Optional;



public class SimpleDotCom {
    private ArrayList<Integer> locationCells;
//    int numOfHits;

    public void setLocationCells(ArrayList<Integer>locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        int index = locationCells.indexOf(guess);
        if (index >= 0){
            locationCells.remove(index);
        }
        if (locationCells.isEmpty()){
            result = "Потопил";
        } else {
            result = "Попал";
        }
        System.out.println(result);
        return result;
    }
}
