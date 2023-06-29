package Pyramid;

import java.util.Scanner;

public class PyramidPattern {
	static void PyramidPattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern3(int n) {
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x % 2 + " ");
				x++;
			}
			System.out.println();
		}
	}

	static void PyramidPattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x + " ");
				if (j < i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}

	static void PyramidPattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				if (j < i)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = i;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x + " ");
				if (j < i)
					x--;
				else
					x++;
			}
			System.out.println();
		}
	}

	static void PyramidPattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print((char) (x + 96) + " ");
				x++;
			}
			System.out.println();
		}
	}

	static void PyramidPattern9(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern10(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void PyramidPattern11(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = i;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x + " ");
				if (j < i)
					x--;
				else
					x++;
			}
			System.out.println();
		}
		System.out.println();
	}
     
	static void PyramidPattern12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x + " ");
				if (j < i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}

	static void PyramidPattern13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x % 2 + " ");
				x++;
			}
			System.out.println();
		}
	}

	static void PyramidPattern14(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			int x = i;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print((char) (x + 64) + " ");
				if (j < i)
					x--;
				else
					x++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		PyramidPattern1(n);
		PyramidPattern2(n);
		PyramidPattern3(n);
		PyramidPattern4(n);
		PyramidPattern5(n);
		PyramidPattern6(n);
		PyramidPattern7(n);
		PyramidPattern8(n);
		PyramidPattern9(n);
		PyramidPattern10(n);
		PyramidPattern11(n);
		PyramidPattern12(n);
		PyramidPattern13(n);
		PyramidPattern14(n);
	}

}