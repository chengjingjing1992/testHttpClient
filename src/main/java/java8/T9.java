package java8;

import entity.Person;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *  方法引用：若lamda 体中的内容已经有方法实现了，我可以使用"方法引用"
 *  可以理解为 方法引用是lamda 表达式的另外一种表现形式
 *
 * 主要有3种语法格式：
 * 1 对象::实例方法名
 * 2 类::静态方法名
 * 3 类::实例方法名
 * 注意 :
 * 1)lamba 体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致！
 * 2) 若lamda参数列表中的第一参数是实例方法的调用者，而第二个参数是实例方法的参数时 可以使用 className::method
 */
public class T9 {
    @Test
    public void tess5(){
        /**
         * 类::实例方法
         */
        BiPredicate biPredicate=(x,y)->x.equals(y);
        biPredicate.test("abc","abc");
        BiPredicate<String,String> biPredicate2=String::equals;


    }
    @Test
    public void test1(){
        /**
         * 对象::实例方法
         */
        System.out.println();
        Consumer consumer=(x)-> System.out.println(x);
        PrintStream printStream=System.out;
        Consumer consumer1=printStream::println;
        consumer1.accept("你好");
    }


    @Test
    public void test3(){
        /**
         * 对象::实例方法
         */
        Person person=new Person(1,"小明",12);
        Supplier supplier=()->person.getAge();

        Object object=supplier.get();
        System.out.println(object.toString());
        Supplier supplier1=person::getAge;
        System.out.println(supplier1.get());
        Supplier supplier2=person::getName;
        System.out.println(supplier2.get());

    }

    @Test
    public void test4(){
        /**
         * 类::静态方法
         */
        Comparator<Integer> comparator=(x,y)->Integer.compare(x,y);
        System.out.println(comparator.compare(6,5));
        Comparator<Integer> comparator1=Integer::compare;
        comparator1.compare(5,6);


    }





}
