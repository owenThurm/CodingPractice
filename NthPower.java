public class Kata {
  public static int nthPower(int[] array, int n) {
    if (n>=array.length || n<0) return -1;
    return (int)Math.pow(array[n],n);
  }
}

public class Kata {
	public static int nthPower(int[] array, int n) {
		try{
			return (int) Math.pow(array[n], n);
		} catch(IndexOutOfBoundsException e) {
			return -1;
		}
	}
}