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
obj.attnCalc(present_hours,total_hours);
obj.predict();
obj.display();

}

}

class Att{

  private double pre;
  private double ttl;
  double main_attendance;
//Variables
int count=0,num=1,denom=1;
int countp=0,deno=1;
//****************************************************************************
  public  double attnCalc(double present,double total){
    pre =present;
    ttl=total;
  main_attendance=pre/ttl*100;


  while (true)
   {

      double current_attendance=((present+num)/(total+denom))*100;
       num++;
       denom++;

   if(current_attendance>75){break;}
count++;
  }
  return count;
  }
//****************************************************************************
 public double predict(){

if(main_attendance>75)
{
while (deno<=1000)
 {

    double predicted_attandance=((pre)/(ttl+deno))*100;
if(predicted_attandance>=75){countp++;}
     deno++;
}

}
return countp;
}
//****************************************************************************
void display(){
  if(main_attendance>=75){
    System.out.println("You are Safe :) ");
    System.out.println("In case Of Emergency,You can bunk "+countp+" Consecutive classes(if taken) and will stay above or equal 75%");
  }
  if(main_attendance<75){
    System.out.println("You Need To be present in next  "+count+" Hours To hit 75%");
  }
}



//****************************************************************************

}
