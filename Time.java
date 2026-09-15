public class Time{
	public static void main(String[] args){
		int hour = 12;
		int minute = 24;
		int second = 35;
		
		int secondsSinceMidnight = hour * 60 * 60 + minute * 60 + second;
		int secondsRemaining = 24 * 60 * 60 - secondsSinceMidnight;
		double percentagePassed = secondsSinceMidnight * 100 / (24 * 60 * 60);
		
		int newHour = 12;
		int newMinute = 37;
		int newSecond = 55;
		int timeElapsed = newHour * 60 * 60 + newMinute * 60 + newSecond - secondsSinceMidnight;
		
		System.out.println(secondsSinceMidnight);
		System.out.println(secondsRemaining);
		System.out.println(percentagePassed);
		System.out.println(timeElapsed);
	}
}
