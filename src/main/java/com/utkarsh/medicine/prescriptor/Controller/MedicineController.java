package com.utkarsh.medicine.prescriptor.Controller;

import com.utkarsh.medicine.prescriptor.Objects.Medicine;
import com.utkarsh.medicine.prescriptor.Repositories.MedicineRepo;
import com.utkarsh.medicine.prescriptor.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MedicineController {


     @Autowired
    MedicineService medicineService;

     @Autowired
     MedicineRepo medicineRepo;



     @RequestMapping("/medicine/{id}")
     @ResponseBody
    public Medicine findmedicine(@PathVariable Long id , Model model){
         Medicine medicine = medicineService.findMedicineById(id);
         model.addAttribute(medicine);
       return medicine;

     }

     @RequestMapping("/medicine/findall")
     @ResponseBody
     public List<Medicine> findAll(Model model){
         List<Medicine> medicine = medicineService.showAllMedicine();
         model.addAttribute(medicine);
         return medicine;
     }

    @RequestMapping(value = "/admin/medicineinput", method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("medicine", new Medicine());
        return "medicineform";
    }

    @RequestMapping(value = "/admin/medicineinput",method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Medicine medicine, Model model) {
        model.addAttribute("medicine", medicine);
        medicineRepo.save(medicine);
        return "result";

    }


}
