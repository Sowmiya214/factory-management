package com.jsw.certificates.Factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FactoryServiceImpl implements FactoryService {
    @Autowired
    private FactoryRepository factoryRepository;
    @Override
    public FactoryModel save(FactoryModel factoryModel) {
        factoryModel.setId(null);
        factoryModel.setFactory_name("jsw");
        factoryModel.setFactory_addr("steel");
        System.out.println(">>>>>>>>>: "+factoryModel.toString());
        return factoryRepository.save(factoryModel);
    }

    @Override
    public FactoryModel update(FactoryModel factoryModel) {
        Optional<FactoryModel> upd = factoryRepository.findById(factoryModel.getId());
        if(upd.isPresent()){
            upd.get().setFactory_name(factoryModel.getFactory_name());
            upd.get().setFactory_addr(factoryModel.getFactory_addr());
            upd.get().setMachine_name(factoryModel.getMachine_name());
            upd.get().setCapacity(factoryModel.getCapacity());
            upd.get().setSl_no(factoryModel.getSl_no());
            upd.get().setMake(factoryModel.getMake());
            upd.get().setLift_height(factoryModel.getLift_height());
            upd.get().setCrane_no(factoryModel.getCrane_no());
            upd.get().setId_no(factoryModel.getId_no());
            upd.get().setLift_machine_date(factoryModel.getLift_machine_date());
            upd.get().setLift_machine_loc(factoryModel.getLift_machine_loc());
            upd.get().setCertificate_issue(factoryModel.getCertificate_issue());
            upd.get().setCertificate_carried(factoryModel.getCertificate_carried());
            upd.get().setHeat_lift_carried_certificate(factoryModel.getHeat_lift_carried_certificate());
            upd.get().setDefects_remedy(factoryModel.getDefects_remedy());
            upd.get().setSwl(factoryModel.getSwl());
            upd.get().setDevice_condition(factoryModel.getDevice_condition());
            upd.get().setVisual_inspection(factoryModel.getVisual_inspection());
            upd.get().setRemarks(factoryModel.getRemarks());
            upd.get().setTested_on(factoryModel.getTested_on());
            System.out.println("update>>>>>>>>>: "+upd.get().toString());
        }
        return factoryRepository.save(upd.get());
    }

    @Override
    public FactoryModel getDetails(String certificate_no) {
        return factoryRepository.getDetails(certificate_no);
    }


}
