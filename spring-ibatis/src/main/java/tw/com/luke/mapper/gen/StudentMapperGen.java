package tw.com.luke.mapper.gen;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tw.com.luke.entity.Student;
import tw.com.luke.entity.criterion.StudentCriterion;
import tw.com.luke.entity.gen.StudentGen;

public interface StudentMapperGen {
    int countByCriterion(StudentCriterion criterion);

    int deleteByCriterion(StudentCriterion criterion);

    @Delete({
        "delete from \"student\"",
        "where \"id\" = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into \"student\" (\"id\", \"name\", ",
        "\"bdate\", \"tel\")",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=NCHAR}, ",
        "#{bdate,jdbcType=DATE}, #{tel,jdbcType=CHAR})"
    })
    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByCriterion(StudentCriterion criterion);

    @Select({
        "select",
        "\"id\", \"name\", \"bdate\", \"tel\"",
        "from \"student\"",
        "where \"id\" = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Student selectByPrimaryKey(Integer id);

    int updateByCriterionSelective(@Param("record") Student record, @Param("example") StudentCriterion criterion);

    int updateByCriterion(@Param("record") Student record, @Param("example") StudentCriterion criterion);

    int updateByPrimaryKeySelective(Student record);

    @Update({
        "update \"student\"",
        "set \"name\" = #{name,jdbcType=NCHAR},",
          "\"bdate\" = #{bdate,jdbcType=DATE},",
          "\"tel\" = #{tel,jdbcType=CHAR}",
        "where \"id\" = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Student record);
}