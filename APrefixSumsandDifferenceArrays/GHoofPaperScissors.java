package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class GHoofPaperScissors {
    public static void main(String[] args){
        Kattio io=new Kattio();
        int n=io.nextInt();
        char []ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=io.next().charAt(0);
        }
        int []prefix=new int[n];
        int []suffix=new int[n];
        int h=0,p=0,s=0;
        for(int i=0;i<n;i++){
            if(ch[i]=='H'){
                h++;
            }else if(ch[i]=='P'){
                p++;
            }else{
                s++;
            }
            prefix[i]=Math.max(h,Math.max(p,s));
        }
        h=0;
        p=0;
        s=0;
        for(int i=n-1;i>=0;i--){
            if(ch[i]=='H'){
                h++;
            }else if(ch[i]=='P'){
                p++;
            }else{
                s++;
            }
            suffix[i]=Math.max(h,Math.max(p,s));
        }
        int ans=0;
        ans=prefix[n-1];
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,prefix[i]+suffix[i+1]);
        }
        io.println(ans);
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
