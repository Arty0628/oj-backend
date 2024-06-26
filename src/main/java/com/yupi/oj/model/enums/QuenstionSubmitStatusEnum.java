package com.yupi.oj.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 题目提交枚举
 *
 * @author <a href="https://github.com/liyupi">zyh</a>
 */
public enum QuenstionSubmitStatusEnum {
    //判题的状态 0 等待 1 运行 2 成功 3 失败
    WAITING("等待", 0),
    RUNNING("正在运行", 1),
    SUCCEED("成功", 2),
    FAILED("失败",3);

    private final String text;

    private final Integer value;

    QuenstionSubmitStatusEnum(String text, Integer value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static QuenstionSubmitStatusEnum getEnumByValue(Integer value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (QuenstionSubmitStatusEnum anEnum : QuenstionSubmitStatusEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
