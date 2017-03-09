//Created By Ankur Pandey
//Git hub:- AnkDos

import java.util.*;

class Calc{

static  double attnCalc(double present,double total){
  double present_attendance=present/total*100;
  int count=0,num=1,denom=1;
  while (true)
   {

       present_attendance=((present+num)/(total+denom))*100;
       num++;
       denom++;

   if(present_attendance>75){break;}
count++;
  }
  return count;
  }


public static void main (String args[]){
Scanner n=new Scanner(System.in);
System.out.println("Enter Present Hours");
double present_hours=Double.parseDouble(""+n.nextDouble());
System.out.println("Enter Total Hours");
double total_hours=Double.parseDouble(""+n.nextDouble());

double result=attnCalc(present_hours,total_hours);
System.out.println("You Need "+result+" Hours To hit 75%");
}

}
