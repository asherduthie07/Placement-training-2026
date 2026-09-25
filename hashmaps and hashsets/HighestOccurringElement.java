import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElement {
	public static void freq(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("No elements to count.");
			return;
		}

		Map<Integer, Integer> frequencies = new HashMap<>();
		for (int value : arr) {
			frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
		}

		int answer = arr[0];
		int maxFreq = 0;
		for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
			if (entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				answer = entry.getKey();
			}
		}

		System.out.println("max = " + maxFreq);
		System.out.println("ans = " + answer);
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 30, 20, 40, 10};
		freq(arr);
	}
}
