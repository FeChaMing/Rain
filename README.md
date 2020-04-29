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
## 抽象类
    抽象类不能被实例化，
    含有抽象方法必须是抽象类，
    抽象类不一定必须含有抽象方法，
    抽象类的抽象方法必须在子类实现，
    如若子类没有实现父类的抽象方法那么子类也必须抽象，
    不能有抽象构造方法和抽象静态方法。
## 接口
    Java7：
    1.常量
    2.抽象方法
    J-8：
    3.默认方法
    4.静态方法
    J-9：
    5.私有方法
## 多态
    1.要有继承关系
    2.子类需重写父类的方法
    3.父类引用指向子类
## 内部类
### 静态内部类和非静态内部类的区别：
    1.静态内部类可以有静态成员，而非静态内部类则不能有静态成员。
    2.静态内部类可以访问外部类的静态变量，而不可访问外部类的非静态变量；
    3.非静态内部类的非静态成员可以访问外部类的非静态变量。
    4.静态内部类的创建不依赖于外部类，而非静态内部类必须依赖于外部类的创建而创建。
### 局部内部类：
    1.局部内类不允许使用访问权限修饰符 public private protected 均不允许。
    2.局部内部类对外完全隐藏，除了创建这个类的方法可以访问它其他的地方是不允许访问的。
    3.局部内部类与成员内部类不同之处是他可以引用成员变量，但该成员必须声明为 final，并内部不允许修改该变量的值。（这句话并不准确，因为如果不是基本数据类型的时候，只是不允许修改引用指向的对象，而对象本身是可以被就修改的）
### 匿名内部类:
    1.匿名内部类不含访问修饰符的。
    2.匿名内部类必须继承一个抽象类或者实现一个接口
    3.匿名内部类中不能存在任何静态成员或方法。
    4.匿名内部类是没有构造方法的，因为它没有类名。
    5.与局部内部相同匿名内部类也可以引用局部变量。此变量也必须声明为 final。 
### 可变参数
    使用前提：当方法的参数列表数据类型已经确定，但是参数个数不确定，就可以使用
    使用格式：定义方法时使用
           修饰符 返回值类型 方法名(数据类型...变量名){ }
    可变参数原理：
        底层是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
        传递参数的个数，可以是0个（不传递），1,2...多个
    注意事项：
        1.一个方法的参数列表，只能有一个可变参数
        2.如果方法的参数有多个，那么可变参数必须写在参数列表末尾
## 常用API类
### Random
    创建 Random r = new Random();
    常用：获取一个随机的int数字，(范围是int所有范围，有正负两种)：int num = r.nextInt();
    int num = r.nextInt(3); //参数代表左闭右开[0,3)
### Arraylist<E>
    数组的长度不可以发生改变 
    底层是数组队列，是动态数组，容量可以动态增长
    实现了Cloneable接口，能被克隆
    实现了java.io.Serializable 接口，支持序列化，能通过序列化去传输
    ArrayList 中的操作不是线程安全的
    <E>指泛型
##### 常用方法：
    public boolean add(E e),向集合中添加元素
    public E get(int index),从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
    public E remove(int index),从集合中删除元素，参数是索引编号，返回值就是删掉的元素
    public int size(),获取集合的长度，返回值包含集合个数
### String
       * 字符串的内容永不变
        字符串可以共享使用
        字符串效果上相当于char[]字符数组，java9以后:底层是byte[]字节数组，在这之前是char[]数组
        浪费空间
##### 常用构造方法：
    public String(),创建一个空白字符串，不含有任何内容
    public String(char[] array),根据字符数组内容创建
    public String(byte[] array),根据字节数组内容创建
##### 常用方法：
    public int length(),获取字符串当中含有的字符个数，拿到字符串长度
    public String concat(String str),将当前字符串和参数字符串拼接成为返回值新的字符串
    public char charAt(int index),获取指定索引位置单个字符
    public int indexOf(String str),查找参数字符串在本字符串当中首次出现的索引位置，没有返回-1
