package org.study.java.basis;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bby15929
 * @date 2021年02月26日 10:09 上午
 */
public class ArrayListTest {
    /**
     * 测试 【Arrays.copyOf】
     */
    @Test
    public void ArraysCopyTest(){
        String[] source = new String[]{"1","2","3","4"};
        String[] target ;
        // 将长度增加到目标长度
        target = Arrays.copyOf(source,5);
        // ["1","2","3","4",null]
        System.out.println(JSON.toJSONString(target));
    }

    /**
     * 测试 【System.arraycopy】
     */
    @Test
    public void SystemArrayCopyTest(){
        String[] source = new String[]{"1","2","3","4"};
        String[] target = new String[4];
//        Object src : 原数组
//        int srcPos : 从元数据的起始位置开始（从0开始标记。如：移除第三个，则从第四个开始前移一位，则从【四-1】开始复制）
//　　     Object dest : 目标数组
//　　     int destPos : 目标数组的开始起始位置（从0开始标记。如：移除第三个，则覆盖第三个，那么下标为【三-1】开始）
//　　     int length  : 要copy的数组的长度（要复制的数量）
        System.arraycopy(source,3,source,2,1);
        // ["1","2","3","4",null]
        System.out.println(JSON.toJSONString(source));
    }

}
