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
    4.成员方法：编译在左，运行看右。
      成员变量：编译在左，运行看左。
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
###### 常用方法：
    public boolean add(E e),向集合中添加元素
    public E get(int index),从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
    public E remove(int index),从集合中删除元素，参数是索引编号，返回值就是删掉的元素
    public int size(),获取集合的长度，返回值包含集合个数
### String
       * 字符串的内容永不变
        字符串可以共享使用
        字符串效果上相当于char[]字符数组，java9以后:底层是byte[]字节数组，在这之前是char[]数组
        浪费空间
###### 常用构造方法：
    public String(),创建一个空白字符串，不含有任何内容
    public String(char[] array),根据字符数组内容创建
    public String(byte[] array),根据字节数组内容创建
###### 常用方法：
    public int length(),获取字符串当中含有的字符个数，拿到字符串长度
    public String concat(String str),将当前字符串和参数字符串拼接成为返回值新的字符串
    public char charAt(int index),获取指定索引位置单个字符
    public int indexOf(String str),查找参数字符串在本字符串当中首次出现的索引位置，没有返回-1
###### 字符串截取：
    public String substring(int index),截取从参数位置一直到字符串末尾，返回新字符串
    public String substring(int begin,int end),截取从begin开始到end结束，中间的字符串，左开右闭
###### 字符串转换:
    public char[] toCharArray(),将当前字符串拆分成为字符数组作为返回值
    public byte[] getBytes(),获得当前字符串底层数组
    public String replace(CharSequence oldString,CharSequence newString),
    将所有出现的老字符串替换成为新的字符串，返回替换之后的新字符串
###### 字符串分割：
    public String[] split(String regex),按照参数的规则，将字符串切分成为若干部分
### Date
###### 构造方法
    public Date(),获取当前系统的日期和时间
    public Date(long date),传递毫秒值，把毫秒值转换为Date日期
###### 常用方法
    public long getTime(),把日期转换为毫秒值
#### DateFormat
    日期/时间格式化子类的抽象类，用于日期和文本之间的转换，即Date和String转换
    格式化：按照指定格式，从Date对象转换成String
    解析：按照指定格式，从String对象转换成Date
    此类抽象类，一般使用子类java.text.SimpleDateFormat
###### 成员方法
    String format(Date date),按照指定格式，把Date日期，格式化为符合模式的字符串
    Date parse(String source),把符合模式的字符串解析为Date日期
#### SimpleDateFormat
###### 构造方法
    public SimpleDateFormat(String pattern),用给定的模式和默认语言环境的日期格式符号构造
#### Calendar
    日历类，是一个抽象类，提供了很多操作日历的字段(YEAR、MONTH、DAT_OF_MONTH、HOUR)
    Clendar类无法直接创建对象使用，里边有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
    static Calendar getInstance()使用默认时区和语言环境获得一个日历
###### 常用方法
    public int get(int field),返回给定日历字段的值
    public void set(int field,int value),将给定日历字段设置为给定值
    public abstract void add(int field,int amout),依据日历的规则，为给定的日历字段添加或减去指定的时间量
    public Date getTime(),返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
###### 成员方法的参数：
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
###### 常用方法
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
###### 常用方法
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
###### 常用方法
    public boolean hasNext(),如果仍有元素可以迭代，则返回true
    public E next(),返回迭代的下一个元素
### ArrayList<E>
    数据结构，增删慢，查找快
### LinkedList<E>
    底层是一个双向循环链表，jdk1.7之后是双向链表，实现了List<E>接口
    查询慢，增删快
    里边有大量操作首尾元素的方法
###### 常用方法
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
###### 常用功能
    public static <T> boolean addAll(Collection<T> c,T...elements),往集合中添加一些元素
    public static void shuffle(List<?> list),打乱集合顺序
    publiic static <T> void sort(List<T> list),将集合中元素按照默认规则排序
    public static <T> void sort(List<T> list,Comparator<? super T>),将集合中顺序按指定规则排序
### Map接口
    1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
    2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
    3.Map集合中的元素，key是不允许重复的，value可以重复
    4.Map集合中的元素，key和value是一一对应
