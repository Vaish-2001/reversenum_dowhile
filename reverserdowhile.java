class reverserdowhile
 {
  public static void main(String[]args)
   {
    int num=123;
    int num1=num;
    int r=0;
    int re=0;
    do
    {
     r=num%10;
     re=re*10+r;
     num=num/10;
     }while(num>0);
    System.out.println(re);
   }
 }