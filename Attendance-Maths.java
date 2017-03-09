//Created By Ankur Pandey
//Git hub:- AnkDos

import java.util.*;

class Calc{

public static void main (String args[]){
Scanner n=new Scanner(System.in);
System.out.println("Enter Present Hours");
double present_hours=Double.parseDouble(""+n.nextDouble());
System.out.println("Enter Total Hours");
double total_hours=Double.parseDouble(""+n.nextDouble());
Att obj=new Att();
double result=obj.attnCalc(present_hours,total_hours);
System.out.println("You Need To be present in next  "+result+" Hours To hit 75%");
}

}

class Att{
  private double pre;
  private double ttl;
public  double attnCalc(double present,double total){
    pre =present;
    ttl=total;
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
}
