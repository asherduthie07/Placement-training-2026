import java.util.HashMap;
import java.util.Map;

public class frequency {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Map<Integer, Integer> frequencies = new HashMap<>();

		for (int value : arr) {
			frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
		}

		// Print each distinct value and its frequency.
		for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
