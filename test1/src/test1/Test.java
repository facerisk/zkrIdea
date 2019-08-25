package test1;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        System.out.println();
        String nn = "{\"name\":\"lpl\",\"naee\":{\"n\":\"n\",\"s\":\"s\"}}";
        Vo vo = JSON.parseObject(nn, Vo.class);
        System.out.println(vo.name);
        System.out.println(vo.naee.n);


        double random = Math.random();
        System.out.println(random);

    }
}
