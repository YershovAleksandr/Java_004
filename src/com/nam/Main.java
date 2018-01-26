package com.nam;

public class Main {

    static void VaTest(int ... v)
    {
        System.out.println("Length = " + v.length);

        int i = 0;

        for (int x : v)
        {
            System.out.println("Arg [" + i++ + "] = " + x);
        }

    }

    public static void main(String[] args)
    {
	// write your code here

        String str = "WWW1";

        System.out.println("Wtf " + str);

        String str2 = "WWW1";

        boolean tr = str.equals(str2);

        int len = str.length();

        char ch = str.charAt(2);

        System.out.println("Ret = " + tr + " Length = " + len + " cht 4 = " + ch);

        for (String a : args)
        {
            System.out.println("arg = " + a);
        }

        VaTest(1, 2 , 3);

        VaTest(4, 8, 16, 32);

        VaTest();

        VaTest(42);


    }
}
