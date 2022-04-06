package javaBasics;

import java.util.Arrays;

public class Updated_Multi_DimensionArray {

	public static void main(String[] args) {
		// multi-dimension array

		int[][] numbers = new int[10][5];
		numbers[0][0] = 1;
		numbers[5][3] = 5;
		// [row] [col]

		// this loop goes through all of the rows, we have 10 rows
		for (int row = 0; row < numbers.length; row++) {

			// this loop goes through each row. we have five columns in each row
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}

			// this print line makes the result like a table
			System.out.println();
		}

		System.out.println("===============");

		// another example

		// String userPass [][] = new String {{"user1_dsff",
		// "pass1_dshdh"},{"user1_dsff", "pass1_dshdh"},{"user1_dsff",
		// "pass1_dshdh"},{"user1_dsff", "pass1_dshdh"}

		String[][] userPass = new String[10][2];
		userPass[0][0] = "user1";
		userPass[0][1] = "pass1";

		userPass[1][0] = "user2";
		userPass[1][1] = "pass2";

		userPass[2][0] = "user3";
		userPass[2][1] = "pass3";

		userPass[3][0] = "user4";
		userPass[3][1] = "pass4";

		userPass[4][0] = "user5";
		userPass[4][1] = "pass5";

		userPass[5][0] = "user6";
		userPass[5][1] = "pass6";
		
		/*
		rows 		0 column 1		1 column 2
		0			00		   		01
		1			10				11
		2			20				21
		3			30				31
		4			40				41
		5			50				51
		6			60				61
		7			70				71
		8			80				81
		9			90				91
		 */

		for (int i = 0; i < userPass.length; i++) { // outer loop- goes through the rows
			for (int j = 0; j < userPass[i].length; j++) { // inner loop- goes through the in that row
				System.out.print(userPass[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------");

		int num[][] = new int[7][4];
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		num[0][3] = 4;
		num[1][0] = 5;
		num[1][1] = 6;
		num[1][2] = 7;
		num[1][3] = 8;
		num[2][0] = 9;
		num[2][1] = 10;
		num[2][2] = 11;
		num[2][3] = 12;
		num[3][0] = 13;
		num[3][1] = 14;
		num[3][2] = 15;
		num[3][3] = 16;
		num[4][0] = 17;
		num[4][1] = 18;
		num[4][2] = 19;
		num[4][3] = 20;
		num[5][0] = 21;
		num[5][1] = 22;
		num[5][2] = 23;
		num[5][3] = 24;
		num[6][0] = 25;
		num[6][1] = 26;
		num[6][2] = 27;
		num[6][3] = 28;
		
		/*
		rows 		0 column 1		1 column 2		2 column 3		3 column 4
		0			00		   		01				02				03
		1			10				11				12				13
		2			20				21				22				23
		3			30				31				32				33
		4			40				41				42				43	
		5			50				51				52				53
		6			60				61				62				63
		 */

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------");
		
		// print data in (2)(3)
		// print data in (0)(1)
		
		int [][] array = {
				{23, 4, 32, 56},
				{45, 43, 11, 4},
				{10, 8, 26, 687}
		};
		
		for (int i =0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
		}
		
		System.out.println("----------------");
		
		System.out.println("data in (2)(3): " + array[2][3]);
		System.out.println("data in (0)(1): " + array[0][1]);
		
		System.out.println();
		System.out.println("-------------");

		String[][][] someArray = new String[3][3][3];
		someArray[0][0][0] = "SD";
		someArray[0][0][1] = "AK";
		someArray[0][0][2] = "CA";

		someArray[0][1][0] = "AL";
		someArray[0][1][1] = "MS";
		someArray[0][1][2] = "EC";

		someArray[0][2][0] = "DE";
		someArray[0][2][1] = "OK";
		someArray[0][2][2] = "IL";

		someArray[1][0][0] = "LJ";
		someArray[1][0][1] = "OH";
		someArray[1][0][2] = "NL";

		someArray[1][1][0] = "RE";
		someArray[1][1][1] = "TM";
		someArray[1][1][2] = "ES";

		someArray[1][2][0] = "EN";
		someArray[1][2][1] = "NO";
		someArray[1][2][2] = "ND";

		someArray[2][0][0] = "NV";
		someArray[2][0][1] = "TX";
		someArray[2][0][2] = "OR";

		someArray[2][1][0] = "SA";
		someArray[2][1][1] = "GE";
		someArray[2][1][2] = "MN";

		someArray[2][2][0] = "FL";
		someArray[2][2][1] = "WA";
		someArray[2][2][2] = "VA";

		for (int i = 0; i < someArray.length; i++) {
			for (int j = 0; j < someArray[i].length; j++) {
				for (int k = 0; k < someArray[i][j].length; k++) {
					System.out.print(someArray[i][j][k] + " ");
				}
				System.out.println("next row");
			}
			System.out.println("next sheet");
		}

		System.out.println("===========");

		System.out.println(Arrays.deepToString(someArray) + " ");
		System.out.println();

		int nums[][][][] = new int[2][3][5][5]; // the first one is the number of workbooks, the second one is the
		// number of sheets, the third one is the number of rows and the last of
		// one is the number of columns
		int x = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				for (int k = 0; k < nums[i][j].length; k++) {
					for (int m = 0; m < nums[i][j][k].length; m++) {
						nums[i][j][k][m] = x++;
						System.out.print(nums[i][j][k][m] + "\t");
					}
					System.out.println("next row");
				}
				System.out.println("----- next sheet");
			}
			System.out.println("next workbook");
		}

		System.out.println("------------");
	}

}
