import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //实例化一个Map
        Map<String,String>map=new HashMap<>();
        //isEmpty   isze
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        //put插入几个键值对  通过key找value，反向不行
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        //4.使用get根据key找value
        System.out.println(map.get("及时雨"));
        System.out.println(map.get("行者"));
        //5.getOrDefault找到key 返回value  没找到  返回默认值
        System.out.println(map.getOrDefault("行者", "武松"));
        //6.contains  判断元素是否存在
        System.out.println(map.containsKey("及时雨"));//效率较高
        System.out.println(map.containsValue("宋江"));//效率较低
        //7.循环遍历Map.  此处的Entry表示"条目"  一个一个的键值对  一个对象就是一个键值对
        //对于Map来说，保存的元素顺序和插入顺序无关
        //Map内部对于元素顺序有自己的规则   元素组织顺序取决于具体是HashMap还是TreeMap
        for (Map.Entry<String,String>entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //8.clean
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

    }
}
