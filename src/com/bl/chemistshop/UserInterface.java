package com.bl.chemistshop;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public void printHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.HOMEOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}	
	}
	
	public void printAllopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.ALLOPATHY) {
				System.out.println(list.get(i));
			}
		}	
	}
	
	public void printAiurvedic(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.AIURVEDIC) {
				System.out.println(list.get(i));
			}
		}	
	}
	
	int showMainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" [1] Add medicine \n [2] Remove medicine \n [3] update \n [4]Print All Medicine" +
				"\n [5] print only homeopathy \n [6] print only allopathy \n [7] print only aiurvedic "
				+ "\n [8] prit only yunani \n [9] exit ");
		int option = scanner.nextInt();
		return option;
	}
	
	public void update(Medicine medicine) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. change name \n 2.change company name \n 3. change mfg date /n 4.change expdate \n change constrains ");
		int choose = scanner.nextInt();
		
		switch (choose){
		
		case 1:
			
			
			
		}
		
	}
}
