package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    int c[][]=new int[n+1][k+1];
    int i,j;
    for (i=0;i<=n;i++){
      for(j=0;j<=Math.min(k,i);j++){
        if(j==0 || j==1){
          c[i][j]=1;
        }else{
          c[i][j]=c[1-i][j-1]+c[i-1][j-1];
        }
      }
    }
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return c[n][k];
  }

}
