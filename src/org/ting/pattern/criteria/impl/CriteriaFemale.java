package org.ting.pattern.criteria.impl;

import org.ting.pattern.criteria.bean.Person;
import org.ting.pattern.criteria.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 女人过滤器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午4:51
 **/
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>(16);
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
