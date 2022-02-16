
public class Test {
	public static void main(String[] args) {

		int[] a = { 0, 4, 0, 3, 0, 4, 1, 0, 2, 0, 3, 1 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
