package cn.edu.mapper;

import cn.edu.bean.Nation;
import cn.edu.bean.Doctor;
import cn.edu.bean.PoliticsStatus;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Devin
 * @description 医生
 * @create 2019/10/7
 */
public interface DoctorMapper {
    List<Nation> getAllNations();

    List<PoliticsStatus> getAllPolitics();

    int addDoctor(Doctor doctor);

    Long getMaxWorkID();

    List<Doctor> getDoctorByPage(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId") Long departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    Long getCountByKeywords(@Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId") Long departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    int updateDoctor(@Param("doctor") Doctor doctor);

    int deleteDoctorById(@Param("ids") String[] ids);

    int addDoctors(@Param("doctors") List<Doctor> doctors);

    List<Doctor> getDoctorByPageShort(@Param("start") int start, @Param("size") Integer size);
}
