package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class BRangeSum {
    public static void main(String []args){
        Kattio io=new Kattio();
        int n=io.nextInt();
        int m=io.nextInt();
        long nums[]=new long[n];
        nums[0]=io.nextLong();
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+io.nextLong();
        }
        for(int i=0;i<m;i++){
            int l=io.nextInt();
            int r=io.nextInt();
            if(l!=1) {
                io.println(nums[r - 1] - nums[l - 2]);
            }else{
                io.println(nums[r - 1]);
            }
        }
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
