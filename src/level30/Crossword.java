package level30;


import java.util.ArrayList;
import java.util.*;

/*
Кроссворд
*/

public class Crossword{

    public static void main(String[] args) {
//        int[][] crossword = new int[][]{
//                {'f', 'd', 'e', 'r', 'l', 'k'},
//                {'u', 's', 'a', 'm', 'e', 'o'},
//                {'l', 'n', 'g', 'r', 'o', 'v'},
//                {'m', 'l', 'p', 'r', 'r', 'h'},
//                {'p', 'o', 'e', 'e', 'j', 'j'}
//        };
        int[][] crossword = new int[][]{
                {'a', 'b', 'c'},
                {'b', 'd', 'd'},
                {'c', 'd', 'd'}
        };

//        detectAllWords(crossword, "home", "same");
        detectAllWords(crossword, "bb", "bb");
        detectAllWords(crossword, "dd");

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<List<Integer>> skipNumbers = new ArrayList<>();
        List<Word> result = new ArrayList<>();
        for (String word : words) {
            List<Integer> startCoords = findCoords(skipNumbers, crossword, word.charAt(0));
            if (startCoords == null) {
                continue; // Если первая буква не найдена, пропустите слово
            }

            int startX = startCoords.get(0);
            int startY = startCoords.get(1);
            Word wordObject = new Word(word);
            boolean found = false;
            int[] fixedDirection = null;

            for (int i = 1; i < word.length(); i++) {
                char nextLetter = word.charAt(i);
                int foundX = -1;
                int foundY = -1;

                int[][] directions = {
                        {-1, 0}, // Вверх
                        {0, -1}, // Влево
                        {1, 0},  // Вниз
                        {0, 1},  // Вправо
                        {-1, -1}, // Вверх и влево (диагональ)
                        {-1, 1},  // Вверх и вправо (диагональ)
                        {1, -1},  // Вниз и влево (диагональ)
                        {1, 1}    // Вниз и вправо (диагональ)
                };

// Проверка всех направлений
                if (fixedDirection == null) {
                    // Проверка всех направлений
                    for (int[] direction : directions) {
                        int newX = startX + direction[0];
                        int newY = startY + direction[1];

                        if (newX >= 0 && newX < crossword.length && newY >= 0 && newY < crossword[0].length) {
                            if (crossword[newX][newY] == nextLetter) {
                                foundX = newX;
                                foundY = newY;
                                fixedDirection = direction; // Фиксируем направление
                                break;
                            }
                        }
                    }
                } else {
                    // Используем зафиксированное направление
                    int newX = startX + fixedDirection[0];
                    int newY = startY + fixedDirection[1];

                    if (newX >= 0 && newX < crossword.length && newY >= 0 && newY < crossword[0].length) {
                        if (crossword[newX][newY] == nextLetter) {
                            foundX = newX;
                            foundY = newY;
                        }
                    }}

                if (foundX != -1) {
                    startX = foundX;
                    startY = foundY;
                } else {
                    skipNumbers.add(Arrays.asList(startX, startY));
                    break; // Если буква не найдена, выход из цикла
                }

                // Если последняя буква найдена
                if (i == word.length() - 1) {
                    wordObject.setStartPoint(startCoords.get(1), startCoords.get(0));
                    wordObject.setEndPoint(startY, startX);
                    found = true;
                }
            }

            result.add(wordObject);

        }

        for (Word word : result) {
            System.out.println(word);
        }
        System.out.println(result.size() == words.length);
        return result;
    }

    public static List<Integer> findCoords(List<List<Integer>> skipNumbers, int[][] crossword, char letter) {


        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                if (crossword[i][j] == letter && !skipNumbers.contains(Arrays.asList(i, j))) {
                    return Arrays.asList(i, j);
                }
            }
        }
        return null;

    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}