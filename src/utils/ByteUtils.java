package utils;

import java.security.SecureRandom;
import java.util.*;

/**
 * @author rtyu
 * @since 10:14 of 24.12.2022
 */

public class ByteUtils {
    static String negr = new Scanner(System.in).nextLine();
    static byte[] sex = negr.getBytes();
    private static final Map<String, byte[]> bytes = new HashMap<>();

    static SecureRandom rnd = new SecureRandom();
    static Random r = new Random();
    static StringBuilder builder = new StringBuilder();
    static StringBuilder zxc1 = new StringBuilder();

    public static void vByte() {

        System.out.println("БАЙТЫ: ");

        for (byte b : sex) {
            builder.append(String.format(RandomUtils.randomint() + "0" + RandomUtils.randomstring() + "x" + RandomUtils.randomint() + "%02X" + RandomUtils.randomint(), b));
        }

        String gey = builder.toString();
        byte[] penis = gey.getBytes();

        for (byte k : penis) {
            zxc1.append(String.format("0x%02X ", k));
        }

        System.out.println(builder.toString());
    }

    //sex
    public static void izByte() {
        String bit1 = builder.toString();

        String l = bit1.replaceAll("┴Brain☻Err┴0x9H", "");
        String g = l.replaceAll("1000-7☻DeadInside☻", "");
        String o = g.replaceAll("☻zxc┴0x3†", "");
        String u = o.replaceAll("☻De┴ad0x9i", "");
        String n = u.replaceAll("Mom┴☻Dead†┴", "");
        String d = n.replaceAll("xor†┴14d☻", "");
        String k = d.replaceAll("F┴agg┴ot†0x9iSosi☻", "");
        String v = k.replaceAll("Stop†0x1De0x3Hashing0x7☻Bytes", "");
        String c = v.replaceAll("†movr14d,100┴", "");
        String p = c.replaceAll("┴jmp->0xBE┴", "");
        String x = p.replaceAll("переведи это в стринг АХАХ", "");
        String z = x.replaceAll("011", "");
        String f = z.replaceAll("1100", "");
        String i = f.replaceAll("1101", "");
        String q = i.replaceAll("1101", "");
        String y = q.replaceAll("11011", "");
        String a = y.replaceAll("11010", "");
        String s = a.replaceAll("11", "");
        String kvn = s.replaceAll("0", "");

        String openis = kvn.replaceAll("x", "0x");
        String xu = openis.replaceAll("90", "0");

        System.out.println("\nОБРАТНО В СТРИНГ: ");
        byte[] bavarca = xu.getBytes();
        String gz = new String(sex);
        String zg = new String(gz);
        System.out.println(zg);
    }
    public static void byteTo() {

        String bit1 = new Scanner(System.in).nextLine();

        String l = bit1.replaceAll("┴Brain☻Err┴0x9H", "");
        String g = l.replaceAll("1000-7☻DeadInside☻", "");
        String o = g.replaceAll("☻zxc┴0x3†", "");
        String u = o.replaceAll("☻De┴ad0x9i", "");
        String n = u.replaceAll("Mom┴☻Dead†┴", "");
        String d = n.replaceAll("xor†┴14d☻", "");
        String k = d.replaceAll("F┴agg┴ot†0x9iSosi☻", "");
        String v = k.replaceAll("Stop†0x1De0x3Hashing0x7☻Bytes", "");
        String c = v.replaceAll("†movr14d,100┴", "");
        String p = c.replaceAll("┴jmp->0xBE┴", "");
        String x = p.replaceAll("переведи это в стринг АХАХ", "");
        String z = x.replaceAll("011", "");
        String f = z.replaceAll("1100", "");
        String i = f.replaceAll("1101", "");
        String q = i.replaceAll("1101", "");
        String y = q.replaceAll("11011", "");
        String a = y.replaceAll("11010", "");
        String s = a.replaceAll("11", "");
        String kvn = s.replaceAll("0", "");

        String openis = kvn.replaceAll("x", "0x");
        String xu = openis.replaceAll("90", "0");

        System.out.println("\nОБРАТНО В СТРИНГ: ");
        byte[] bavarca = xu.getBytes();
        String gz = new String(sex);
        String zg = new String(gz);
        System.out.println(zg);
    }
}
