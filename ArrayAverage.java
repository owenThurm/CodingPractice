public class School{
 	public static int getAverage(int[] marks){
    int total = 0;
    for(int grade : marks) {
      total+=grade;
    }
    return (int) Math.floor((double) total/ marks.length);
	}
}