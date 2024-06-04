package com.yupi.oj.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 文件上传业务类型枚举
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public enum JudgeinfoMessageEnum {

    Accepted ("成功", "Accepted "),
    Wrong_Answer(" Wrong Answer","答案错误"),
    Compile_Error("Compile Error","编译错误"),
    Memory_Limit_Exceeded("Memory Limit Exceeded","内存溢出"),
    Time_Limit_Exceeded("Time Limit Exceeded","超时"),
    Presentation_Error("Presentation Error","展示错误"),
    Output_Limit_Exceeded("Output Limit Exceeded","输出溢出"),
    Waiting("Waiting","等待中"),
    Dangerous_Operation(" Dangerous Operation","危险操作"),
    Runtime_Error(" Runtime Error","运行错误(用户程序的问题)"),
    System_Error("System Error","系统错误(做系统人的问题)");

    private final String text;

    private final String value;

    JudgeinfoMessageEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static JudgeinfoMessageEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (JudgeinfoMessageEnum anEnum : JudgeinfoMessageEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
