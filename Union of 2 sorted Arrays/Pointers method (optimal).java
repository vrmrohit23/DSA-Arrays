// approach - we have two sorted arrays which means if we can compare the element from both of the array from the start we can maintain a sorted order while 
//            adding elements to the final array and we can avoid duplicates also this way.




// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int i1 = 0,i2 = 0;
        int n1 = a.length;
        int n2 = b.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(i1 < n1 && i2 < n2){
            if(a[i1] < b[i2]){
                    if(!ans.isEmpty() && a[i1] == ans.get(ans.size()-1)) i1++;
                    else{
                  ans.add(a[i1]);
                  i1++;
                    }
            }
            else if(a[i1] == b[i2]){
                  if(!ans.isEmpty() && a[i1] == ans.get(ans.size()-1)) i1++;
                    else{
                  ans.add(a[i1]);
                  i1++;
                  i2++;
                    }
            }
            else {
                  if(!ans.isEmpty() && b[i2] == ans.get(ans.size()-1)) i2++;
                  else {
                  ans.add(b[i2]);
                  i2++;
                  }
            }
        }  
        while(i1 < n1){
            if(a[i1] != ans.get(ans.size()-1)) ans.add(a[i1]);
            i1++;
        }
        while(i2 < n2){
            if(b[i2] != ans.get(ans.size()-1)) ans.add(b[i2]);
            i2++;
        }
        return ans;  
    }          
}

// n1 - length of the first array, n2 - length of the second array
// Time complexity = O(n1) + O(n2)
// Space complexity = O(n1 + n2) but only for returning the answer

