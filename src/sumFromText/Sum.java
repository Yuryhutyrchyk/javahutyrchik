package sumFromText;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class Sum {
		public static void main(String[] args) {
			int n = sumFromFile();
			System.out.println(n);
		}

		static int sumFromFile() {

			BufferedReader reader = null;
			int sum = 0;

			try {
				reader = new BufferedReader(new FileReader("input.txt"));

				String S = null;

				while ((S = reader.readLine()) != null) {
					String[] SS = S.split("[\\\\/№;:а-яА-Яa-zA-Z?!,.\\-(){}\\[\\]@#\\$%^&?*~<>\\s]+");

					for (String S1 : SS) {
						if (S1.length() > 0)
							sum += Integer.parseInt(S1);
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return sum;

		}
	}
