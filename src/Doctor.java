public class Doctor {
    // Поля: поля-змінні, поля-методи
    String lastName;
    String firstName;
    String midName;
    String mood;
    int workExperience;
    String specialty;
    Schedule workSchedule = new Schedule();

    /*
     * 1. Немає повертаючого типу + немає параметрів
     * 2. Немає повертаючого типу + є параметри
     * 3. Є повертаючий тип + немає параметрів
     * 4. Є повертаючий тип + є параметри
     */

    void setSpecialty(String s) {
        specialty = s;
    }

    String getMood(boolean isHungry, boolean isSleepy) {
        if(isHungry && isSleepy){
            return "Very bad";
        } else if((isHungry && !isSleepy) || (!isHungry && isSleepy)){
            return "Normal";
        } else {
            return "Very good";
        }
    }
}