###### 常用方法
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
###### throw关键字
        作用：可以使用throw关键字在指定方法中抛出指定的异常
        格式：throw new xxxException("异常产生原因");
        注意：
            1.throw关键字必须写在方法内部
            2.throw关键字后边new的对象必须是Exception或者Exception子类对象
            3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
                throw关键字后边创建的是RuntimeException或者是RuntimeException的子类对象，我们可以不处理，默认交给JVM处理（打印异常对象，中断程序）
                throw关键字后边创建的是编译异常（写代码的时候报错），我们就必须处理这个异常，要么throws，要么try...catch
###### throws关键字
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
###### try...catch
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
###### finally
    注意：
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要资源释放（IO）
        3.如果finally有return语句，永远返回finally中的结果，避免该情况（finally里return语句会覆盖）
###### 自定义异常
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
###### 构造方法
    public Thread(),分配一个新的线程对象
    public Thread(String name),分配一个指定名字的新的线程对象
    public Thread(Runnable target),分配一个带有指定目标的新的线程对象
    public Thread(Runnable target,String name),分配一个带有指定目标新的线程对象并指定名字
###### 常用方法
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
    
    
## IO
    绝对路径：是一个完整的路径，以盘符（C:,D:）开始的路径
            C:\\Users\\Rainbow\\Desktop\\test.txt
    相对路径：是一个简化的路径
        相对路径指的是相对当前项的根目录(C:\\Users\\itcast\\IdeaProjects\\shungyuan)
        如果使用当前项目的根目录，路径可以简化书写
        C:\\Users\\itcast\\IdeaProjects\\shungyuan\\test.txt-->简化为：test.txt
### File
     类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作
###### 构造方法
    public File(String pathname),通过给定的路径名字符串转换为抽象路径名来创建新的File实例
    public File(String parent,String child),从父路径名字符串和子字符串创建新的File实例
    public File(File parent,String child),从父抽象路径名和子路径字符串创建新的File实例
###### 静态成员变量
    public static String pathSeparator,与系统有关的路径分隔符，为了方便，它被表示为一个字符串
    public static char pathSeparatorChar,与系统路径有关的路径分隔符
    public static String separator,与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
    public static char separatorChar,与系统有关的默认名称分隔符
###### 常用方法
    public String getAbsolutePath(),返回此File的绝对路径名字符串
    public String getPath(),将此File转换为路径名字符串
    public String getName(),返回由此File表示的文件或目录的名称
    public long length(),返回此File表示的文件的长度
    public boolean exists(),此File表示的文件或目录是否实际存在
    public boolean isDirectory(),此File表示的是否为目录
    public boolean isFile(),此File表示的是否为文件
    public boolean createNewFile(),当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
    public boolean delete(),删除由此File表示的文件或目录
    public boolean mkdir(),创建由此File表示的目录
    public boolean mkdirs(),创建由此File表示的目录，包括任何必须但不存在的父目录
### FileFilter
    java.io.FileFilter接口：用于抽象路径名(File对象)的过滤器
    作用：用于过滤文件（File对象）
    抽象方法：用来过滤文件的方法
        boolean accept(File pathname),测试指定抽象路径名是否应该包含在某个路径名列表中
    参数：
        File pathname：使用listFiles方法遍历目录，得到的每一个文件对象
    File[] listFiles(FilenameFilter filter)
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
        作用：用于过滤文件名称
        抽象方法：用来过滤文件的方法
            boolean accept(File dir,String name) 测试指定文件是否应该包含在某一文件列表中
            参数：
                File dir:构造方法中传递的被遍历的目录
                String name:使用listFiles方法遍历目录，获取每一个文件/文件夹的名称
    两个过滤器接口都是没有实现类，需要自己写实现类，重写过滤的方法accept，在方法中自定义过滤规则
## IO流分类
                    输入流                     输出流
    字节流      字节输入流(InputStream)     字节输出流(OutputStream)
    字符流      字符输入流(Reader)          字符输出流(Writer)
