package java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class T7 {
    /**
     * Consumer<T>消费型接口
     */
    @Test
    public void test(){
        drink("雪碧",(x)-> System.out.println("我喝了10瓶："+ x));
        drink("加多宝",(x)-> System.out.println("我最不喜欢喝："+x));
        drink("牛奶",(y)-> System.out.println("我妈老是然让我喝"+y));

    }
    public static void drink(String drinkName, Consumer consumer){
        consumer.accept(drinkName);
    }


    @Test
    public void test1(){
        List<Integer> list=getNumberList(()-> (int)(Math.random()*100));
        System.out.println(list.toString());
    }
    /**
     *Supplier supplier 供给型接口
     */

    public List<Integer> getNumberList(Supplier supplier){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Object a=supplier.get();
            list.add(Integer.parseInt(a.toString()));
        }
        return list;
    }

    /**
     * Function<T,R> function  函数式接口
     * @return
     */

    @Test
    public void test2(){
        // 传入一个 数  返回它的二倍
        Object obj=suan(20,(x)->Integer.parseInt(x.toString())*2);
        System.out.println(obj.toString());

        Object obj2=fanzhuan("wo ai ni",(x)->x.toString().toUpperCase());
        System.out.println(obj2.toString());




    }



    public Object suan(int a,Function function){

        return function.apply(a);
    }
    public Object fanzhuan(String str,Function function){
        return function.apply(str);
    }

    @Test
    public void test4(){
        List<String> list1=Arrays.asList(new String[]{"beijing","na","ab","shagnhai"});

        List<String> list4=filterString(list1,( str)->str.toString().length()<3);
        System.out.println(list4.toString());

    }


    public List<String> filterString(List<String> list ,Predicate predicate){
        List<String> list1=new ArrayList<>();
        for (String str:list) {
            if(predicate.test(str)){
                list1.add(str);
            }
        }
        return list1;
    }














}
