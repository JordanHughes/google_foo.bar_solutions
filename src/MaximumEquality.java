/**
 * GOOGLE FOO.BAR CHALLENGE PROMPT:
 * In other words, choose two elements of the array, x[i] and x[j] (i distinct from j) and simultaneously increment x[i] by 1 and decrement x[j] by 1.
 * Your goal is to get as many elements of the array to have equal value as you can.
 * For example, if the array was [1,4,1] you could perform the operations as follows:
 * Send a rabbit from the 1st car to the 0th: increment x[0], decrement x[1], resulting in [2,3,1]
 * Send a rabbit from the 1st car to the 2nd: increment x[2], decrement x[1], resulting in [2,2,2].
 * All the elements are of the array are equal now, and you've got a strategy to report back to Beta Rabbit!
 *
 * Note that if the array was [1,2], the maximum possible number of equal elements we could get is 1, as the cars could never have the same number of rabbits in them.
 * Write a function answer(x), which takes the array of integers x and returns the maximum number of equal array elements that we can get,
 * by doing the above described command as many times as needed.
 * The number of cars in the train (elements in x) will be at least 2, and no more than 100.
 * The number of rabbits that want to share a car (each element of x) will be an integer in the range [0, 1000000].
 */
public class MaximumEquality {

    public String checkAnswer(){
        String result = "Maximum Equality Tests: ";
        if (answer(new int[]{1, 4, 1})==3&&answer(new int[]{23,56,123,9,23,10,9})==6){
            return result+"PASSED";
        } else {
            return result+"FAILED";
        }
    }

    /**
     * If the average of the integers in the array do not have a remainder
     * I will be able to make all the numbers equal - otherwise there will be one leftover
     * @param x = an integer array between [0, 1000000]
     * @return  maximum equal numbers that can be created by increment from one element
     *          and decrementing from another simultaneously
     */
    public int answer(int[] x){
        // acquire the total
        int total = 0;
        for (int i = 0; i < x.length; i++){
            total+=x[i];
        }
        // determine if the average has a remainder
        if (total%x.length==0){
            return x.length;
        } else {
            return x.length-1;
        }
    }
}
