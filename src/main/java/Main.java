//
//import Entyties.Project.Development.BuildingWrapper.CalibrationData.ZcCalibrations.GeneralInfo.GeneralInfoRow;
//import com.mashape.unirest.http.exceptions.UnirestException;
//
//import java.io.IOException;
//import java.lang.reflect.Method;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
///**
// * Created by Александр on 13.06.2017.
// */
//public class Main {
//    public static void main(String[] args) throws IOException, UnirestException {
//
//
//        Class c = GeneralInfoRow.class;
//        System.out.println(c.getName());
//        Method[] methods = c.getMethods();
//        for (Method method : methods) {
//            System.out.println("Имя: " + method.getName());
//            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());
//
//            Class[] paramTypes = method.getParameterTypes();
//            System.out.print("Типы параметров: ");
//            for (Class paramType : paramTypes) {
//                System.out.print(" " + paramType.getName());
//            }
//            System.out.println();
//        }
//    }}
