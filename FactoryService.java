package com.jsw.certificates.Factory;

public interface FactoryService {
    FactoryModel save(FactoryModel factoryModel);
    FactoryModel update(FactoryModel factoryModel);
    FactoryModel getDetails(String certificate_no);


}
