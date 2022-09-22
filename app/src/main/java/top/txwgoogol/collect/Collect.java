package top.txwgoogol.collect;

import android.os.Build;
import android.util.ArrayMap;
import android.util.SparseArray;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * 集合
 * @see 1 https://juejin.cn/post/6930632285301669895
 * @see 2 https://juejin.cn/post/6931007634028003341
 * @see 3 https://juejin.cn/post/6931563785245163534
 */
@RequiresApi(api = Build.VERSION_CODES.KITKAT)
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


    //SparseArray 避免了 HashMap 每次存取值时的装箱拆箱操作，key 值保持为基本数据类型 int，减少了性能开销
    private final SparseArray<String> sparseArray = new SparseArray<>();
    private void sparseArray() {
        sparseArray.append(0, "1");
    }

    //
    private final ArrayMap<Integer,Object> arrayMap = new ArrayMap<Integer,Object>();
    // 因为ArrayMap与SparseArray内部都使用了二分法进行从小到大的排序，所以当数据量很大的时候，效率至少降低一半，
    // 所以谷歌推荐数据量在千级以内时使用ArrayMap与SparseArray，数据量非常大时使用HashMap；


}
