import java.util.ArrayList;
import java.util.List;

public class MinimumSwapBalls {
    public static int solution(String s) {

        int arrSize = s.length();

        // tüm toplar "R" veya "W" ise
        if (arrSize == 0 || s.replaceAll("W", "").isEmpty() || s.replaceAll("R", "").isEmpty()) {
            return 0;
        }

        // (R) topların indeksleri
        List<Integer> redBallIndices = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) {
            if (s.charAt(i) == 'R') {
                redBallIndices.add(i);
            }
        }

        int swaps = 0;
        int leftPointer = 0;
        int rightPointer = redBallIndices.size() - 1;

        // Sol taraftan ve sağ taraftan başlayarak, her iki "R" topunu yan yana getir
        while (leftPointer < rightPointer) {
            swaps += redBallIndices.get(rightPointer) - redBallIndices.get(leftPointer) - (rightPointer - leftPointer);
            leftPointer++;
            rightPointer--;
        }

        return swaps;
    }


    public static void main(String[] args) {

        System.out.println("0 -> " + solution("W"));
        System.out.println("0 -> " + solution("WWWWWWW"));
        System.out.println("0 -> " + solution("R"));
        System.out.println("0 -> " + solution("RRRRRRR"));
        System.out.println("0 -> " + solution("WWR"));
        System.out.println("4 -> " + solution("WWRWWWRWR"));
        System.out.println("2 -> " + solution("WRRWWR"));
        System.out.println("2 -> " + solution("RWWRR"));
        System.out.println("4 -> " + solution("RWWWWR"));
        System.out.println("2 -> " + solution("WRWWRR"));
        System.out.println("2 -> " + solution("RRWWRW"));
        System.out.println("9 -> " + solution("RWWRWWWRWR"));
        System.out.println("4 -> " + solution("WRWWRRWWR"));
        System.out.println("84 -> " + solution("RWWRWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRR"));
    }
}