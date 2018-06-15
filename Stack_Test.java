import java.util.Scanner;
public class Stack_Test {
    public static Scanner sc;
    public static Operator topOperator = new Operator();
    String string = (new Scanner(System.in)).nextLine();
    static boolean flag = true;

    public static void scalculation(String input) {
        String[] inputs = input.split(" ");
        @SuppressWarnings("rawtypes")
        MyStack<?> outputStack = new MyStack();//输出栈
        @SuppressWarnings("rawtypes")
        MyStack<?> operatorStack = new MyStack<>();//运算符栈
        int leftBracketsPosition = -1;//存储(的位置
        int osCount = -1;//存储栈顶一下的下一个元素
        System.out.println(inputs.length);
        Operator operator = new Operator();
        for (int i = 0; i < inputs.length; i++) {
            try {
                Integer integer = Integer.valueOf(inputs[i]);
                outputStack.push(inputs[i]);

                if (inputs[i].equals("(")) {
                    operator.setValue("(");
                    operatorStack.push(operator.priority);
                    topOperator.priority = operator.priority;
                }
                if (!(inputs[i].equals("(")) && !(inputs.equals(")"))) {
                    if (operatorStack.hasnext(inputs[i])) {
                        int back = fuhao(inputs[i]);
                        operatorStack.push(back);
                        topOperator.priority = operator.priority;
                    }
                    if (operatorStack.top().equals(")")) {
                        int back = fuhao(inputs[i]);
                        operatorStack.push(back);
                        topOperator.priority = operator.priority;
                    }
                    if (better(inputs[i])) {
                        int back = fuhao(inputs[i]);
                        operatorStack.push(back);
                        topOperator.priority = operator.priority;
                    }
                } else {
                    operatorStack.pop();
                }

            } catch (Exception e) {
                System.out.println("haha");
            }

        }
        System.out.println("******************结果*********************");
        System.out.println("打印输出栈内所有元素：");
        outputStack.show();
        System.out.println();
        System.out.println("输出栈长度：" + outputStack.count);
    }

    public static int fuhao(String fuhao) {
        Operator operator = new Operator();
        switch (fuhao) {
            case "+":
                operator.setValue("+");
                break;
            case "_":
                operator.setValue("-");
                break;
            case "*":
                operator.setValue("*");
                break;
            case "/":
                operator.setValue("/");
                break;
            default:
                break;
        }
        return operator.priority;
    }

    public static boolean better(String yusuan) {
        Operator operator = new Operator();
        int deji = fuhao(yusuan);
        if (deji <= topOperator.priority) {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("请输入表达式(以空格分隔，例如1 + 2 * ( 1 + 2 ) )：");
        sc = new Scanner(System.in);
        String input = sc.nextLine();
        // 转化为后缀表达式
        scalculation(input);

    }
}