##### 字符串截取：
    public String substring(int index),截取从参数位置一直到字符串末尾，返回新字符串
    public String substring(int begin,int end),截取从begin开始到end结束，中间的字符串，左开右闭
##### 字符串转换:
    public char[] toCharArray(),将当前字符串拆分成为字符数组作为返回值
    public byte[] getBytes(),获得当前字符串底层数组
    public String replace(CharSequence oldString,CharSequence newString),
    将所有出现的老字符串替换成为新的字符串，返回替换之后的新字符串
##### 字符串分割：
    public String[] split(String regex),按照参数的规则，将字符串切分成为若干部分
### Date
##### 构造方法
    public Date(),获取当前系统的日期和时间
    public Date(long date),传递毫秒值，把毫秒值转换为Date日期
##### 常用方法
    public long getTime(),把日期转换为毫秒值
#### DateFormat
    日期/时间格式化子类的抽象类，用于日期和文本之间的转换，即Date和String转换
    格式化：按照指定格式，从Date对象转换成String
    解析：按照指定格式，从String对象转换成Date
    此类抽象类，一般使用子类java.text.SimpleDateFormat
##### 成员方法
    String format(Date date),按照指定格式，把Date日期，格式化为符合模式的字符串
    Date parse(String source),把符合模式的字符串解析为Date日期
#### SimpleDateFormat
##### 构造方法
    public SimpleDateFormat(String pattern),用给定的模式和默认语言环境的日期格式符号构造
#### Calendar
    日历类，是一个抽象类，提供了很多操作日历的字段(YEAR、MONTH、DAT_OF_MONTH、HOUR)
    Clendar类无法直接创建对象使用，里边有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
    static Calendar getInstance()使用默认时区和语言环境获得一个日历
##### 常用方法
    public int get(int field),返回给定日历字段的值
    public void set(int field,int value),将给定日历字段设置为给定值
    public abstract void add(int field,int amout),依据日历的规则，为给定的日历字段添加或减去指定的时间量
    public Date getTime(),返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
##### 成员方法的参数：
    int field:日历类的字段，可以使用Calendar类的静态成员变量获取
        public static final int YEAR = 1;           年
        public static final int MONTH = 2;          月
        public static final int DATE= 5;            月中的某一天
        public static final int DAY_OF_MONTH = 5;   月中的某一天
        public static final int HOUR = 10;          时
        public static final int MINUTE = 12;        分
        public static final int SECOND = 13;        秒
#### StringBuilder
    字符串缓冲区，可以提高字符串的操作效率(看成一个长度可以变化的字符串)
    底层也是一个数组，但是没有被final修饰，可以改变长度
    效率高，线程不安全
##### 常用方法
    public StringBuilder append(...),可以添加任意数据的字符串形式，并返回当前对象自身
    public String toString(),将当前StringBuilder转换成String对象
## 集合
    集合长度可变，集合存储的是对象，对象的类型可以不一致。 
    Collection接口：定义的是所有单列集合中共性的方法，没有带索引的方法
    List接口：继承Collection，有序的集合，允许存储重复的元素，有索引，可以使用普通的for循环遍历
    Set接口：继承Collection接口，不允许存储重复的元素，没有索引，不能使用普通的for循环遍历，无序的集合（存储和取出元素的顺序有可能不一致）
### Collection
    它是所有单列集合的父接口，因此在Collection中定义了单列集合（List和Set）通用的一些方法，
    这些方法可用于操作所有的单列集合
##### 常用方法
    public boolean add(E e),把给定对象添加到当前集合
    public void clear(),清空集合中所有元素
    public boolean remove(E e),把给定对象在当前集合中删除
    public boolean contains(E e),判断集合中是否包含给定对象
    public boolean isEmpty(),判断当前集合是否为空
    public int size(),返回集合中元素的个数
    public Object[] toArray(),把集合中的元素，存储到数组中
