package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int n =0;
        System.out.println("Введите кол-во строк");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Введите строки");
        String[] f = new String[n];

        for(int i =0; i < n; i++)
        {
            f[i] = new String(sc.next());
        }
        sc.close();
        int max =-1;
        int ind = -1;
        boolean l = false;
        for(int i = 0; i < n; i++)
        {
            String t = f[i];
            char[] setUni = t.toCharArray();
            int m = t.length();
            for(int j =0; j< setUni.length; j++)
            {
                if(j != t.indexOf(setUni[j]))
                {
                    m--;
                }
            }
            if(m == max)
            {
                l = true;
                break;
            }
            if(m > max){
                max = m;
                ind = i;
            }
        }
        if(l)
        {
            System.out.println(f[0]);
        }
        else
        {
            System.out.println(f[ind]);
        }
    }
}
