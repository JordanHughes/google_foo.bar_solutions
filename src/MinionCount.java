/**
 * Answer to google foo.bar coding challenge
 * Goal:
 * If there is an organization with a single person at the top
 * who can only have a maximum of 7 employees under them and each of those
 * employees can only have 7 employees under them, given the number of
 * layers of supervision return the total number of employees the organization has
 * Examples:
 *  Input = 2
 *  Output = 8
 *
 *  Input = 5
 *  Output = 2801
 */
public class MinionCount {

    public static String executeProblemTests(){
        String result = "Minion Count Tests: ";
        if (answer(2)==8&&answer(5)==2801){
            return result + "PASSED";
        }else{
            return result + "FAILED";
        }
    }

    /**
     * bound by the rule that each employee can only have a maximum of 7
     * employees under them
     * @param x = number of levels of employees
     * @return the total number of employees
     */
    private static int answer(int x){
        int total = 0;
        for (int i = 0; i < x; i++){
            total+=Math.pow(7,i);
        }
        return total;
    }
}
