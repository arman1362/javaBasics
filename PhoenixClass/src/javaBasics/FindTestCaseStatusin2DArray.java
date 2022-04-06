package javaBasics;

public class FindTestCaseStatusin2DArray {

	public static void main(String[] args) {
		// In the following 2D array, print the tests that failed.
		// String [][] teststatus = {{"tc001", "passed"}, {"tc002", "failed"}, {"tc003", "passed"}};

		String[][] teststatus = { { "tc001", "passed" }, { "tc002", "failed" }, { "tc003", "passed" } };

		for (int i = 0; i < teststatus.length; i++) {
			if (teststatus[i][1].equals("failed")) {
				System.out.println(teststatus[i][0] + " " + teststatus[i][1]);
			}
			System.out.println();
		}
	}
}
