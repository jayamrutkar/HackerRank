package sols.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFSShortestPath {

	private static Queue<Integer> queue = new LinkedList<Integer>();

	static int[][] getMatrix(int nodes) {
		int[][] matrix = new int[nodes + 1][nodes + 1];
		for (int i = 1; i <= nodes; i++) {
			for (int j = 1; j <= nodes; j++) {
				matrix[i][j] = -1;
				if (i == j) {
					matrix[i][j] = 1;
				}
			}
		}
		return matrix;
	}

	static Integer[] getEdges(int[][] matrix, int nodes, int source) {

		int[] visited = new int[nodes + 1];
		int i, element;

		visited[source] = 0;
		queue.offer(source);
		int m = 1;
		while (!queue.isEmpty()) {

			element = queue.poll();
			i = 1;

			while (i <= nodes) {
				if (matrix[element][i] == 1 && visited[i] == 0 && i != element) {

					visited[i] = m + visited[element];
					queue.add(i);
				}
				i++;
			}

		}

		Integer[] total = new Integer[nodes - 1];
		int l = 0;
		for (int k = 1; k <= nodes; k++) {
			if (source != k) {
				total[l] = -1;
				if (visited[k] != 0) {
					total[l] = 6 * visited[k];
				}
				l++;
			}
		}
		return total;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		List<Integer[]> list = new ArrayList<Integer[]>();

		for (int a0 = 0; a0 < t; a0++) {

			int nodes = in.nextInt();
			int edges = in.nextInt();

			int[][] matrix = getMatrix(nodes);

			for (int i = 0; i < edges; i++) {
				int m = in.nextInt();
				int n = in.nextInt();
				if (m <= nodes && n <= nodes) {
					matrix[m][n] = 1;
					matrix[n][m] = 1;
				}
			}
			int source = in.nextInt();

			Integer[] res = getEdges(matrix, nodes, source);
			list.add(res);
		}

		for (int i = 0; i < t; i++) {
			Integer[] res = list.get(i);
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[j] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
