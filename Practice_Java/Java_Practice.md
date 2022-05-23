# Homework

## 第二章 数据类型和流程控制

### CH2 homework1

> 2022.3.7 面向对象程序设计课后作业——2.1&2.2输入输出

1. 编写一个Java应用程序，输出自己的姓名、年龄、身高、籍贯等信息。要求答案中提供源代码及、运行结果的截图。要求有提示性语句，如“请输入你的姓名：”。。。等提示。通过键盘输入姓名、年龄等信息。

```java
import java.util.Scanner;

public class ch1_demo_2 {
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        String origin;

        Scanner sc = new Scanner(System.in);
        System.out.println("please input your name:");
        name = sc.next();
        System.out.println("please input your age:");
        age = sc.nextInt();
        System.out.println("please input your height:");
        height = sc.nextFloat();
        System.out.println("please input your origin:");
        origin = sc.next();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
      	System.out.println("height: " + height + "cm");
      	System.out.println("origin: " + origin);
    }
}
```

2. 有若干个学生某一课程的成绩，计算这些学生的总成绩和平均成绩。由于学生人数未知（如多个班级多个学生），所以无法准确输入成绩数。这时可以利用方法hasNextXXX()判断是否还有成绩，如果有则继续累加，否则计算平均成绩。以输入一行字符串作为结束输入的标志。

```java
import java.util.Scanner;

public class ch1_demo_3 {
    public static void main(String[] args) {
        float scores = 0;
        int nums = 0;
        float average = 0;
        System.out.println("Please input the scores:");

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextFloat()) {
            scores = sc.nextFloat();
            average += scores;
            nums += 1;
        }
        average = average / nums;
        System.out.println("The average is " + average);
    }
}
```



### CH2 homework2

> 2022.3.13 面向对象程序设计课后作业——2.3流程控制

1. 如下表，输入奖票号码，如果符合要求则给出中奖信息，输入over表示退出。每张奖票2元钱，统计买了多少张奖票，花了多少钱。

| 奖票号码 | 奖励等级 |   奖品   |
| :------: | :------: | :------: |
|   f(F)   |  一等奖  |  奥迪Q5  |
|   s(S)   |  二等奖  | 吉利博越 |
|   t(T)   |  三等奖  |  奇瑞QQ  |

```java
import java.util.Scanner;

public class ch2_demo_3 {
    public static void main(String[] args) {
        String code;
        int numbs = 0, price = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please input your code numbers:");
            code = sc.next();
            if ("over".equalsIgnoreCase(code)) {
                break;
            }
            price += 2;
            if ("f".equalsIgnoreCase(code)) {
                System.out.println("congratulations! you win the 1st prize\n");
                numbs += 1;
                continue;
            }
            if ("t".equalsIgnoreCase(code)) {
                System.out.println("congratulations! you win the 2nd prize\n");
                numbs += 1;
                continue;
            }
            if ("s".equalsIgnoreCase(code)) {
                System.out.println("congratulations! you win the 3rd prize\n");
                numbs += 1;
                continue;
            } else {
                System.out.println("sorry,you didn't win the prize\n");
                numbs += 1;
                continue;
            }
        }
        System.out.println("numbs\t" + numbs);
        System.out.println("price\t" + price);
    }
}
```

2. 制作如下图所示的学生管理系统控制台菜单。输入菜单号将给出相应的提示信息，例如输入1，则输出查询学生信息，输入0结束程序.

