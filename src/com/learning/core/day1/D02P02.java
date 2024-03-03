package com.learning.core.day1;

public class D02P02 {
	public static void main(String args[]) {
		Tablet t = new Tablet();
		Syrup s = new Syrup();
		Ointment o = new Ointment();
		
		t.displayLabel();
		s.displayLabel();
		o.displayLabel();
	}
}

interface MedicineInfo {
	void displayLabel();
}

class Tablet implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Store in a cool dry place.");
	}
}

class Syrup implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription.");
	}
}

class Ointment implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Ointment is For external use only.");
	}

}
