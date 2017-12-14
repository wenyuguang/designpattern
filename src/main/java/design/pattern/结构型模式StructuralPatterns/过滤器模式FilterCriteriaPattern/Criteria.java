package design.pattern.结构型模式StructuralPatterns.过滤器模式FilterCriteriaPattern;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}