![](https://pic.imgdb.cn/item/625644a2239250f7c5bac9ed.png)

```java
import java.util.Scanner;

public class ch2_demo_5 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("**************学生管理系统***************");
            System.out.println("-----1.查询------------------2.增加-----");
            System.out.println("-----3.修改------------------4.删除-----");
            System.out.println("-----0.退出");
            System.out.println("请输入菜单号：");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            if (command == 1) {
                System.out.println("查询学生信息：");
            } else if (command == 2) {
                System.out.println("增加学生信息：");
            } else if (command == 3) {
                System.out.println("修改学生信息：");
            } else if (command == 4) {
                System.out.println("删除学生信息：");
            } else if (command == 0) {
                System.exit(0);
            } else {
                System.out.println("请重新输入正确的菜单号");
            }
        }
    }
}
```

3. 产生若干不大于100的随机整数aInt，进行如下处理： (1) 如果50≤aInt≤60则重新产生随机整数; (2) 如果aInt被7整除则停止产生随机数，退出程序； (3) 如果aInt是奇数，计算s=1+1/2+……+1/aInt； (4) 如果aInt是偶数，输出该偶数的所有因子。

```java
import java.util.Random;

public class ch2_demo_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int aInt;
        double s = 0;
        int m = 0, k = 0;
        aInt = rand.nextInt(100);
        System.out.println(+aInt);
        if (50 <= aInt && aInt <= 60) {
            aInt = rand.nextInt(100);
            System.out.println(+aInt);
        }
        if (aInt % 7 == 0) {
            System.exit(0);
        }
        if (aInt % 2 == 1) {
            for (int i = 1; i <= aInt; i++) {
                s += 1.0 / i;
            }
            System.out.printf("%.3f", s);
        }
        if (aInt % 2 == 0) {
            for (int j = 1; j <= aInt / 2; j++) {
                if (aInt % j == 0) {
                    m = aInt / j;
                    System.out.print("因子有：" + m + "\t");
                }
                if (m % 2 == 0) {
                    k++;
                }
            }
            System.out.println("一共有：" + k);
        }
    }
}
```



### CH2 homework 3

> 2022.3.20 面向对象程序课后作业——2.4 数组

1. 在控制台输入一组数字，排序后在控制台输出。一种运行结果如下图所示

![](https://pic.imgdb.cn/item/62564bf2239250f7c5c4e922.jpg)

```java
import java.util.Scanner;
import java.util.Arrays;

public class ch3_demo_1 {
    public static void main(String[] args) {
        int [] a= new int[7];
        int i,t,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字，用空格分开：");
        for(i=0;i<a.length;i++) {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("输出排序后的结构:");
        System.out.println(Arrays.toString(a));
    }
}
```

2. 将一个数组中的重复元素保留一个其他的清零。（知识点：数组遍历、数组元素访问）

```java
import java.util.Arrays;
import java.util.Scanner;

public class ch3_demo_2 {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入数组的长度：");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数据： ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr = clearRepeat(arr);
        System.out.println("新数组：" + Arrays.toString(arr));
    }

    public static int[] clearRepeat(int[] arr) {
        int count = 0;//记录重复元素个数；
        //计算重复元素个数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }

        int newLength = arr.length - count;//创建新的数组
        int[] newArr = new int[newLength];
        int index = 0;
        //把旧数组的元素放进新数组中
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            boolean flag = false;

            for (int k : newArr) {
                if (k == temp) {
                    flag = true;//数组重复
                    break;
                }
            }
            if (!flag) { //如果不重复就放进新数组中
                newArr[index++] = temp;
            }
        }
        return newArr;
    }
}
```

3. 写一个方法，实现功能：定义一个int型的一维数组，返回该数组的后len个数据。定义如下方法：public static int[] LenArr(int[] Arr,int len) 。在main方法中调用这个方法，实现返回Arr数组中，后len个数据。比如，main方法中定义int[] arr= {1,2,3,4,5,6,7,8,9,10};调用方法LenArr（arr,4），得到一个新的数组，显示为{7,8,9,10}。

```java
import java.util.Arrays;
import java.util.Scanner;

public class ch3_demo_3 {
    public static int[] LenArr(int[] Arr, int len) {
        int[] a = new int[len];
        int b = 0;
        for (int i = 10 - len; i < 10; i++) {
            a[b] = Arr[i];
            b++;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入显示的位数(1-10)：");
        len = sc.nextInt();
        System.out.println(Arrays.toString(LenArr(Arr, len)));
    }
}
```

4. 下表显示了3个学生4门课程的成绩，定义一个二维数组，计算每个学生的平均分并输出它们。

| 课程学号 | 数学 | 计算机基础 | 大学语文 |
| :------: | :--: | :--------: | :------: |
|    0     |  62  |     59     |    82    |
|    1     |  76  |     86     |    68    |
|    2     |  58  |     71     |    79    |
|    3     |  45  |     67     |    76    |

```java
public class ch3_demo_4 {
    public static void main(String[] args) {
        double[][] arr = {{62, 59, 82, 0}, {76, 86, 68, 0}, {58, 71, 79, 0}, {45, 67, 76, 0}};
        int n = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length - 1; j++) {
                sum += arr[i][j];
            }
            arr[i][3] = sum / 3.0;
        }
        System.out.println("\n\t课程学号\t数学\t计算机基础\t大学语文\t平均分\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\t%d\t", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%.2f\t", arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
```



## 第三、四章 面向对象思想&类设计基础

### 说明

第三章名为面向对象思想,第四章名为类设计基础,由于第三章的内容是为了后面面向对象学习的铺垫,所以将三章与四章合并练习

### CH3 homework 1

> 2022.3.27 面向对象程序设计课后作业——3.1 类和对象

1. 定义个Person类，属性有身份证号码、姓名、性别、年龄、籍贯、住址，行为包括：（1）eating(String food)，能够表示吃什么食物；（2）shopping(String goods)，表示购物；（3）sleeping(int time),表示睡觉，参数time表示睡觉的时长；（4）setName(String aName),表示修改人的姓名；（5）setAge(int aAge)，表示修改人的年龄；（6）printPerson()，表示打印人的所有信息。

```java
//define source code
public class Person {
    String id_code;
    String name;
    String sex;
    int age;
    String native_place;
    String address;

    public void eating(String food) {
        System.out.println(name + "正在吃" + food);
    }

    public void shopping(String goods) {
        System.out.println("要购买的商品: " + goods);
    }

    public void sleeping(int time) {
        System.out.println("睡觉的时间: " + time + "小时");
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    public void printPerson() {
        System.out.println("id: " + id_code);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("年龄：" + age + "岁");
        System.out.println("籍贯：" + native_place);
        System.out.println("地址：" + address);
    }
}
```

```java
//test source code
import java.util.Scanner;

public class Person_demo {
    public static void main(String[] args) {
        Person sun = new Person();
        Scanner scn = new Scanner(System.in);
        sun.id_code = "54188";
        sun.name = "二狗";
        sun.sex = "女";
        sun.age = 18;
        sun.native_place = "河南省郑州";
        sun.address = "天津市北辰区北仓镇富锦华庭";

        System.out.println("请输入喜欢吃的食物：");
        String food;
        food = scn.next();

        System.out.println("请输入要购买的商品：");
        String goods;
        goods = scn.next();

        System.out.println("请输入睡觉的时间：");
        int time;
        time = scn.nextInt();

        System.out.println("请输入修改人的姓名：");
        String aName;
        aName = scn.next();

        System.out.println("请输入修改人的年龄：");
        int aAge;
        aAge = scn.nextInt();

        System.out.println("\n");

        System.out.println("信息如下：");

        sun.setName(aName);
        sun.setAge(aAge);
        sun.printPerson();
        sun.eating(food);
        sun.shopping(goods);
        sun.sleeping(time);
    }
}
```

2. 设计一个表示书本的Book类，要求入下：

   1. 私有化的数据成员包括书名，出版社名，作者（可能有多个，采用字符串数组），价格，页数。
   2. 功能方法：（1）输出书名、出版社名和作者的方法；（2）输出书籍所有信息的方法；（3）做笔记的方法,即方法参数（String note），方法体为输出 note

   - Book类测试要求如下：

   1. 实例化一本书，然后设置新的价格和页数.
   2. 输出这本书   的所有信息.
   3. 做笔记，笔记内容是“环境保护，从我做起”.

```java
//define source code
public class Book {
    private String Book_name;
    private String Publish;
    private String[] writers;
    private double Price;
    private int Pages;

    //Assignment
    public void setBook_name(String book_name) {
        this.Book_name = book_name;
    }

    public void setPublish(String publish) {
        this.Publish = publish;
    }

    public void setWriters(String[] writers1) {
        this.writers = writers1;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setPages(int pages) {
        this.Pages = pages;
    }

    //function
    public void Print() {
        System.out.println("书名：" + "《" + this.Book_name + "》");
        System.out.println("出版社名：" + this.Publish);
        System.out.print("作者：");
        for (int i = 0; i < writers.length; i++) {
            System.out.println(writers[i] + " ");
        }
        System.out.println("价格：" + this.Price);
        System.out.println("页数：" + this.Pages);
    }

    public void MakeNote(String note) {
        System.out.println("笔记内容是/" + note + "/");
    }
}
```

```java
//test source code
import java.util.Scanner;

public class Book_demo {
    public static void main(String[] args) {
        Book ret = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入书名：");
        ret.setBook_name(sc.next());

        System.out.println("请输入出版社名：");
        ret.setPublish(sc.next());

        System.out.println("请输入作者：");
        ret.setWriters(new String[]{sc.next()});

        System.out.println("请输入书的价格：");
        ret.setPrice(sc.nextDouble());

        System.out.println("请输入书的页数：");
        ret.setPages(sc.nextInt());

        System.out.println("\n");
        ret.Print();
        ret.MakeNote("保护环境，从我做起");
    }
}
```

### CH4 homework 1

> 2022.3.31 面向对象程序设计课后作业——类和对象(二)

1. 定义长方体类Cuboid，要求如下：（1）私有成员变量包括长length、宽width和高height；（2）构造方法包括一个公共的空构造方法，一个能够初始化所有成员变量的构造方法；（3）包括所有的setter和getter方法，其中setter方法要求对形参进行验证，例如长、宽和高都大于0；（4）功能方法包括计算表面积getArea()、计算体积getCubage()、判断是否正方体isCube()、输出该长方体的长宽高printCuboid()、绘制该长方体（给出提示信息即可）drawing()。

- 测试一要求如下：(1)利用空构造方法创建一个新的长方体对象cuboidA，然后利用setter方法设置长宽高分别为1.5、2.6和18.6，(2)调用printCuboid()方法输出cuboidA的基本信息，调用isCube()方法判断是否正方体；（3）调用方法drawing()模拟绘制该长方体。
- 测试二要求如下：(1)利用构造方法创建一个具有长宽高分别为2.5、6.8和8.0的长方体对象cuboidB，然后利用setLength()方法修改length为4.6；(2)调用getArea()方法计算表面积；(3)调用getCubage计算该长方体的体积。

```java
//define source code
public class Cuboid {
    private double length;
    private double width;
    private double height;

    //构造公共空方法
    public Cuboid() {

    }

    //初始化所有成员变量方法
    public Cuboid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //逐个封装
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 10;
            System.out.println("输入违法，请输入大于0的数，length默认值为10，请重新输入！");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 20;
            System.out.println("输入违法，请输入大于0的数，width默认值为20，请重新输入！");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 30;
            System.out.println("输入违法，请输入大于0的数，height默认值为30，请重新输入！");
        }
    }

    //定义计算表面积getArea（）
    public double getArea() {
        double area = 2 * (this.height * this.width + this.height * this.length + this.length * this.width);
        return area;
    }

    //定义计算体积getCubage（）
    public double gerCubage() {
        double volume = this.height * this.width * this.length;
        return volume;
    }

    //判断是否正方体isCube（）
    public boolean isCube() {
        if ((this.length == this.width) && (this.height == length)) {
            return true;
        }
        return false;
    }

    //输出长方体长宽高数据printCuboid()
    public void printCuboid() {
        System.out.println("length= " + this.length);
        System.out.println("width= " + this.width);
        System.out.println("height= " + this.height);
    }

    //绘制该长方体drawing()
    public void drawing() {
        System.out.println("正在绘制长方体...");
    }
    
}
```

```java
//test source code 
import java.text.DecimalFormat;

public class Cuboid_demo {
    public static void main(String[] args) {
        Cuboid ret = new Cuboid();

        System.out.println("-------Test 1-------");
        Cuboid cuboidA = new Cuboid();
        //设置长宽高
        cuboidA.setLength(1.5);
        cuboidA.setWidth(2.6);
        cuboidA.setHeight(18.6);
        //调用方法输出信息
        cuboidA.printCuboid();
        //调用isCube判断是否正方体
        cuboidA.isCube();
        boolean flag = cuboidA.isCube();
        if (flag == true) {
            System.out.println("cuboidA is a cube");
        } else System.out.println("cuboidA isn't a cube");
        //调用drawing方法
        Cuboid dr = new Cuboid();
        dr.drawing();
//        cuboidA.printCuboid();

        System.out.println();
        System.out.println("-------Test 2-------");
        Cuboid cuboidB = new Cuboid();
        //设置第二组长宽高
        cuboidB.setLength(2.5);
        cuboidB.setWidth(6.8);
        cuboidB.setHeight(8.0);
        //用setLength()修改数据
        cuboidB.setLength(4.6);
        DecimalFormat df = new DecimalFormat("#0.00");
        //调用getArea求面积
        cuboidB.getArea();
        double area = cuboidB.getArea();
        System.out.println("AREA of cuboidB is " + df.format(area));
        //调用getCubage求体积
        cuboidB.gerCubage();
        double volume = cuboidB.gerCubage();
        System.out.println("VOLUME of cuboidB is " +df.format(volume));
    }
}
```

2. 定义Student类，要求如下：（1）私有化成员变量name，age和数据结构成绩ds和英语成绩English；（2）定义3个构造方法；（3）定义setter和getter方法；（4）定义3个功能方法，计算总分total( )，计算平均分average( )，输出某人的所有信息printStudent()。（5）定义测试类Demo，测试Student类的方法。

```java
//define source code
public class Student {
    private String name;
    private int age;
    private double data_structure;
    private  double English;

    //数据封装
    public String getterName(){
        return name;
    }
    public void setterName(String name){
        this.name=name;
    }

    public int getterAge(){
        return age;
    }
    public void setterAge(int age){
        this.age=age;
    }

    public double getterDS(){
        return data_structure;
    }
    public void setterDS(double data_structure){
        this.data_structure=data_structure;
    }

    public double getterEnglish(){
        return English;
    }
    public void setterEnglish(double English){
        this.English=English;
    }

    //计算总分total（)
    public double total(){
        double total=getterDS() +getterEnglish();
        return total;
    }
    //计算平均分average()
    public double average(){
        double average=total()/2.0;
        return average;
    }
    public void printStudent(){
        System.out.println("Name:"+getterName());
        System.out.println("Age:"+getterAge());
        System.out.println("DS scores :"+getterDS());
        System.out.println("English scores :"+getterEnglish());
        System.out.println("TOTAL: "+total());
        System.out.println("AVERAGE: "+average());
    }
}
```

```java
//test source code
import java.util.Scanner;

public class Student_demo {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the student's name: ");
        stu.setterName(sc.next());

        System.out.println("Please input the student's age: ");
        stu.setterAge(sc.nextInt());

        System.out.println("Please input the student's data_structure scores: ");
        stu.setterDS(sc.nextDouble());

        System.out.println("Please input the student's English scores: ");
        stu.setterEnglish(sc.nextDouble());

        System.out.println();
        stu.printStudent();
    }
}
```

### CH4 homework 2

> 2022.3.31 面向对象程序设计课后作业——类和对象(三)

1. 定义长方体类Cuboid，要求如下：（1）私有成员变量包括长length、宽width和高height；（2）构造方法包括一个公共的空构造方法，一个能够初始化所有成员变量的构造方法；（3）包括所有的setter和getter方法，其中setter方法要求对形参进行验证，例如长、宽和高都大于0；（4）功能方法包括计算表面积getArea()、计算体积getCubage()、判断是否正方体isCube()、输出该长方体的长宽高printCuboid()、绘制该长方体（给出提示信息即可）drawing()。

- 测试一要求如下：(1)利用空构造方法创建一个新的长方体对象cuboidA，然后利用setter方法设置长宽高分别为1.5、2.6和18.6，(2)调用printCuboid()方法输出cuboidA的基本信息，调用isCube()方法判断是否正方体；（3）调用方法drawing()模拟绘制该长方体。
- 测试二要求如下：(1)利用构造方法创建一个具有长宽高分别为2.5、6.8和8.0的长方体对象cuboidB，然后利用setLength()方法修改length为4.6；(2)调用getArea()方法计算表面积；(3)调用getCubage计算该长方体的体积。

```java
//define source code
public class Cuboid {
    private double length;
    private double width;
    private double height;

    //构造公共空方法
    public Cuboid() {

    }

    //初始化所有成员变量方法
    public Cuboid(double length, double width, double height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //逐个封装
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 10;
            System.out.println("输入违法，请输入大于0的数，length默认值为10，请重新输入！");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 20;
            System.out.println("输入违法，请输入大于0的数，width默认值为20，请重新输入！");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 30;
            System.out.println("输入违法，请输入大于0的数，height默认值为30，请重新输入！");
        }
    }

    //定义计算表面积getArea（）
    public double getArea() {
        double area = 2 * (this.height * this.width + this.height * this.length + this.length * this.width);
        return area;
    }

    //定义计算体积getCubage（）
    public double gerCubage() {
        double volume = this.height * this.width * this.length;
        return volume;
    }

    //判断是否正方体isCube（）
    public boolean isCube() {
        if ((this.length == this.width) && (this.height == length)) {
            return true;
        }
        return false;
    }

    //输出长方体长宽高数据printCuboid()
    public void printCuboid() {
        System.out.println("length= " + this.length);
        System.out.println("width= " + this.width);
        System.out.println("height= " + this.height);
    }

    //绘制该长方体drawing()
    public void drawing() {
        System.out.println("正在绘制长方体...");
    }

}
```

```java
//test source code
import java.text.DecimalFormat;

public class Cuboid_demo {
    public static void main(String[] args) {
        Cuboid ret = new Cuboid();

        System.out.println("-------Test 1-------");
        Cuboid cuboidA = new Cuboid();
        //设置长宽高
        cuboidA.setLength(1.5);
        cuboidA.setWidth(2.6);
        cuboidA.setHeight(18.6);
        //调用方法输出信息
        cuboidA.printCuboid();
        //调用isCube判断是否正方体
        cuboidA.isCube();
        boolean flag = cuboidA.isCube();
        if (flag == true) {
            System.out.println("cuboidA is a cube");
        } else System.out.println("cuboidA isn't a cube");
        //调用drawing方法
        Cuboid dr = new Cuboid();
        dr.drawing();
//        cuboidA.printCuboid();

        System.out.println();
        System.out.println("-------Test 2-------");
        Cuboid cuboidB = new Cuboid();
        //设置第二组长宽高
        cuboidB.setLength(2.5);
        cuboidB.setWidth(6.8);
        cuboidB.setHeight(8.0);
        //用setLength()修改数据
        cuboidB.setLength(4.6);
        DecimalFormat df = new DecimalFormat("#0.00");
        //调用getArea求面积
        cuboidB.getArea();
        double area = cuboidB.getArea();
        System.out.println("AREA of cuboidB is " + df.format(area));
        //调用getCubage求体积
        cuboidB.gerCubage();
        double volume = cuboidB.gerCubage();
        System.out.println("VOLUME of cuboidB is " +df.format(volume));
    }
}
```

2. 定义Student类，要求如下：（1）私有化成员变量name，age和数据结构成绩ds和英语成绩English；（2）定义3个构造方法；（3）定义setter和getter方法；（4）定义3个功能方法，计算总分total( )，计算平均分average( )，输出某人的所有信息printStudent()。（5）定义测试类Demo，测试Student类的方法。

```java
//define source code 
public class Student {
    private String name;
    private int age;
    private double data_structure;
    private double English;

    //数据封装
    public String getterName() {
        return name;
    }

    public void setterName(String name) {
        this.name = name;
    }

    public int getterAge() {
        return age;
    }

    public void setterAge(int age) {
        this.age = age;
    }

    public double getterDS() {
        return data_structure;
    }

    public void setterDS(double data_structure) {
        this.data_structure = data_structure;
    }

    public double getterEnglish() {
        return English;
    }

    public void setterEnglish(double English) {
        this.English = English;
    }

    //计算总分total（)
    public double total() {
        double total = getterDS() + getterEnglish();
        return total;
    }

    //计算平均分average()
    public double average() {
        double average = total() / 2.0;
        return average;
    }

    public void printStudent() {
        System.out.println("Name:" + getterName());
        System.out.println("Age:" + getterAge());
        System.out.println("DS scores :" + getterDS());
        System.out.println("English scores :" + getterEnglish());
        System.out.println("TOTAL: " + total());
        System.out.println("AVERAGE: " + average());
    }
}
```

```java
//test source code
import java.util.Scanner;

public class Student_demo {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the student's name: ");
        stu.setterName(sc.next());

        System.out.println("Please input the student's age: ");
        stu.setterAge(sc.nextInt());

        System.out.println("Please input the student's data_structure scores: ");
        stu.setterDS(sc.nextDouble());

        System.out.println("Please input the student's English scores: ");
        stu.setterEnglish(sc.nextDouble());

        System.out.println();
        stu.printStudent();
    }
}
```

### CH4 homework 3

> 2022.4.11 面向对象程序设计课后作业——类和对象(四)

1. 设计一个线段类，每一个线段用两个端点的坐标表示，类中定义计算线段长度的方法、对线段进行平移的方法和对线段绕原点旋转的方法。定义线段类对象并进行相应的操作。

```java
//define source code
public class Line {
    private float x1, x2, y1, y2;

    public Line(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //计算长度
    public float LineLength() {
        float p = (x1 - x2) * (x1 - x2);
        float q = (y1 - y2) * (y1 - y2);
        return (float) Math.sqrt(p + q);
    }

    //平移
    public void Move(float x, float y) {
        x1 += x;
        x2 += x;
        y1 += y;
        y2 += y;
    }

    //旋转
    public void Rotate() {
        x1 = -x1;
        x2 = -x2;
        y1 = -y1;
        y2 = -y2;
    }

    @Override
    public String toString() {
        return ("Line[x1=" + x1 + ",y1=" + y1 + ",x2=" + x2 + ",y2=" + y2 + "]");
    }
}
```

```java
//text source code
import java.text.DecimalFormat;
import java.util.Scanner;

public class Line_demo {
    public static void main(String[] args) {
        Line line = new Line(1.0f, 2.0f, 8.0f, 3.0f);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(line);
        System.out.println("线段的长度为：" + df.format(line.LineLength()));

        System.out.println("请输入平移位置：");
        line.Move(sc.nextFloat(), sc.nextFloat());
        System.out.println("平移后的坐标位置：");
        System.out.println(line);

        line.Rotate();
        System.out.println("旋转后坐标为：");
        System.out.println(line);
    }
}
```

2. 设计一个自然数类，该类的对象能表示一个自然数。类中定义方法能计算1到这个自然数的各个数之和、能够判断该自然数是否是素数。定义自然数的对象并进行相应的操作。

```java
//define source code
public class Number {
    private int num;

    //输入
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //累加
    public int Cumulation() {
        int sum = 0;
        for (int i = 0; i <= this.num; i++) {
            sum += i;
        }
        return sum;
    }

    //判断素数
    public void isprime() {
        int n, s;
        int f = 0;
        s = (int) Math.sqrt(this.num);
        for (n = 2; n <= s; n++) {
            if (this.num % n == 0) {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println(this.num + "是素数");
        }
        if (f == 1) {
            System.out.println(this.num + "不是素数");
        }
    }
}
```

```java
//text source code
import java.util.Scanner;

public class Number_demo {
    public static void main(String[] args) {
        Number number = new Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        number.setNum(num);

        System.out.println(num + " 这个整数的累加为：" + number.Cumulation());
        number.isprime();
    }
}
```

3. 设计一个三角形类，*每一个三角形由了个顶点的坐标表示*。类中定义方法能计算三角形的周长和面积、能对三角形进行平移和绕原点旋转。定义三角形类的对象并进行相应的操作。

```java
//define source code 
public class Triangle {
    private int x1,x2,x3;
    private int y1,y2,y3;

    public Triangle(int x1,int x2,int x3,int y1,int y2,int y3){
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
    }
    private float TrianglelengthA(){
        float a=(float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return a;
    }
    private float TrianglelengthB(){
        float b=(float) Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        return b;
    }
    private float TrianglelengthC(){
        float c=(float) Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        return c;
    }

    public float Perimeter(){
        float perimeter=TrianglelengthA()+TrianglelengthB()+TrianglelengthC();
        return perimeter;
    }
    public float TriangleArea(){
        float p= (float) (Perimeter()/2.0);
        float area=(float) Math.sqrt(p*(p-TrianglelengthA())*(p-TrianglelengthB())*(p-TrianglelengthC()));
        return area;
    }
    public void Move(int x,int y){
        x1+=x;
        x2+=x;
        x3+=x;
        y1+=y;
        y2+=y;
        y3+=y;
    }
    public void Spin(){
        x1=-x1;
        x2=-x2;
        x3=-x3;
        y1=-y1;
        y2=-y2;
        y3=-y3;
    }

    @Override
    public String toString() {
        return "Location[(" +x1 + "," + y1 + "),(" + x2 +","+ y2 +"),(" + x3 + "," + y3 +")]";
    }
}
```

```java
//text source code
import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle_demo {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1,2,3,3,1,3);
        Triangle tri2 = new Triangle(1,2,3,3,1,3);
        Scanner sc =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("原始坐标为：");
        System.out.println(tri);
        System.out.println("三角形的周长为： "+df.format(tri.Perimeter()));
        System.out.println("三角形的面积为： "+df.format(tri.TriangleArea()));
        System.out.println("请输入平移的位置（先左右移动x，后上下y）：");
        tri.Move(sc.nextInt(),sc.nextInt());
        System.out.print("移动后的坐标：");
        System.out.println(tri);

        tri2.Spin();
        System.out.print("旋转后的坐标：");
        System.out.println(tri2);
    }
}
```

2. 设计一个分数类，分数的分子和分母用两个整型数表示，类中定义方法能对分数进行加法、减法、乘法和除法运算。定义分数类的对象、运算并输出运算结果。

```java
//define source code 
public class Fraction {
    private int mol1, mol2;
    private int denom1, denom2;

    public int getMol1() {
        return mol1;
    }

    public void setMol1(int mol1) {
        this.mol1 = mol1;
    }

    public int getMol2() {
        return mol2;
    }

    public void setMol2(int mol2) {
        this.mol2 = mol2;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    }

    //求分子分母的最大公约数
    public int gcd(int a, int b) {
        if (a < b) {
            int c = a;
            a = b;
            b = c;
        }
        int r;
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public void fAdd() {
        int fm = getDenom1() * getDenom2();
        int fz = getMol1() * getDenom2() + getMol2() * getDenom1();
        int g = gcd(fz, fm);
        fz = fz / g;
        fm = fm / g;
        System.out.println("运算结果为：" + fz + "/" + fm);
    }

    public void fSub() {
        int fm = getDenom1() * getDenom2();
        int fz = getMol1() * getDenom2() - getMol2() * getDenom1();
        if (fz != 0) {
            int g = gcd(fz, fm);
            fz = fz / g;
            fm = fm / g;
            System.out.println("运算结果为：" + fz + "/" + fm);
        } else System.out.println("运算结果为: 0");

    }

    public void fMul() {
        int fz = getMol1() * getMol2();
        int fm = getDenom1() * getDenom2();
        if (fz == fm) {
            System.out.println("运算结果为： 1");
        } else {
            int g = gcd(fz, fm);
            fz = fz / g;
            fm = fm / g;
            System.out.println("运算结果为：" + fz + "/" + fm);
        }
    }

    public void fDiv() {
        int fm = getDenom1() * getMol2();
        int fz = getMol1() * getDenom2();
        if (fz != fm && fm != 0) {
            int g = gcd(fz, fm);
            fz = fz / g;
            fm = fm / g;
            System.out.println("运算结果为：" + fz + "/" + fm);
        }
        else System.out.println("运算结果为：1");
    }
}
```

```java
//text source code
import java.util.Scanner;

public class Fraction_demo {
    public static void main(String[] args) {
        Fraction frac = new Fraction();
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("------------请选择要进行的运算-------------");
        System.out.println("---1.加法     2.减法    3.乘法    4.除法---");
        x = sc.nextInt();
        System.out.println("请输入第一个分数的分子,分母（用空格隔开）：");
        frac.setMol1(sc.nextInt());
        frac.setDenom1(sc.nextInt());
        System.out.println("请输入第二个分数的分子，分母（用空格隔开）：");
        frac.setMol2(sc.nextInt());
        frac.setDenom2(sc.nextInt());
        switch (x) {
            case 1 -> {
                System.out.println("运算...");
                frac.fAdd();
            }
            case 2 -> {
                System.out.println("运算...");
                frac.fSub();
            }
            case 3 -> {
                System.out.println("运算...");
                frac.fMul();
            }
            case 4 -> {
                System.out.println("运算...");
                frac.fDiv();
            }
            default -> System.out.println("请输入1-4：");
        }
    }
}
```

2. 设计一个复数类，复数类的实部和虚部都是实型数，类中定义方法能对复数进行加法、减法和乘法运算。定义复数类的对象、运算井输出结果。

```java
//define source code
import java.text.DecimalFormat;
import java.util.Scanner;

public class Complex {
    private double RealPart;
    private double ImaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.RealPart = realPart;
        this.ImaginaryPart = imaginaryPart;
    }

    public void Complex(double realPart, double imaginaryPart) {
        this.RealPart = realPart;
        this.ImaginaryPart = imaginaryPart;
    }

    Complex() {
        Scanner sc = new Scanner(System.in);
        double RealPart=sc.nextDouble();
        double ImaginaryPart=sc.nextDouble();
        Complex(RealPart, ImaginaryPart);
    }

    public double getRealPart() {
        return RealPart;
    }

    public double getImaginaryPart() {
        return ImaginaryPart;
    }

    //Add
    public Complex CAdd(Complex a) {
        double RealPart1 = a.getRealPart();
        double ImaginaryPart1 = a.getImaginaryPart();
        double newRealPart = RealPart + RealPart1;
        double newImaginaryPart = ImaginaryPart + ImaginaryPart1;
        Complex result = new Complex(newRealPart, newImaginaryPart);
        return result;
    }

    //Sub
    public Complex CSub(Complex a) {
        double RealPart1 = a.getRealPart();
        double ImaginaryPart1 = a.getImaginaryPart();
        double newRealPart = RealPart - RealPart1;
        double newImaginaryPart = ImaginaryPart - ImaginaryPart1;
        Complex result = new Complex(newRealPart, newImaginaryPart);
        return result;
    }

    //Mul
    public Complex CMul(Complex a) {
        double RealPart1=a.getRealPart();
        double ImaginaryPart1=a.getImaginaryPart();
        double newRealPart = RealPart*RealPart1-ImaginaryPart*ImaginaryPart1;
        double newImaginaryPart = RealPart*ImaginaryPart1+ImaginaryPart*RealPart1;
        Complex result = new Complex(newRealPart,newImaginaryPart);
        return result;
    }

    //Div
    public Complex CDiv(Complex a) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double RealPart1=a.getRealPart();
        double ImaginaryPart1=a.getImaginaryPart();
        double newRealPart = (RealPart*RealPart1+ImaginaryPart*ImaginaryPart1)
                / (RealPart1*RealPart1+ImaginaryPart1*ImaginaryPart1);
        double newImaginaryPart = (ImaginaryPart*RealPart1-RealPart*ImaginaryPart1)
                /(RealPart1*RealPart1+ImaginaryPart1*ImaginaryPart1);
        newRealPart= Double.parseDouble(df.format(newRealPart));
        newImaginaryPart= Double.parseDouble(df.format(newImaginaryPart));
        Complex result = new Complex(newRealPart,newImaginaryPart);
        return result;
    }

    public void printf() {                                                    //输出结果
        System.out.println(  RealPart + " + " +  ImaginaryPart + "i");
    }
    
}
```

```java
//text source code
public class Complex_demo {
    public static void main(String[] args) {

        System.out.println("请输入第一个复数的实部和虚部(fz):");
        Complex first = new Complex();
        System.out.println("请输入第二个复数的实部和虚部(fm):");
        Complex second = new Complex();

        Complex result_Add = first.CAdd(second);                    //是第一个对第二个的操作
        Complex result_Reduce = first.CSub(second);
        Complex result_Multiply = first.CMul(second);
        Complex result_Divide = first.CDiv(second);

        System.out.println("两个复数相加后:");
        result_Add.printf();
        System.out.println("两个复数相减后:");
        result_Reduce.printf();
        System.out.println("两个复数相乘后:");
        result_Multiply.printf();
        System.out.println("两个复数相除后:");
        result_Divide.printf();
    }
}
```

### CH4.3 构造函数

#### CH4.3 homework 1

1. 题目如下

- 设计CPU类，要求如下：
  - 1. 私有数据成员包括型号，频率，价格，寄存器；
    2. 一个空构造方法，一个初始化型号，频率，价格的构造方法；
    3. 写出设置寄存器和读取寄存器数据的setter和getter方法；
    4. 功能方法：模拟CPU发出运算指令从内存中读取数据到寄存器，把CPU中寄存器的数据写入内存。

- 设计内存类RAM，要求如下：
  - 1. 频率，大小，当前保存的数据；
    2. 一个空构造方法；
    3. 一个setter方法把数据保存在RAM中，一个getter方法取得RAM中的数据。
    4. 测试要求：构造一个CPU对象，测试两个功能方法。

```Java
//define source code
package Pracite;

public class CPU {
 private String type;
 private double  Hz;
 private double price;
 private String register;
 public String getRegister() {
  return register;
 }
 public void setRegister(String reg) {
  register = reg;
 }
 public CPU(){
  
 }
 public CPU(String type, double hz, double price) {
  super();
  this.type = type;
  Hz = hz;
  this.price = price;
 }
 public void function1(RAM ram) {
  this.register=ram.getDate();
 }
 public void function2(RAM ram) {
  ram.setDate(this.register);
 }
}
```

```java
//define source code
package Pracite;

public class RAM {
 private double Hz;//频率
 private double ram;//内存大小
 private String date;//当前所保存的数据
 public String getDate() {
  return date;
 }
 public void setDate(String date) {
  this.date = date;
 }
 public RAM(){
  
 }
}
```

```java
//
package Pracite;

public class CPU_demo {
 public static void main(String[] args) {
  CPU cpu=new CPU("E3200",66,90);
  RAM ram=new RAM();
  ram.setDate("从内存中读取的数据");
  cpu.function1(ram);
  System.out.println("寄存器数据:"+cpu.getRegister());
  cpu.setRegister("CPU中寄存器的数据");
  cpu.function2(ram);
  System.out.println("内存数据:"+ram.getDate());
 }
}
```



2. 题目如下

- 设计学生类，要求如下:
  - 1. 成员变量包括姓名name、年龄age、选修的课程course（假设都选修2门课程），上课教室room（不同的2个教室）；
    2. 定义构造方法初始化所有成员变量；
    3. 定义setter和getter方法；
    4. 定义方法getAverage()计算学生的平均成绩；
    5. 重写Object的toString()方法返回有价值的信息（姓名、年龄，平均成绩）  

- 设计课程类Course，要求如下：

  - 1. 成员变量包括课程名name，成绩score；

    2. 定义setter和getter方法；

    3. 重写toString()方法。 

-  设计教室类Room，要求如下：

  - 1. 成员变量包括教室位置location，教室房间号；
    2. 定义构造方法初始化所有成员变量；
    3. 定义setter和getter方法；
    4. 定义重写toString()方法。

- 编写测试类，某班级3名学生的信息如下表所示。

  - 1. 输出所有学生的信息，包括姓名，年龄，选修课程和上课教室；
    2. 输入某个学生姓名，输出某个学生的姓名，年龄，选修课程和上课教室。

```java
//
package Pracite;

public class Room {
 private String location;
 @Override
 public String toString() {
  return "Room [location=" + location + ", roomNumber=" + roomNumber + "]";
 }
 public String getLocation() {
  return location;
 }
 public void setLocation(String location) {
  this.location = location;
 }
 public int getRoomNumber() {
  return roomNumber;
 }
 public void setRoomNumber(int roomNumber) {
  this.roomNumber = roomNumber;
 }
 private int roomNumber;
 public Room(String location, int roomNumber) {
  super();
  this.location = location;
  this.roomNumber = roomNumber;
 }
 
}
```

```java
package Pracite;

public class Course {
 private String Coursename;
 public Course(String coursename, double score) {
  super();
  Coursename = coursename;
  this.score = score;
 }
 public String getCoursename() {
  return Coursename;
 }
 public void setCoursename(String coursename) {
  Coursename = coursename;
 }
 public double getScore() {
  return score;
 }
 public void setScore(double score) {
  this.score = score;
 }
 private double score;
 @Override
 public String toString() {
  return "Course [Coursename=" + Coursename + ", score=" + score + "]";
 }
 
}
```

```java
package Pracite;

public class Student {
 private String name;
 public String getName() {
  return name;
 }
 public Student(String name, int age, Course course1, Course course2, Room room1, Room room2) {
  super();
  this.name = name;
  this.age = age;
  this.course1 = course1;
  this.course2 = course2;
  this.room1 = room1;
  this.room2 = room2;
 }
 @Override
 public String toString() {
  return "Student [name=" + name + ", age=" + age + ", getAverage()=" + getAverage() + "]";
 }
 public String getString() {
  return "姓名:"+name+"; 年龄:"+age+"; 选修课程:"+course1.getCoursename()+","+
    course2.getCoursename()+"; 上课教室:"+room1.toString()+","+room2.toString();
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public Course getCourse1() {
  return course1;
 }
 public void setCourse1(Course course1) {
  this.course1 = course1;
 }
 public Course getCourse2() {
  return course2;
 }
 public void setCourse2(Course course2) {
  this.course2 = course2;
 }
 public Room getRoom1() {
  return room1;
 }
 public void setRoom1(Room room1) {
  this.room1 = room1;
 }
 public Room getRoom2() {
  return room2;
 }
 public void setRoom2(Room room2) {
  this.room2 = room2;
 }
 private int age;
 private Course course1,course2;
 private Room room1,room2;
 public double getAverage() {
  return (course1.getScore()+course2.getScore())/2;
 }
 
}
```

```java
package Pracite;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Student_demo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Course course[]= {new Course("高等数学",88),new Course("英语",89),new Course("体育",91),new Course("心理学",92),
    new Course("机械制图",88),new Course("大学物理",81)
  };
  Room room[]= {new Room("实验楼",301),new Room("逸夫楼",409),new Room("体育馆",308),new Room("实验楼",206),
    new Room("逸夫楼",310),new Room("实验楼",318)
    
  };
  Student student[]= {new Student("孙悟空",22,course[0],course[1],room[0],room[1]),
    new Student("猪八戒",18,course[2],course[3],room[2],room[3]),
    new Student("沙和尚",21,course[4],course[5],room[4],room[5])
  };
  for(int i=0;i<student.length;i++) {
   System.out.println(student[i].getString());
  }
  String name;
  System.out.println("请输入需要查找信息的学生姓名：");
  Scanner sc=new Scanner(System.in);
  name=sc.next();
  boolean flag=true;
  for(int i=0;i<student.length;i++) {
   flag=true;
   if(name.equals(student[i].getName())) {
    System.out.println(student[i].getString());
    break;
   }else {
    flag=false;
   }
  }
  if(!flag) {
   System.out.println("本系统暂未录入该学生的相关信息");
  }  
 }
}
```



3. 题目如下

- 定义长方体类Cuboid，要求如下：
  - 1. 私有成员变量包括长length、宽width和高height;
    2. 构造方法包括一个公共的空构造方法，一个能够初始化所有成员变量的构造方法;
    3. 包括所有的setter和getter方法，其中setter方法要求对形参进行验证，例如长、宽和高都大于0;
    4. 功能方法包括计算表面积getArea()、计算体积getCubage()、判断是否正方体isCube()、输出该长方体的长宽高printCuboid()。
- 测试一要求如下：
  - 1. 利用空构造方法创建一个新的长方体对象cuboidA，然后利用setter方法设置长宽高分别为1.5、2.6和18.6.
    2. 调用printCuboid()方法输出cuboidA的基本信息，调用isCube()方法判断是否正方体。
- 测试二要求如下：
  - 1. 利用构造方法创建一个具有长宽高分别为2.5、6.8和8.0的长方体对象cuboidB，然后利用setLength()方法修改length为4.6;
    2. 调用getArea()方法计算表面积;
    3. 调用getCubage计算该长方体的体积。

```java
package Pracite;

public class Cuboid {
 private double length,width,height;
 public Cuboid(double length, double width, double height) {
  super();
  this.length = length;
  this.width = width;
  this.height = height;
 }
 public double getLength() {
  return length;
 }
 public void setLength(double length) {
  if(length>0) {
  this.length = length;
  }else {
   System.out.println("输入有错，请重新输入");
  }
 }
 public double getWidth() {
  return width;
 }
 public void setWidth(double width) {
  if(width>0) {
  this.width = width;
  }else {
   System.out.println("输入有错，请重新输入");
  }
 }
 public double getHeight() {
  return height;
 }
 public void setHeight(double height) {
  if(height>0) {
  this.height = height;
  }else {
   System.out.println("输入有错，请重新输入");
  }
 }
 public Cuboid(){
  
 }
 public double getArea() {
  return 2*(this.height*this.length+this.height*this.width+this.length*this.width);
 }
 public double getCubage() {
  return this.height*this.length*this.width;
 }
 public boolean isCube() {
  boolean flag=false;
  if((this.height==this.length)&&(this.height==this.width)){
   flag=true;
  }
  return flag;
 }
 public void printCuboid(){
  System.out.println("长:"+this.length+";宽:"+this.width+";高:"+this.height);
  
 }
 
}
```

```java
package Pracite;

public class Cuboid_demo {
 public static void main(String[] args) {
  Cuboid cuboidA=new Cuboid();
  cuboidA.setHeight(18);
  cuboidA.setLength(1);
  cuboidA.setWidth(2);
  if(cuboidA.isCube()) {
   System.out.println("正方体");
  }else {
   System.out.println("长方体");
  }
  cuboidA.printCuboid();
 
  Cuboid cuboidB=new Cuboid(2,6,8);
  cuboidB.setLength(4);
  System.out.println("表面积:"+cuboidB.getArea());
  System.out.println("体积:"+cuboidB.getCubage());
 }
}
```



4. 题目如下:
   1. 私有化成员变量name，age和数据结构成绩ds和英语成绩English;
   2. 定义3个构造方法;
   3. 定义setter和getter方法;
   4. 定义3个功能方法，计算总分total( )，计算平均分average( )，输出某人的所有信息printStudent();
   5. 定义测试类Demo，测试Student类的方法。

```java
package Pracite;

public class Student1 {
  private String name;
  public Student1(String name, int age, double english, double ds) {
  super();
  this.name = name;
  this.age = age;
  English = english;
  this.ds = ds;
  }
 public Student1() {
   
  }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 public double getEnglish() {
  return English;
 }
 public void setEnglish(double english) {
  English = english;
 }
 public double getDs() {
  return ds;
 }
 public void setDs(double ds) {
  this.ds = ds;
 }
 private int age;
 private double English;
 private double ds;
 public double total() {
  return this.ds+this.English;
 }
 public double average( ) {
  return this.total()/2;
 }
 public void printStudent() {
  System.out.println("姓名:"+this.name+";年龄:"+this.age+";数据结构成绩"+this.ds+
    ";英语成绩:"+this.English+";总分:"+this.total()+";平均分:"+this.average());
 }
   
}
```

```java
package Pracite;

public class Student1_demo {
 public static void main(String[] args) {
  Student1 student=new Student1("李华",18,98,98);
  student.printStudent();
 }
}
```



### CH4.4 对象组合

#### CH4.4 homework

1. 有学生类Student，包含：学号id，姓名name，性别sex，年龄age，并包含自我介绍方法sayHi();
   - 定义属性id,name,sex,age;
   - 实现属性封装 setter/getter;
   - 构造函数对属性初始化;
   - 实现自我介绍方法sayHi();

- 创建测试类TestStudent。将创建三个学生信息数组，实现遍历；判断数组中是否有lily同学，如果没有重新将(1005,lily,female,20)添加到数组中；找出年龄最大的同学，输出他的信息。

```java
package Pracite;

public class Student2 {
 private String id,name,sex;
 private int age;
 public Student2(String id, String name, String sex, int age) {
  super();
  this.id = id;
  this.name = name;
  this.sex = sex;
  this.age = age;
 }
 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getSex() {
  return sex;
 }

 public void setSex(String sex) {
  this.sex = sex;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public void sayHi() {
  System.out.println("学号:"+this.id+";姓名:"+this.name+";性别:"+this.sex+";年龄:"+this.age);
 }
}
```

```java
package Pracite;

public class Student2_demo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Student2 student[]=new Student2[4];
  student[0]=new Student2("1001","sam","male",18);
  student[1]=new Student2("1002","judy","female",19);
  student[2]=new Student2("1003","jack","male",21);
  boolean flag=false;
  int max=0;
  for(int i=0;i<student.length-1;i++) {
   student[i].sayHi();
   if(student[i].getName().equals("lily")) {
    flag=true;
   }
   if(student[i].getAge()>student[max].getAge()) {
    max=i;
   }
  }
  if(!flag) {
   System.out.println("本系统中无Lily的学生信息");
   student[3]=new Student2("1005","lily","female",20);
   if(student[3].getAge()>student[max].getAge()) {
    max=3;
   }
  }
  System.out.print("最大年龄同学的信息:");
  student[max].sayHi();
  
 }

}
```



2. ![](https://pic.imgdb.cn/item/6288854d0947543129018ebe.png)

![](https://pic.imgdb.cn/item/628885300947543129017811.jpg)

```java
package Work;

public class CPU {
 private int speed;

 public int getSpeed() {
  return speed;
 }

 public void setSpeed(int speed) {
  this.speed = speed;
 }
 
}
```

```java
package Work;

public class HardDisk {
 private int mount;

 public int getMount() {
  return mount;
 }

 public void setMount(int mount) {
  this.mount = mount;
 }
 
}
```

```java
package Work;

public class PC {
 private CPU cpu;
 private HardDisk HD;
 public CPU getCpu() {
  return cpu;
 }
 public void setCpu(CPU cpu) {
  this.cpu = cpu;
 }
 public HardDisk getHD() {
  return HD;
 }
 public void setHD(HardDisk hD) {
  HD = hD;
 }
 public void show() {
  System.out.println("CPU的速度:"+this.cpu.getSpeed()+";磁盘容量:"+this.HD.getMount());
 }
}
```

```java
package Work;


public class Test1 {
 public static void main(String[] args) {
  CPU cpu=new CPU();
  cpu.setSpeed(2200);
  HardDisk disk=new HardDisk();
  disk.setMount(200);
  PC pc=new PC();
  pc.setCpu(cpu);
  pc.setHD(disk);
  pc.show(); 
 }
}
```





## 第五章 类设计进阶

### CH5.1 类的继承

#### CH5.1 homework 1

1. 根据下图  
   1. 创建父类Person类，包括name、age成员变量，变量的封装getter/setter，定义printPerson()打印人的信息 
   2. 创建子类Student继承Person类，新增className成员变量，变量的封装getter/setter，定义printStudent（）打印学生信息 
   3. 在Student类中实现对Person类printPerson()的重写。 
   4. 创建Person和Student对象，Person对象调用printPerson()方法，Student对象调用printPerson()和PrintStudent()方法。

![](https://pic.imgdb.cn/item/628884ef0947543129014b1c.png)

```java
package Work;

public class Person {
 private String name;
 private int age;
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public int getAge() {
  return age;
 }
 public void setAge(int age) {
  this.age = age;
 }
 
 public void printPerson() {
  System.out.println("Person [name=" + name + ", age=" + age + "]");
 }
}
```

```java
package Work;

public class Student extends Person {
 private String className;
 public String getClassName() {
  return className;
 }
 public void setClassName(String className) {
  this.className = className;
 }
 public void printStudent() {
  System.out.println("Student [class=" + className + ", name=" + getName() + ", age=" + getAge() + "]");
 }
 public void printPerson() {
  System.out.println("Person [class=" + className + ", name=" + getName() + ", age=" + getAge() + "]");
 }
 
}
```

```java
package Work;

public class Demo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Person p=new Person();
  p.setAge(18);
  p.setName("lily");
  p.printPerson();
  Student s=new Student();
  s.setAge(19);
  s.setName("sam");
  s.setClassName("计算机5班");
  s.printPerson();
  s.printStudent();
 }

}
```





### CH5.2 多态

#### CH5.2 homework 1

1. 题目如下:

- (1) ColaEmployee ：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。
  - Ÿ 方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
- (2) SalariedEmployee ： ColaEmployee 的子类，拿固定工资的员工。
  - Ÿ 属性：月薪
- (3) HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5 倍工资发放。
  - Ÿ 属性：每小时的工资、每月工作的小时数
- (4) SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。
  - Ÿ 属性：月销售额、提成率
- (5) 定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额，写一个测试类TestCompany,在main方法，把若干各种类型的员工放在一个ColaEmployee 数组里，并单元出数组中每个员工当月的工资。

```java
package Test;

public abstract class ColaEmployee {
 private String name;
 private int month;
 public ColaEmployee(String name, int month) {
  super();
  this.name = name;
  this.month = month;
 }

 public String getName() {
  return name;
 }

 public int getMonth() {
  return month;
 }

 public abstract double getSalary(int month);
 
}
```

```java
package Test;

public class SalariedEmployee extends ColaEmployee {
 private double monthMoney;
 public SalariedEmployee(String name,int month,double monthMoney) {
  super(name,month);
  this.monthMoney = monthMoney;
 }

 @Override
 public double getSalary(int month) {
  // TODO Auto-generated method stub
  if(month==this.getMonth()) {
   return this.monthMoney+100;
  }else {
   return this.monthMoney;
  }
 }

}
```

```java
package Test;

public class HourlyEmployee extends ColaEmployee {
 private int hour;
 private double hourMoney;
 public HourlyEmployee(String name, int month, int hour, double hourMoney) {
  super(name, month);
  this.hour = hour;
  this.hourMoney = hourMoney;
 }
 @Override
 public double getSalary(int month) {
  // TODO Auto-generated method stub
  double money=0;
  if(this.hour>160) {
   money= (160*this.hourMoney+(this.hour-160)*this.hourMoney*1.5);
  }else {
   money= this.hourMoney *this.hour ;
  } 
  if(month==this.getMonth()) {
   return money+100;
  }else
   return money;
 }

}
```

```java
package Test;

public class SalesEmployee extends ColaEmployee {
 private double monthPay;
 private double rate;
 public SalesEmployee(String name, int month, double monthPay, double rate) {
  super(name, month);
  this.monthPay = monthPay;
  this.rate = rate;
 }
 @Override
 public double getSalary(int month) {
  // TODO Auto-generated method stub
  double money=0;
  money= this.monthPay*(1+this.rate);
  if(month==this.getMonth()) {
   return money+100;
  }else
   return money;
 }

}
```

```java
package Test;

public class Company {
 public void getMoney(ColaEmployee c,int month) {
  System.out.println("第"+month+"月,员工"+c.getName()+
    "的工资为:"+c.getSalary(month)+"元");
 }
}
```

```java
package Test;

import java.util.Calendar;

public class TestCompany {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  ColaEmployee c[]=new ColaEmployee[3];
  c[0]=new SalariedEmployee("Lily",5,5000);
  c[1]=new HourlyEmployee("Tom",3,100,75);
  c[2]=new SalesEmployee("Jerry",3,5500,0.02);
  Company company=new Company();
  Calendar calendar = Calendar.getInstance();
  for(int i=0;i<c.length;i++) {
   company.getMoney(c[i],calendar.get(Calendar.MONTH)+1);
  }
 }

}
```



### CH5.3 接口

#### CH5.3 homework

1. 当前疫情期de间，民航飞机必须实现两个强制性的规范;一个是符合检疫标准;一个是符合安全标准.私人飞机只需要实现一个强制性规范:符合安全标淮。编程完成以下功能：
   - 1）接口IOuarantine：声明了void quarantine( ) 抽象方法；
   - 2）接口ISafety：声明了void statusTest( ) 抽象方法;
   - 民航飞机类Plane实现了上述lQuarantine、ISafety两个接口，其方法功能如下:
     - 1. quarantine方法: 输出:  Plane通过了严格的检疫。
       2. statusTest方法: 输出：Plane进行了严格的飞行前检测。
   - 私人飞机类PrivatePlane实现了上述ISafety接口，其方法功能如下：
     - 1. statusTest方法：输出：PrivatePlane 进行了严格的飞行前检测。
   - 测试类Test，其main方法实现以下功能:创建Plane对象、PrivatePlane对象，执行
     各自的方法。
```
//interface
package Interface.Practice_2;

public interface IOuarantine {
    void quarantine();
}
```
```
//interface
package Interface.Practice_2;

public interface ISafety {
    void statusTest();
}
```
```
//Class Plane
package Interface.Practice_2;

public class Plane implements IOuarantine,ISafety{
    @Override
    public void quarantine() {
        System.out.println("Plane通过了严格的检疫");
    }

    @Override
    public void statusTest() {
        System.out.println("Plane进行了严格的飞行前检测");
    }
}
```
```
//Class Private Plane
package Interface.Practice_2;

public class PrivatePlane implements ISafety{
    @Override
    public void statusTest() {
        System.out.println("PrivatePlane进行了严格的飞行前检测");
    }
}
```
```java
//Test
package Interface.Practice_2;

public class Demo_IF_2 {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.quarantine();
        plane.statusTest();

        PrivatePlane privatePlane = new PrivatePlane();
        privatePlane.statusTest();
    }
}
```


## 第六章 异常处理机制

### CH6.2 异常处理

#### CH6.2 homework
> 2022年5月23日 11:36:52

1. 已知若引用数组元素时，如果下标超出合理范围，则将触发数组下标越界异(ArrayIndexOutOfBoundsException)

   编写类ExceptionTest， 在其main方法中完成：

   - 1） 在try中编写代码，通过数组下标越界代码，触发一个数组下标越界异常；
   - 2） 有两个catch块：一个是捕捉ArraylndexOutOfBoundsException， 输出：数组下标不能越界;一个是捕捉任意异常，输出：其它异常被触发：
   - 3） 有一个finally块：输出：所有异常被处理。
```java
package Exception.Practice_1;

public class Test {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("数组下标不可越界");
        } catch (Exception e) {
            System.out.println("其它异常被触发");
        } finally {
            System.out.println("所有异常被处理");
        }

    }
}
```