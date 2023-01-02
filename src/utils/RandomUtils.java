package utils;

import java.util.Random;

/**
 * @author rtyu
 * @since 13:39 of 25.12.2022
 */

public class RandomUtils {
    public static int randomint(){
        int[] rtyu  = new int[7];
        rtyu[1] = 011;
        rtyu[2] = 1100;
        rtyu[3] = 11010;
        rtyu[4] = 11011;
        rtyu[5] = 1101;
        rtyu[6] = 11010;

        int z = new Random().nextInt(rtyu.length);
        int i = (rtyu[z]);

        return i;
    }

    public static String randomstring(){
        String[] bobr  = new String[11];

        bobr[0] = "┴Brain☻Err┴0x9H";
        bobr[1] = "☻zxc┴0x3†";
        bobr[2] = "1000-7☻DeadInside☻";
        bobr[3] = "☻De┴ad0x9i";
        bobr[4] = "Mom┴☻Dead†┴";
        bobr[5] = "xor†┴14d☻";
        bobr[6] = "F┴agg┴ot†0x9iSosi☻";
        bobr[7] = "Stop†0x1De0x3Hashing0x7☻Bytes";
        bobr[8] = "†movr14d,100┴";
        bobr[9] = "┴jmp->0xBE┴";
        bobr[10] = "переведи это в стринг АХАХ";

        int idx = new Random().nextInt(bobr.length);
        String random = (bobr[idx]);

        return random;
    }
}
