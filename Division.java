public class Division implements Calculate {
    @Override
    public int add(int a, int b){
    if (b == 0){
        throw new Error("На ноль делить нельзя");
    }
        System.out.println("Решение :");
    return a/b;
    }
}