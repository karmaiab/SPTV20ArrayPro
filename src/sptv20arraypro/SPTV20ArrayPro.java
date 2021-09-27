/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20arraypro;

import java.util.Arrays;
import java.util.Random;



/**
 *
 * @author user
 */
public class SPTV20ArrayPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Массивы в Java
        int[] nums;
        nums = new int[5];
//        nums[0]=1;
//        nums[1]=2;
//        nums[2]=3;
//        nums[3]=4;
//        nums[4]=5;
        for(int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }
        //Вывод массива в консоль
        System.out.print("nums =  [");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //или так
        System.out.println("nums = "+Arrays.toString(nums));
        //Копированние массива
//        int[] nums2 = new int[7];
//        for(int i = 0;i<nums.length;i++){
//            nums2[i] = nums[i];
//        }
//        System.arraycopy(nums, 0, nums2, 0, nums.length);
        int[] nums2 = Arrays.copyOf(nums, 7);
        System.out.println("nums2 = "+Arrays.toString(nums2));
        nums = nums2;
        System.out.println("nums = "+Arrays.toString(nums));
        
        System.out.println("Многомерные массивы");
        int [][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i*j;
            }
        }
        int[] sumCols = new int [5];
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d",matrix[i][j] = i*j);
                sum += matrix[i][j];
                sumCols[j] += matrix[i][j];
            }
            System.out.println("| the sum is: " +sum);
        }
        System.out.println("   --The sum of the Colums--");
        for (int i = 0; i < sumCols.length; i++) {
            System.out.printf("%3d",sumCols[i]);
        }
        System.out.println();
        System.out.println("Зубчиатые массивы");
        int[][] matrixZ = new int[5][];
        matrixZ[0] = new int[1];
        matrixZ[1] = new int[6];
        matrixZ[2] = new int[3];
        matrixZ[3] = new int[4];
        matrixZ[4] = new int[5];
        Random random = new Random();
        int min = 0, max = 9;
        int[] sumColsZ = new int[max];
        for (int i = 0; i < matrixZ.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrixZ[i].length; j++) {
                matrixZ[i][j] = random.nextInt(max - min + 1);
                System.out.printf("%3d,", matrixZ[i][j]);
                sum += matrixZ[i][j];
                sumColsZ[j] += matrixZ[i][j];
            }
            System.out.println("| the sum: " +sum);
        }
        System.out.println("  Sum of colums");
        for (int i = 0; i < sumColsZ.length; i++) {
            System.out.printf("%3d,", sumColsZ[i]);
        }
        System.out.println();
    }
    
    
}
