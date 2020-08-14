public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()){
        String s = scanner.nextLine();
        String[] arr = s.trim().split(" ");
        double m = Double.parseDouble(arr[0]);
        int n = Integer.parseInt(arr[1]);
        if(m==0 && n==0){
            break;
        }
        ArrayList<Integer> res = new ArrayList<>();
        double product = 1;
        while (product != 0 && res.size() < 10){
            product = m * n;
            int tmp = (int)product;
            res.add(tmp);
            product -= tmp;
            m = product;
        }
        String out = "0.";
        for (int i=0; i<res.size(); i++) {
            out = out + res.get(i).toString();
        }
        System.out.println(out);

    }
}
