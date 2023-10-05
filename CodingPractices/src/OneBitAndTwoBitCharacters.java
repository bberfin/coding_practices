public class OneBitAndTwoBitCharacters {
    public static boolean isOneBitCharacter(int[] bits) {

        int bitSize = bits.length;

        for (int i = 0; i < bitSize; i++) {
            if (bits[i] == 1) {
                if (i + 2 <= bitSize - 1)
                    i = i + 1;
                else
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0};
        int[] nums2 = {1, 0, 0};
        System.out.println(isOneBitCharacter(nums2));
    }
}