### Iterator迭代器
    原理就是指针
    此接口用于遍历集合，因为是一个接口，所以无法直接使用它，需要使用Iterator接口实现类对象，获取实现类的方式比较特殊
    Collection接口中有一个方法:iterator(),这个方法返回的就是迭代器实现类对象
    Iterator<E> iterator()返回在此collection的元素上进行迭代的迭代器
##### 常用方法
    public boolean hasNext(),如果仍有元素可以迭代，则返回true
    public E next(),返回迭代的下一个元素
### ArrayList<E>
    数据结构，增删慢，查找快
### LinkedList<E>
    底层是一个双向循环链表，jdk1.7之后是双向链表，实现了List<E>接口
    查询慢，增删快
    里边有大量操作首尾元素的方法
##### 常用方法
    public void addFirst(E e),将指定元素插入开头
    public void addLast(E e),将指定元素插入末尾
    public E getFirst(),返回此列表第一个元素
    public E getLast(),返回此列表最后一个元素
    public E removeFirst(),移除第一个元素
    public E removeLast(),移除最后一个元素
    public E pop(),从此列表所表示的堆栈处弹出一个元素
    public void push(E e),将元素推入此列表所表示的堆栈
    public boolean isEmpty(),列表不包含元素，返回true
### Vector<E>
    可以实现可增长的对象数组
    Vector类的所有方法都是同步的(单线程，速度慢)。可以由两个线程安全地访问一个Vector对象、但是一个线程访问Vector的话代码要在同步操作上耗费大量的时间。
    Arraylist不是同步的，所以在不需要保证线程安全时建议使用Arraylist。
#### Set集合存储元素不重复的的元素方法
        前提是存储的元素必须重写了hashCode()和equals()方法
        hashCode()与equals()的相关规定：
        
        1.如果两个对象相等，则hashcode一定也是相同的
        2.两个对象相等,对两个equals方法返回true
        3.两个对象有相同的hashcode值，它们也不一定是相等的
        4.综上，equals方法被覆盖过，则hashCode方法也必须被覆盖
        5.hashCode()的默认行为是对堆上的对象产生独特值。如果没有重写hashCode()，则该class的两个对象无论如何都不会相等（即使这两个对象指向相同的数据）。
        
        ==与equals的区别
        
        1.==是判断两个变量或实例是不是指向同一个内存空间 equals是判断两个变量或实例所指向的内存空间的值是不是相同
        2.==是指对内存地址进行比较 equals()是对字符串的内容进行比较
        3.==指引用是否相同 equals()指的是值是否相同
### HashSet<E>
    实现Set接口，一个哈希表结构，无序集合，不同步。
    不允许存储重复的元素
    没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    底层是一个哈希表结构(查询的速度非常快)
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    <   public native int hashCode();  native:代表该方法调用的是本地操作系统的方法>
    底层：
        jdk1.8之前：哈希表 = 数组 + 链表；
        jdk1.8之后：哈希表 = 数组 + 链表；
                    哈希表 = 数组 + 红黑树（提高查询速度）；//如果链表长度超过了8位，就会把链表转换成红黑树
### LinkedHashSet<E>
    底层是一个哈希表（数组 + 链表/红黑树） + 链表：多了一条链表（记录元素的存储顺序），保证元素有序
### Collections工具类
##### 常用功能
    public static <T> boolean addAll(Collection<T> c,T...elements),往集合中添加一些元素
    public static void shuffle(List<?> list),打乱集合顺序
    publiic static <T> void sort(List<T> list),将集合中元素按照默认规则排序
    public static <T> void sort(List<T> list,Comparator<? super T>),将集合中顺序按指定规则排序
### Map接口
    1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
    2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
    3.Map集合中的元素，key是不允许重复的，value可以重复
    4.Map集合中的元素，key和value是一一对应
