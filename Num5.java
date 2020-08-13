public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while (s.hasNext()){
        String str = s.nextLine();
        String[] arr = str.trim().split(" ");
        float sum = 0;
        float avy = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i].length();
        }
        avy = sum / arr.length;
        System.out.printf("%.2f\r\n", avy);
    }
}
