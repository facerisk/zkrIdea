package test.Annotation;

/**
 * Created by wuzejian on 2017/5/18.
 * 数据库表Member对应实例类bean
 */@DBTable(name = "MEMBER")public class Member {

    @SQLString(name = "ID", value = 50, constraint = @Constraints(primaryKey = true))
    private String id;

    @SQLString(name = "NAME")
    private String name;

    @SQLInteger(name = "AGE")
    private int age;

    @SQLString(name = "DESCRIPTION", value = 150, constraint = @Constraints(allowNull = true))
    private String description;
}