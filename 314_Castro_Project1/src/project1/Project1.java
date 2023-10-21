/*
 * Project Name: COCS 314: Project 1
 * Author: Cristopher Castro
 * Date: 10/27/2023
 * Description: Program that takes 10x10 0-1 matrix and identifies it's properties (Reflexive, AntiReflexive, Symmetric, AntiSymmetric)
 */
package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1 {
	/*
public static int[][] matrix(int [][] maxFile) throws FileNotFoundException {

	Scanner input = new Scanner(System.in);
	System.out.println("File input: ");
	String fileName = input.nextLine();
	File matrx = new File(fileName);
	Scanner matrxFile = new Scanner(matrx); 

	int matrixFile[][] = new int[10][10]; 
	for (int i = 0; i < matrixFile.length; i++) {
		for (int j = 0; j < matrixFile.length; j++) {
			matrixFile[i][j] = matrxFile.nextInt(); 
			
		}
	}
	System.out.println(matrixFile);
	return maxFile;

}
*/
public static int[][] reflexive(int[][] refMatrix) {
	int[][] refMatrx; 
		for (int i = 0; i < refMatrx.length; i++) {
			for (int j = 0; j < refMatrx.length; j++) {
				if (refMatrx[i][j] == 1 && refMatrx[j][i] == 1) {
					return refMatrx;
				} else {
					System.out.println("Reflexive - error");
				}
			}	
		}
	return refMatrix;
		
}
public static int[][] antiReflexive(int[][] antiRefMatrix) {
	int[][] antiMatrx; 
		for (int i = 0; i < antiMatrx.length; i++) {
			for (int j = 0; j < antiMatrx.length; j++) {
				if (antiMatrx[i][j] != 1 && antiMatrx[j][i] != 1) {
				return antiMatrx;
				} else {
				System.out.println("AntiReflexive - error");
			}
		}	 
	}
	return antiRefMatrix;
}

public static int[][]symmetric(int[][] symMartix) {
	int[][] symMatrx; 
		for (int j = 0; j < symMatrx.length; j++) {
			for (int i = 0; i < symMatrx.length; i++) {
				if (symMatrx[i][j] == symMatrx[j][i]) {
				return symMatrx;
			} else {
				System.out.println("symmetric - error");
			}
		}
	}
	return symMartix;
}
public static int [][]antiSymmetric(int[][] antiSymMartix) {
	int[][] antiSymMatrx; 
		for (int j = 0; j < antiSymMatrx.length; j++) {
			for (int i = 0; i < antiSymMatrx.length; i++) {
				if (antiSymMatrx[i][j] != antiSymMatrx[j][i]) {
				return antiSymMatrx;
			} else {
				System.out.println("symmetric - error");
			}
		}
	}
	return antiSymMartix;
}

public static void main(String[] args) throws FileNotFoundException {
	
	Scanner input = new Scanner(System.in);
	System.out.println("File input: ");
	String fileName = input.nextLine();
	File matrx = new File(fileName);
	Scanner matrxFile = new Scanner(matrx); 

	int[][] matrixFile = new int[10][10]; 
	for (int i = 0; i < matrixFile.length; i++) {
		for (int j = 0; j < matrixFile.length; j++) {
			matrixFile[i][j] = matrxFile.nextInt(); 
			int[][] resultMat = reflexive(matrixFile[i][j]); 
		}
	}
	
	
	

}

}

	

	


