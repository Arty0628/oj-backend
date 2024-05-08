package com.yupi.oj.mapper;

import com.yupi.oj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 周宇涵
* @description 针对表【question_submit(题目提交)】的数据库操作Mapper
* @createDate 2024-05-07 16:14:44
* @Entity com.yupi.oj.model.entity.QuestionSubmit
*/
@Mapper
public interface QuestionSubmitMapper extends BaseMapper<QuestionSubmit> {

}




