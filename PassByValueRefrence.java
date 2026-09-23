ublic class PassByValueReference {

    // Pass by Value
    static void changeValue(int x) {
        x = 100;
        System.out.println(x);
    }

    
    public static void main(String[] args) {

        // Pass by Value
        int a = 10;

        System.out.println(a);

        changeValue(a);

    }
}
