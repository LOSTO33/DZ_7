public class Division implements Calculate{
    @Override
    public int add(int a, int b) {
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }
        return a;
    }
}
