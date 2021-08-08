package task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum03 {
    /**
     * 사용자에게 값을 입력 받아서 다 더한 합계를 파일로 출력하는 프로그램을 만드시오.
     * 특정 입력 값을 받으면 종료.
     * (사용자가 숫자를 입력하면 총합계를 내고, 종료전까지 무한으로 돌림...)
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //br는 입력을 받으면 무조건 String
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0; //합계를 받는 변수
        int num = 0;//입력 받는 변수
        System.out.println("숫자를 입력해주세요.\n'0'을 입력하면 결과종료");

        try {
            while (true) {//끝을 모르니까 while
                System.out.print("입력 : ");
                num = Integer.parseInt(br.readLine());//스캐너로 따지자면 sc.nextInt
                sum += num;

                //0을 입력하면 종료.
                if (num == 0) {
                    break;
                }//end if
            }//end while
            
        }catch (NumberFormatException nf){
            System.out.println("범위초과 다시 입력해주세요.");
        }finally {
            System.out.println("총 힙계는 "+sum+"입니다.");
            br.close(); //종료
        }//end finally

    }//main
    
}//class