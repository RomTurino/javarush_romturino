package level30;

import java.util.*;

public class RectanleCount {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        if (a == null) {
            return 0;
        }

        boolean[][] visited = new boolean[a.length][a[0].length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                // Если находим единицу и она еще не посещена
                if (a[i][j] == 1 && !visited[i][j]) {
                    count++; // Увеличиваем счетчик групп
                    markVisited(a, visited, i, j); // Помечаем все единицы в этой группе как посещенные
                }
            }
        }

        return count;
    }

    private static void markVisited(byte[][] a, boolean[][] visited, int x, int y) {
        // Проверяем границы массива
        if (x < 0 || x >= a.length || y < 0 || y >= a[0].length || a[x][y] == 0 || visited[x][y]) {
            return;
        }

        // Помечаем текущую единицу как посещенную
        visited[x][y] = true;

        // Рекурсивно проверяем соседние ячейки (вверх, вниз, влево, вправо)
        markVisited(a, visited, x + 1, y);
        markVisited(a, visited, x - 1, y);
        markVisited(a, visited, x, y + 1);
        markVisited(a, visited, x, y - 1);
    }
}
