public class Main {
    public static void main(String[] args) {
        boolean payment = true;
        int bonus_fix;
        int percent;
        if(payment) {
            percent = 100;
        } else {
            percent = 1;
        }
        long score = 1100; //счет
        long bonus = score / percent; //счет : процент = бонус
        long limit = 1100;  //минимальная сумма для бонусов
        if(score < limit) {   //если счет меньше 1100 то бонус = 0
            bonus = 0;
        }
        System.out.println(bonus);
    }
}