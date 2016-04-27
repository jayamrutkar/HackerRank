package sols.impl;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] grid = new char[n][n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			String str = in.next();
			grid[grid_i] = str.toCharArray();
		}

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {

				if (grid[i][j] > grid[i - 1][j] && grid[i][j] > grid[i + 1][j]
						&& grid[i][j] > grid[i][j - 1]
						&& grid[i][j] > grid[i][j + 1]) {
					grid[i][j] = 'X';
				}
			}
		}
		for (int grid_i = 0; grid_i < n; grid_i++) {
			System.out.println(grid[grid_i]);
		}
		in.close();
	}
}
