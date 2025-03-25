public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings){

		boolean swapped = true;
			
		for (int i = 0; i < strings.length - 1 && swapped; i++) {
			swapped = false;
			for (int j = 0; j < strings.length - 1 - i; j++) {
				int comparasion = strings[j].toLowerCase().compareTo(strings[j + 1].toLowerCase());
				if (comparasion > 0){
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

