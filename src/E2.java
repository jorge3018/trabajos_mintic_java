class E2 {

	public static void main(String[] args) {

		int[] prueba = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int result = sumaPares(prueba);

		System.out.print(result);
	}

	public static int sumaPares(int[] vector) {
		int s = 0;

		for (int number : vector) {
			if (number % 2 == 0 && number >= 0) {
				s += number;

			}
		}

		return s;
	}

}