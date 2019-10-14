package cn.edu.mapper;

import cn.edu.bean.Expert;
import cn.edu.bean.Nation;
import cn.edu.bean.PoliticsStatus;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Devin
 * @description 专家
 * @create 2019/10/7
 */
public interface ExpertMapper {
    List<Nation> getAllNations();

    List<PoliticsStatus> getAllPolitics();

    int addExpert(Expert expert);

    Long getMaxWorkID();

    List<Expert> getExpertByPage(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId") Long departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    Long getCountByKeywords(@Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId") Long departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    int updateExpert(@Param("expert") Expert expert);

    int deleteExpertById(@Param("ids") String[] ids);

    int addExperts(@Param("experts") List<Expert> expert);

    List<Expert> getExpertByPageShort(@Param("start") int start, @Param("size") Integer size);
}
