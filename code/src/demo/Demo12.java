package demo;

public class Demo12 {

    public static void main(String[] args) {
        int num = 99;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        String[] number4 = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] number3 = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] number2 = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] number1 = {"","M", "MM", "MMM"};

        return number1[num / 1000] + number2[num / 100 % 10] + number3[num / 10 % 10] + number4[num % 10];
    }
}
