public class Break_Continue {
    public static void main(String [] args) {
        int a = 0;
        while(true) {
            if(a == 5) {
                break;
            }
            System.out.println(a);
            a++;
        }
//        System.out.println("You left the loop!");

        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
//            System.out.println(i + " - It's an odd number");
        }
    }
}


