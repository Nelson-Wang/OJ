public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()){
        String end = "NO";
        int source = scanner.nextInt();
        if(source % 2 == 1){
            end = "YES";
        }else {
            for(int i=2; i<Math.ceil(Math.sqrt(source)); i++){
                if(source % i == 0){
                    if(i % 2 == 1){
                        end = "YES";
                        break;
                    }
                    if(i % 2 == 0 && (source / i) % 2 == 1){
                        end = "YES";
                        break;
                    }
                }
            }
        }
        System.out.println(end);
    }
}
