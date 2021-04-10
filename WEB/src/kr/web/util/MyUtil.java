package kr.web.util;

public class MyUtil {
	public int sum(int a) {
		int result = 0;
		for(int i = 1;  i <= a; i++){
			result += i;
		}
		return result;
	}
}