### 字节输出流(OutputStream类)
    定义了字节输出流基本共性功能方法：
        public void close(),关闭此输出流并释放与此流相关联的任何系统资源
        public void flush(),刷新此输出流并强制任何缓冲的输出字节被写出
        public void write(byte[] b),将b.length字节从指定的字节数组写入此输出流
        public void write(byte[] b,int off,int len),将指定的字节数组写入len字节，从偏移量off开始输出到此输出流
        public abstract void write(int b),将指定的字节写入输出流
##### FileOutputStream
    文件字节输出流
    作用：把内存中的数据写入到硬盘文件中
###### 构造方法
    public FileOutputStream(String name),创建一个向具有指定名称的文件中写入数据的输出文件流
    public FileOutputStream(File file),创建一个向指定File对象表示的文件中写入数据的文件输出流
    参数：
        String name：目的地是一个文件路径
        File file：目的地是一个文件
    构造方法的作用：
                    1.创建一个FileoutputStream对象
                    2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
                    3.会把FileOutputStream对象指向创建好的文件
    追加/续写：使用两个参数的构造方法
        public FileOutputStream(String name,boolean append),创建一个向具有指定name的文件中写入数据的输出文件流
        public FileOutputStream(File file,boolean append),创建一个向指定File对象表示的文件中写入数据的文件输出流
    参数：
        String name,File file:写入数据的目的地
        boolean append:追加写开关
                        true:创建对象不会覆盖源文件，继续在文件的末尾追加写数据
                        false:创建一个新文件，覆盖源文件
### 字节输入流(InputStream类)
    定义了字节输入流的基本共性功能方法
        public void close(),关闭此输入流并释放与此流相关联的任何系统资源
        public abstract int read(),从输入流读取数据的下一个字节
        public int read(byte[] b),从输入流中读取一些字节数，并将他们存储到字节数组b中
##### FileInputStream
    文件字节输入流
    作用：把硬盘文件中的数据，读取到内存中使用
###### 构造方法
    public FileInputStream(String name),创建一个从具有指定名称的文件中读取数据的输入文件流
    public FileInputStream(File file),创建一个从指定File对象表示的文件中读取数据的文件输入流
    参数：读取文件的数据源
        String name：文件路径
        File file：文件
    构造方法的作用：
          1.会创建一个FileInputStream对象
          2.会把FileInputStream对象指定构造方法要读取的文件
    
    
### 字符输入流(Reader类)
    字符输入流的最顶层父类，是一个抽象类
    共性成员方法：
                public int read(),读取单个字符并返回
                public int read(char[] cbuf),一次读取多个字符，将字符读入数组
                public void close(),关闭该流并释放与之关联的所有资源
##### FileReader
    文件字符输入流
    作用：把硬盘文件中的数据以字符的方式读取到内存中
###### 构造方法
    public FileReader(String fileName),
    public FileReader(File file),
    参数：读取文件的数据源
        String fileName：文件路径
        File file：一个文件
    构造方法作用：
            1.创建一个FileReader对象
            2.会把FileReader对象指向要读取的文件
### 字符输出流(Writer)
    字符输出流最顶层的父类，是一个抽象类
    共性成员方法：
                public void write(int c),写入单个字符
                public void write(char[] cbuf),写入字符数组
                public abstract void write(char[] cbuf,int off,int len),写入字符数组的某一部分，off是数组的开始索引，len是写入字符个数
                public void write(String str),写入字符串
                public void write(String str,int off, int len),写入字符串某一部分，off是字符串的开始索引，len写入字符的个数
                public void flush(),刷新该流的缓冲
                public void close(),关闭此流，但要先刷新它
##### FileWriter
    文件字符输出流
###### 构造方法
    public FileWriter(String fileName),
    public FileWriter(File file),
    参数：读取文件的数据源
        String fileName：文件路径
        File file：一个文件
    构造方法作用：
            1.创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件路径，创建文件
            3.会把FileWriter对象指向创建好的文件
### 缓冲流
##### BufferedOutputStream
    字节缓冲输出流
    继承父类共性成员方法：
            public void close(),关闭此输出流并释放与此流相关联的任何系统资源
            public void flush(),刷新此输出流并强制任何缓冲的输出字节被写出
            public void write(byte[] b),将b.length字节从指定的字节数组写入此输出流
            public void write(byte[] b,int off,int len),将指定的字节数组写入len字节，从偏移量off开始输出到此输出流
            public abstract void write(int b),将指定的字节写入输出流
