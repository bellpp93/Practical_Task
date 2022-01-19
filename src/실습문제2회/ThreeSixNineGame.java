package ½Ç½À¹®Á¦2È¸;

import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1~99 ÁßÀÇ Á¤¼ö ÇÏ³ª¸¦ ÀÔ·Â");
		num = scan.nextInt();
		if (num == 3 || num == 6 || num == 9) {
			System.out.println("¹Ú¼öÂ¦");
		} else if (num >= 10) {
			if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9) {
				if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
					System.out.println("¹Ú¼öÂ¦Â¦");
				else
					System.out.println("¹Ú¼öÂ¦Â¦Â¦");
			} else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
				System.out.println("¹Ú¼öÂ¦");
		}

		/*
        for (int i = 1; i <= 9999; i++) {
			if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
					System.out.println(i + " ¹Ú¼öÂ¦Â¦");// ÀÚ¸´¼ö ¸ğµÎ
				else
					System.out.println(i + " ¹Ú¼öÂ¦");// 1ÀÇ ÀÚ¸´¼ö¸¸
			} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
				System.out.println(i + " ¹Ú¼öÂ¦");// 10ÀÇ ÀÚ¸´¼ö¸¸
		}
		 */
	}
}
