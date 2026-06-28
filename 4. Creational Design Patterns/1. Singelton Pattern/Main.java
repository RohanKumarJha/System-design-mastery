class Main {
    public static void main(String[] args) {
        Singelton obj1 = Singelton.getInstance();
        System.out.println(obj1);

        Singelton obj2 = Singelton.getInstance();
        System.out.println(obj2);

        Singelton obj3 = Singelton.getInstance();
        System.out.println(obj3);
    }
}