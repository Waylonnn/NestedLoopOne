public class Main {
    public static void main(String[] args) {
        System.out.println("Loop 1");
        for(int a = 0; a <= 30; a++){
            System.out.println(a);
        }
        System.out.println("Loop 2");
        for(int a = 30; a >= 0; a--){
            System.out.println(a);
        }
        System.out.println("Loop 3");
        for(int a = 0; a <= 18; a += 3){
            System.out.println(a);
        }
        System.out.println("Loop 4");
        for(int a = 10; a >= 0; a -= 2){
            System.out.println(a);
        }
    }
}