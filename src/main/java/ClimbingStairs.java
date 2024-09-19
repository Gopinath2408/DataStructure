// You are climbing a staircase. It takes n steps to reach the top.Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step


import java.util.*;
class ClimbingStairs {
  public static void main(String args[])
  {
    Scanner x=new Scanner(System.in);
       int n=x.nextInt();
       find obj=new find();
       System.out.println(obj.climbStairs(n));
  }
}

class find{
public int climbStairs(int i) {
    if(i==0 || i==1)
        return 1;

  int dp[]=new int [i+1];
  dp[0]=1;
  dp[1]=1;

  for(int j=2;j<=i;j++)
  {
      dp[j]=dp[j-1]+dp[j-2];
  }


  return dp[i];
}

}