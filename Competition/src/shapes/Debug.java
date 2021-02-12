package shapes;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 3;
		
		DrawBox box = new DrawBox(size, 'h');
		DrawZ z = new DrawZ(size, 'h');
		DrawX x = new DrawX(size, 'h');
		DrawY y = new DrawY(size, 'h');
		
		for(int j = 0; j < size; j++)
			System.out.println(box.getStarsIndex(j)+" "+x.getStarsIndex(j)+" "+y.getStarsIndex(j)
					+" "+z.getStarsIndex(j));
	}

}
