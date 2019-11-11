public class ShowMinutesAndSeconds {
	
	public static void main(String[] args) {
		
		int totalSeconds = 130;
		int minutes = totalSeconds / 60;
		int remainingSeconds = totalSeconds % 60;
		System.out.println(minutes + " minutes and " + remainingSeconds + " seconds");
	
	}
	
}
