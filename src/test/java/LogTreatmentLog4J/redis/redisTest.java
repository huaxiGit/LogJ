package LogTreatmentLog4J.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class redisTest {


    /*使用jedis创建一个连接对象,操作6379
     */
    @Test
    public void connection(){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.216.130",6380);
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
    }


}