##### 常用方法
    public V put(K key, V value),把指定键与指定的值添加到Map集合中
    public V remove(Object key),把指定键所对应的键值对元素集合在Map集合中删除，返回被删除元素的值
    public V get(Object key),根据指定键，在Map集合中获取对应的值
    public Set<K> keySet(),获取Map集合中所有的键，存储到Set集合中
    public Set<Map.Entry<K,V>> entrySet(),获取到Map集合中所有的键值对对象的集合(Set集合)
### HashMap<K,V>
    1.集合底层是哈希表，查询速度特别快
        jdk1.8之前：数组 + 单向链表
        jdk1.8之后：数组 + 单向链表/红黑树(链表长度超过8)
    2.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
    可以存储null值，null键
    线程不安全，多线程集合，速度快
    在使用HashMap集合时，一个类对象作为key元素，必须重写hashCode()和equals()方法以保证key唯一
### LinkedHashMap<K,V>
    1.LinkedHashMap集合底层是哈希表 + 链表(保证迭代顺序)
    2.LinkedHashMap集合石一个有序的集合，存储元素和取出元素的顺序是一致的 
### Hashtable
    底层也是一个哈希表，是一个线程安全的集合，是单线程的集合，速度慢
    不能存储null值，null键
## 异常
    Throwable：
        Error：错误
        Exception：编译期异常
            RuntimeException：运行期异常
    子父类异常：
                - 如果父类抛出多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
                - 父类方法没有抛出异常，子类重写父类该方法也不可抛出异常。此时子类产生异常，只能捕获处理，不能声明抛出
                注意：
                    父类异常什么样，子类异常就什么样
##### throw关键字
        作用：可以使用throw关键字在指定方法中抛出指定的异常
        格式：throw new xxxException("异常产生原因");
        注意：
            1.throw关键字必须写在方法内部
            2.throw关键字后边new的对象必须是Exception或者Exception子类对象
            3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
                throw关键字后边创建的是RuntimeException或者是RuntimeException的子类对象，我们可以不处理，默认交给JVM处理（打印异常对象，中断程序）
                throw关键字后边创建的是编译异常（写代码的时候报错），我们就必须处理这个异常，要么throws，要么try...catch
##### throws关键字
      异常处理的第一种方式，交给别人处理
      作用：
            当方法内部抛出异常对象处理的时候，那么我们必须处理这个对象
            可以使用throws关键字处理这个异常对象，会把对象声明抛出给方法调用者处理（自己不处理，交给别人处理），最终交给JVM处理--->中断处理
      使用格式：在方法声明时使用
        修饰符 返回类型    方法名(参数列表) throws xxxException,yyyException...{ 
                throw new xxxException("产生原因");
                throw new yyyException("产生原因");
                ...
           }
      注意：
            1.throws关键字必须写在方法声明处
            2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
            3.方法内部如果抛出了多个异常对象，那么throws后边也必须声明多个异常
                如果抛出的多个异常对象有子父类关系，那么直接声明父类即可
            4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
                要么继续使用throws声明抛出，交给方法调用者处理，最终交给JVM
                要么try...catch自己处理异常
##### try...catch
    异常出来的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，产生异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到日志
        }
        ...
        catch(异常类名 变量名){
        }finally{
            无论是否出现异常都会执行
        }
    注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
          如果try中没有产生异常，那么就不会执行catch中的异常处理逻辑，执行完毕try中的代码，继续执行try...catch之后的代码
##### finally
    注意：
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
        3.如果finally有return语句，永远返回finally中的结果，避免该情况（finally里return语句会覆盖）
##### 自定义异常
    java提供自定义异常，不够我们使用时，需要自己定义一些异常
    格式：
        public class xxxException extends Exception | RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
    注意：
        1.自定义异常类一般都是以Exception结尾，说明该类是一个异常类
        2.自定义异常类，必须的继承Exception或RuntimeException
            继承Exception：那么自定义的异常类就是一个编译期异常，如果方法内部抛出了一个编译期异常，那么就必须处理这个异常，要么throws，要么try...catch
            继承RuntimeException：那么自定义异常就是一个运行期异常，无需处理，交给虚拟机处理（中断处理）
