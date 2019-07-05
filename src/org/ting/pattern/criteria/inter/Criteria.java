package org.ting.pattern.criteria.inter;

import org.ting.pattern.criteria.bean.Person;

import java.util.List;

/**
 * 标准接口
 *
 * @author 张韧炼
 * @create 2019-07-04 下午4:45
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
