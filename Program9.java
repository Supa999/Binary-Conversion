package Assignment4;

public class Program9 {
    public static void main(String[] args) {
        System.out.println(decimalConversion(42,2));
        System.out.println(decimalConversion(42, 16));
        System.out.println(decimalConversion(42,8));
        System.out.println(decimalConversion(341,2));
        System.out.println(decimalConversion(341,8));
        System.out.println(decimalConversion(1,8));
        System.out.println(decimalConversion(207,16));
        System.out.println(decimalConversion(207,2));


    }


    public static String decimalConversion(int num, int base) {
        if(base == 2 && num != 0) {
            return decimalConversion(num / 2, 2) + num % 2;
        }
        if(base == 8 && num != 0) {
            return decimalConversion(num / 8, 8) + num % 8;
        }
        if(base == 16 && num != 0) {
            if(num % 16 >= 10) return decimalConversion(num/16,16) + remainder(num % 16);
            return decimalConversion(num / 16, 16) + num % 16;
        }

        return "";
    }
    
    public static String remainder(int remainder) {
        switch(remainder) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12: 
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
        }
        return "";
    }


}
