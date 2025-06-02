class labelledcontinue
{
   public static void main(String args[])
   {
       first: for(int i=1;i<5;i++)
       {
           for(int j=1;j<3;j++)
           {
               if (i==2)
               {
                   continue first;
               }
               System.out.println("i = "+i+" j = "+j);
           }
       }
   }
}