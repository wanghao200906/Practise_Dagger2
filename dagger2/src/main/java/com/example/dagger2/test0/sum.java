package com.example.dagger2.test0;

/**
 * Created by Sven.Wong on 2020-02-06
 */

public class sum {


/*
    总结一下：
    Component中 如果有StudentModule，就会自动创建这个StudentModule的对象，
    在Component中的范围内都可以使用Module中的 @Provides了。
    Component中 如果没有Module，但是在Component范围内会用到某个对象，那么这个对象就的构造方法就得@Inject

    Component中定义的方法两种
        1. 返回值为void，有一个参数
        2. 有返回值类型，参数为null
            a.返回的类型要么构造方法被@Inject，要么在Module中提供了
            b.返回的类型也可能是一个subComponent的component。

    Component 中如果有了Module 或者dependencies了其他的Component(AComponent)，
    则会自动创建这个Module和其他AComponent对象就可以使用对象中的方法了。
    对象中的方法就是提供了最终要使用的对象
    也就是Component可以使用Module和AComponent提供的对象。


    Module类中有两个注解 @Provides了和@Binds
        @Provides :修饰普通方法，返回一个具体的类
        @Binds 修饰抽象方法，所以Module也得是抽象类
         用处是你在某个类中Inject的是一个接口或者是抽象类。比如@Inject Teacher 是一个接口也不知道具体实现是什么
         这时候就得需要用@Binds了。这个方法名随意，参数就是具体的实现类，返回值就是接口或者抽象类，比如Teacher 。

    Subcomponents
        是继承和扩展父组件的对象的组件。
        因此，父组件中提供的所有对象也将在子组件中提供。通过这种方式，来自子组件的对象可以依赖于父组件提供的对象。

    Module中可以 依赖一个  SubComponent（test4_2_2）
        需要用@SubComponent注解
        SubComponent里面还需要再放一个Builder, interface或者abstract class都可以，标注@Subcomponent.Builder
        Builder里必须要有一个无参数的返回SubComponent本身的方法
        如果SubComponent依赖其他Module，必须提供参数为这个Module，返回类型为Builder的方法(名字都叫Builder了，也就是建造者模式了，应该知道这是要干嘛了吧)
        Builder里的方法的方法名可随意，不过还是按规范走吧



    @Qualifier：
        修饰注解用的，被修饰的注解用于Module中 修饰变量，避免返回类型相同



        @Qualifier
        @Documented
        @Retention(RUNTIME)
        public @interface Named

        可以自己自定义




    @Scope：修饰作用范围。作用范围是在一个Component范围内保证只有一个。

        当某个Module被 @Scope修饰，则调用他的Component也应该被 @Scope修饰。
            含义就是Component范围内Module内部，要生成的对象只会创建一次，之后在各个地方调用，只初始化一次
            如果没有被 @Scope修饰，那么Module中要获取的对象就会，第一个地方调用，就会创建一次。
        如果某个类没有在Module中使用而是在构造方法中使用的@Inject的方式，那么这个类也应该被 @Scope修饰。


        默认的单利
        @Scope
        @Documented
        @Retention(RUNTIME)
        public @interface Singleton {}

        也可以自己自定义。

 */


}
