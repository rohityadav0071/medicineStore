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
		System.out.println("[1] Add medicine [2] Remove medicine  [3] update [4]Print All Medicine" +
				"[5] print only homeopathy  [6] print only allopathy [7] print only aiurvedic "
				+ "[8]prit only yunani [9] exit ");
		int option = scanner.nextInt();
		return option;
	}
	
	public void updateMedicine() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name of the medicine");
		String updateName = scanner.nextLine();
		
		
	}
}
