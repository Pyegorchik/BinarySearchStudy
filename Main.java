class Main {
    public static void main(String[] args) {
        // When not presented in array expected behaviour is return of length of array + 1

        // Test Arrays.binarySearch for int array
        int[] intArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(intArray, 5));
        System.out.println(Arrays.binarySearch(intArray,10));

        // Test Arrays.binarySearch for double array
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println(Arrays.binarySearch(doubleArray, 3.3)); 
        System.out.println(Arrays.binarySearch(doubleArray, 5.5)); 

        // Test Arrays.binarySearch for char array
        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println(Arrays.binarySearch(charArray, 'c'));
        System.out.println(Arrays.binarySearch(charArray, 'z'));
    }
}