public class Main {
    public static void main(String[] args) {
        int percent = 100; //процент
        long score = 1000; //счет
        long bonus = score / percent; //счет : процент = бонус
        long limit = 1100;  //минимальная сумма для бонусов
        if(score < limit) {   //если счет меньше 1100 то бонус = 0
            bonus = 0;
        }
        System.out.println(bonus);
    }
}