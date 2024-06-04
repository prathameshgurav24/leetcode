package string;

public class ZigzagConversion {

	public static String convert(String s, int numRows) {

		StringBuilder sb = new StringBuilder();

		int maxDistance = (numRows - 1) * 2;
		System.out.println(maxDistance);
		int i = 0;

		while (i < numRows - 1) {
			int j = i;

			int distance = (numRows - i - 1) * 2;
			System.out.println("------ i-" + i + " d-" + distance);

			while (j < s.length()) {
				sb.append(s.charAt(j));
				System.out.print(" j-" + j);
				j = j + distance;
				if (distance < maxDistance)
					distance = maxDistance - distance;
			}
			sb.append(" ");
			System.out.println();
			i++;
		}
		while (i < s.length()) {
			sb.append(s.charAt(i));
			i = i + maxDistance;
		}
		System.out.println();

		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 4));
		// PAHNAPLSIIGYIR
		// PINALSIGYA HRPI

	}

}