package year_up;

public class YearUp {

    public static void printYearUp(){
        for (int i = 1; i <= 45; i++){
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println("Year Up");
            }
            else if (i % 3 == 0) {
                System.out.println("Year");
            }

            else if (i % 5 ==0){
                System.out.println("Up");
            }
            else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {

        printYearUp();

    }

}
