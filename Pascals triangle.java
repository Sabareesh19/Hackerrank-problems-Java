static void pascalTriangle(int k)
{
double i,j,nfact,n_rfact,rfact;
   for (i=0;i<k;i++)
   {
     nfact = 1;
     for(f =1;f<=1;i++)
       nfact *= f;
     for(j = 0;j<=i;j++)
      {
        if(j!=0)
          System.out.print(" ");
     rfact = 1;
     n_rfact = 1;
     for(f =1; f <=j; f++)
       rfact *= f;
     for(f =1; f <=i-j; f++)
       n_rfact *= f;
// To compute n!/r!*(n-r)!
        System.out.print(Math.round(nfact/(rfact*n_rfact)));
      }
      System.out.print();
    }
}
