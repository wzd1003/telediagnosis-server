package cn.edu.controller;

import cn.edu.bean.Patient;
import cn.edu.bean.Position;
import cn.edu.bean.RespBean;
import cn.edu.common.EmailRunnable;
import cn.edu.common.poi.PoiUtils;
import cn.edu.service.DepartmentService;
import cn.edu.service.JobLevelService;
import cn.edu.service.PatientService;
import cn.edu.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/**
 * Created by sang on 2018/1/12.
 */
@RestController
@RequestMapping("/patient/basic")
public class PatientBasicController {
    @Autowired
    PatientService patientService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    PositionService positionService;
    @Autowired
    JobLevelService jobLevelService;
    @Autowired
    ExecutorService executorService;
    @Autowired
    TemplateEngine templateEngine;
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    String emailAddress;

    @RequestMapping(value = "/basicdata", method = RequestMethod.GET)
    public Map<String, Object> getAllNations() {
        Map<String, Object> map = new HashMap<>();
        map.put("nations", patientService.getAllNations());
        map.put("politics", patientService.getAllPolitics());
        map.put("deps", departmentService.getDepByPid(-1L));
        map.put("positions", positionService.getAllPos());
        map.put("joblevels", jobLevelService.getAllJobLevels());
        map.put("workID", String.format("%08d", patientService.getMaxWorkID() + 1));
        return map;
    }

    @RequestMapping("/maxWorkID")
    public String maxWorkID() {
        return String.format("%08d", patientService.getMaxWorkID() + 1);
    }

    @RequestMapping(value = "/patient", method = RequestMethod.POST)
    public RespBean addPatient(Patient patient) {
        if (patientService.addPatient(patient) == 1) {
            List<Position> allPos = positionService.getAllPos();
            for (Position allPo : allPos) {
                if (allPo.getId() == patient.getPosId()) {
                    patient.setPosName(allPo.getName());
                }
            }
            executorService.execute(new EmailRunnable(patient,
                    javaMailSender, templateEngine,emailAddress));
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @RequestMapping(value = "/patient", method = RequestMethod.PUT)
    public RespBean updatePatient(Patient patient) {
        if (patientService.updatePatient(patient) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @RequestMapping(value = "/patient/{ids}", method = RequestMethod.DELETE)
    public RespBean deletePatientById(@PathVariable String ids) {
        if (patientService.deletePatientById(ids)) {
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }

    @RequestMapping(value = "/patient", method = RequestMethod.GET)
    public Map<String, Object> getPatientByPage(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size,
            @RequestParam(defaultValue = "") String keywords,
            Long politicId, Long nationId, Long posId,
            Long jobLevelId, String engageForm,
            Long departmentId, String beginDateScope) {
        Map<String, Object> map = new HashMap<>();
        List<Patient> patientByPage = patientService.getPatientByPage(page, size,
                keywords,politicId, nationId, posId, jobLevelId, engageForm,
                departmentId, beginDateScope);
        Long count = patientService.getCountByKeywords(keywords, politicId, nationId,
                posId,jobLevelId, engageForm, departmentId, beginDateScope);
        map.put("patients", patientByPage);
        map.put("count", count);
        return map;
    }

    @RequestMapping(value = "/exportPatient", method = RequestMethod.GET)
    public ResponseEntity<byte[]> exportPatient() {
        return PoiUtils.exportPatient2Excel(patientService.getAllPatients());
    }

    @RequestMapping(value = "/importPatient", method = RequestMethod.POST)
    public RespBean importPatient(MultipartFile file) {
        List<Patient> patients = PoiUtils.importPatient2List(file,
                patientService.getAllNations(), patientService.getAllPolitics(),
                departmentService.getAllDeps(), positionService.getAllPos(),
                jobLevelService.getAllJobLevels());
        if (patientService.addPatients(patients) == patients.size()) {
            return RespBean.ok("导入成功!");
        }
        return RespBean.error("导入失败!");
    }
}
