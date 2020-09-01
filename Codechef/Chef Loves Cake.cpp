#include <bits/stdc++.h>
using namespace std;
int solve(long long,long long);
int gcd(long long ,long long);
int main() {
	// your code goes here

	int t;
	cin>>t;
	while(t--){
	    	long long n,m;
	long long ans;
	    cin>>m;
	    cin>>n;
	    ans=gcd(m,n);
	    ans=(m*n)/ans;
	    cout<<ans<<endl;
	}
	return 0;
}
     int gcd(long long a, long long b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
      