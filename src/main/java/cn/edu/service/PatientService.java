package cn.edu.service;

import cn.edu.mapper.PatientMapper;
import cn.edu.bean.Patient;
import cn.edu.bean.Nation;
import cn.edu.bean.PoliticsStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by sang on 2018/1/12.
 */
@Service
@Transactional
public class PatientService {
    @Autowired
    PatientMapper patientMapper;
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    SimpleDateFormat birthdayFormat = new SimpleDateFormat("yyyy-MM-dd");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    public List<Nation> getAllNations() {
        return patientMapper.getAllNations();
    }

    public List<PoliticsStatus> getAllPolitics() {
        return patientMapper.getAllPolitics();
    }

    public int addPatient(Patient patient) {
        Date beginContract = patient.getBeginContract();
        Date endContract = patient.getEndContract();
        Double contractTerm = (Double.parseDouble(yearFormat.format(endContract)) - Double.parseDouble(yearFormat.format(beginContract))) * 12 + Double.parseDouble(monthFormat.format(endContract)) - Double.parseDouble(monthFormat.format(beginContract));
        patient.setContractTerm(Double.parseDouble(decimalFormat.format(contractTerm / 12)));
        return patientMapper.addPatient(patient);
    }

    public Long getMaxWorkID() {
        Long maxWorkID = patientMapper.getMaxWorkID();
        return maxWorkID == null ? 0 : maxWorkID;
    }

    public List<Patient> getPatientByPage(Integer page, Integer size, String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope) {
        int start = (page - 1) * size;
        Date startBeginDate = null;
        Date endBeginDate = null;
        if (beginDateScope != null && beginDateScope.contains(",")) {
            try {
                String[] split = beginDateScope.split(",");
                startBeginDate = birthdayFormat.parse(split[0]);
                endBeginDate = birthdayFormat.parse(split[1]);
            } catch (ParseException e) {
            }
        }
        return patientMapper.getPatientByPage(start, size, keywords, politicId, nationId, posId, jobLevelId, engageForm, departmentId, startBeginDate, endBeginDate);
    }

    public Long getCountByKeywords(String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope) {
        Date startBeginDate = null;
        Date endBeginDate = null;
        if (beginDateScope != null && beginDateScope.contains(",")) {
            try {
                String[] split = beginDateScope.split(",");
                startBeginDate = birthdayFormat.parse(split[0]);
                endBeginDate = birthdayFormat.parse(split[1]);
            } catch (ParseException e) {
            }
        }
        return patientMapper.getCountByKeywords(keywords, politicId, nationId, posId, jobLevelId, engageForm, departmentId, startBeginDate, endBeginDate);
    }

    public int updatePatient(Patient patient) {
        Date beginContract = patient.getBeginContract();
        Date endContract = patient.getEndContract();
        Double contractTerm = (Double.parseDouble(yearFormat.format(endContract)) - Double.parseDouble(yearFormat.format(beginContract))) * 12 + Double.parseDouble(monthFormat.format(endContract)) - Double.parseDouble(monthFormat.format(beginContract));
        patient.setContractTerm(Double.parseDouble(decimalFormat.format(contractTerm / 12)));
        return patientMapper.updatePatient(patient);
    }

    public boolean deletePatientById(String ids) {
        String[] split = ids.split(",");
        return patientMapper.deletePatientById(split) == split.length;
    }

    public List<Patient> getAllPatients() {
        return patientMapper.getPatientByPage(null, null, "", null, null, null, null, null, null, null, null);
    }

    public int addPatients(List<Patient> patients) {
        return patientMapper.addPatients(patients);
    }

    public List<Patient> getPatientByPageShort(Integer page, Integer size) {
        int start = (page - 1) * size;
        return patientMapper.getPatientByPageShort(start,size);
    }
}
