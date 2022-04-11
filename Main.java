package com.programacion.funcional;

class HelloWorld{

     static void patron(int val){
        for (int i = val, x = 0; i >= 1; i--, x += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(' ');
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }     }


    public static void main(String []args){
        HelloWorld.patron(5);
    }
}
