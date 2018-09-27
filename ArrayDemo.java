public class ArrayDemo {

  public static void printArray(int[]ary) {
    System.out.print("[ ");
for (int x = 0; x < ary.length; x++) {
    System.out.print(ary[x] + ", ");
  }
    System.out.print(" ]");
  }

  public static void printArray(int[][]ary) {
    System.out.print("[ ");
    int x = 0;
    int y = 0;
  while (x < ary.length && y < ary.length) {
    System.out.print(ary[x][y])
    x++;
    y++;
  }
    System.out.print(" ]");
  }

public static void main(String[]args) {
  
}
  
}
