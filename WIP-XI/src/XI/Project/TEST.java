/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        int item = 0;
        int limit = 10;
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 to Add");
        System.out.println("2 to Remove");
        System.out.println("3 to Check the amount");
        System.out.print("Choose your action : ");
        menu = sc.nextInt();
        if (menu == 1) {
            int amountAdd = 0;
            System.out.print("How many will you add : ");
            amountAdd = sc.nextInt();
            if (item + amountAdd <= limit) {
                item = amountAdd + item;
                System.out.println("Your amount of item in cago is : " + item);
            } else {
                System.out.println("โกดังเต็มแล้ว ไม่สามารถเพิ่มอีกได้");
            }
        }
        if (menu == 2) {
            int amountDel;
            System.out.print("How many will you take out : ");
            amountDel = sc.nextInt();
            if (item - amountDel >= 0) {
                item = item - amountDel;
                System.out.println("Your amount of item in cago is : " + item);
            } else {
                System.out.println("โกดังมีน้อยกว่าที่คุณต้องการจะเอาออก");
            }
        }
        if (menu == 3) {
            System.out.println("Your amount of item in cago is : " + item);
        }
    }
    }
