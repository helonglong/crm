package com.hll.pojo;

/**
 * 数据字典表
 */
public class BasDict {
    private Integer dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Integer dictIsEditable;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    @Override
    public String toString() {
        return "BasDict{" +
                "dictId=" + dictId +
                ", dictType='" + dictType + '\'' +
                ", dictItem='" + dictItem + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", dictIsEditable=" + dictIsEditable +
                '}';
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem == null ? null : dictItem.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public Integer getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Integer dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }
}