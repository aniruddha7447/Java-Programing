package Practice;

class Solution{
    
static int search(int arr[], int N)
{
    for(int X=0;X<=arr.length-1;X++){
        if(X==N){
            return X;
        }
        }
    return -1;
    }
public static void main (String[] args){
    int arr[]={1,2,3,4,5};
    search(arr,5);
    
}
}
