package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] newProducts = new String[0] ;


        Product iphone = new Product(1," Iphone",1200,"Flagship");
        Product samsung = new Product(2," Samsung",980,"Made in China");
        Product oppo = new Product(3, " Oppo",689,"Good Looking");
        Product pixel = new Product(4," Pixel",3000, "Excellent at taking photos");
        Product appleWatch = new Product(4," AppleWatch",259,"Watch device");

        newProducts = iphone.addProduct(newProducts);
        newProducts = samsung.addProduct(newProducts);
        newProducts = oppo.addProduct(newProducts);
        newProducts = pixel.addProduct(newProducts);
        newProducts = appleWatch.addProduct(newProducts);

        Arrays.sort(newProducts);

//        newProducts = samsung.delProduct(newProducts);
//        samsung.findProduct(newProducts);
//        pixel.findProduct(newProducts);
        System.out.println(Arrays.toString(newProducts));
//        System.out.println(Arrays.toString(samsung.sortArray(newProducts)));


    }



}
