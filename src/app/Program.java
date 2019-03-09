package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int proc = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == proc) {
					System.out.println("Position " + i + ", " + j + ":");
					if (j - 1 >= 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
					}
					if (i - 1 >= 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}

					if (j + 1 <= 2) {
						System.out.println("RIGHT: " + mat[i][j + 1]);
					}
					if (i + 1 <= 2) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