###### 构造方法
    public BufferedOutputStream(Outputstream out),创建一个新的缓冲输出流，以将数据写入指定的底层输出流
    public BufferedOutputStream(Outputstream out,int size),创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流
    参数： 
        OutputStream out：字节输出流
                我们可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
        int size：指定缓冲流内部缓冲区的大小，不指定默认大小
##### BufferedInputStream
    字节缓冲输入流 
    继承父类成员方法
            public void close(),关闭此输入流并释放与此流相关联的任何系统资源
            public abstract int read(),从输入流读取数据的下一个字节
            public int read(byte[] b),从输入流中读取一些字节数，并将他们存储到缓冲区数组b中
###### 构造方法
    public BufferedInputStream(InputStream in),创建一个BufferedInputStream并保存其参数，
    public BufferedInputStream(InputStream in,int size),创建具有指定缓冲区大小的BufferedInputStream并保存其参数
    参数： 
        InputStream in：字节输入流
                我们可以传递FileInputStream，缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
        int size：指定缓冲流内部缓冲区的大小，不指定默认大小   
##### BufferedWriter
    字符缓冲输出流
    继承父类的共性成员方法
                public void write(int c),写入单个字符
                public void write(char[] cbuf),写入字符数组
                public abstract void write(char[] cbuf,int off,int len),写入字符数组的某一部分，off是数组的开始索引，len是写入字符个数
                public void write(String str),写入字符串
                public void write(String str,int off, int len),写入字符串某一部分，off是字符串的开始索引，len写入字符的个数
                public void flush(),刷新该流的缓冲
                public void close(),关闭此流，但要先刷新它
###### 构造方法
    public BufferedIWriter(Writer out),创建一个使用默认大小输出缓冲区的缓冲字符输出流
        public BufferedIWriter(Writer out,int size),创建具有指定缓冲区大小的新缓冲字符输出流
        参数： 
           Writer out：字符输出流
                    我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int size：指定缓冲流内部缓冲区的大小，不指定默认大小 
###### 特有成员方法
    public void newLine(),写入一个行分隔符，会根据不同操作系统，获取不同分隔符    
##### BufferedReader
    字符缓冲输入流
    继承字符类成员共性方法：    
                public int read(),读取单个字符并返回
                public int read(char[] cbuf),一次读取多个字符，将字符读入数组
                public void close(),关闭该流并释放与之关联的所有资源
###### 构造方法
    public BufferedReader(Reader in),创建一个使用默认大小输出缓冲区的缓冲字符输入流
        public BufferedReader(Reader in,int size),创建具有指定缓冲区大小的新缓冲字符输入流
        参数： 
           Reader in：字符输入流
                    我们可以传递FileReader，缓冲流会给FileReader增加一个缓冲区，提高FileReader的读取效率
            int size：指定缓冲流内部缓冲区的大小，不指定默认大小    
###### 特有成员方法
    public String readLine(),读取一个文本行，读取一行数据             
### 转换流
    字符字节转换
##### OutputStreamWriter
    字符通向字节流的桥梁，可使用指定的charset将要写入流中的字符编码成字节
    继承父类共性成员方法：
                public void write(int c),写入单个字符
                public void write(char[] cbuf),写入字符数组
                public abstract void write(char[] cbuf,int off,int len),写入字符数组的某一部分，off是数组的开始索引，len是写入字符个数
                public void write(String str),写入字符串
                public void write(String str,int off, int len),写入字符串某一部分，off是字符串的开始索引，len写入字符的个数
                public void flush(),刷新该流的缓冲
                public void close(),关闭此流，但要先刷新它    
###### 构造方法
    public OutputStreamWriter(OutputStream out),创建使用默认字符编码的OutputStreamWriter
        public OutputStreamWriter(OutputStream out,String charsetName),创建使用指定字符编码的OutputStreamWriter
        参数： 
           OutputStream out：字节输出流
           String charsetName：指定编码表名称，不区分大小写，不指定默认使用UTF-8  
