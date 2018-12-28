public class Main {
    public static void main(String[] args) {
        GenericArrayList<String> list = new GenericArrayList<>();
        list.add("I tired");
        list.add("understand");
        list.add("this code");
        list.add("and");
        list.add("generic lists");

        for (int i = 0; i <list.size();  i++) {
            System.out.println(list.get(i));

        }
    }
    public Main(){
    }
}
