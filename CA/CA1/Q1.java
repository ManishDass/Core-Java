/*
 * Program to demonstrate iterating two dimensional array using enhanced for
 * loop
 */
public class Q1 {
        public static void main(String[] args) {
                int[][] courseCode = { { 716, 717, 456 }, { 756, 625, 839 }, { 236, 227, 890 }, { 559, 557, 920 },{ 550, 540, 955 },{ 459, 647, 753 } };
 
                System.out.println("Below are the Available Course Code for MCA students Semester wise: \n");
                for (int[] row : courseCode) {
                        for (int j : row) {
                                System.out.print("CAP" + j + "\t");
                        }
                        System.out.println(""); //new line
                }
        }
}