public class Main {
    public static void main(String[] args) {
        long score = 1100; //счет
        long bonus = 0;
        long limit = 1000;  //минимальная сумма для бонусов
        if (score > limit) {   //если счет меньше 1100 то бонус = 0
            bonus = score / 100;
        }
        System.out.println(bonus);
    }
}