package pactice;

import model.Product;

import java.util.*;

public class Practice_Session3_4 {

    public static void main(String args[]) {
        int[] arrayList = new int[] {1, 11, 12, 16, 30, 54, 6, 61, 65, 66};

        System.out.println("Find number 6 in list :" + Arrays.toString(arrayList));
        for (int i=0;i<arrayList.length;i++){
            if (6==arrayList[i]) {
                System.out.println("Number 6 is at index :" + i);
                break;
            }
            if (i==(arrayList.length-1))
                System.out.println("No number 6 in the list");
        }

        Random random = new Random();
        List<Product> productList = new ArrayList<>();
        Set<Product> productSet = new HashSet<>();
        for(int i=0;i<6;i++){
            Product product = new Product();
            product.setTitle("Title 1:"+(i+1));
            product.setDescription("Description 1:"+(i+1));
            product.setPrice(random.nextInt(200));
            product.setQuality(i*2+1);
            productList.add(product);
            productSet.add(product);
        }

        System.out.println("Product from list :");
        for(Product product:productList){
            if(product.getPrice()>=100){
                System.out.println(product.toString());
            }
        }

        System.out.println("Product from set :");
        for(Product product:productSet){
            if(product.getPrice()>=100){
                System.out.println(product.toString());
            }
        }
    }
}