##### InputStreamReader
    字节通向字符流的桥梁，可使用指定的charset读取字节并将其解码成字符
    继承父类成员方法
            public void close(),关闭此输入流并释放与此流相关联的任何系统资源
            public abstract int read(),从输入流读取数据的下一个字节
            public int read(byte[] b),从输入流中读取一些字节数，并将他们存储到缓冲区数组b中
###### 构造方法
    public InputStreamReader(InputStreamReader in),创建使用默认字符编码的InputStreamReader
        public InputStreamReader(InputStreamReader in,String charsetName),创建使用指定字符编码的InputStreamReader
        参数： 
           InputStreamReader in：字节输入流
           String charsetName：指定编码表名称，不区分大小写，不指定默认使用UTF-8      
## 网络编程
    C/S结构：全称为Client/Server结构，客户端和服务器结构。常见程序有QQ、迅雷等软件
    B/S结构：全称为Browser/Server结构，是指浏览器和服务器结构。常见浏览器有谷歌、火狐等。
### 网络通信协议
    ●网络通信协议:通过计算机网络可以使多台计算机实现连接,位于同一个网络中的计算机在进行连接和通信时
    需要遵守一定的规则,这就好比在道路中行驶的汽车一定要遵守交通规则一样。在计算机网络中,这些连接和
    通信的规则被称为网络通信协议，它对数据的传输格式、传输速率、传输步骤等做了统一规定,通信双方必须
    同时遵守才能完成数据交换。
    ●TCP/IP协议 :传输控制协议/因特网互联协议( Transmission Control Protocol/Internet Protocol),是
    Internet最基本、最广泛的协议。它定义了计算机如何连入因特网,以及数据如何在它们之间传输的标准。它
    的内部包含一系列的用于处理数据通信的协议 ,并采用了4层的分层模型,每一层都呼叫它的下一层所提供的
    协议来完成自己的需求。
    TCP/IP协议中的四层分别是应用层、传输层、网络层和链路层,每层分别负责不同的通信功能。
    链路层:链路层是用于定义物理传输通道,通常是对某些网络连接设备的驱动协议,例如针对光纤、网线提供的驱
    动。
    网络层:网络层是整个TCP/IP协议的核心,它主要用于将传输的数据进行分组,将分组数据发送到目标计算机或
    者网络。
    运输层:主要使网络程序进行通信,在进行网络通信时,可以采用TCP协议。也可以采用UDP协议。
    应用层:主要负责应用程序的协议，例如HTTP协议、FTP协议等。
###### 协议分类
    ●UDP :用户数据报协议(User Datagram Protocol)。 UDP是无连接通信协议，即在数据传输时，数据的发送端
    和接收端不建立逻辑连接。简单来说，当-台计算机向另外一台计算机发送数据时,发送端不会确认接收端是
    否存在,就会发出数据,同样接收端在收到数据时，也不会向发送端反馈是否收到数据。
    由于使用UDP协议消耗资源小,通信效率高,所以通常都会用于音频、视频和普通数据的传输例如视频会议都
    使用UDP协议,因为这种情况即使偶尔丢失一两个 数据包，也不会对接收结果产生太大影响。
    但是在使用UDP协议传送数据时,由于UDP的面向无连接性,不能保证数据的完整性,因此在传输重要数据时
    不建议使用UDP协议。
    特点:数据被限制在64kb以内,超出这个范围就不能发送了。
    ●TCP :传输控制协议(Transmission Control Protoco)or TCP协议是面向连接的通信协议，即传输数据之前，
    在发送端和接收端建立逻辑连接,然后再传输数据,它提供了两台计算机之间可靠无差错的数据传输。
    在TCP连接中必须要明确客户端与服务器端,由客户端向服务端发出连接请求,每次连接的创建都需要经过“三
    次握手”。
    三次握手: TCP协议中。在发送数据的准备阶段。客户端与服务器之间的三次交互，以保证连接的可靠。
    第一次握手，客户端向服务器端发出连接请求,等待服务器确认。
    第二次握手，服务最端向客户端回送一 一个响应,通知客户端收到了连接请求。
    第三次握手，客户端再次向服务器端发送确认信息。确认连接。整个交互过程如下图所示。
    完成三次握手,连接建立后，客户端和服务器就可以开始进行数据传输了。由于这种面向连接的特性, TCP协议
    可以保证传输数据的安全,所以应用十分广泛，例如下载文件、浏览网页等。
