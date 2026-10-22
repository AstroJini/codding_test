class TimeComplexityExample1 {
    public static void main(String[] args){
        // 0~99 사이 값 무작위 선택
        int findNumber = (int)(Math.random() * 100);
        for (int i = 0; i < 100; i++) {
            if(i == findNumber){
                System.out.println(i);
                break;
            }
        }
    }
}