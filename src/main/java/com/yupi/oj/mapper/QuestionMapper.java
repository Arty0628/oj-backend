package com.yupi.oj.mapper;

import com.yupi.oj.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 周宇涵
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-05-07 16:12:46
* @Entity com.yupi.oj.model.entity.Question
*/
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {

}




