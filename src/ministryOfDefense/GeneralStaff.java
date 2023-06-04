package ministryOfDefense;

import java.lang.reflect.Method;
import java.util.List;

abstract public class GeneralStaff implements MinistryTwo {
    static int numberOfAlerts = 0;

    public abstract void notificationOfPersonnel(String whatNeed);

    @Override
    public void showWhenWeWin() {
        System.out.println("very soon");
    }

    @Override
    public void showWhenrusshaLoss() {
        System.out.println("is a near future");

    }

    @Override
    public void whenBeCheckBase() {

        System.out.println("every day and every night");

        System.out.println(" -------------- It'S a SuRpRiSe :)))))))))) ");
        for (Method method : List.class.getDeclaredMethods()) {
            String returnType = method.getReturnType().toString();
            String methodName = method.getName();
            StringBuilder parameterTypes = new StringBuilder();
            for (Class<?> parameterClass : method.getParameterTypes()) {
                if (parameterTypes.length() != 0) parameterTypes.append(",");
                parameterTypes.append(parameterClass.getName());
            }

            System.out.printf("%s %s(%s)\n", returnType, methodName, parameterTypes);
        }
    }
}

