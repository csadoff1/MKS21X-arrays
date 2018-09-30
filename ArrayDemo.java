public class ArrayDemo {

  public static void printArray(int[]ary) {
    System.out.print("[ ");
for (int x = 0; x < ary.length; x++) {
  if (x < ary.length) {
    System.out.print(ary[x] + ", ");
  }
}
    System.out.println(" ]");
  }

  public static void printArray2(int[][]ary) {
    System.out.print("[ ");
    int x = 0;
    int y = 0;
  while (x < ary.length && y < ary[x].length) {
    while (y < ary[x].length) {
    System.out.print(ary[x][y]);
    y++;
    if (y < ary[x].length && x < ary.length) {
      System.out.print(", ");
  }
}
  y = 0;
  x++;
}
    System.out.println(" ]");
  }

  public static int countZeros2D (int[][] nums) {
  		int i;
  		int j;
  		int count = 0;
  		for(i= 0; i<nums.length; i++)
  			for(j=0; j<nums[i].length; j++) {
  				if (nums[i][j] == 0) {
  					count ++;
  				}
  			}
  		return count;
   	}

    public static void fill2D(int[][]vals) {
		int i;
		int j;
		for(i=0; i<vals.length; i++) {
			for(j=0; j<vals[i].length; i++) {
				if(j==i) {
					vals[i][j] = 3;
				}
				else {
					vals[i][j] = 1;
 				}
			}
		}
  }

  public static void fill2DCopy(int[][]vals) {
  int i;
  int j;
  for(i=0; i<vals.length; i++) {
    for(j=0; j<vals[i].length; i++) {
      if(vals[i][j]<0) {
        vals[i][j] = 3;
      }
      else {
        vals[i][j] = 1;
      }
    }
  }
}

public static void main(String[]args) {
  int[] Array1 = {1, 2, 4, 5, 7, 8};
  printArray(Array1);
  int[][] Array2 = {{1, 2, 3, 4},
                    {6, 7, 8, 9}};
  printArray2(Array2);
  int[][] Array3 = {{4, 3, 2},
                    {5, 6, 7},
                    {0, 1, 9}};
  printArray2(Array3);
  System.out.println(countZeros2D(Array3));
}

}
