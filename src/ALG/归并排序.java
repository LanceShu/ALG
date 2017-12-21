package ALG;

public class 归并排序 {

    private static int length ;
    private static int sm;

    public static void main(String[] args) {

        int[] arrats = {50,10,90,30,70,40,80};
        sm = arrats.length / 2;
        mergeSort(arrats,arrats,0,arrats.length-1);

    }

    public static void mergeSort(int[] sr,int[] tr1,int s,int t){
        int m ;
        int[] tr2;

        if(s == t){
            tr1[s] = sr[s];
        }else{
            m = (s+t) / 2;
            tr2 = new int[sr.length];
            mergeSort(sr,tr2,s,m);
            mergeSort(sr,tr2,m+1,t);
            Merge(tr2,tr1,s,m,t);

        }
    }

    private static void Merge(int[] sr, int[] tr, int i, int m, int n) {
        int j,k,l;
        for(j=m+1,k=i;i<=m && j<=n;k++){
            if(sr[i]<sr[j]){
                tr[k] = sr[i++];
            }else{
                tr[k] = sr[j++];
            }
        }

        if(i<=m){
            for(l = 0;l<m-i;l++){
                tr[k+l] = sr[i+l];
            }
        }

        if(j <= n){
            for(l = 0;l<n-j;l++){
                tr[k+l] = sr[j+l];
            }
        }

        if(m == sm){
            for (Integer integer : tr){
                System.out.print(integer+",");
            }
        }
    }


}
