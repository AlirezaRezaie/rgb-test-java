package help;

public class gettingRGBrules {
    public static void main(String[] args) {
        int num = -10136250;
        // this is ARGB value
        System.out.println(Integer.toBinaryString(num));
        // two hex place _,_ is 8 bit's
        // bitmasking the 32 bit value and getting 4 * 8 bits from it
        /////////////////////////////////////////////////////////////
        // R first byte representing red
        System.out.println(num & 0xff);
        // G second byte with first byte masked
        // (so removing first byte with >> 8 right shift)
        System.out.println((num & 0xff00) >> 8);
        // B third byte with first and second bytes masked
        // (so removing first and second byte with >> 16 right shift)
        System.out.println((num & 0xff0000) >> 16);
        // A fourth byte with first and second and third bytes masked
        // (so removing first and second and third byte with >> 24 right shift)
        System.out.println((num & 0xff000000) >> 24);

    }
}
