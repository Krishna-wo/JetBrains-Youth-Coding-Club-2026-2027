package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class JCircularRangeAdditions {
    public static void main(String args[]){
        Kattio io=new Kattio();
        int n=io.nextInt();
        int m=io.nextInt();
        long arr[]=new long[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=io.nextLong();
        }
        long diff[]=new long[n+2];
        for(int j=1;j<=m;j++){
            int l=io.nextInt();
            int r=io.nextInt();
            long x=io.nextLong();
            if(r>l){
                diff[l]+=x;
                diff[r+1]-=x;
            }else if(r==l){
                diff[l]+=x;
                diff[l+1]-=x;
            }else{
//                diff[1]+=x;
//                diff[l]-=x;
//                diff[r]+=2*x;
                diff[l] += x;
                diff[n + 1] -= x;
                diff[1] += x;
                diff[r + 1] -= x;
            }
        }
        for(int i=1;i<=n;i++){
            diff[i]+=diff[i-1];
        }
        for(int i=1;i<=n;i++){
            arr[i]+=diff[i];
        }
        for(int i=1;i<=n;i++){
            io.print(arr[i]+" ");
        }
        io.println();
        io.flush();
        io.close();

    }
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        public Kattio() {
            this(System.in, System.out);
        }

        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(r.readLine());
                }
                return st.nextToken();
            } catch (Exception e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

}
