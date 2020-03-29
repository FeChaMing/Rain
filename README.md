# Practices
学习java的练习及总结
## 继承：
    Java只能单继承，不能多继承，但接口可以多继承。
    1、子类继承父类所有的属性（除了private）
    2、子类继承父类（除private）所有的方法
    3.final方法不可以被继承，static方法不可以被继承，随着类的加载而加载。权限允许，子类可以使用。
    3、子类可以通过super，表示父类的引用，调用父类的属性或者方法。
    （构造函数和代码块是无法被继承）
## 方法：
    访问修饰符：public、protected、default、private
    方法名与参数列表合称为方法签名。
***
    关键字：主要有abstract、static两个关键字
    abstract关键字：
        抽象方法：
                1.抽象方法没有方法体。
                2.抽象方法必须被实现，如果一个类含有抽象方法，那么它一定是抽象类。
                3.如果一个子类没有实现父类中的抽象方法，则子类也成为了一个抽象类！
                4.抽象方法必须被重写，从没有方法体变为有具体的方法体。
                5.抽象类不能被实例化，不能new操作。
                6.抽象方法只需声明。
    static关键字：
        静态方法：
                1.和静态变量一样不属于对象，属于类。
                2.静态方法不能直接访问所属类非静态成员变量和非静态方法。
                3.不能使用this和super。
***
    构造方法：
        1.无返回值。
        2.名称必须与类名称相同。
        3.不能递归。
***
    方法重载：
        同一个类，多个方法有相同的名字、不同的参数便产生了重载。
            1.不能有两个方法名称和参数类型相同，但是返回不同类型值的方法。
***
    方法重写：
        子类对父类的允许访问的方法实现过程进行重新定义
        	方法名相同，参数类型相同	(方法签名相同)
        	1.子类返回类型小于等于父类方法返回类型(指的是继承的关系)
        	2.子类方法抛出的异常小于等于父类方法
        	3.子类方法访问权限大于等于父类方法
        	口诀：两同两小一大
        