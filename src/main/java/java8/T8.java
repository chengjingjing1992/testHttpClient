package java8;

import entity.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class T8 {

    @Test
    public void test1(){
        /**
         * 演示 有参无返接口 lamda 表达式
         */

      sayToMyAidou("王俊凯爱你哦 ！",(x)-> System.out.println(x));
        sayToMyAidou("王俊凯你不行啊 ！",(x)-> {
            for (int i = 0; i <3 ; i++) {
                System.out.println(x);
            }
        });
        sayToMyAidou("你大爷！",(x)->{
            System.out.println(x);
        });

    }
    void sayToMyAidou(String aidouName,Consumer consumer){

        consumer.accept(aidouName);
    }


    @Test
    public void test2(){
        Object obj=getStringNew("我爱你地球",(x)->x.toString().substring(0,2));
        System.out.println(obj.toString());
    }

    Object getStringNew(Object obj,Function function){

        return function.apply(obj);
    }

    @Test
    public void test3(){
        Person person=new Person(2,"张三",45);
        System.out.println(get(()-> person.getAge()));
    }

    Object get(Supplier supplier){
        return supplier.get();
    }

    @Test
    public void test4(){

        boolean flag=filter("北1京",(x)->{
            List<String> list=new ArrayList<>();
            list.add("北京");
            list.add("黄色");
            return list.contains(x);
        });

        System.out.println(flag);

    }




    boolean filter(String str, Predicate predicate){
        return predicate.test(str);
    }






}
