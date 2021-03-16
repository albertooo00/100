public class Main {
    public static void main(String[] args) {
        int percent;
        if() {          //Что тут тогда писать в скобках????????????????????
            percent = 100;
        } else {
            percent = 1;
        }
        long score = 1300; //счет
        long bonus = score / percent; //счет : процент = бонус
        long limit = 1100;  //минимальная сумма для бонусов
        if(score < limit) {   //если счет меньше 1100 то бонус = 0
            bonus = 0;
        }
        System.out.println(bonus);

    }
}