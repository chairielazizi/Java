/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfop3;

/**
 *
 * @author user
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AssignmentFOP3{
    public static void main(String[]args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        String sym;
        int min, max, count;
        String des;
        int l = 0, h = 0, n1 = 0, n2 = 0;
        int pause=0,bil=1;
        
        start sta = new start();
        sta.setVisible(true);
        //NewJFrame jframe = new NewJFrame(); 
        //jframe.setVisible(true);

        

        try {
            PrintWriter p = new PrintWriter(new FileOutputStream("Symbols.txt"));
            System.out.println("Enter Symbol, Minimum Block, Maximum Block and Description(Enter Z to end):");
            do {
                sym = s.next();
                if (sym.equalsIgnoreCase("Z")) {
                    break;
                }
                min = s.nextInt();
                max = s.nextInt();
                des = s.next();
                p.print(sym + " ");
                p.print(min + " ");
                p.print(max + " ");
                p.println(des + " ");

            } while (!sym.equals("Z"));
            p.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }//end of symbol input
        
        System.out.print("Area(Length x Height)= ");
        String size=s.next();
        String[]border=size.split("x");
        int borderLength=((int)Integer.parseInt(border[0],10));
        int borderHeight=((int)Integer.parseInt(border[1],10));
        //input area
        
    int[][]check=new int[borderHeight][borderLength];
    String [][] symbol = new String[borderHeight][borderLength];
    int [][] got = new int[borderHeight][borderLength];

   for(int i=0;i<borderHeight;i++){
    for(int j=0;j<borderLength;j++){
         symbol[i][j]="     |";    
     }
 }
   //main road
        int r1 = r.nextInt(borderHeight-1);
        int r2 = r.nextInt(borderLength-1);
        for (int i = 0; i < borderLength; i++) {
            symbol[r1][i] = "  >  |";
            symbol[r1 + 1][i] = "  <  |";
            check[r1][i] =3;
            check[r1 + 1][i] =3;
            got[r1][i] =1;
            got[r1 + 1][i] =1;
        }
        if (r1 <= 4) {
            symbol[r1][r2] = "  >  |";
            symbol[r1 + 1][r2 + 1] = "  <v |";
            symbol[r1][r2 + 1] = "  >v |";
            symbol[r1 + 1][r2] = "  <  |";
            check[r1][r2] =3;
            check[r1 + 1][r2 + 1] =3;
            check[r1][r2 + 1] =3;
            check[r1 + 1][r2] =3;
            got[r1][r2] =1;
            got[r1 + 1][r2 + 1] =1;
            got[r1][r2 + 1] =1;
            got[r1 + 1][r2] =1;
            for (int i = 2; i < borderHeight - r1; i++) {
                symbol[r1 + i][r2] = "  ^  |";
                symbol[r1 + i][r2 + 1] = "  v  |";
                check[r1 + i][r2] =3;
                check[r1 + i][r2 + 1] =3;
                got[r1 + i][r2] =1;
                got[r1 + i][r2 + 1] =1;
            }
        } else if (r1 >= borderHeight-5) {
            symbol[r1][r2] = "  >^ |";
            symbol[r1 + 1][r2 + 1] = "  <  |";
            symbol[r1][r2 + 1] = "  >v |";
            symbol[r1 + 1][r2] = "  <^ |";
            check[r1][r2] =3;
            check[r1 + 1][r2 + 1] =3;
            check[r1][r2 + 1] =3;
            check[r1 + 1][r2] =3;
            got[r1][r2] =1;
            got[r1 + 1][r2 + 1] =1;
            got[r1][r2 + 1] =1;
            got[r1 + 1][r2] =1;
            for (int i = 1; i <= r1; i++) {
                symbol[r1 - i][r2] = "  ^  |";
                symbol[r1 - i][r2 + 1] = "  v  |";
                check[r1 - i][r2] =3;
                check[r1 - i][r2 + 1] =3;
                got[r1 - i][r2] =1;
                got[r1 - i][r2 + 1] =1;

            }

        }
        else {
            symbol[r1][r2] = "  >^ |";
            symbol[r1 + 1][r2 + 1] = "  <v |";
            symbol[r1][r2 + 1] = "  >v |";
            symbol[r1 + 1][r2] = "  <^ |";
            check[r1][r2] =3;
            check[r1 + 1][r2 + 1] =3;
            check[r1][r2 + 1] =3;
            check[r1 + 1][r2] =3;
            got[r1][r2] =1;
            got[r1 + 1][r2 + 1] =1;
            got[r1][r2 + 1] =1;
            got[r1 + 1][r2] =1;
            for (int i = 1; i <= r1; i++) {
                symbol[r1 - i][r2] = "  ^  |";
                symbol[r1 - i][r2 + 1] = "  v  |";
                check[r1 - i][r2] =3;
                check[r1 - i][r2 + 1] =3;
                got[r1 - i][r2] =1;
                got[r1 - i][r2 + 1] =1;

            }
            for (int i = 2; i < borderHeight - r1; i++) {
                symbol[r1 + i][r2] = "  ^  |";
                symbol[r1 + i][r2 + 1] = "  v  |";
                check[r1 + i][r2] =3;
                check[r1 + i][r2 + 1] =3;
                got[r1 + i][r2] =1;
                got[r1 + i][r2 + 1] =1;

            }


        }//main road

        try {
            Scanner sc = new Scanner(new FileInputStream("Symbols.txt"));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] temp = line.split(" ");
                sym = temp[0];
                min = ((int) Integer.parseInt(temp[1], 10));
                max = ((int) Integer.parseInt(temp[2], 10));
                des = temp[3];
                
//input area
                 System.out.print(sym+"=");
             count=s.nextInt();
        bil++;
        //end of input area
                      while (count>0){
            test1:{            
                int area = min + r.nextInt(max - min + 1);
  //              System.out.println(sym+" = "+area);
                int extra = 0;
                if (area % 4 != 0) {
                    for (int i = area - 1; i > 1; i--) {
                        if (i % 4 == 0) {
                            extra = area % i;
                            area = i;
                            break;
                        }
                    }
                }

                if (area <= 14) {           //make it beautiful
                    for (int i = 2; i <= area; i++) {
                        if (area % i == 0) {
                            if ((0 + r.nextInt()) % 2 == 0) {
                                l = i;
                                h = area / l;
                            } else {
                                h = i;
                                l = area / h;
                            }
                            break;
                        }
//            }

                    }
                } else {
                    for (int i = 3; i <= area; i++) {
                        if (area % i == 0) {
                            if ((0 + r.nextInt()) % 2 == 0) {
                                l = i;
                                h = area / l;
                            } else {
                                h = i;
                                l = area / h;
                            }
                            break;
                        }
//            }

                    }
                }

                int can = 0, end = 1;
                //               while(end==1){
                int rerun=0;
                while (can == 0) {
                    if(rerun>100){
                     break test1;
                 }
                    rerun++;
                    pause++;
                    can = 1;
                    while(true){
                        n1 = 0 + r.nextInt(borderHeight-1 - h);
                        n2 = 0 + r.nextInt(borderLength-1 - l);
                        if(extra>h && n1==0)
                            continue;
                        else 
                            break;
                    }
                    for (int c = n1; c < n1 + h; c++) {
                        for (int d = n2; d < n2 + l; d++) {
                            if (check[c][d] != 0) {
                                can = 0;
                            }
                        }
                    }
                    if (extra > 0) {
                        if (n1 <= (borderHeight - h + extra) && (n1 + h - extra) >= 0) {
                            for (int c = n1 + h - extra; c < n1 + h; c++) {
                                if (n2 <= borderLength-2 - l) {
                                    for (int d = n2 + l; d < n2 + l + 1; d++) {
                                        if (check[c][d] != 0) {
                                            can = 0;
                                        }
                                    }
                                }
                            }
                        }

                    }
                    if (can == 1) {
                        if (n1 >= 1) {      //up
                            int c = (n1 - 1);        //create space for road
                            if (n2 <= borderLength-1 - l && n2 >= 1) {
                                for (int d = n2 - 1; d <= n2 + l; d++) {
                                    check[c][d] = 2;
                                }
                            }
                            if (n2 == 0) {
                                for (int d = n2; d <= n2 + l; d++) {
                                    check[c][d] = 2;
                                }
                            }
                        }
                        if (n1 <= borderHeight-1 - h) {   //down
                            int c = (n1 + h);        //create space for road
                            if (n2 <= borderLength-1 - l && n2 >= 1) {
                                for (int d = n2 - 1; d <= n2 + l; d++) {
                                    check[c][d] = 2;
                                }
                            }
                            if (n2 == 0) {
                                for (int d = n2; d <= n2 + l; d++) {
                                    check[c][d] = 2;
                                }
                            }
                        }

                        //}while( don't know why here)
                        if (n2 >= 1) { //left
                            int d = n2 - 1;
                            if (n1 <= borderHeight-1 - h) {
                                for (int c = n1; c < n1 + h; c++) {
                                    check[c][d] = 2;
                                }
                            }

                        }
                        if (n2 <= borderLength-1 - l) { //right
                            int d = n2 + l;
                            for (int c = n1; c < n1 + h; c++) {
                                check[c][d] = 2;
                            }
                        }
                        if (extra > 0) {  //create space if got extra

                            if (n1 < (borderHeight-1 - h + extra + 1) && (n1 >= extra + 1 - h) && (n2 <= borderLength-1 - l)) {      //up
                                int c = n1 + h - extra - 1;
                                int d = n2 + l;
                                check[c][d] = 2;
                            }

                            if ((n1 <= borderHeight-1 - h) && n2 <= borderLength-1 - l) {   //down
                                int c = n1 + h;
                                int d = n2 + l;
                                check[c][d] = 2;
                            }

                            if (n2 >= 1) { //left
                                if (n1 <= borderHeight-1 - h + extra - 1) {
                                    int d = n2 + l - 1;
                                    for (int c = n1 + h - extra + 1; c < n1 + h; c++) {
                                        check[c][d] = 2;
                                    }
                                }
                            }
                            if (n2 <= borderLength-2 - l) { //right
                                int d = n2 + l + 1;
                                    for (int c = n1 + h - extra - 1; c <= n1 + h; c++) {
                                 if ((n1+h-extra-1 <= borderHeight-1)&&(n1+h-extra-1>=0)) {
                     //            if ((n1 <= 19 - h + extra + 1)&&n1+h<20) {
                                       check[c][d] = 2;     //n1-extra-1+h>0    &&n1+h<20
                                    }
                                }
                            }

                        }//close extra>0
                        for (int c = n1; c < n1 + h; c++) {
                            for (int d = n2; d < n2 + l; d++) {
                                symbol[c][d] = "  " + sym + "  |";
                                check[c][d] = 1;
                                got[c][d]=bil;
//                        end=0;
                            }
                        }
//   end=0;
                        if (extra > 0) {
                            if (n1 <= (borderHeight - h + extra) && (n1 + h - extra) >= 0) {
                                for (int c = n1 + h - extra; c < n1 + h; c++) {
                                    if (n2 <= borderLength-2 - l) {
                                        for (int d = n2 + l; d < n2 + l + 1; d++) {
                                            symbol[c][d] = "  " + sym + "  |";
                                            check[c][d] = 1;
                                        }
                                    }
                                }
                            }
                        }
                        int total = 0;//main road beside building
                        for (int i = 0; i < borderLength; i++) {//upper side main road

                            if (r1 > 0 && check[r1][i] == 2 && (check[r1 - 1][i] == 1)) {
                                total++;
                            } else {
                                if (total > 0) {
                                    int temp1 = total / 2;
                                    symbol[r1][i - temp1 - 1] = "  ^> |";
                                    symbol[r1][i - temp1] = "  v> |";
                                    total = 0;
                                }
                            }
                        }
                        total = 0;
                        for (int i = 0; i < borderLength; i++) {//lower side main road
                            if (r1 + 1 < borderHeight-1 && check[r1 + 1][i] == 2 && (check[r1 + 2][i] == 1)) {
                                total++;
                            } else {
                                if (total > 0) {
                                    int temp1 = total / 2;
                                    symbol[r1 + 1][i - temp1 - 1] = "  ^< |";
                                    symbol[r1 + 1][i - temp1] = "  v< |";
                                    total = 0;
                                }
                            }
                        }
                        int start=0,stop=borderHeight;
                        if(r1<=4){
                            start=r1;
                            stop=borderHeight;
                        }
                        else if(r1>=borderHeight-5){
                            start=0;
                            stop=r1;
                        }
                        total = 0;
                        for (int i = start; i < stop; i++) {//right side main road
                            if (r2 + 1 < borderLength-1 && check[i][r2 + 1] == 2 && (check[i][r2 + 2] == 1)) {
                                total++;
                            } else {
                                if (total > 0) {
                                    int temp1 = total / 2;
                                    symbol[i - temp1 - 1][r2 + 1] = "  v> |";
                                    symbol[i - temp1][r2 + 1] = "  v< |";
                                    total = 0;
                                }
                            }
                        }
                        total = 0;
                        for (int i = start; i < stop; i++) {//left side main road
                            if (r2 > 0 && check[i][r2] == 2 && (check[i][r2 - 1] == 1)) {
                                total++;
                            } else {
                                int temp1 = total / 2;
                                if (total == 1) {
                                    symbol[i - temp1 - 1][r2] = " <>^ |";
                                    total = 0;
                                } else if (total > 0) {
                                    symbol[i - temp1 - 1][r2] = "  >^ |";
                                    symbol[i - temp1][r2] = "  <^ |";
                                    total = 0;
                                }
                            }
                        }//end of main road beside building

                        for (int i = 0; i < borderLength; i++) {    //assign overlapped main road as 3
                            check[r1][i] = 3;
                            check[r1 + 1][i] = 3;
                        }
                        if (r1 <= 4) {
                            check[r1][r2] = 3;
                            check[r1 + 1][r2 + 1] = 3;
                            check[r1][r2 + 1] = 3;
                            check[r1 + 1][r2] = 3;
                            for (int i = 2; i < borderHeight - r1; i++) {
                                check[r1 + i][r2] = 3;
                                check[r1 + i][r2 + 1] = 3;
                            }
                        } else if (r1 >= borderHeight-5) {
                            check[r1][r2] = 3;
                            check[r1 + 1][r2 + 1] = 3;
                            check[r1][r2 + 1] = 3;
                            check[r1 + 1][r2] = 3;
                            for (int i = 1; i <= r1; i++) {
                                check[r1 - i][r2] = 3;
                                check[r1 - i][r2 + 1] = 3;

                            }

                        } else {
                            check[r1][r2] = 3;
                            check[r1 + 1][r2 + 1] = 3;
                            check[r1][r2 + 1] = 3;
                            check[r1 + 1][r2] = 3;
                            for (int i = 1; i <= r1; i++) {
                                check[r1 - i][r2] = 3;
                                check[r1 - i][r2 + 1] = 3;

                            }
                            for (int i = 2; i < borderHeight - r1; i++) {
                                check[r1 + i][r2] = 3;
                                check[r1 + i][r2 + 1] = 3;
                            }
                        }

                        ///// small road
                        int a, b, total3 = 0, total1 = Integer.MAX_VALUE, total2 =Integer.MAX_VALUE,total5_1=0,total5_2=0,x=n2,y=n1,xu=n2,xd=n2,yr=n1,yl=n1;//total5 is to test the building is blocked or not
                        int exlength,exheight,minus,f,g,totaldown = Integer.MAX_VALUE, totalleft =Integer.MAX_VALUE, totalup = Integer.MAX_VALUE, totalright =Integer.MAX_VALUE,total5_1u=0,total5_2r=0,total5_1d=0,total5_2l=0;
                        int wayvertical=0,wayhorizontal=0;//up&right=1 down&left=2
// test:while(true) {
                        if(extra==0){
                                exlength=l;
                                minus=0;
                        }
                        else{
                                exlength=l+1;
                                minus=h-extra;
                            }
                            
                        if(extra<h){
                        test:
                        {           
                           
                            for (int i = n2; i < n2+exlength; i++) {   //vertical
                                    totaldown=0 ;   //total1=horizontal road t2=vertical
                                for (int j = 0; j < borderHeight; j++) {
                                        a = n1 + h;
                                        if(n1+h-1==borderHeight-1){
                                            totaldown=Integer.MAX_VALUE;
                                            break test;
                                        }
                                        if(a+j<borderHeight){
                                        
                                        if (check[a + j][i] == 3||check[a+j][i]==4) {
                                            xd=i;
                                            break test;
                                        }
                                        else if (check[a + j][i] == 1||a+j== borderHeight-1) {
                                            totaldown = 0;
                                            total5_1d++;
                                            break;
                                        }
                                        else{
                                        totaldown++;
                                        }
                                        }
                                        
                                }
                            }
                        }//test
                                //    }   
                                test:
                                {
                                for (int i = n2; i < n2+exlength; i++) {   //vertical
                                    totalup=0 ;   //total1=horizontal road t2=vertical
                                for (int j = 0; j < borderHeight; j++) {   //road above building
                                if(n1==0){
                                    totalup=Integer.MAX_VALUE;
                                    break test;
                                }
                                    if(n1-j-1>=0){
                                    if (check[n1 - j-1][i] == 3|| check[n1-j-1][i]==4) {
                                            xu=i;
                                            break test;
                                        }
                                    else if (check[n1 - j-1][i] == 1||n1-j-1==0) { 
                                            totalup = 0;
                                            total5_1u++;
                                            break;
                                        }
                                        else{
                                        totalup++;
                                        }
                               //     }
                                }
                                }
                                }
                            }//test
                            if(totalup<=totaldown&&totalup!=0||total5_1d==exlength){
                                wayvertical=1;
                                total5_1=total5_1u;
                                total1=totalup;
                                x=xu;
                            }
                            else if(totaldown<totalup&&totaldown!=0||total5_1u==exlength){
                                wayvertical=2;
                                total5_1=total5_1d;
                                total1=totaldown;
                                x=xd;
                            }
                                

                        test:
                        {
                            for (int i = n1+h-1; i >= n1; i--) {
                                totalright=0;  //t2=vertical road
                                for (int j = 0; j < borderLength; j++) {
                                      if(extra==0||i<n1+minus){
                                          b=n2+l;
                                      }
                                       else{
                                          b=n2+l+1;
                                           }
                                  if(b-1==borderLength-1){
                                      totalright=Integer.MAX_VALUE;
                                      break test;
                                  }
                                        if (b + j < borderLength) {  
                                            
                                             if (check[i][b + j] == 3 || check[i][b+j]==4) {     // road at the right
                                                yr=i;
                                                break test;
                                             } 
                                            else if (check[i][b + j] == 1||b+j==borderLength-1) {
                                                totalright = 0;
                                                total5_2r++;
                                                break;
                                            }else{
                                            totalright++;
                                            }
                                        } 
                                    }
                            }
                        }//test
                                    //} 
                                    test:
                                    {
                                     for (int i = n1+h-1; i >= n1; i--) {
                                totalleft=0;   //t2=vertical road
                                for (int j = 0; j < borderLength; j++) {  // road at the left
                                       if(n2==0){
                                           totalleft=Integer.MAX_VALUE;
                                           break test;
                                       }
                               if (n2 - j-1 >= 0) {
                                            
                                            if (check[i][n2 - j-1] == 3 || check[i][n2-j-1]==4) {
                                                yl=i;
                                                break test;
                                            }
                                            else if (check[i][n2 - j-1] == 1||n2-j-1==0) {
                                                totalleft = 0;
                                                total5_2l++;
                                                break;
                                            }
                                            else{
                                            totalleft++;
                                            }
                                        } 
                            //        }

                                }
                            }
                            //     break;
                        }//test
                        if((totalright<=totalleft&&totalright!=0)||total5_2l==h){
                                wayhorizontal=1;
                                total5_2=total5_2r;
                                total2=totalright;
                                y=yr;
                            }
                        if((totalleft<totalright&&totalleft!=0)||total5_2r==h){
                                wayhorizontal=2;
                                total5_2=total5_2l;
                                total2=totalleft;
                                y=yl;
                            }
                            if ((total5_2==h || total1 <= total2)&&total5_1!=exlength) { //total5=0 means it is not blocked by other buildings
                                total3 = total1;
                            if (wayvertical==2) {  // road at the bottom 
                                for (int k = 0; k < total3; k++) {
                                    if (n1 + h + k < borderHeight) {
                                        symbol[n1 + h + k][x] = "  ^v |";
                                        check[n1 + h + k][x] = 4;
                                    }
                                }
                            } else if(wayvertical==1){
                                if(n2+l==x)
                                    total3+=minus;  //road at up
                                    for (int k = 0; k < total3; k++) {
                                        if(n2+l==x)
                                          g=n1-k+minus-1;
                                        else
                                            g=n1-k-1;
                                        if (g >= 0) {
                                            symbol[g][x] = "  ^v |";
                                            check[g][x] = 4;
                                        }
                                  
                                }
                            }
                            
                        }
                        if ((total5_1==exlength||total2 <= total1)&&total5_2!=h ) {
                            total3 = total2;
                            if ((wayhorizontal==1)&&(extra==0||total3>=1)) {  // road at the right
                                    for (int k = 0; k < total3; k++) {
                                    if(extra==0||y<n1+minus){
                                        if (n2 + l + k < borderLength) {
                                        symbol[y][n2 + l + k] = "  <> |";
                                        check[y][n2 + l + k] = 4;
                                        }
                                    }else{
                                            if (n2 + l + k+1 < borderLength) {
                                        symbol[y][n2 + l + k+1] = "  <> |";
                                        check[y]
                                                [n2 + l + k+1] = 4;
                                            }
                                        }
                                }
                       //     }
                            }else {
                                if (wayhorizontal==2) {  //road at left
                                    for (int k = 0; k < total3; k++) {
                                        if (n2 - k-1 >= 0) {
                                            symbol[y][n2 - k-1] = "  <> |";
                                            check[y][n2 - k-1] = 4;
                                        }
                                    }
                                }
                            }
                        }
                            //all direction blocked
                        if(total5_1u==exlength&&total5_1d==exlength&&total5_2r==h&&total5_2l==h){
                            test:
                                {
                            if(n1>r1){  //road at above
                                for (int k = 0; k < borderHeight; k++) {
                                        if (n1-k-1>= 0) {
                                            if (check[n1-k-1][n2]==3||check[n1-k-1][n2]==4){
                                         break test;
                                         }
                                         else if(check[n1-k-1][n2]!=1){
                                             symbol[n1-k-1][n2] = "  ^v |";
                                             check[n1-k-1][n2] = 4;
                                        }
                                            
                                        }
                                    }
                                
                                }
                            
                            else{
                                for (int k = 0; k < borderHeight; k++) {//bottom
                                    if (n1 + h + k < borderHeight) {
                                        if (check[n1 + h + k][x]==3||check[n1 + h + k][x]==4){
                                             break test;
                                         }
                                         else if(check[n1 + h + k][x]!=1){
                                             symbol[n1 + h + k][x] = "  ^v |";
                                             check[n1 + h + k][x] = 4;
                                         }
                                    }
                                }
                            }
                        }
                        }
                    }//extra<h 
                        if(extra>=h){
                        test:
                        {         
                            for (int i = n2; i <= n2 + l; i++) {   //vertical
                                    totaldown = 0 ;   //total1=horizontal road t2=vertical
                                    for (int j = 0; j < borderHeight; j++) {
                                   // if (n1 < r1) {  
                                        a = n1 + h;         //road at bottom
                                        if(a-1==borderHeight-1){
                                            totaldown=Integer.MAX_VALUE;
                                            break test;
                                        }
                                        if(a+j<borderHeight){
                                        if (check[a + j][i] == 3||check[a+j][i]==4) {
                                            xd=i;
                                            break test;
                                        }
                                        else if (check[a + j][i] == 1||a+j==borderHeight-1) {
                                            totaldown = 0;
                                            total5_1d++;
                                            break;
                                        }
                                                else{
                                        totaldown++;
                                        }
                                        }
                                    }}
                        }
                        test:
                        {
                            for (int i = n2+l; i >= n2; i--) {   //vertical
                                    
                                    totalup = 0 ;   //total1=horizontal road t2=vertical
                                    for (int j = 0; j < borderHeight; j++) {
                                    
                                 if(n1==0){
                                     totalup=Integer.MAX_VALUE;
                                     break test;
                                 }
                                 if(n1-j-1>=0){
                                        if (check[n1 - j-1][i] == 3|| check[n1-j-1][i]==4) {    //road above building
                                            xu=i;
                                            break test;
                                        }
                                        else if (check[n1 - j-1][i] == 1||n1-j-1==0) {  
                                            totalup = 0;
                                            total5_1u++;
                                          break;
                                        }
                                                else{
                                        totalup++;
                                        }
                                 //   }
                                 }
                                }
                            }
                        }
                       if(totalup<=totaldown&&totalup!=0||total5_1d==exlength){
                                wayvertical=1;
                                total5_1=total5_1u;
                                total1=totalup;
                                x=xu;
                            }
                       if(totaldown<totalup&&totaldown!=0||total5_1u==exlength){
                                wayvertical=2;
                                total5_1=total5_1d;
                                total1=totaldown;
                                x=xd;
                            }
                        test:
                        {
                            for (int i = n1+h-1; i >= n1-(extra-h); i--) {
                                if(i>=0&&i<borderHeight){
                                totalright = 0 ;   //t2=vertical road
                                for (int j = 0; j < borderLength; j++) {
                                        b = n2 + l+1;       // road at the right
                                        if(b-1==borderLength-1){
                                            totalright=Integer.MAX_VALUE;
                                            break test;
                                        }
                                        if (b + j < borderLength) {
                                            

                                            if (check[i][b + j] == 3 || check[i][b+j]==4) {
                                                yr=i;
                                                break test;
                                            } 
                                            else if (check[i][b + j] == 1||b+j==borderLength-1) {
                                                totalright = 0;
                                                total5_2r++;
                                                break;
                                            }
                                                    else{
                                            totalright++;
                                            }
                                        } 
                                }}}
                        }
                        test:
                        {
                            for (int i = n1+h-1; i >= n1-(extra-h); i--) {   //t2=vertical road
                                totalleft=0;
                                if(i>=0&&i<borderHeight){
                                for (int j = 0; j < borderLength; j++) {
                                if(n2==0){
                                    totalleft=Integer.MAX_VALUE;
                                    break test;
                                }
                                        if (n2 - j > 0) {           
                                            

                                            if (check[i][n2 - j-1] == 3 || check[i][n2-j-1]==4) {  // road at the left
                                                yl=i;
                                                break test;
                                            }
                                            else if (check[i][n2 - j-1] == 1||n2-j-1==0) {
                                                totalleft = 0;
                                                total5_2l++;
                                                break;
                                            }
                                                    else{
                                            totalleft++;
                                            }
                                        } 
                                //    }

                                }
                            }
                        }
                        }
                        if((totalright<=totalleft&&totalright!=0)||total5_2l==extra){
                                wayhorizontal=1;
                                total5_2=total5_2r;
                                total2=totalright;
                                y=yr;
                            }
                        if((totalleft<totalright&&totalleft!=0)||total5_2r==extra){
                                wayhorizontal=2;
                                total5_2=total5_2l;
                                total2=totalleft;
                                y=yl;
                            }
                       //print small road
                            if ((total5_2==extra||total1 <= total2)&&total5_1!=exlength) { //total5=0 means it is not blocked by other buildings
                                total3 = total1;
                            if (wayvertical==2) {  // road at the bottom 
                                for (int k = 0; k < total3; k++) {
                                    if (n1 + h + k < borderHeight) {
                                        symbol[n1 + h + k][x] = "  ^v |";
                                        check[n1 + h + k][x] = 4;
                                    }
                                }
                            } //else {
                                if (wayvertical==1) {  //road at up
                                    
                                    for (int k = 0; k < total3; k++) {
                                    if(x==n2+l-1){
                                        f=n1-(extra-h)-k-1;
                                    }else
                                        f=n1-k-1;
                                     if (f>= 0) {
                                            symbol[f][x] = "  ^v |";
                                            check[f][x] = 4;
                                        }
                                    }
                                }
                        //    }

                        }
                        if ((total5_1==l+1||total2 <= total1)&&total5_2!=extra ) { 
                            total3 = total2;
                            
                            if ((wayhorizontal==1)&&total3>=1) {  // road at the right
                                for (int k = 1; k <= total3; k++) {
                                    if (n2 + l + k < borderLength) {
                                        
                                        symbol[y][n2 + l + k] = "  <> |";
                                        check[y][n2 + l + k] = 4;
                                    }
                                }
                            
                            
                            }else {
                                if (wayhorizontal==2) {  //road at left
                                    if(y==n1-(extra-h))
                                        total3+=l;
                                    for (int k = 0; k < total3; k++) {
                                        if (n2 - k > 0) {
                                            symbol[y][n2 - k-1] = "  <> |";
                                            check[y][n2 - k-1] = 4;
                                        }
                                    }
                                }
                            }
                        }
                        //all direction blocked
                        if(total5_1u==l+1&&total5_1d==l+1&&total5_2r==extra&&total5_2l==extra){
                            test:
                                {
                            if(n1>r1){  //road at above
                                
                                for (int k = 0; k < borderHeight; k++) {
                                    if(x==n2+l-1){
                                        f=n1-(extra-h)-k-1;
                                    }else
                                        f=n1-k-1;
                                     if (f>= 0) {
                                         if (check[f][x]==3||check[f][x]==4){
                                         break test;
                                         }
                                         else if(check[f][x]!=1){
                                             symbol[f][x] = "  ^v |";
                                             check[f][x] = 4;
                                        }
                                     }
                                }
                                }
                            
                            else{
                                for (int k = 0; k < borderHeight; k++) {
                                    if (n1 + h + k < borderHeight) {
                                         if (check[n1 + h + k][x]==3||check[n1 + h + k][x]==4){
                                             break test;
                                         }
                                         else if(check[n1 + h + k][x]!=1){
                                             symbol[n1 + h + k][x] = "  ^v |";
                                             check[n1 + h + k][x] = 4;
                                         }
                                         
                                             
                                    }
                                }
                                
                                
                            }
                        }
                        }
                        }   //extra>h
                    }//close can
                 if(pause>=1500){
                     System.out.println("There is no space for your building, please try again.");
                     System.exit(0);
                 }
                
                }//while can=0
             count--;         
            }//end test1
        }//end count
            }//while has next line
            sc.close();
            //create small road end

            //sc.close();
            for (int i = 0; i < borderHeight; i++) {
                System.out.print("|");
                for (int j = 0; j < borderLength; j++) {
                    System.out.print(symbol[i][j]);
                }
                System.out.println("");
            }
//            System.out.println("");
//            for (int i = 0; i < borderHeight; i++) {
//                for (int j = 0; j < borderLength; j++) {
//                    System.out.print(got[i][j]);
//                }
//                System.out.println("");
//            }
//            
            Scanner s1 = new Scanner(new FileInputStream("Symbols.txt"));
            System.out.println("Legend: ");
            while (s1.hasNextLine()) {
                String line = s1.nextLine();
                String[] temp = line.split(" ");
                sym = temp[0];
                des = temp[3];
                System.out.println(sym+"-"+des);
            }
            ///////////////////////subway////////////////////////////////
              for (int i = 0; i <=borderHeight / 2 ; i++) {
                for (int j = 0; j <= borderLength / 2 ; j++) {
                    if(((borderLength/2 + j+ 1)<borderLength) && ((borderHeight/2 +i)<borderHeight)){
                    if (check[borderHeight / 2 + i][borderLength / 2 + j] != 1
                            && 
                            check[borderHeight / 2 + i][borderLength / 2 + j + 1] == 1
                            && 
                            check[borderHeight / 2 + i + 1][borderLength / 2 + j + 1] != 1) {    //down right 
                        for (int o = 0; o < j; o++) {
                            if (check[borderHeight / 2 + i][borderLength / 2 + j - o] == 1 || check[borderHeight / 2 + i][borderLength / 2 + j - o] == 5) {
                                break;
                            }
                            symbol[borderHeight / 2 + i][borderLength / 2 + j - o] = "  <> |";
                            check[borderHeight / 2 + i][borderLength / 2 + j - o] = 5;
                        }
                    }
                    }//right down
                    if(((borderLength/2 - j- 1)>=0) && ((borderHeight/2 +i)<borderHeight)){
                    if (check[borderHeight / 2 + i][borderLength / 2 - j] != 1
                            && 
                            check[borderHeight / 2 + i][borderLength / 2 - j - 1] == 1
                            && 
                            check[borderHeight / 2 + i + 1][borderLength / 2 - j - 1] != 1) {    //down left
                        for (int o = 0; o < j; o++) {
                            if (check[borderHeight / 2 + i][borderLength / 2 - j + o] == 1 || check[borderHeight / 2 + i][borderLength / 2 - j + o] == 5) {
                                break;
                            }
                            symbol[borderHeight / 2 + i][borderLength / 2 - j + o] = "  <> |";
                            check[borderHeight / 2 + i][borderLength / 2 - j + o] = 5;
                        }
                    }
                    }//left down
                    if(((borderLength/2 + j+ 1)<borderLength) && ((borderHeight/2 -i)>=0)){
                    if (check[borderHeight / 2 - i][borderLength / 2 + j] != 1
                            && 
                            check[borderHeight / 2 - i][borderLength / 2 + j + 1] == 1
                            && 
                            check[borderHeight / 2 - i + 1][borderLength / 2 + j + 1] != 1) //down right/
                                    {
                        for (int o = 0; o < j; o++) {
                            if (check[borderHeight / 2 - i][borderLength / 2 + j - o] == 1 || check[borderHeight / 2 - i][borderLength / 2 + j - o] == 5) {
                                break;
                            }
                            symbol[borderHeight / 2 - i][borderLength / 2 + j - o] = "  <> |";
                            check[borderHeight / 2 - i][borderLength / 2 + j - o] = 5;
                        }
                
                    }
                    }//right up
                    if(((borderLength/2 - j- 1)>=0) && ((borderHeight/2 -i)>=0)){
                    if (check[borderHeight / 2 - i][borderLength / 2 - j] != 1
                            && //for left up corner side 
                            check[borderHeight / 2 - i + 1][borderLength / 2 - j] != 1
                            && //down
                            check[borderHeight / 2 - i][borderLength / 2 - j - 1] == 1
                            && 
                            check[borderHeight / 2 - i + 1][borderLength / 2 - j - 1] != 1) {    //down left
                        for (int o = 0; o < j; o++) {
                            if (check[borderHeight / 2 - i][borderLength / 2 - j + o] == 1 || check[borderHeight / 2 - i][borderLength / 2 - j + o] == 5) {
                                break;
                            }
                            symbol[borderHeight / 2 - i][borderLength / 2 - j + o] = "  <> |";
                            check[borderHeight / 2 - i][borderLength / 2 - j + o] = 5;
                        }
                    }
    
                    }//left up
            }
            }
            for (int i = 0; i < borderHeight; i++) {
                if (check[i][borderLength / 2] == 1) {
                    continue;
                }
            symbol[i][borderLength / 2] = " ^v  |";
                    check[i][borderLength / 2] = 5;
                }
            
           for (int i = 1; i < borderHeight-1; i++) {
                if (check[i][borderLength / 2] == 1) {
                    continue;
                }
                if ((check[i][borderLength / 2 + 1] == 1 || check[i][borderLength / 2 + 1] == 5)
                        && (check[i][borderLength / 2 - 1] == 1 || check[i][borderLength / 2 - 1] == 5) && check[i + 1][borderLength / 2 - 1] != 1) {
                    symbol[i][borderLength / 2] = "<^v> |";
                    check[i][borderLength / 2] = 5;
                } else if ((check[i][borderLength / 2 + 1] != 5 || check[i][borderLength / 2 + 1] != 1) && (check[i][borderLength / 2 - 1] == 1 || check[i][borderLength / 2 - 1] == 5) && check[i + 1][borderLength / 2 - 1] != 1
                        || symbol[i][borderLength / 2 - 1].equalsIgnoreCase("  <> |")) {
                    symbol[i][borderLength / 2] = "<^v  |";
                    check[i][borderLength / 2] = 5;
                } else if ((check[i][borderLength / 2 + 1] == 5 || check[i][borderLength / 2 + 1] == 1) && (check[i][borderLength / 2 - 1] != 5 || check[i][borderLength / 2 - 1] != 1) && check[i + 1][borderLength / 2 + 1] != 1
                        || symbol[i][borderLength / 2 + 1].equalsIgnoreCase("  <> |")) {
                    symbol[i][borderLength / 2] = " ^v> |";
                    check[i][borderLength / 2] = 5;
                } else if (check[i][borderLength / 2 + 1] != 1 && check[i][borderLength / 2 - 1] != 1) {
                    symbol[i][borderLength / 2] = " ^v  |";
                    check[i][borderLength / 2] = 5;
                }
                else if (symbol[i + 1][borderLength / 2].equalsIgnoreCase("<^v  |") || symbol[i + 1][borderLength / 2].equalsIgnoreCase(" ^v> |")
                        || symbol[i - 1][borderLength / 2].equalsIgnoreCase("<^v  |") || symbol[i - 1][borderLength / 2].equalsIgnoreCase(" ^v> |")) {
                    symbol[i][borderLength / 2] = " ^v  |";
                    check[i][borderLength / 2] = 5;
                } 
            }
        

            symbol[borderHeight / 2][borderLength / 2] = "  T  |";
            check[borderHeight / 2][borderLength / 2] = 1;

            //sc.close();
            for (int i = 0; i < borderHeight; i++) {
                System.out.print("|");
                for (int j = 0; j < borderLength; j++) {
                    if(check[i][j]==1||check[i][j]==5)
                    System.out.print(symbol[i][j]);
                    else
                    System.out.print("     |");

                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
            //////////////////subway////////////////end

//check
    /*       for (int i = 0; i < borderHeight; i++) {
                for (int j = 0; j < borderLength; j++) {
                    System.out.print(check[i][j]);
                }
                System.out.println("");
            }

      */      
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

