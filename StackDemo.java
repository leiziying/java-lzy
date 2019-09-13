import  java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<String>   stack=new Stack<>();
        stack.push("学习");//将项目推送到此堆栈的顶部
        stack.push("睡觉");
        stack.push("打豆豆");
        System.out.println(stack.empty());//测试此堆栈是否为空    false
        System.out.println(stack.peek());//查看此堆栈顶部的对象，而不从堆栈中删除它  打豆豆
        System.out.println(stack.pop());//删除此堆栈顶部的对象，并将该对象作为此函数的值返回  打豆豆
        System.out.println(stack.pop());//睡觉
        System.out.println(stack.pop());//学习
        System.out.println(stack.pop());//null
    }
}
