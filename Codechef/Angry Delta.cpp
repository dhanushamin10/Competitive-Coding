#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	int n;
	cin>>t;
	 int arr[10000];
	while(t--){
	    
	    cin>>n;
	   
	    int sum=0;
	    for(int i=0;i<n;i++){
	        
	        cin>>arr[i];
	        
	        
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]%2==0){
	            sum+=arr[i];
	        }
	    }
	    cout<<sum<<endl;
	    memset(arr,0,sizeof(arr));
	}
	return 0;
}
