package crack;

public class Main {

	public static void main(String[] args) {
		BellmanFordImplemenation o = new BellmanFordImplemenation();
		// Sample example.
		/*int[][] graph =  {
				{0, -1, 4, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 2, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 5, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -3, 0, 0, 0, 0, 0},
               };
		*/
		//
		int[][] graph =  {
		{0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11, 0},
        {0, 8, 0, 7, 0, 4, 0, 0, 2},
        {0, 0, 7, 0, 9, 14, 0, 0, 0},
        {0, 0, 0, 9, 0, 10, 0, 0, 0},
        {0, 0, 4, 14, 10, 0, 2, 0, 0},
        {0, 0, 0, 0, 0, 2, 0, 1, 6},
        {8, 11, 0, 0, 0, 0, 1, 0, 7},
        {0, 0, 2, 0, 0, 0, 6, 7, 0}
       };
	

		int[] r = o.findMinimunPathBF(0, graph);
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}

	}
}
