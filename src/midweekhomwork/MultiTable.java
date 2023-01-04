package midweekhomwork;

public class MultiTable {

        //Print multiplication table of 24, 50 and 29 using loop.

    public static void main(String[] args){
        int tableNumber =24;
        //Generating table of 24

        System.out.println("Generating table of 24 :");
        for (int i=1; i <= 10;i++ ){
            System.out.format("%d*%d =%d\n", tableNumber,i,tableNumber * i);
        }

       //Generating table of 50

        System.out.println("Generating table of 50 :");
        int othertableNumber =50;
        for (int i=1; i <= 10;i++ ){
            System.out.format("%d*%d =%d\n", othertableNumber,i,othertableNumber * i);
        }

       //Generating table of 29
        System.out.println("Generating table of 29 :");
        int anathertableNumber =29;
        for (int i=1; i <= 10;i++ ){
            System.out.format("%d*%d =%d\n", anathertableNumber,i,anathertableNumber * i);
        }
    }
}
