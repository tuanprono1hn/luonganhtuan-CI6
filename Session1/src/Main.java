import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
//        <kieu cua bien> tenbien
//        byte //-128 127
//        short // -2^15 2^15-1
//        int // -2^31 2^31-1
//        long // -2^63 2^63-1
//        float // -3.4*10^38 3.4*10^38
//        double // -1.7*10^308 1.7*10^38
//        boolean // true false
//        char // "1 ky tu duy nhat"
//        int a = 3;
//        int b = 2;
//        int c = a / b;
//        System.out.println(c);
        //        float a = 3;
        //        String s = "Hello, World";
        //        String s1 = " CI6 ";
        //        String result = s + s1 + a;
        //        System.out.println(result);
//        // if - else
//                int a = 3;
        //        boolean result = true;
        //
        //        if (!result) {
        //
        //        } else {
        //
        //        }
        //
        //        if (a <= 3) {
        //            System.out.println("abc");
        //        } else if (a==4) {
        //
        //        } else {
        //
        //        }
//        String s1 = "ahihi";
//        String s2 = "ahihi";
//        if ((s1 == s2) || (a == 3)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        switch (a) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                break;
//                default:
//                    break;
//        }
    //        for (int i = 5; i > 0; i -= 1) { //tang i len 1 //tang i len 2
    //            System.out.println(i);
    //        }
//        int i = 0;
////        while (i < 5) {
////            //code
////            System.out.println(i);
////            i += 1;
////        }
//        do {
//            i++;
//            System.out.println(i);
//        } while (i < 5);
//        int[] array = new int[10];
//        int[] list = {1,3,4,-4,1,0};
//
        //        List<String> list = new ArrayList<>();
        //        list.add("a");
        //        list.add("b");
        //        list.add("c");
        //        list.add( "d");
        //        String string = list.get(0);
        //        for (int i = 0; i < list.size(); i++) {
        //
        //        }
        //        for (String string: list) {
        //
        //        }
//        array[0] = 1;
//        array[1] = 2;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//            System.out.println(array[i]);
//        }
//        for (int element: array) {
//            System.out.println(element);
//        }
        //        Scanner scanner = new Scanner(System.in);
        //        int a = scanner.nextInt();
        //        double b = scanner.nextDouble();
        //        String a = scanner.next();
        //        System.out.println(a);
        //        String[][] array = new String[4][4];
        //        String[][] list = {
        //                {"*","*"},
        //                {"*","*"}
        //        };
//        String[][] map = new String[4][4];
//        for (int i = 0; i < 4; i++) {
//            for (int k = 0; k < 4; k++) {
//                map[i][k] = "* ";
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            System.out.println();
//            for (int k = 0; k < 4; k++){
//                System.out.print(map[i][k] + "");
//            }
//        }
//        int x = 0;
//        int y = 2;
//        int dx = 1;
//        int dy = 1;
//        map[x][y] = "P";
//        Scanner scanner = new Scanner(System.in);
//        String m = scanner.next();
//        switch (m.equalsIgnoreCase()) {
//            case "a":
//                x -= dx;
//            case "s":
//                y -= dy;
//            case "d":
//                x += dx;
//            case "w":
//                y += dy;
//        }
        int map_sokoban = 4;
        int[] player = {2, 1};
        int[] enemy_doc = new int[2];
        int[] enemy_ngang = new int[2];
        boolean is_player, is_eneny;

        Random random = new Random();
        while (true) {
            enemy_doc[0] = random.nextInt(map_sokoban);
            enemy_doc[1] = random.nextInt(map_sokoban);
            if ((enemy_doc[0] != player[0]) && (enemy_doc[1] != player[1])) {
                break;
            }
        }
        while (true) {
            enemy_ngang[0] = random.nextInt(map_sokoban);
            enemy_ngang[1] = random.nextInt(map_sokoban);
            if ((enemy_ngang[0] != player[0]) && (enemy_ngang[1] != player[1]) && (enemy_ngang[0] != enemy_doc[0]) && (enemy_ngang[1] != enemy_doc[1])) {
                break;
            }
        }
        while(true) {
            for (int y = 0; y < map_sokoban; y++) {
                for (int x = 0; x < map_sokoban; x++) {
                    is_player = false;
                    if (x == player[0] && y == player[1]) {
                        System.out.print("P ");
                        is_player = true;
                    }
                    is_eneny = false;
                    if ((x == enemy_doc[0] && y == enemy_doc[1]) || (x == enemy_ngang[0] && y == enemy_ngang[1])) {
                        System.out.print("E ");
                        is_eneny = true;
                    }
                    if ((!is_player) && (!is_eneny)) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            Scanner scanner = new Scanner(System.in);
            String move = scanner.next().toLowerCase();
            int dx = 0;
            int dy = 0;
            int ene_move = 1;
            switch (move){
                case "a":
                    dx = -1;
                    break;
                case "s":
                    dy = 1;
                    break;
                case "d":
                    dx = 1;
                    break;
                case "w":
                    dy = -1;
                    break;
                default:
                    System.out.println("Enter a,s,d,w: ");
                    break;
            }
//            EX_1:
//            if (0 > player[0] + dx || player[0] + dx >= map_sokoban || 0 > player[1] + dy || player[1] + dy >= map_sokoban) {
//                System.out.println("Can't move!!");
//            }
//            else {
//                player[0] += dx;
//                player[1] += dy;
//            }
//            EX2:
            if (player[0] + dx >= map_sokoban) {
                player[0] = 0;
            }
            else if (player[0] + dx < 0) {
                player[0] = map_sokoban -1;
            }
            else if (player[1] + dy >= map_sokoban) {
                player[1] = 0;
            }
            else if (player[1] + dy <0) {
                player[1] = map_sokoban -1;
            }
            else {
                player[0] += dx;
                player[1] += dy;
            }
//            EX3:
//            else if (enemy_ngang[0] + ene_move >= map_sokoban) {
//                enemy_ngang[0] = 0;
//            }
//            else if (enemy_ngang[0] + ene_move < 0) {
//                enemy_ngang[0] = map_sokoban -1;
//            }
//            else if (enemy_doc[1] + ene_move >= map_sokoban) {
//                enemy_doc[1] = 0;
//            }
//            else if (enemy_doc[1] + ene_move <0) {
//                enemy_doc[1] = map_sokoban -1;
//            }
//            else {
//                player[0] += dx;
//                player[1] += dy;
//                enemy_ngang[0] += ene_move;
//                enemy_doc[1] += ene_move;
//                if (((player[0] == enemy_doc[0]) && (player[1] == enemy_doc[1])) || ((player[0] == enemy_ngang[0]) && (player[1] == enemy_ngang[1]))) {
//                    System.out.println("You're Dead");
//                }
//            }

        }
    }
}
//sout
//psvm