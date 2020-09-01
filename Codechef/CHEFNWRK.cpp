#include <iostream>
using namespace std;
int solve(int[],int,int);
int arr[10000];
int main() {
	// your code goes here
	
	int t;
	int n,k;
	cin>>t;
	while(t--){
	    cin>>n;
	    
	    cin>>k;
	    for(int i=1;i<n+1;i++){
	        cin>>arr[i];
	    }
	    int ans=solve(arr,n,k);
	    cout<<ans<<endl;
	    std::fill_n(arr, n, 0);
	    	
}
return 0;
}

int solve(int arr[],int N,int K){
    int sum=0;
    int last_index;
    int i=1;
    int incrementor;
    int numberOfTrips=1;
        while(i<=N){
            if(arr[i]>K)
                return -1;
            if(arr[i]+sum<=K){
                sum+=arr[i];
                last_index=i;
                incrementor=1;
            }
            else{
                numberOfTrips++;
                incrementor=0;
                //clear sum
                sum=0;
            }
            if(i==N){
               break;
            }
            i+=incrementor;

        }
        return numberOfTrips;
}

