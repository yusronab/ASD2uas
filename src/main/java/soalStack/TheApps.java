package soalStack;
public class TheApps {
    public static void main(String[] args) {
        MainStack newStack = new MainStack(10);
        newStack.push(4);
        newStack.printData();
        newStack.push(2);
        newStack.printData();
        newStack.push(3);
        newStack.printData();
        long bacaTop = newStack.peek();
        System.out.println("Nilai top = "+bacaTop);
        System.out.println("Nama saya adalah Yusron Arly Bazarah");
        System.out.println("Nilai yang dihapus = "+newStack.pop());
        newStack.printData();
        newStack.push(4);
        newStack.printData();
    }
}
