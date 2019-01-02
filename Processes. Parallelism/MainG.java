public class MainG {

    private static int timeout;

    public static void main(String[] argv) throws InterruptedException {
        byte[] arr = new byte[32];
        try {
            int n = System.in.read(arr);
        } catch (Exception e) {
            System.out.print(e.toString());
            //TimeUnit.SECONDS.sleep(35);
            setTimeout(1000);
        }
        try {
            int x = Integer.parseInt(new String(arr).trim());
            System.out.print(x - 1);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public static void setTimeout(int timeout) {
        MainG.timeout = timeout;
    }
    

    /*public static int setTimeout(int x) {
        int sum=0;
        int i;
        for (i=0;i++){sum+=x%i;if(i>100000000)break;} 
        return sum;
    }*/
}