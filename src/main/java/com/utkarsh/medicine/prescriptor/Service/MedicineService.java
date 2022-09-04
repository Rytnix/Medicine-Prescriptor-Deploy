package com.utkarsh.medicine.prescriptor.Service;

import com.utkarsh.medicine.prescriptor.Objects.Medicine;
import com.utkarsh.medicine.prescriptor.Repositories.MedicineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService{

    @Autowired
    MedicineRepo medicineRepo;

    public void createMedicine(Medicine medicine){
       medicineRepo.save(medicine);

    }

    void deleteMedicineById(Long id){
        Medicine medicine = medicineRepo.findById(id).orElseThrow(()->new RuntimeException("Medicine Not found"));

        medicineRepo.deleteById(medicine.getId());
    }

    public Medicine findMedicineById(Long id) {
        Medicine medicine;
        medicine = medicineRepo.findById(id).orElseThrow(()-> new RuntimeException("Medicine not found"));
        return medicine;
    }

    public List<Medicine> showAllMedicine(){
        List<Medicine> medicine;
        medicine = (List<Medicine>) medicineRepo.findAll();
        return  medicine;
    }








}
