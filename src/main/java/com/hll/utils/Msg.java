package com.hll.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 何龙
 * @create 2018-11-27 15:57
 * json返回
 */
public class Msg<T>{

    /**
     * 状态码
     * 0：正常
     */
    private Integer code;
    /**
     * 非0状态码 错误信息
     * 当状态码为0时 msg必须为空
     */
    private String msg;
    /**
     * 数据总条数
     */
    private Integer count;
    /**
     * 查询的数据集合
     */
    private List<T> data=new ArrayList<>();
    /**
     * 返回的其他额外信息
     */
    private Map<String,Object> map=new HashMap<>();




    public Map<String, Object> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                ", map=" + map +
                '}';
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Msg(Integer code, String msg, Integer count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;

        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
