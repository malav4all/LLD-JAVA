package overridding;

public class B extends A {
    void doSomeThing() {
        System.out.println("iam in class B");
        super.doSomeThing();
    }

}
