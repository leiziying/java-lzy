import  java.util.HashMap;
import  java.util.Map;
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String>  map=new HashMap<>();
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("====================");
        System.out.println(map.get("作者"));//get(Object key)返回到指定键所映射的值，或 null如果此映射包含该键的映射。
        System.out.println(map.getOrDefault("作者","佚名"));//getOrDefault(Object key, V defaultValue)返回到指定键所映射的值，或 defaultValue如果此映射包含该键的映射
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("=====================");
        map.put("标题","狂人日记");
        map.put("作者","鲁迅");
        map.put("创作时间","1918年");
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));//containsKey(Object key)如果此映射包含指定键的映射，则返回 true
        System.out.println(map.containsValue("佚名"));//如果此地图将一个或多个键映射到指定的值，则返回 true 。
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println("=====================");
        for(Map.Entry<String,String>  e:map.entrySet()){//返回此地图中包含的映射的Set视图
            System.out.println(e);
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
