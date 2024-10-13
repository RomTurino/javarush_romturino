package level18;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<Integer> locations = new ArrayList<>();
        locations.add(1);
        locations.add(2);
        locations.add(3);
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

    }
}
