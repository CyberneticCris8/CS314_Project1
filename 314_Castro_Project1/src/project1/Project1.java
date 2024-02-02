/*
 * Project Name: COCS 314: Final Project
 * Author: Cristopher Castro
 * Date: 10/27/2023
 * Description: Program that takes 10x10 0-1 matrix and identifies it's properties (Reflexive, AntiReflexive, Symmetric, AntiSymmetric)
 */
package project1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1 {

public static boolean reflexive(int[][] refMatrix) {
	for (int i = 0; i < refMatrix.length; i++) {
		if (refMatrix[i][i] != 1) {
			return false;
		}
	} 
	return true; 
} 	

public static boolean antiReflexive(int[][] antiRefMatrix) {
	for (int i = 0; i < antiRefMatrix.length; i++) {
		if (antiRefMatrix[i][i] != 0) {
				return false;
			}
	}	
	return true; 
}

public static boolean symmetric(int[][] symMartix) { 
	for (int i = 0; i < symMartix.length; i++) {
		for (int j = 0; j < symMartix.length; j++) {
			if (symMartix[i][j] != symMartix[j][i]) {
				return false;
			} 
		}
	}
	return true;
}
public static boolean antiSymmetric(int[][] antiSymMartix) {
	for (int i = 0; i < antiSymMartix.length; i++) {
		for (int j = 0; j < antiSymMartix.length; j++) {
			if (antiSymMartix[i][j] == antiSymMartix[j][i]) {
				return false;
			} 
		}
	}
	return true; 
}

public static void main(String[] args) {					
	Scanner input = new Scanner(System.in);
	System.out.println("File input: ");
	String fileName = input.nextLine();
	File matrx = new File(fileName);
	Scanner matrxFile;
	try {
		matrxFile = new Scanner(matrx);
		int[][] matrixFile = new int[10][10]; 
		for (int i = 0; i < matrixFile.length; i++) { 
			for (int j = 0; j < matrixFile.length; j++) {
				if (matrxFile.hasNextInt()) {
					matrixFile[i][j] = matrxFile.nextInt();
				} 
			}
		}
		if (reflexive(matrixFile)) {
			System.out.println("Reflexive - yes");
		} else {
			System.out.println("Reflexive - no");
		}
		if (antiReflexive(matrixFile)) {
			System.out.println("Antireflexive - yes");
		} else {
			System.out.println("Antireflexive - no");
		}
		if (symmetric(matrixFile)) {
			System.out.println("Symmetric - yes");
		} else {
			System.out.println("Symmetric - no");
		}
		if (antiSymmetric(matrixFile)) {
			System.out.println("Antisymmetric - yes");
		} else {
				System.out.println("Antisymmetric - no");
		}
	} 
	
	 catch (FileNotFoundException e) {
		System.out.println("Input File Not Found");
		}
	} 
}
			
		
	






	

	


