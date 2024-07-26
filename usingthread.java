import java.util.Scanner;
class SuperClass {
    int value;
    public SuperClass(int value) {
        this.value = value;}
    public void display() {
        System.out.print(value);}}
class SubClass extends SuperClass {
    int value;
    public SubClass(int value) {
        super(value);
        this.value = value;}
    @Override
    public void display() {
        System.out.print(super.value + ", " + this.value);}}
public class usingthread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int value2 = scanner.nextInt();
        SubClass obj = new SubClass(value1);
        obj.value = value2;
        obj.display(); }}
