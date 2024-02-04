package enum_;

class function
{
    //in this function you can add as much variables as you want and they will be stored in the array a[]
    int sum(int ... a){
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = a[i] + j ;

        }
        return j;
    }}