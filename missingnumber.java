package Practice;

class missingnumber {
    int missingNumber(int array[], int n) {
        // Your Code Here
        
        int sum = 0;
        for(int i = 0;i<n-1;i++){
            sum = sum + array[i];
        }
        int sum1 = n*(n+1)/2;
        int difference = sum1 - sum;
        return difference;
    }
}
