import java.awt.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class B1C {
    public static void main(String[] args) {
        String[][] map = {
            {"*", "*", "*", "*"},
            {"*", "*", "*", "*"},
            {"*", "*", "P", "*"},
            {"*", "*", "*", "*"}
        };
//        ArrayList<Point> position = Array.asList(
//                new Point(0, 0);
//                new Point(0, 1);
//                new Point(0, 2);
//                new Point(0, 3);
//                new Point(1, 0);
//                new Point(1, 1);
//                new Point(1, 2);
//                new Point(1, 3);
//                new Point(2, 0);
//                new Point(2, 1);
//                new Point(2, 2);
//                new Point(2, 3);
//                new Point(3, 0);
//                new Point(3, 1);
//                new Point(3, 2);
//                new Point(3, 3);
//        );
        ArrayList<Point> position = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                position.add(new Point(j,i));
            }
        }
        position.remove(10);

        Random random = new Random();
        int result = add(1,2)
        int x = 2;
        int y = 2;
        Point point = position.remove(random.nextInt(position.size()));
        int enemy1x = point.x;
        int enemy1y = point.y;

        point = position.remove(random.nextInt(position.size()));
        int enemy2x = point.x;
        int enemy2y = point.y;

        point = position.remove(random.nextInt(position.size()));
        int giftx = point.x;
        int gifty = point.y;

        map[enemy1y][enemy1x] = "N";
        map[enemy2y][enemy2x] = "D";
        map[y][x] = "G";

        while (true) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            if (giftx == x && gifty == y) {
                System.out.println("win");
                break;
            }
            System.out.println("Nhap ban phim: ");
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();
            switch (key) {
                case "a":
                    if (x == 0) {
                        x = map.length -1;
                    } else {
                        x -=1;
                    }
                    break;
                case "d":
                    if (x == map.length - 1) {
                        x = 0;
                    } else {
                        x += 1;
                    }
                    break;
                case "w":
                    if (y == 0) {
                        y = map[0].length -1;
                    } else {
                        y -=1;
                    }
                    break;
                case "s":
                    if ( y == map[0].length -1) {
                        y = 0;
                    } else {
                        y += 1;
                    }
                    break;
                    default:
                        System.out.println("Key khong dung");
                        break;
            }
            if (giftx == x && gifty == y) {
                System.out.println("win");
                break;
            }
            map[enemy1y][enemy1x] = "*";
            map[enemy2y][enemy2x] = "*";
            if (((x == enemy1x) && (y == enemy1y)) || ((x == enemy2x) && (y = enemy2y))) {
                System.out.println("Lose");
                break;
            }
            enemy1x = (enemy1x + 1) % map.length;
            enemy2y = (enemy2y + 1) % map[0].length;
            if (enemy1x != giftx || enemy1y != gifty)
            map[enemy1y][enemy1x] = "N";
            map[enemy2y][enemy2y] = "D";

            map[y][x] = "P";
        }
    }
    static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

            }
        }
    }
}
