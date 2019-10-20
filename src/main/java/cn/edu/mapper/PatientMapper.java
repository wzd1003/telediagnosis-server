package cn.edu.mapper;

import org.apache.ibatis.annotations.Param;
import cn.edu.bean.Patient;
import cn.edu.bean.Nation;
import cn.edu.bean.PoliticsStatus;

import java.util.Date;
import java.util.List;

/**
 * Created by sang on 2018/1/12.
 */
public interface PatientMapper {
    List<Nation> getAllNations();

    List<PoliticsStatus> getAllPolitics();

    int addPatient(Patient patient);

    Long getMaxHealthyID();

    List<Patient> getPatientByPage(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId")Long  departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    Long getCountByKeywords(@Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId")Long  departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    int updatePatient(@Param("patient") Patient patient);

    int deletePatientById(@Param("ids") String[] ids);

    int addPatients(@Param("patients") List<Patient> patients);

    List<Patient> getPatientByPageShort(@Param("start") int start, @Param("size") Integer size);
}
