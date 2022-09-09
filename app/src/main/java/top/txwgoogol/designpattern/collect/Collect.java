package top.txwgoogol.designpattern.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 集合
 * @see - https://juejin.cn/post/6930632285301669895
 */
public class Collect {

    //数组集合
    private final ArrayList<Object> arrayList = new ArrayList<>();

    //链表集合
    private final LinkedList<Object> linkedList = new LinkedList<>();

    //无序的HashMap
    private final HashMap<String, String> hashMap = new HashMap<>();

    //有序的HashMap
    private final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

    //不能重复的HashMap
    private final HashSet<Object> hashSet = new HashSet<>();

    //依靠链表来实现有序的 HashSet
    private final LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();

}
