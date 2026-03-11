public class Schedule {
    boolean isWorkingOnMonday = false;
    boolean isWorkingOnTuesday = false;
    boolean isWorkingOnWednesday = false;
    boolean isWorkingOnThursday = false;
    boolean isWorkingOnFriday = false;

    // Метод, який поверне розклад строками
    public boolean[] getScheduleArray() {
        boolean[] scheduleArray = { isWorkingOnMonday, isWorkingOnTuesday, isWorkingOnWednesday, isWorkingOnThursday,
                isWorkingOnFriday };
        return scheduleArray;
    }

}