public class Bubble_Search {

        public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 7, 9, 13, 15, 16, 17, 19};
        int n = array.length;
        int number = 2;
        boolean numberFound;
        int low = 0;
        int high = n-1;

        numberFound = binarySearch(array, low, high, number);
        if (numberFound == true){
            System.out.println( "Number has been found" );
        }
        else{
            System.out.println( "Number was not found" );
        }
    }

        static boolean binarySearch(int[] lst,int low, int high, int number){
        boolean found = false;

        if(low >= high){
            if(lst[low] == number){
                found = true;
            }
            else{
                found = false;
            }
        }
        else{
            int middle = (high + low) / 2;

            if (lst[middle] == number){
                found = true;
            }
            else if (number > lst[middle]){
                low = middle + 1;
                found = binarySearch(lst, low, high, number);
            }
            else if(number < lst[middle]){
                high = middle - 1;
                found = binarySearch(lst, low, high, number);
            }
            else{
                found = false;
            }
        }
        return found;
    }
    }