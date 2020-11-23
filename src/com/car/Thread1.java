package com.car;




import java.util.Random;

public class Thread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("1 @ petrolpump");
			}
			Random r = new Random();
			int q = r.nextInt(6);
			counter c = new counter();
			c.count(q);
			int j = 1;
			result w = new result(i, j);
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("2 @ petrolpump");
			}
			Random r = new Random();
			int q = r.nextInt(6);
			counter c = new counter();
			c.count(q);
			int j = 2;
			result w = new result(i, j);
		}
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("3 @ petrolpump");
			}
			Random r = new Random();
			int q = r.nextInt(6);
			counter c = new counter();
			c.count(q);
			int j = 3;
			result w = new result(i, j);
		}
	}
}

class Thread4 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("4 @ petrolpump");
			}
			Random r = new Random();
			int q = r.nextInt(6);
			counter c = new counter();
			c.count(q);
			int j = 4;
			// int j=1;
			result w = new result(i, j);
		}
	}
}

class Thread5 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("5 @ petrolpump");
			}
			Random r = new Random();
			int q = r.nextInt(6);
			counter c = new counter();
			c.count(q);
			int j = 5;
			result w = new result(i, j);
		}
	}
}

class Thread6 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("6 @ petrolpump");
			}
			Random r = new Random();
			int q = r.nextInt(6);
			counter c = new counter();
			c.count(q);
			int j = 6;
			result w = new result(i, j);
		}
	}
}

class counter {
	public void count(int i) {
		int sum = 0;
		for (int j = i; j < 25; j++) {
			sum = sum + i;
		}
	}
}

class result {
	result(int i, int j) {
		if (i == 10) {
			System.out.println(j + "reached destination");
		}
	}
}