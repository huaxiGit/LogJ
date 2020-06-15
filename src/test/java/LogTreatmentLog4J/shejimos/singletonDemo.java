package LogTreatmentLog4J.shejimos;

public class singletonDemo {
    //单例模式 提供一个全局访问点供外部过期改实例
    //优点：创建比较频繁，省去了new操作符，降低了系统内存使用频率，减少cg压力
    //缺点：没有抽象层，不能扩展，违背单一性原则
    //------------简单--------------------------------
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static singletonDemo instance=null;
    /*私有构造方法，防止被实例化*/
    private  singletonDemo (){

    }
    /*静态工程方法，创建实例 在单线程使用*/
    public static singletonDemo getInstance(){
        if (instance ==null){
            instance=new singletonDemo();
        }
        return instance;
    }
    /*只有在第一次创建对象的时候需要加锁，之后就不需要了*/
    public static  singletonDemo getInstance1() {
        if (instance == null) {
            synchronized (instance){
                if (instance == null){
                    instance = new singletonDemo();
                }
            }

        }
        return instance;
    }

    /*如果该对象被用于序例化，可以保证对象在序例化前后报错一致*/
    public Object readResolve(){
        return instance;
    }

    public static void main(String[] args) {


    }
}
