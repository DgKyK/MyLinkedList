public class TestClass {
    public static void main(String[] args){
        MyList<String> test = new MyLinkedList<>();
        System.out.println(test.size());
        test.insertFirst("Alabama");
        test.insertLast("Red");
        test.insertLast("Blue");
        System.out.println("Getting element by index (0) : " + test.getValueByIndex(0) +
                            "\nLast element is : " +
                            test.getValueByIndex(test.size() - 1) +
                            "\nCurrent size : " + test.size());
        /*test.deleteLast();
        test.deleteFirst();*/
        System.out.println("Now first element is : " + test.getValueByIndex(0) + "\nLast element is : " +
                            test.getValueByIndex(test.size() - 1) +
                            "\nSize: " + test.size());
        System.out.println(test.search("Blue") + "\n" + test.search("Red"));
        for(String k : test){
            System.out.println(k);
        }

    }
}
