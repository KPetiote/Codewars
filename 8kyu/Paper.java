
// Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
// Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.

// Example:
// n= 5, m=5: 25
// n=-5, m=5:  0

public class Paper {
    public static void main(String[] args) {
        int userinput1 = Integer.parseInt(args[0]);
        int userinput2 = Integer.parseInt(args[1]);        
        System.out.println(paperWork(userinput1, userinput2));
    }
    public static int paperWork(int n, int m) {
        if(n < 0 || m < 0){
            return 0;
        } else {
            n = n * m;
        }
        return n;
    }
}
