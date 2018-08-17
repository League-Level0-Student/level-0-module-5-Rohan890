
public class ForloopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i += 1) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
