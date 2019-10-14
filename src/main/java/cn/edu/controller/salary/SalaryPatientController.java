package cn.edu.controller.salary;

import cn.edu.service.PatientService;
import cn.edu.service.SalaryService;
import cn.edu.bean.Patient;
import cn.edu.bean.RespBean;
import cn.edu.bean.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sang on 2018/1/25.
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SalaryPatientController {
    @Autowired
    SalaryService salaryService;
    @Autowired
    PatientService patientService;

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public RespBean updatePatientSalary(Integer sid, Long eid) {
        if (salaryService.updatePatientSalary(sid, eid) == 1) {
            return RespBean.ok("修改成功!");
        }
        return RespBean.error("修改失败!");
    }

    @RequestMapping(value = "/salaries", method = RequestMethod.GET)
    public List<Salary> salaries() {
        return salaryService.getAllSalary();
    }

    @RequestMapping(value = "/patient", method = RequestMethod.GET)
    public Map<String, Object> getPatientByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        Map<String, Object> map = new HashMap<>();
        List<Patient> patientByPage = patientService.getPatientByPageShort(page, size);
        Long count = patientService.getCountByKeywords("", null, null, null, null, null, null, null);
        map.put("patients", patientByPage);
        map.put("count", count);
        return map;
    }
}