## 多线程
    并发：指两个或多个事件在同一个时间段内发生
    并行：指两个或多个事件在同一时刻发生（同时发生）
    进程：进程是程序的一次执行过程，是系统运行程序的基本单位，因此进程是动态的。系统运行一个程序即是一个进程从创建，运行到消亡的过程。
    线程：线程与进程相似，但线程是一个比进程更小的执行单位。一个进程在其执行的过程中可以产生多个线程。
          与进程不同的是同类的多个线程共享进程的堆和方法区资源，但每个线程有自己的程序计数器、虚拟机栈和本地方法栈，
          所以系统在产生一个线程，或是在各个线程之间作切换工作时，负担要比进程小得多，也正因为如此，线程也被称为轻量级进程。
    分时调度：所有线程轮流使用CPU使用权，平均分配每个线程占用CPU的时间
    抢占式调度：优先让优先级高的线程使用CPU，如果线程优先级相同，那么会随机选择一个（线程随机性），java使用的为抢占式调度
### Thread
##### 构造方法
    public Thread(),分配一个新的线程对象
    public Thread(String name),分配一个指定名字的新的线程对象
    public Thread(Runnable target),分配一个带有指定目标的新的线程对象
    public Thread(Runnable target,String name),分配一个带有指定目标新的线程对象并指定名字
##### 常用方法
    public String getName(),获取当前线程名字
    public void start(),导致此线程开始执行，java虚拟机调用此线程的run方法
    public void run(),此线程要执行的任务在此处定义代码
    public static void sleep(long millis),是当前正在执行的线程以指定毫秒数暂停（暂时停止运行）
    public static Thread currentThread(),返回对当前正在执行的线程对象的引用
### 线程同步
    1.同步代码块
        synchronized(锁对象){
            可能出现线程安全问题的代码(访问了共享数据的代码)
        }
        注意：
            1.通过代码中的锁对象，可以使用任意的对象
            2.但是必须保证多个线程使用的锁对象是同一个
            3.锁对象的作用：
                            把同步代码块锁住，只让一个线程在同步代码块中运行
    2.同步方法
        1.把访问了共享数据的代码抽取出来，放到一个方法中
        2.在方法上添加synchronized修饰符
        格式：
            修饰符 synchronized 返回值类型 方法名(参数列表){
                 可能会出现线程安全问题的代码（访问了共享数据的代码）
            }
    3.锁机制        
           java.util.concurrent.Locks.Lock接口
           Lock 实现提供了比使用synchronized方法和语句可获得更广泛的锁定操作。
           Lock 接口中的方法： 
                            void lock(),获取锁
                            void unlock(),释放锁  
           java.util.concurrent.Locks.ReentrantLock implements Lock接口                    
           使用步骤：
                    1.在成员位置创建一个ReentrantLock对象
                    2.在可能出现安全问题的代码前调用Lock接口中的方法Lock获取锁
                    3.在可能出现安全问题的代码后调用Lock接口中的方法unLock释放锁     
### 线程状态
图源《Java 并发编程艺术》4.1.4 节
![](https://raw.githubusercontent.com/FeChaMing/Rain/master/image/1.png)

图源《Java 并发编程艺术》4.1.4 节
![](https://raw.githubusercontent.com/FeChaMing/Rain/master/image/2.png)         

    NEW 至今尚未启动的线程处于这种状态
    RUNNABLE 正在Java虚拟机中执行的线程处于这种状态
    BLOCKED 受阻塞并等待某个监视器锁的线程处于这种状态
    WAITING 无限期地等待另一个线程来执行某一待定操作的线程处于这种状态
    TIMED_WAITING 等待另一个线程来执行取决于指定等待时间的操作的线程处于这种状态
    TERMINATED 已退出的线程处于这种状态
                
    
    