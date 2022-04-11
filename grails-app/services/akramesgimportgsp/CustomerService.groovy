package akramesgimportgsp

import grails.gorm.services.Service
import tst.Customer

@Service(Customer)
interface CustomerService {
    Customer save(String name)
}