### IP地址
    ●IP地址:指互联网协议地址( Internet Protocol Address ) , 俗称IP。IP地址用来给一一个网络中的计算机设
    备做唯一的编号。 假如我们把"个人电脑”比作”一台电话”的话 ,那么IP地址”就相当于“电话号码"。
    IP地址分类
    IPv4:是一个32位的二进制数，通常被分为4个字节,表示成a.b.c.d的形式，例如192.168.65.100。其中
    a.b.c.d都是0~255之间的十进制整数,那么最多可以表示42亿个。
    ●IPv6 :由于互联网的蓬勃发展, IP地址的需求量愈来愈大,但是网络地址资源有限,使得IP的分配越发紧张。
    为了扩大地址空间,拟通过IPv6重新定义地址空间,采用128位地址长度,每16个字节一组，分成8组十六进
    制数,表示成ABCD:EFO1:2345:6789:ABCD:F01:2345:6789,号称可以为全世界的每一粒沙子编上一一个网址，
    这样就解决了网络地址资源数量不够的问题。
###### 常用命令
    ●查看本机P地址,在控制台输入:
    1pconf1g
    ●检查网络是否连通,在控制台输入:
    ping 空格 IP地址
    ping 220.181.57.216
###### 端口号
    网络的通信,本质上是两个进程(应用程序)的通信。每台计算机都有很多的进程,那么在网络通信时,如何区分
    这些进程呢?
    如果说IP地址可以唯一标识网络中的设备 ,那么端口号就可以唯一标识设备中的进程 (应用程序)了。
    ●端口号:用两个字节表示的整数,它的取值范围是0~65535。其中, 0~1023之间的端口号用于一些知名的网
    络服务和应用，普通的应用程序需要使用1024以上的端口号。如果端口号被另外-个服务或应用所占用,会
    导致当前程序启动失败。
    利用协议+ IP地址+端口号三元组合。就可以标识网络中的进程了,那么进程间的通信就可以利用这个标识与其
    它进程进行交互。
### TCP通信
    2.1概述
    TCP通信能实现两台计算机之间的数据交互,通信的两端,要严格区分为客户端(Clent)与服务端(Server)。
    两端通信时步骤:
    1.服务端程序，需要事先启动,等待客户端的连接。
    2.用户端主动连接服务器端,连接成功才能通信。服务端不可以主动连接客户端。
    在Java中.提供了两个类用于实现TCP通信程序:
    1.客户端:java.net.Socket类表示。创建Socket对象,向服务端发出连接请求，服务端响应请求,两者建立
    连接开始通信。
    2.服务端:java.net. ServerSocket类表示。创建ServerSocket对象,相当于开启一个服务,并等待客户端的
    连接。

### Socket
    Socket 类:该类实现客户端套接字,套接字指的是两台设备之间通讯的端点。
###### 构造方法
    public Socket(String host, int port),创建套接字对象并将其连接到指定主机上的指定端口号。如果指定
    的host是null,则相当于指定地址为回送地址。
    小贴士:回送地址(127.x.x.x)是本机回送地址( Loopback Address) , 主要用于网络软件测试以及本地
    机进程间通信,无论什么程序, 一旦使用回送地址发送数据,立即返回,不进行任何网络传输。
###### 成员方法
      public outputstream getoutputstream(),返回此套接字的输出流。
      public Inputstream get InputStream(),返回此套接字的输入流。
      public vold close(),关闭此套接字。
### ServerSocket
    表示服务器的类
###### 构造方法:
    public ServerSocket(int port),创建绑定到特定端口的服务器套接字。
    服务器端必须明确一件事情,必须的知道是哪个客户端请求的服务器
    所以可以使用accept方法获取到请求的客户端对象Socket
###### 成员方法:
    public Socket accept(),侦听并接受到此套接字的连接。

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    