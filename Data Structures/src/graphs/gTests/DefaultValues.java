package graphs.gTests;

public class DefaultValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[5][5];
		
		for(int g = 0; g < 5; ++g)
		{
			for(int h = 0; h < 5; ++h)
				System.out.print(num[h][h]+" ");
			System.out.println();
		}
	}

}
