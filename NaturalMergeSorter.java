package csc143;

public class NaturalMergeSorter {
	public int getSortedRunLength(int[] array, int arrayLength, int startIndex) {
		// Check if the startIndex is out of bounds
		if (startIndex < 0 || startIndex >= arrayLength) {
			return 0;
		}

		int sortedLength = 1; // Minimum length of a sorted run is 1 (single element)
		while (startIndex + sortedLength < arrayLength
				&& array[startIndex + sortedLength - 1] <= array[startIndex + sortedLength]) {
			sortedLength++; // Increment the sorted run length while the array elements are in ascending
							// order
		}

		return sortedLength;
	}

	public void naturalMergeSort(int[] array, int arrayLength) {
		int i = 0;

		while (true) {
			int firstRunLength = getSortedRunLength(array, arrayLength, i);
			if (firstRunLength == arrayLength) {
				break;
			}
			if (i + firstRunLength == arrayLength) {
				i = 0;
				continue;
			}

			int secondRunLength = getSortedRunLength(array, arrayLength, i + firstRunLength);
			merge(array, i, i + firstRunLength - 1, i + firstRunLength + secondRunLength - 1);
			i = i + firstRunLength + secondRunLength;
		}
	}

	public void merge(int[] numbers, int leftFirst, int leftLast, int rightLast) {
		int mergedSize = rightLast - leftFirst + 1;
		int[] mergedNumbers = new int[mergedSize];
		int mergePos = 0;
		int leftPos = leftFirst;
		int rightPos = leftLast + 1;

		// Add smallest element from left or right partition to merged numbers
		while (leftPos <= leftLast && rightPos <= rightLast) {
			if (numbers[leftPos] <= numbers[rightPos]) {
				mergedNumbers[mergePos] = numbers[leftPos];
				leftPos++;
			} else {
				mergedNumbers[mergePos] = numbers[rightPos];
				rightPos++;
			}
			mergePos++;
		}

		// If left partition isn't empty, add remaining elements to mergedNumbers
		while (leftPos <= leftLast) {
			mergedNumbers[mergePos] = numbers[leftPos];
			leftPos++;
			mergePos++;
		}

		// If right partition isn't empty, add remaining elements to mergedNumbers
		while (rightPos <= rightLast) {
			mergedNumbers[mergePos] = numbers[rightPos];
			rightPos++;
			mergePos++;
		}

		// Copy merged numbers back to numbers
		for (mergePos = 0; mergePos < mergedSize; mergePos++) {
			numbers[leftFirst + mergePos] = mergedNumbers[mergePos];
		}

		// Free temporary array
		mergedNumbers = null;
	}
}
