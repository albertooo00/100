public class Main {
    public static void main(String[] args) {
        int percent = 100; //процент
        long score = 1100; //счет
        long bonus = score / percent; //счет : процент = бонус
        System.out.println(bonus);
        // если без лимита, то любое значение теперь делится на 100. Хоть 100 хоть 1100. что является не правильным по условию задачи! 
    }
}