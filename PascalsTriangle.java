import java.util.*;
import java.util.ArrayList;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows){
	ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();
	ArrayList<Integer> prevRow = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			ArrayList<Integer> currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for (int j = 1; j < i; j++) {
				currentRow.add(prevRow.get(j-1) + prevRow.get(j));
			}
			if (i > 0) {
				currentRow.add(1);
			}
			prevRow = currentRow;
			triangle.add(currentRow);		}
		return triangle;
	}

	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> triangle = generate(numRows);

		for (List<Integer> row : triangle) {
			System.out.println(row);
		}
	}
}
