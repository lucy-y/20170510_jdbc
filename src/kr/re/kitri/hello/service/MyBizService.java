package kr.re.kitri.hello.service;

import java.util.List;
import java.util.OptionalDouble;

public class MyBizService {

    public static int processLogic(int firstNumber, int secondNumber) {
        //todo: 덧셈함수
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int sumIntList(List<Integer> intList) {

        /*
        int result = 0;
        for (Integer e : intList) {
            result += e;
        }
        return result;
        */
        int result = intList.stream().mapToInt(x -> x.intValue()).sum();

        return result;
    }

    public static double averageIntList(List<Integer> intList) throws Exception {
        OptionalDouble result;
        /*
        double result;
        MyBizService service = new MyBizService();
        result = service.sumIntList(intList);
        return result / intList.size();
        */
        result = intList.stream().mapToInt(x -> x.intValue()).average();
        if (result.isPresent()) {
            return result.getAsDouble();
        } else {
            throw new Exception("No Date, No result");
        }
    }
}

