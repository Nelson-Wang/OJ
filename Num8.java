public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()){
        ArrayList<Integer> res = new ArrayList<>();
        int n = scanner.nextInt();
        int r = 1;
        # 只需判断n ^ 0.5即可，若后面存在，那么一定存在一个在前面的与之对应
        while (r <= Math.pow(n, 0.5)){
            if(n % r == 0){
                res.add(r);
                if(n / r <= n && n /r != r){
                    res.add(n / r);
                }
            }
            r++;
        }
        Collections.sort(res);
        int count = res.size();
        System.out.printf("%d", count);
        for (int i=0; i<res.size(); i++){
            int ans = res.get(i);
            System.out.printf(" %d", ans);
        }
        System.out.println();
    }
}
