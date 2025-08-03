public class Sum {
    public static void main(String[] args) {
        float [] numbers = {15.3f, 37.2f, 28.14f, 19.3f, 9.7f};
        float sum = 0;
        for(float element : numbers){
            sum = sum + element;
        }
        System.out.println("The value of Sum : " + sum);
    }
}
