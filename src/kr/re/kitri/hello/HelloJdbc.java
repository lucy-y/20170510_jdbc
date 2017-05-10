package kr.re.kitri.hello;

import kr.re.kitri.hello.service.MyBizService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-08.
 */
public class HelloJdbc {
    public static void main(String[] args) throws Exception {

        int firstNumber = 3;
        int secondNumber = 5;

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*
        //todo: 1-1. processLogic 함수로 변경함
        int result = firstNumber + secondNumber ;
        System.out.println(result);
        */

        /*
        //todo: 1-2. 함수
        int result = processLogic(firstNumber,secondNumber);
        System.out.println(result);
        */

        //todo: 1-3. 서비스
        MyBizService service = new MyBizService();
        int result = service.processLogic(firstNumber,secondNumber);
        System.out.println(result);

        //todo: 2-1. 리스트 합
        int resultSum = MyBizService.sumIntList(intList);
        System.out.printf("리스트 합: ");
        System.out.println(resultSum);

        double resultAverage = MyBizService.averageIntList(intList);
        System.out.printf("리스트 평균: ");
        System.out.println(resultAverage);


    }

    /*
    //todo: 1-2. 함수
    public static int processLogic(int firstNumber, int secondNumber){
        int result = 0;
        result = firstNumber + secondNumber;
        return result;
    }
    */

}