try{
    PrintWriter g1=new PrintWriter (new FileOutputStream("border.txt"));
     g1.println(borderHeight);
     g1.println(borderLength);
    
    g1.close();
}catch(IOException e){
            System.out.println("Problem with file output");
}    
try{
    PrintWriter g=new PrintWriter (new FileOutputStream("check.txt"));
    for(int i=0;i<borderHeight;i++){
     for(int j=0;j<borderLength;j++){
     g.print(check[i][j]+" ");
     }
     g.println("");
    }
    g.close();
}catch(IOException e){
            System.out.println("Problem with file output");
}
try{
    PrintWriter g1=new PrintWriter (new FileOutputStream("got.txt"));
    for(int i=0;i<borderHeight;i++){
     for(int j=0;j<borderLength;j++){
     g1.print(got[i][j]+" ");
     }
     g1.println("");
    }
    g1.close();
}catch(IOException e){
            System.out.println("Problem with file output");
}
try {
            Scanner sc = new Scanner(new FileInputStream("Symbols.txt"));
            System.out.println("Legend: ");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] temp = line.split(" ");
                sym = temp[0];
                des = temp[3];
                System.out.println(sym+"-"+des);
            }
            }catch(IOException e){
                    System.out.println("Problem with file output");
                    }
    }
}