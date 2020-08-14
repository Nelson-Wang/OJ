public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()){
        String str = scanner.nextLine().toLowerCase();
        char[] chars = str.toCharArray();
        for (int i=0; i<chars.length; i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ){
                chars[i] = (char)(chars[i] - 32);
            }
        }

        String resStr = new String(chars);
        System.out.printf(resStr);
    }
}
