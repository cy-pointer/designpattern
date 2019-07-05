package org.ting.pattern.criteria.impl;

import org.ting.pattern.criteria.bean.Person;
import org.ting.pattern.criteria.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 男人过滤器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午4:47
 **/
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>(16);
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
