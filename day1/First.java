
class Main {
    public static void main(String[] args) {
        One newone = new One();
        Two newtwo = new Two();

        newone.greet();
        newtwo.greet2();
        System.out.println("String "+args[0]);
        System.out.println("Integer "+Integer.parseInt(args[1]));
    }
}