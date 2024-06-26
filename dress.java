 import java.util.*;
 class dress
 {
     public static void main()
     {
      Scanner ob = new Scanner(System.in);
      System.out.println("### VIBRANT SHADES ###");
      System.out.println("*** SELECT 1 FOR MEN'S CATEGORY ***");
      System.out.println("*** SELECT 2 FOR WOMEN's CATEGORY ***");
      System.out.println("*** SELECT 3 FOR KIDS CATEGORY ***");
      System.out.println("### ENTER YOUR CHOICE ###");
      int ch = ob.nextInt();
      int ch1=0; int ch2=0; int ch3=0;
{
    if(ch==1)
    {
        System.out.println("### WELCOME TO MEN'S SECTION ###");
        System.out.println("*** SELECT 1 FOR T-SHIRTS ***");
        System.out.println("*** SELECT 2 FOR JEANS PANTS ***");
        System.out.println("*** SELECT 3 FOR FORMALS ***");
        System.out.println("*** SELECT 4 FOR TRADITIONAL WEARS ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch1 = ob.nextInt();
    }
    if(ch==2)
    {
        System.out.println("### WELCOME TO WOMEN'S SECTION ###");
        System.out.println("*** SELECT 1 FOR T-SHIRTS ***");
        System.out.println("*** SELECT 2 FOR JEANS PANTS ***");
        System.out.println("*** SELECT 3 FOR WESTERN WEARS ***");
        System.out.println("*** SELECT 4 FOR TRADITIONAL WEARS ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch2 = ob.nextInt();
    }
    else if(ch==3)
    {
        System.out.println("### WELCOME TO KIDS SECTION ###");
        System.out.println("*** SELECT 1 FOR SHIRT AND TROUSER(BOYS) ***");
        System.out.println("*** SELECT 2 FOR SHIRT AND TROUSER(GIRLS) ***");
        System.out.println("*** SELECT 3 FOR DUNGAREES ***");
        System.out.println("*** SELECT 4 FOR GOWNS ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch3 = ob.nextInt();
    }
}
      int ch4=0; int ch5=0; int ch6=0; int ch7=0; 
      int ch8=0; int ch9=0; int ch10=0; int ch11=0;
      int ch12=0; int ch13=0; int ch14=0; int ch15=0;
{
    if(ch1==1)
    {
        System.out.println("### WELOCOME TO T-SHIRTS SECTION ###");
        System.out.println("*** ENTER 1 FOR SMALL SIZE ***");
        System.out.println("*** ENTER 2 FOR MEDIUM SIZE ***");
        System.out.println("*** ENTER 3 FOR LARGE SIZE ***");
        System.out.println("*** ENTER 4 FOR EXTRA LARGE SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch4 = ob.nextInt();
    }
    if(ch1==2)
    {  
        System.out.println("### WELCOME TO JEANS SECTION ###");
        System.out.println("*** ENTER 1 FOR SIZE 32 ***");
        System.out.println("*** ENTER 2 FOR SIZE 34 ***");
        System.out.println("*** ENTER 3 FOR SIZE 36 ***");
        System.out.println("*** ENTER 4 FOR SIZE 38 ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch5 = ob.nextInt();
    }
    if(ch1==3)
    {
        System.out.println("### WELCOME TO FORMALS SECTION ###");
        System.out.println("*** ENTER 1 FOR SMALL SIZE ***");
        System.out.println("*** ENTER 2 FOR MEDIUM SIZE ***");
        System.out.println("*** ENTER 3 FOR LARGE SIZE ***");
        System.out.println("*** ENTER 4 FOR EXTRA LARGE SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch6 = ob.nextInt();
    }
    else if(ch1==4) 
    {
        System.out.println("### WELCOME TO TRADITIONAL WEAR SECTION ###");
        System.out.println("*** ENTER 1 FOR SIZE 32 ***");
        System.out.println("*** ENTER 2 FOR SIZE 34 ***");
        System.out.println("*** ENTER 3 FOR SIZE 36 ***");
        System.out.println("*** ENTER 4 FOR SIZE 38 ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch7 = ob.nextInt();
    }
}
{
    if(ch2==1)
    {
        System.out.println("### WELOCME TO T-SHIRTS SECTION ###");
        System.out.println("*** ENTER 1 FOR SMALL SIZE ***");
        System.out.println("*** ENTER 2 FOR MEDIUM SIZE ***");
        System.out.println("*** ENTER 3 FOR LARGE SIZE ***");
        System.out.println("*** ENTER 4 FOR EXTRA LARGE SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch8 = ob.nextInt();
    }
    if(ch2==2)
    {
        System.out.println("### WELCOME TO JEAN SECTION ###");
        System.out.println("*** ENTER 1 FOR 32 SIZE ***");
        System.out.println("*** ENTER 2 FOR 34 SIZE ***");
        System.out.println("*** ENTER 3 FOR 36 SIZE ***");
        System.out.println("*** ENTER 4 FOR 38 SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch9 = ob.nextInt();
    }
    if(ch2==3)
    {
        System.out.println("### WELCOME TO WESTERN WEAR SECTION ###");
        System.out.println("*** ENTER 1 FOR 32 SIZE ***");
        System.out.println("*** ENTER 2 FOR 34 SIZE ***");
        System.out.println("*** ENTER 3 FOR 36 SIZE ***");
        System.out.println("*** ENTER 4 FOR 38 SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch10 = ob.nextInt();
    }
    else if(ch2==4)
    {
        System.out.println("### WELCOME TO TRADITIONAL WEAR SECTION ###");
        System.out.println("*** ENTER 1 FOR SMALL SIZE ***");
        System.out.println("*** ENTER 2 FOR MEDIUM SIZE *** ");
        System.out.println("*** ENTER 3 FOR LARGE SIZE ***");
        System.out.println("*** ENTER 4 FOR EXTRA LARGE SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch11 = ob.nextInt();
    }
    }
    {
    if(ch3==1)
    {
        System.out.println("### WELCOME TO SHIRT AND TROUSER(BOYS) SECTION ###");
        System.out.println("*** ENTER 1 FOR SMALL SIZE ***");
        System.out.println("*** ENTER 2 FOR MEDIUM SIZE ***");
        System.out.println("*** ENTER 3 LARGE SIZE ***");
        System.out.println("*** ENTER 4 FOR EXTRA LARGE SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch12 = ob.nextInt();
    }
    if(ch3==2)
    {
        System.out.println("### WELCOME TO SHIRT AND TROUSER(GIRLS) SECTION ###");
        System.out.println("*** ENTER 1 FOR SMALL SIZE ***");
        System.out.println("*** ENTER 2 FOR MEDIUM SIZE ***");
        System.out.println("*** ENTER 3 FOR LARGE SIZE ***");
        System.out.println("*** ENTER 4 FOR EXTRA LARGE SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch13 = ob.nextInt();
    }
    if(ch3==3)
    {
        System.out.println("### WELCOME TO DUNGAREES SECTION ###");
        System.out.println("*** ENTER 1 FOR 22 SIZE ***");
        System.out.println("*** ENTER 2 FOR 24 SIZE ***");
        System.out.println("*** ENTER 3 FOR 26 SIZE ***");
        System.out.println("*** ENTER 4 FOR 28 SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch14 = ob.nextInt();
    }
    else if(ch3==4)
    {
        System.out.println("### WELCOME TO GOWNS SECTIONS ###");
        System.out.println("*** ENTER 1 FOR 22 SIZE ***");
        System.out.println("*** ENTER 2 FOR 24 SIZE ***");
        System.out.println("*** ENTER 3 FOR 26 SIZE ***");
        System.out.println("*** ENTER 4 FOR 28 SIZE ***");
        System.out.println("### ENTER YOUR CHOICE ###");
        ch15 = ob.nextInt();
    }
}
{
    if(ch4==1)
    {
        System.out.println("$$$ PAY Rs 250/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch4==2)
    {
        System.out.println("$$$ PAY Rs 300/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch4==3)
    {
        System.out.println("$$$ PAY Rs 350/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
     else if(ch4==4)
     {
         System.out.println("$$$ PAY Rs 400/- $$$");
         System.out.println("### THANK YOU, VISIT AGAIN ###");
     }
}
{
    if(ch5==1)
    {
        System.out.println("$$$ PAY Rs 850/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch5==2)
    {
        System.out.println("$$$ PAY Rs900/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch5==3)
    {
        System.out.println("$$$ PAY Rs 950/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch5==4)
    {
        System.out.println("$$$ PAY Rs 1000/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch6==1)
    {
        System.out.println("$$$ PAY Rs 1200/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch6==2)
    {
        System.out.println("$$$ PAY Rs 1300/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch6==3)
    {
        System.out.println("$$$ PAY Rs 1400/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch6==4)
    {
        System.out.println("$$$ PAY Rs 1500/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch7==1)
    {
        System.out.println("$$$ PAY Rs 1700/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch7==2)
    {
        System.out.println("$$$ PAY Rs 1800/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ##3");
    }
    if(ch7==3)
    {
        System.out.println("$$$ PAY Rs 1900/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch7==4)
    {
        System.out.println("$$$ PAY Rs 2000/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch8==1)
    {
        System.out.println("$$$ PAY Rs 250/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch8==2)
    {
        System.out.println("$$$ PAY Rs 300/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch8==3)
    {
        System.out.println("$$$ PAY Rs 350/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch8==4)
    {
        System.out.println("$$$ PAY Rs 400/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch9==1)
    {
        System.out.println("$$$ PAY Rs 850/- $$$");
        System.out.println("### THANK YOU< VISIT AGAIN ###");
    }
    if(ch9==2)
    {
        System.out.println("$$$ PAY Rs 900/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch9==3)
    {
        System.out.println("$$$ PAY Rs 950/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch9==4)
    {
        System.out.println("$$$ PAY Rs 1000/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch10==1)
    {
        System.out.println("$$$ PAY Rs 1200/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch10==2)
    {
        System.out.println("$$$ PAY Rs 1300/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch10==3)
    {
        System.out.println("$$$ PAY Rs 1400/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch10==4)
    {
        System.out.println("$$$ PAY Rs 1500/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch11==1)
    {
        System.out.println("$$$ PAY Rs 1700/-");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch11==2)
    {
        System.out.println("$$$ PAY Rs 1800/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch11==3)
    {
        System.out.println("$$$ PAY Rs 1900/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch11==4)
    {
        System.out.println("$$$ PAY Rs 2000/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch12==1)
    {
        System.out.println("$$$ PAY Rs 400/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch12==2)
    {
        System.out.println("$$$ PAY Rs 500/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch12==3)
    {
        System.out.println("$$$ PAY Rs 600/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch12==4)
    {
        System.out.println("$$$ PAY Rs 700/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch13==1)
    {
        System.out.println("$$$ PAY Rs 400/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch13==2)
    {
        System.out.println("$$$ PAY Rs 500/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch13==3)
    {
        System.out.println("$$$ PAY Rs 600/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###"); 
    }
    else if(ch13==4)
    {
        System.out.println("$$$ PAY Rs 700/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch14==1)
    {
        System.out.println("$$$ PAY Rs 450/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch14==2)
    {
        System.out.println("$$$ PAY Rs 550/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch14==3)
    {
        System.out.println("$$$ PAY Rs 650/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch14==4)
    {
        System.out.println("$$$ PAY Rs 750/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
{
    if(ch15==1)
    {
        System.out.println("$$$ PAY Rs 450/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch15==2)
    {
        System.out.println("$$$ PAY Rs 550/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    if(ch15==3)
    {
        System.out.println("$$$ PAY Rs 650/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
    else if(ch15==4)
    {
        System.out.println("$$$ PAY Rs 750/- $$$");
        System.out.println("### THANK YOU, VISIT AGAIN ###");
    }
}
}
}


 