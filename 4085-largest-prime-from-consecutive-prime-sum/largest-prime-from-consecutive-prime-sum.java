class Solution {
    public static List<Integer> generatePrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
    public static boolean isPrime(int n) {

    if(n <= 1) return false;

    for(int i = 2; i * i <= n; i++){
        if(n % i == 0){
            return false;
        }
    }

    return true;
}
    public int largestPrime(int n) {
        List<Integer> arr=generatePrimes(n);
        if (arr.size() == 0) return 0; 
        int[] prefix=new int[arr.size()];
        prefix[0]=arr.get(0);
        int max=arr.get(0);
        for(int i=1;i<arr.size();i++){
            prefix[i]=prefix[i-1]+arr.get(i);
            if(prefix[i]>n) break;
            if(isPrime(prefix[i]) && prefix[i]<=n){
                max=Math.max(max,prefix[i]);
            }
        }
        // System.out.println(arr);
        return max;

    }
}