public class App {

    public static void main(String[] args) {

        Doctor doc2 = new Doctor();

        doc2.firstName = "Kseniia";
        doc2.midName = "Petrivna";
        doc2.lastName = "Ivanova";

        doc2.workSchedule.isWorkingOnMonday = true;
        doc2.workSchedule.isWorkingOnWednesday = true;
        doc2.workSchedule.isWorkingOnFriday = true;

        boolean[] scheduleArray = doc2.workSchedule.getScheduleArray();

        for(boolean i : scheduleArray){
            System.out.println(i);
        }
        // Класи в Java

        /*
         * 1. Основи
         * 2. Загальна форма
         * 3. Оголошення об'єктів
         * 4. Основи методів
         * 5. Повернення значення (return)
         * 
         */

        // 1. Клас
        // 2. Об'єкт
        /*
         * 
         * Доктор:
         * Прізвище
         * Ім'я
         * По батькові
         * Стаж роботи
         * Спеціалізація
         * Розклад
         * 
         */

        

        /*
        Дані та дії над даними
        
        
        */

       System.out.println(doc2.getMood(true, true));

    }

}