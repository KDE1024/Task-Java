package task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum03 {
    /**
     * ����ڿ��� ���� �Է� �޾Ƽ� �� ���� �հ踦 ���Ϸ� ����ϴ� ���α׷��� ����ÿ�.
     * Ư�� �Է� ���� ������ ����.
     * (����ڰ� ���ڸ� �Է��ϸ� ���հ踦 ����, ���������� �������� ����...)
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //br�� �Է��� ������ ������ String
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0; //�հ踦 �޴� ����
        int num = 0;//�Է� �޴� ����
        System.out.println("���ڸ� �Է����ּ���.\n'0'�� �Է��ϸ� �������");

        try {
            while (true) {//���� �𸣴ϱ� while
                System.out.print("�Է� : ");
                num = Integer.parseInt(br.readLine());//��ĳ�ʷ� �����ڸ� sc.nextInt
                sum += num;

                //0�� �Է��ϸ� ����.
                if (num == 0) {
                    break;
                }//end if
            }//end while
            
        }catch (NumberFormatException nf){
            System.out.println("�����ʰ� �ٽ� �Է����ּ���.");
        }finally {
            System.out.println("�� ����� "+sum+"�Դϴ�.");
            br.close(); //����
        }//end finally

    }//main
    
}//class